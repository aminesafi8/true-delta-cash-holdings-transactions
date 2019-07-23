package com.delta.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.delta.models.HoldingDelta;
import com.delta.models.TransactionDelta;
import com.delta.repositories.TransactionDeltaRepository;
import com.mongodb.client.DistinctIterable;
import com.mongodb.client.MongoCursor;

@RestController
@RequestMapping("api")
public class TransactionDeltaController {

	@Autowired
	MongoTemplate mongoTemplate;

	@Autowired
	TransactionDeltaRepository transactionDeltaRepository;

	@GetMapping("transaction-deltas-distinct-recon_break")
	public List<String> queryAllDistinct(String custodian) {
		DistinctIterable<String> iterable = mongoTemplate.getCollection("transactionDelta").distinct("recon_break",
				String.class);
		MongoCursor<String> cursor = iterable.iterator();
		List<String> DistinctHoldingDeltas = new ArrayList<String>();
		while (cursor.hasNext()) {
			DistinctHoldingDeltas.add(cursor.next());
		}
		return DistinctHoldingDeltas;
	}

	@RequestMapping(value = "transaction-deltas-recon_break", method = RequestMethod.GET)
	public Page<TransactionDelta> transactionDeltasByReconBreak(Pageable pageable, @RequestParam String recon_break) {
		return transactionDeltaRepository.findByReconBreak(pageable, recon_break);

	}

}

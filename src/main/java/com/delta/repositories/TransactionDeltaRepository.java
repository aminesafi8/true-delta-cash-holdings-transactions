package com.delta.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.delta.models.TransactionDelta;

@Repository
public interface TransactionDeltaRepository extends MongoRepository<TransactionDelta, String> {

	Page<TransactionDelta> findByReconBreak(Pageable pageable, String reconBreak);

}

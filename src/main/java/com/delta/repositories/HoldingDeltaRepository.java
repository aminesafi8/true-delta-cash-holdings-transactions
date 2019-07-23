package com.delta.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.delta.models.HoldingDelta;

public interface HoldingDeltaRepository extends MongoRepository<HoldingDelta, String> {

	Page<HoldingDelta> findByReconBreak(Pageable pageable, String reconBreak);

}

package com.delta.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.delta.models.HoldingDelta;

@Repository
public interface HoldingDeltaRepository extends MongoRepository<HoldingDelta, String> {

	Page<HoldingDelta> findByReconBreak(Pageable pageable, String reconBreak);

}

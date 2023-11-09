package com.limbo.eask.datasource.repository;

import com.limbo.eask.datasource.entity.Problemz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SolutionzRepository extends CrudRepository<Problemz, UUID> {
}

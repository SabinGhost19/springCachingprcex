package com.tericcabrel.springbootcaching.repositories;

import com.tericcabrel.springbootcaching.models.CacheData;
import org.springframework.data.repository.CrudRepository;

public interface CacheDataRepository extends CrudRepository<CacheData, String> {
}

package com.mobileprogramming.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mobileprogramming.domain.Entry;

/**
 * Basic repository for saving entries.
 * @author MJazy
 *
 */
@Repository("dataRepository")
public interface DataRepository extends CrudRepository<Entry, Integer>{

}

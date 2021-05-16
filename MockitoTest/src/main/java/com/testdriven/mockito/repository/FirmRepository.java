package com.testdriven.mockito.repository;

import org.springframework.data.repository.CrudRepository;

import com.testdriven.mockito.model.Firm;

public interface FirmRepository extends CrudRepository<Firm, Long> {

}

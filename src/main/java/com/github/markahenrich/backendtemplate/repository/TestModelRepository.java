package com.github.markahenrich.backendtemplate.repository;

import com.github.markahenrich.backendtemplate.model.entity.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestModelRepository extends JpaRepository<TestModel, Long> {
}

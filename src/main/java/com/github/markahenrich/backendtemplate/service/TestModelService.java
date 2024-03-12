package com.github.markahenrich.backendtemplate.service;

import com.github.markahenrich.backendtemplate.model.entity.TestModel;
import com.github.markahenrich.backendtemplate.repository.TestModelRepository;

import java.util.List;

public interface TestModelService {

    List<TestModel> getAllTestModels();
    TestModel getTestModel(Long id);
    TestModel createTestModel(TestModel testModel);
    TestModel updateTestModel(TestModel testModel);
    void deleteTestModel(Long id);
    List<TestModel> saveAllTestModels(List<TestModel> testModels);
    TestModel saveTestModel(TestModel testModel);
}

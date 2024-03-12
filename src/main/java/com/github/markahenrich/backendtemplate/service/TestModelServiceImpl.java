package com.github.markahenrich.backendtemplate.service;

import com.github.markahenrich.backendtemplate.model.entity.TestModel;
import com.github.markahenrich.backendtemplate.repository.TestModelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TestModelServiceImpl implements TestModelService {
    private final TestModelRepository testModelRepository;

    public TestModelServiceImpl(TestModelRepository testModelRepository) {
        this.testModelRepository = testModelRepository;
    }

    @Override
    public List<TestModel> getAllTestModels() {
        return testModelRepository.findAll();
    }

    @Override
    public TestModel getTestModel(Long id) {
        return testModelRepository.getReferenceById(id);
    }

    @Override
    public TestModel createTestModel(TestModel testModel) {
        return testModelRepository.save(testModel);
    }

    @Override
    public TestModel updateTestModel(TestModel testModel) {
        TestModel modelToUpdate = getTestModel(testModel.getId());
        if (Objects.isNull(modelToUpdate)) return null;
        modelToUpdate.setName(testModel.getName());
        return testModelRepository.save(modelToUpdate);
    }

    @Override
    public void deleteTestModel(Long id) {
        testModelRepository.deleteById(id);
    }

    @Override
    public List<TestModel> saveAllTestModels(List<TestModel> testModels) {
        return testModelRepository.saveAll(testModels);
    }

    @Override
    public TestModel saveTestModel(TestModel testModel) {
        return testModelRepository.save(testModel);
    }
}

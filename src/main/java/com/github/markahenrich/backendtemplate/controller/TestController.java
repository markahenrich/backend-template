package com.github.markahenrich.backendtemplate.controller;

import com.github.markahenrich.backendtemplate.model.entity.TestModel;
import com.github.markahenrich.backendtemplate.service.TestModelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/test-model")
@CrossOrigin
public class TestController {
    private final TestModelService testModelService;

    public TestController(TestModelService testModelService) {
        this.testModelService = testModelService;
    }

    @GetMapping("/all")
    public List<TestModel> getAllTestModels() {
        return testModelService.getAllTestModels();
    }

    @GetMapping("/{id}")
    public TestModel getTestModel(@PathVariable Long id) {
        return testModelService.getTestModel(id);
    }

    @PostMapping
    public TestModel addTestModel(@RequestBody TestModel testModel) {
        return testModelService.saveTestModel(testModel);
    }

    @PostMapping("/list")
    public List<TestModel> addListOfTestModels(@RequestBody List<TestModel> testModels) {
        return testModelService.saveAllTestModels(testModels);
    }

    @PutMapping
    public TestModel updateTestModel(@RequestBody TestModel testModel) {
        return testModelService.updateTestModel(testModel);
    }

    @DeleteMapping("/{id}")
    public void deleteTestModel(@PathVariable Long id) {
        testModelService.deleteTestModel(id);
    }
}

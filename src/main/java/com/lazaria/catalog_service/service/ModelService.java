package com.lazaria.catalog_service.service;

import com.lazaria.catalog_service.model.Model;
import com.lazaria.catalog_service.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {
    @Autowired
    private ModelRepository modelRepository;

    public Model getModelById(Long id){
        return modelRepository.getReferenceById(id);
    }

    public void addModel(Model model){
        modelRepository.save(model);
    }
    public void deleteModelById(Long id){
        modelRepository.deleteById(id);
    }

    public List<Model> getAllModels(){
        return modelRepository.findAll();
    }
    public void editModelById(Model model,Long id){
        Model modelToEdit = modelRepository.getReferenceById(id);
        modelToEdit.setName(model.getName());
        modelToEdit.setDescription(model.getDescription());
        modelToEdit.setBrand(model.getBrand());
        modelToEdit.setCategory(model.getCategory());
        modelRepository.save(modelToEdit);
    }
}

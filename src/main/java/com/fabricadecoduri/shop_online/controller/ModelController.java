package com.fabricadecoduri.shop_online.controller;

import com.fabricadecoduri.shop_online.model.Model;
import com.fabricadecoduri.shop_online.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ModelController {
    @Autowired
    private ModelService modelService;

    @GetMapping("/model/{id}")
    public Model getModelById(@PathVariable long id){return modelService.getModelById(id);}
    @GetMapping("/model/all")
    public void getAllModels(){modelService.getAllModels();}

    @PostMapping("/model/add")
    public void addModel(Model model){ modelService.addModel(model);}

    @DeleteMapping("/model/delete{id}")
    public void deleteModelById(@PathVariable long id){modelService.deleteModelById(id);}

    @PutMapping("/model/edit{id}")
    public void editModelById(Model model,@PathVariable long id){modelService.editModelById(model,id);}
}

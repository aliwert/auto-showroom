package com.alimert.controller.impl;


import com.alimert.controller.BaseController;
import com.alimert.controller.ISoldCarController;
import com.alimert.controller.RootEntity;
import com.alimert.dto.DtoSoldCar;
import com.alimert.dto.DtoSoldCarIU;
import com.alimert.service.ISoldCarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/sold-car")
public class SoldCarControllerImpl extends BaseController implements ISoldCarController {


    @Autowired
    private ISoldCarService soldCarService;


    @PostMapping("/save")
    @Override
    public RootEntity<DtoSoldCar> buyCar(@Valid @RequestBody DtoSoldCarIU dtoSoldCarIU) {
        return ok(soldCarService.buyCar(dtoSoldCarIU));
    }
}
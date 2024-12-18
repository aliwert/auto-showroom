package com.alimert.controller;

import com.alimert.dto.DtoGalleristCar;
import com.alimert.dto.DtoGalleristCarIU;

import java.util.List;

public interface IGalleristCarController {

    public RootEntity<DtoGalleristCar> saveGalleristCar(DtoGalleristCarIU dto);

    public RootEntity<DtoGalleristCar> getGalleristCarById(Long id);

    public RootEntity<List<DtoGalleristCar>> getAllGalleristCar();

    public RootEntity<DtoGalleristCar> updateGalleristCar(Long id, DtoGalleristCarIU dtoGalleristCarIU);

    public RootEntity<Void> deleteGalleristCar(Long id);
}

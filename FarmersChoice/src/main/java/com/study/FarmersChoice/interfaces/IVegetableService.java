package com.study.FarmersChoice.interfaces;

import java.util.List;

import com.study.FarmersChoice.entity.Vegetable;

public interface IVegetableService {
	
	List<Vegetable> getAllVegetables();
	Vegetable getVegetableByID(int vegId);
    boolean addVegetable(Vegetable vegetable);
    void updateVegetable(Vegetable Vegetable);
    void deleteVegetable(int vegId);

}

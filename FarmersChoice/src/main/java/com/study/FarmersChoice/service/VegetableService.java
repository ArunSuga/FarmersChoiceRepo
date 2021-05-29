package com.study.FarmersChoice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.FarmersChoice.entity.Vegetable;
import com.study.FarmersChoice.interfaces.IVegetableService;
import com.study.FarmersChoice.repo.VegetableRepository;

@Service
public class VegetableService implements IVegetableService{
	
	@Autowired
	private VegetableRepository vegetableRepository;

	@Override
	public List<Vegetable> getAllVegetables() {
		// TODO Auto-generated method stub
		List<Vegetable> vegetableList = new ArrayList<>();
		
		vegetableRepository.findAll().forEach( e -> vegetableList.add(e));
		
		return vegetableList;
	}

	@Override
	public Vegetable getVegetableByID(int vegId) {
		// TODO Auto-generated method stub
		Vegetable vegetable = (Vegetable) vegetableRepository.findById(vegId);
		
		return vegetable;
	}

	@Override
	public boolean addVegetable(Vegetable vegetable) {
		// TODO Auto-generated method stub
		List<Vegetable> list = vegetableRepository.findByName(vegetable.getName());
        if (list.size() > 0) {
        return false;
      } else {
    	  vegetableRepository.save(vegetable);
        return true;
      }
	}

	@Override
	public void updateVegetable(Vegetable vegetable) {
		// TODO Auto-generated method stub
    	  vegetableRepository.save(vegetable);
		
	}

	@Override
	public void deleteVegetable(int vegId) {
		// TODO Auto-generated method stub
		vegetableRepository.delete(getVegetableByID(vegId));
		
		
	}

}

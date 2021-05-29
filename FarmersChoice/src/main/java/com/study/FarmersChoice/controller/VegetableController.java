package com.study.FarmersChoice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.study.FarmersChoice.entity.Vegetable;
import com.study.FarmersChoice.interfaces.IVegetableService;


@RestController
@RequestMapping("/farmerschoice")
public class VegetableController {
	
	/*
	 * @Autowired; private IVegetableService vegetableService;
	 */
	
	@Autowired
	private IVegetableService vegetableService;
	
	@GetMapping(value="vegetables",produces = "application/json")
	public ResponseEntity<List<Vegetable>> getAllVegetables(){
		
		List<Vegetable> vegetableList = new ArrayList<Vegetable>();
		
		vegetableList = vegetableService.getAllVegetables();
		
		if(vegetableList.isEmpty())
		{
			
			   Vegetable veg = new Vegetable(); veg.setName("Okra");
			
			   Vegetable veg1 = new Vegetable(); veg1.setName("Brinjal");
			 
			   Vegetable veg2 = new Vegetable(); veg2.setName("Pumpkin");
			 
			   vegetableList.add(veg1); vegetableList.add(veg2); 
			 
		}
		
	
		return new ResponseEntity<List<Vegetable>>(vegetableList,HttpStatus.OK);
	}
	
	@GetMapping(value="vegetable/{id}" , produces = "application/json")
	public ResponseEntity<Vegetable> getVegetableByName(@PathVariable("id") int id){
		
//		List<Vegetable> vegetableList = new ArrayList<Vegetable>();
//		
//		Vegetable veg = new Vegetable();
//		veg.setName("Okra");
//		
//		Vegetable veg1 = new Vegetable();
//		veg1.setName("Brinjal");
//		
//		Vegetable veg2 = new Vegetable();
//		veg2.setName("Pumpkin");
//		
//		
//		vegetableList.add(veg1);
//		vegetableList.add(veg2);
		
		Vegetable vegetable = vegetableService.getVegetableByID(id);
		
	
		return new ResponseEntity<Vegetable>(vegetable,HttpStatus.OK);
	}
	
	@PostMapping(value="vegetable" , consumes= "application/json")
	public ResponseEntity<Void> addVegetable(@RequestBody Vegetable vegInfo , UriComponentsBuilder uriComponentsBuilder){
		
		Vegetable vegetable = new Vegetable();
		
		BeanUtils.copyProperties(vegInfo, vegetable);
		
		vegetable.setName(vegInfo.getName());
			
		boolean isVegetableAdded =  vegetableService.addVegetable(vegInfo);
		
		if(!isVegetableAdded)
		{
			  return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		
		HttpHeaders headers = new HttpHeaders();
	
		headers.setLocation(uriComponentsBuilder.path("vegetable/{id}").buildAndExpand(vegInfo.getID()).toUri());
			
		return new ResponseEntity<Void>(headers,HttpStatus.OK);
	}
	
	@PutMapping(value="vegetable" , consumes = "application/json" , produces = "application/json")
	public ResponseEntity<Vegetable> updateVegetable(@RequestBody Vegetable vegetable)
	{    
		Vegetable vegtoUpdate = new Vegetable();
		BeanUtils.copyProperties(vegetable, vegtoUpdate);
		
		vegetableService.updateVegetable(vegetable);
		
		Vegetable ob = new Vegetable();
		BeanUtils.copyProperties(vegtoUpdate, ob);
		return new ResponseEntity<Vegetable>(ob, HttpStatus.OK);
		
	}
	
	@DeleteMapping(value= "vegetable/{id}", produces= { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
		
		vegetableService.deleteVegetable(id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}

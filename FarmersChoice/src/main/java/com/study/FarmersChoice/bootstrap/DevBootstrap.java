package com.study.FarmersChoice.bootstrap;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.study.FarmersChoice.entity.Vegetable;
import com.study.FarmersChoice.repo.VegetableRepository;

@Component
public class DevBootstrap implements CommandLineRunner{

	/*
	 * @Override public void onApplicationEvent(ApplicationEvent event) { // TODO
	 * Auto-generated method stub
	 * 
	 * initData();
	 * 
	 * }
	 */
	/*
	 * private void initData() { Vegetable veg = new Vegetable();
	 * 
	 * 
	 * }
	 */
	
	private final VegetableRepository vegRepo;
	

	public DevBootstrap(VegetableRepository vegRepo) {
		super();
		this.vegRepo = vegRepo;
	}




	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		 Vegetable carrot = new Vegetable();
		 
		  carrot.setName("Carrot");
		  
		  Vegetable tomato = new Vegetable();
		  
		  tomato.setName("Tomato");
		  
		  List<Vegetable> vegetablelist = new ArrayList<Vegetable>();
		  
		  vegetablelist.add(tomato);
		  vegetablelist.add(carrot);
		  
		  vegRepo.saveAll(vegetablelist);
		  
		  System.out.println("BootStrap is started");
		  
		  System.out.println("vegetable list :"  + vegRepo.count());

		  
		  //vegRepo.get;
		  
		  
	}

}

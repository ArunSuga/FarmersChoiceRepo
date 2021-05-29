package com.study.FarmersChoice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.FarmersChoice.entity.Vegetable;
import com.study.FarmersChoice.repo.VegetableRepository;


@Controller
public class VegetableViewController {
	
	@Autowired
	private VegetableRepository vegRepo;
	
	@RequestMapping("/vegetables")
	public String getVegetables(Model model)
	{   
		List<Vegetable> veglist = vegRepo.findAll();
		
		veglist.forEach(veg -> {System.out.println(
				veg.getName() + "+" + veg.getID());
			});
		
		model.addAttribute("vegetables", vegRepo.findAll());
		
		return "vegetables/list";
	}
}
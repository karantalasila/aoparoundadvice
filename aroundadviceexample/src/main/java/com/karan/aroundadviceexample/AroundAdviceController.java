package com.karan.aroundadviceexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("advice")
public class AroundAdviceController {
	@Autowired
	private AroundAdviceService aroundAdviceService;
	@GetMapping("/get")
	public String aroundget() {
		
		aroundAdviceService.aroundget();
		
		return "success";
		
	}

}

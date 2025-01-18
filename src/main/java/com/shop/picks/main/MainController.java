package com.shop.picks.main;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*" )
public class MainController {
	
	
	@GetMapping("/test")
	public void test() {
		System.out.println("안녕하세요 테스트입니다.");
	}
}

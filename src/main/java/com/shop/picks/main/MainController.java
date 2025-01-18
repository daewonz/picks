package com.shop.picks.main;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*" )
public class MainController {
	@Autowired
	MainService mainService;
	
	@GetMapping("/test")
	public ResponseEntity<String> test() {
		System.out.println("안녕하세요 테스트입니다.");
		URI location = URI.create("http://example.com/languages/java/");
		List<Map<String, Object>> members = new ArrayList<>();
		members = mainService.getMembers();
		//System.out.println(members);
		return ResponseEntity.created(location).header("MyResponseHeader", "MyValue").body("Hello World123");
	}
}

package com.shop.picks.login;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:8088", allowCredentials = "true")
public class LoginController {
	
	@PostMapping("/login")
	public ResponseEntity<Map<String, Object>> test(){
		System.out.println("test");
		URI location = URI.create("http://example.com/languages/java/");
		Map<String, Object> result = new HashMap<>();
		result.put("test", "test");
		result.put("test2", "test2");
		String a = "aa";
		return ResponseEntity.created(location).header("MyResponseHeader", "MyValue").body(result);
	}
}

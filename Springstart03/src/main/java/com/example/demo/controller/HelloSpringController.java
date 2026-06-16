package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringController {
	//ハンドラーメソッド
	@GetMapping("/hello")
	public String Hello() {
		//HTMLテンプレートにHello-springを指定
		return "Hello-spring";
	}
}

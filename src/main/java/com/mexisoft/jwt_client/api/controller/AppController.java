package com.mexisoft.jwt_client.api.controller;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mexisoft.jwt_client.Models.Message;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class AppController {
	
	@GetMapping("/list")
	public List<Message> list(){
		return Collections.singletonList(
				new Message("Lista de ejemplo"));
	}
	
	@PostMapping("/create")
	public Message create(@RequestBody Message message) {
		
		log.info("Mensaje guardado {}", message);
		
		return message;
	}
	
	@GetMapping("/authorized")
	public Map<String, String> authorized(@RequestParam String code){
		return Collections.singletonMap("code", code);
	}

}

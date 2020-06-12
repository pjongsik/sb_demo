package com.example.demo;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TestModel;
import com.example.demo.repository.TestRepository;

@RestController
public class HelloController {
	
	@Autowired
	TestRepository testRepository;
	
	@RequestMapping("/")
	public void hello (HttpServletResponse response) throws IOException {
		response.getWriter().print("hello world~!");
	}
	
	@GetMapping("/test/{seqno}")
	public String test (@PathVariable int seqno) throws IOException {
		
		Optional<TestModel> test = testRepository.findById(seqno);
		
		return test.toString();
	}
}

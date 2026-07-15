package com.controller;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;

@Controller
public class TestController {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	@GetMapping("/form")
	public String form() {
		return "form.jsp";
		
	}
	
	@GetMapping("/submit")
	public String display(@ModelAttribute Student student) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(student);
		et.commit();
		System.out.println(student.getId());
		System.out.println(student.getName());
		return "display.jsp";
		
	}
	

}

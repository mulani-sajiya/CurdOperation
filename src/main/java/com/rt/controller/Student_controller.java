package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rt.Entity.Student;
import com.rt.service.Student_service;

@Controller
public class Student_controller {
	@Autowired
	Student_service studService;
	
	@RequestMapping("/")
	public String StudentHomePage()
	{
		return "StudentHome";
	}
	
	//register operation
	@RequestMapping("/registerForm")
	public String StudentRegisterForm()
	{
		return "register";
	}
	
	@RequestMapping("/register")
	public String StudentRegisterData(@ModelAttribute Student s,Model m )
	{
		boolean isAdded = studService.register(s);
		
		if(isAdded)
		{
			m.addAttribute("successMsg","Student Added successfully");
		}
		else
		{
			m.addAttribute("errorMsg","Student is not possible to add there is some problem in cofiguration");
		}
		return "register";
	}
	
	
	
	//update operation
	@RequestMapping("/updateForm")
	public String StudentUpdateForm()
	{
		return "StudentUpdateForm";
	}
	
	@RequestMapping("/update")
	public String StudentUpdateData(@ModelAttribute Student s,Model m )
	{
		boolean isUpadted = studService.update(s);
		
		if(isUpadted )
		{
			m.addAttribute("successMsg","Student update successfully");
		}
		else
		{
			m.addAttribute("errorMsg","Student is not possible to update there is some problem in cofiguration");
		}
		return "StudentUpdateForm";
	}
	
	
	//delete operation
	@RequestMapping("/deleteForm")
	public String StudentdeleeForm()
	{
		return "StudentDeleteForm";
	}
	
	@RequestMapping("/delete")
	public String StudentDeleteData(@RequestParam int id,Model m  )
	{
		boolean isDeleted = studService.delete(id);
		
		if(isDeleted )
		{
			m.addAttribute("successMsg","Student deleted successfully");
		}
		else
		{
			m.addAttribute("errorMsg","Student is not possible to delete there is some problem in cofiguration");
		}
		return "StudentDeleteForm";
	}
	
	
	
	//select operation
	@RequestMapping("/selectStudentForm")
	public String selectStudentForm()
	{
		return "selectStudent";
	}
	
	@RequestMapping("/selectStudentById")
	public String SelectStudentData(@RequestParam int id,Model m )
	{
		Student s = studService.selectStudentById( id);
		
		m.addAttribute("studData",s);
		return "DisplayStudent";
		
	}
	
	
	//select all operation
	@RequestMapping("/selectAllStudent")
	public String SelectAllStudent( Model m )
	{
		List<Student> list = studService.selectAllStudent();
		
		m.addAttribute("studData", list);
		return "DisplayAllStudent";
		
	}

}

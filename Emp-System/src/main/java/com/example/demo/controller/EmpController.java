package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.EmpEntity;
import com.example.demo.service.EmpService;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	
	@GetMapping("/")
	public String home(Model m)
	{
		List<EmpEntity> emp = service.getAllEmp();
		m.addAttribute("emp",emp);
		
		return "index";
	}
	
	@GetMapping("/addemp")
	public String addEmp()
	{
		return "add_emp";
		
		
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute EmpEntity e,HttpSession session)
	{
		System.out.println(e);
		
		service.addEmp(e);
		session.setAttribute("msg", "Employee added Successfully");
		return "redirect:/";
		//return "index";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model m)
	{
		
		EmpEntity e = service.getEmpId(id);
		
		m.addAttribute("emp", e);
		
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute EmpEntity e,HttpSession session) 
	{
		service.addEmp(e);
		session.setAttribute("msg", "Emp Data updated Successfully...");
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable("id") int id, HttpSession session) {
	    service.deleteEmp(id);
	    session.setAttribute("msg", "Emp Data Deleted Successfully...");
	    return "redirect:/";
	}

	
}

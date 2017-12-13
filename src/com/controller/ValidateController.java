package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.pojo.Employee;

public class ValidateController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("darshan","jain"));
		employees.add(new Employee("akshay","pokalwar"));
		employees.add(new Employee("vaibhav","kokate"));
		employees.add(new Employee("ashish","mahajan"));
		employees.add(new Employee("darshan","jain"));
		employees.add(new Employee("akshay","pokalwar"));
		employees.add(new Employee("vaibhav","kokate"));
		employees.add(new Employee("ashish","mahajan"));
		employees.add(new Employee("darshan","jain"));
		employees.add(new Employee("akshay","pokalwar"));
		employees.add(new Employee("vaibhav","kokate"));
		employees.add(new Employee("ashish","mahajan"));

		
		
		
		if(username.equals("admin") && password.equals("admin1")){
			ModelAndView modelAndView=new ModelAndView("welcome");
			Employee e=new Employee(username,password);
			modelAndView.addObject("emp",employees);
			modelAndView.addObject("user",new Employee("aaa","bbb"));
			
			return modelAndView;
		}
		else{
			ModelAndView modelAndView=new ModelAndView("error");
			return modelAndView;
		}
		
	}

}

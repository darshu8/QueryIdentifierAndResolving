package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import pojo.Student;
import service.StudentService;

public class StudentLogin implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		String sid=	req.getParameter("uname");
		String password=	req.getParameter("psw");
		Student s=new Student();
		s.setSid(Integer.valueOf(sid));
		s.setPassword(password);
		
		Student status=StudentService.validateStudent(s);
		if(status!=null) {
			System.out.println("USER IS VALID "+status);
		}
		else {
			System.out.println("user is invalid");
		}
		return null;
	}

}

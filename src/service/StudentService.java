package service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import dao.CustomerDAO;
import dao.StudentDAO;
import pojo.Customer;
import pojo.Student;

public class StudentService {
	
	public static void addStudent(Student student) {
		Resource resource=new ClassPathResource("application.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		StudentDAO studentDAO=(StudentDAO)beanFactory.getBean("studentObj");
		studentDAO.insert(student);
	}	
	
	public static Student validateStudent(Student student) {
		Resource resource=new ClassPathResource("application.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		StudentDAO studentDAO=(StudentDAO)beanFactory.getBean("studentObj");
		return studentDAO.validateStudent(student);
	}
	
	
}

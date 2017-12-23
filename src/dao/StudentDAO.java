package dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import pojo.Student;

public class StudentDAO {
	HibernateTemplate template;
	public HibernateTemplate getTemplate() {
		return template;
	}

	public StudentDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public void insert(Student student) {
			template.save(student);
			System.out.println("STUDENT SAVED");
	}
		
}

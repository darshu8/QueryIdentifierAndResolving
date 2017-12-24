package dao;

import java.util.ArrayList;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;

import pojo.Customer;
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

	public Student validateStudent(Student s) {
		ArrayList<Student> students = (ArrayList<Student>) template
									 .findByCriteria(DetachedCriteria.forClass(Student.class)
									 .add(Restrictions.gt("cid", 1)));
		
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if (student.getSid() == s.getSid() && student.getPassword().equals(s.getPassword())) {
				return student;
			}

		}
		return null;
	}

}

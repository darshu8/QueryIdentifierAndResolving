package dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import pojo.Customer;

public class CustomerDAO {
	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public CustomerDAO() {
		// TODO Auto-generated constructor stub
	}

	public void insert(Object obj) {
		if (obj instanceof Customer) {
			Customer customer = (Customer) obj;
			System.out.println("Persisting the Customer usign Hibernate ORM");
			System.out.println(customer.toString());
			template.save(customer);
			System.out.println("Completed");
		}

	}

	public void delete(Object obj) {
		// TODO Auto-generated method stub

	}

	public void retrieve(Object obj) {
		// TODO Auto-generated method stub

	}
}

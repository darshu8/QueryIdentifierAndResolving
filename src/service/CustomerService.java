package service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import dao.CustomerDAO;
import pojo.Customer;

public class CustomerService {

	public static void addCustomer(Customer customer) {
		Resource resource=new ClassPathResource("application.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		CustomerDAO customerDAO=(CustomerDAO)beanFactory.getBean("cust");
		customerDAO.insert(customer);
	}	
	
	
}

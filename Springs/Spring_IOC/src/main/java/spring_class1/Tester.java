package spring_class1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Tester {

	public static void main(String[] args) {
		ClassPathResource resource=new ClassPathResource("spring_class1/Myconfiguration.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		//Bike b=(Bike)factory.getBean("bike");

		@SuppressWarnings("resource")
		ApplicationContext a=new ClassPathXmlApplicationContext("Spring_class1/Myconfiguration.xml");
		Car c=(Car)a.getBean("car");
		Bike b1=(Bike)a.getBean("bike");
		System.out.println(c+"\n"+b1);	
		
		System.out.println(b1+"\n"+b1);
		
	}

}

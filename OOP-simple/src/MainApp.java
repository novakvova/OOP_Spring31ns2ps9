import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("ConfigDI.xml");
		
		//System.out.println("Hello");
		//Engine engine =  context.getBean("myEngine", Engine.class);  //new EngineElectro(); new EngineLanos(); //new EngineAudi();
		//engine.start();
		Car car = context.getBean("myCar", Car.class); //new CarTesla(engine);
		//car.drive();
		
		Car car2 = context.getBean("myCar", Car.class); //new CarTesla(engine);
		//car2.drive();
		
		boolean res = (car==car2);
		
		System.out.println("Car == "+ res);
		
		System.out.println("Car "+ car);
		
		System.out.println("Car2 "+ car2);
		context.close();

	}

}

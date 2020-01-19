import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("ConfigDI.xml");
		
		//System.out.println("Hello");
		Engine engine =  context.getBean("myEngine", Engine.class);  //new EngineElectro(); new EngineLanos(); //new EngineAudi();
		//engine.start();
		Car car = new CarTesla(engine);
		car.drive();
		
		context.close();

	}

}

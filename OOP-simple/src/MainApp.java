
public class MainApp {

	public static void main(String[] args) {
		//System.out.println("Hello");
		Engine engine = new EngineElectro(); //new EngineLanos(); //new EngineAudi();
		//engine.start();
		Car car = new CarTesla(engine);
		car.drive();

	}

}

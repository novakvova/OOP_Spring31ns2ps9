
public class CarAudi implements Car {
	private Engine engine;
	
	public CarAudi(Engine engine) {
		//super();
		this.engine = engine;
	}

	@Override
	public void drive() {
		engine.start();
		System.out.println("Audi drive go");

	}

}

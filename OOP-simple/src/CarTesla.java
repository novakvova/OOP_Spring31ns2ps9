/**
 * 
 */

/**
 * Tesla
 *
 */
public class CarTesla implements Car {

	private Engine engine;

	public CarTesla(Engine engine) {
		// super();
		this.engine = engine;
	}

	@Override
	public void drive() {
		engine.start();
		System.out.println("Tesla drive go");

	}

}

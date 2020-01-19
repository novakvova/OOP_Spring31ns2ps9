
public class CarZuhuli implements Car {

	private String email;
	private Engine engine;
	
	public void setEngine(Engine engine)
	{
		System.out.println("------Set ingine by property---------");
		this.engine = engine;	
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void drive() {
		engine.start();
		System.out.printf("Zuhuli drive go %s\n", email);

	}

}

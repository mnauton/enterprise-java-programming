import java.util.Optional;

public class Bike {
	private Optional<Wheels> wheels;
    private String brand;
    
    public Bike(Optional<Wheels> wheels, String brand) {
        this.setWheels(wheels);
        this.setBrand(brand);
    }

	public Optional<Wheels> getWheels() {
		return wheels;
	}

	public void setWheels(Optional<Wheels> wheels) {
		this.wheels = wheels;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}


public class Wheels {
	private String brand;
    private int spokes;
    
    public Wheels(String brand, int spokes) {
        this.setBrand(brand);
        this.setSpokes(spokes);
    }

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSpokes() {
		return spokes;
	}

	public void setSpokes(int spokes) {
		this.spokes = spokes;
	}
}

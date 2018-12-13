package lt.bt;

public class Padangos {
	private int heigth;
	private int width;
	private String speed;
	private double price;
	
	
	
	public Padangos() {
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double nextDouble) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString () {
	return this.heigth + " - " + width + " - " + speed;
	}

	
}

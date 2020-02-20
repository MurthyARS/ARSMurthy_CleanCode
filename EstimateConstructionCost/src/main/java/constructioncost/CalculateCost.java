package constructioncost;

public class CalculateCost extends Input{
	public long calculate(int choice) {
		return getArea()*getPrice(choice);
	}
}

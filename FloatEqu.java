
public class FloatEqu {

	public static void main(String[] args) {
		
		double var1 = (1.0/10) * (1.0/10);
		double var2 = (1.0/100);
		final double TOLERANCE = 0.0001;
		
		if (Math.abs(var1 - var2) < TOLERANCE)
			System.out.println("essentially eaual");
	}

}

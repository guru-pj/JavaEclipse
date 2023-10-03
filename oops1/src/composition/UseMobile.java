package composition;

public class UseMobile {
	public static void main(String[] args) {
		Display d1 = new Display();
		Processor p1 = new Processor();
		Mobile m1 = new Mobile();

		d1.Brand = "Samsung";
		d1.price = 15000;
		d1.resolution = 1440;
		d1.type = "OLED";

		p1.brand = "A16 BIONIC";
		p1.noOfCores = 8;
		p1.price = 20000;

		m1.brand = "Apple";
		m1.colour = "Red";
		m1.display = d1;
		m1.portType = "Type C";
		m1.processor = p1;
		m1.price = 69500;

		System.out.println("MOBILE DETAILS: ");
		System.out.println(m1.brand + " " + m1.colour + " " + m1.price + " " + m1.portType);

		System.out.println("DISPLAY DETAILS: ");
		System.out.println(
				m1.display.Brand + " " + m1.display.type + " " + m1.display.resolution + " " + m1.display.price);

		System.out.println("PROCESSOR DETAILS: ");
		System.out.println(m1.processor.brand + " " + m1.processor.noOfCores + " " + m1.processor.price);

	}

}

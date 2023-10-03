package testQuestions;

public class UseAC {
	public static void main(String[] args) throws AC {
		AC a1 = new AC("Voltas", "INV3S1.5T", 40000, 0);
		AC a2 = new AC("OG", "INV5S2T", 55000, 60);
		AC a3 = new AC("Panasonic", "INV4S1.5T", 45000, -1);
		AC a4 = new AC("Samsung", "INV2S1T", 28000, 12);
		AC a5 = new AC("Bluestar", "INV5S1.5T", 55000, 48);

		AC[] acs = { a1, a2, a3, a4, a5 };
		try {
			for (int i = 0; i < acs.length; i++) {
				if (acs[i].getWarranty() <= 0) {
					throw new AC("NoWarrantyException");
				}

			}
		} catch (AC a) {
			System.out.println("Exception Handled");
		}
	}
}

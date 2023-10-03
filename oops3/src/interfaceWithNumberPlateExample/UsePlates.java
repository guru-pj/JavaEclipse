package interfaceWithNumberPlateExample;

public class UsePlates {
	public static void main(String[] args) {
		TamilNaduGov tG = new TamilNaduGov();
		KeralaGov keG = new KeralaGov();
		KarnatakaGov kaG = new KarnatakaGov();

		System.out.print("TamilNaduGovRules");
		System.out.print(" " + tG.plateColour());
		System.out.print(" " + tG.fontColour());
		System.out.println(" " + tG.revettedPlate());

		System.out.print("KeralaGovRules");
		System.out.print(" " + keG.plateColour());
		System.out.print(" " + keG.fontColour());
		System.out.println(" " + keG.revettedPlate());

		System.out.print("KarnatakaGovRules");
		System.out.print(" " + kaG.plateColour());
		System.out.print(" " + kaG.fontColour());
		System.out.println(" " + kaG.revettedPlate());
	}
}

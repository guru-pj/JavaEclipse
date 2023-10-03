package multiLevel;

public class Speaker extends AudioProduct {
	boolean isWireless;
	String range; // hometheatre or soundBars or Portable

	public Speaker(boolean b, String r, int p, String c) {
		super(p, c);
		isWireless = b;
		range = r;
	}

	public String toString() {
		return super.toString() + ", " + "IsWireless: " + isWireless + ", " + "Range: " + range;
	}
}

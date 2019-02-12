public class Hotel {
	private static final int hotelBudget = 999_999;
	int visitorsPerYear;
	String hotelName;
	int numberOfRooms;
	private double avarageCost;
	private int rate;
	protected String vipClient1;
	protected String vipClient2;

	public Hotel() {
		visitorsPerYear = 0;
		hotelName = "unknown";
		numberOfRooms = 0;
		avarageCost = 0;
		rate = 0;
		vipClient1 = "unknown";
		vipClient2 = "unknown";
	}

	public Hotel(int visitorsPerYear, String hotelName, int numberOfRooms, double avarageCost) {
		this.visitorsPerYear = visitorsPerYear;
		this.hotelName = hotelName;
		this.numberOfRooms = numberOfRooms;
		this.avarageCost = avarageCost;
	}

	public Hotel(int visitorsPerYear, String hotelName, int numberOfRooms, double avarageCost, int rate,
			String vipClient1, String vipClient2) {
		this(visitorsPerYear, hotelName, numberOfRooms, avarageCost);
		this.rate = rate;
		this.vipClient1 = vipClient1;
		this.vipClient2 = vipClient2;
	}

	public String toString() {
		return "Visitors per year: " + visitorsPerYear + "\n" + "Name of hotel: " + hotelName + "\n"
				+ "Number of rooms: " + numberOfRooms + "\n" + "Avarage cost of one room: " + avarageCost + "\n"
				+ "Hotel rate: " + rate + "\n" + "First VIP client name: " + vipClient1 + "\n"
				+ "Second VIP client name: " + vipClient2 + "\n";
	}

	public void resetValues(int visitorsPerYear, String hotelName, int numberOfRooms, double avarageCost, int rate,
			String vipClient1, String vipClient2) {
		this.visitorsPerYear = visitorsPerYear;
		this.hotelName = hotelName;
		this.numberOfRooms = numberOfRooms;
		this.avarageCost = avarageCost;
		this.rate = rate;
		this.vipClient1 = vipClient1;
		this.vipClient2 = vipClient2;
	}

	public void setAvarageCost(int avarageCost) {
		this.avarageCost = avarageCost;
	}

	public double getAvarageCost() {
		return avarageCost;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

	public static int printStaticHotelBudget() {
		return hotelBudget;
	}

	public int printHotelBudget() {
		return hotelBudget;
	}

}
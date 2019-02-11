public class Hotel {
	private static final int hotelBudget = 999_999;
	int visitorsPerYear;
	String hotelName;
	int numberOfRooms;
	private double avarageCost;
	private int rate;
	protected String vipClient_1;
	protected String vipClient_2;

public Hotel () {
	visitorsPerYear = 0;
	hotelName = "unknown";
	numberOfRooms = 0;
	avarageCost = 0;
	rate = 0;
	vipClient_1 = "unknown";
	vipClient_2 = "unknown";
}

public Hotel(int visitorsPerYear, String hotelName, int numberOfRooms, double avarageCost) {
	this.visitorsPerYear = visitorsPerYear;
	this.hotelName = hotelName;
	this.numberOfRooms = numberOfRooms;
	this.avarageCost = avarageCost;
}

public Hotel(int visitorsPerYear, String hotelName, int numberOfRooms, double avarageCost,
		int rate, String vipClient_1, String vipClient_2){
	this.visitorsPerYear = visitorsPerYear;
	this.hotelName = hotelName;
	this.numberOfRooms = numberOfRooms;
	this.avarageCost = avarageCost;
	this.rate = rate;
	this.vipClient_1 = vipClient_1;
	this.vipClient_2 = vipClient_2;
}

public String toString () {
	System.out.println ("Number of visitors per year: " + visitorsPerYear);
	System.out.println ("Name of hotel: " + hotelName);
	System.out.println ("Number of rooms: "+ numberOfRooms);
	System.out.println ("Avarage cost of one room: " + avarageCost);
	System.out.println ("Hotel rate: " + rate);
	System.out.println ("First VIP client name: " + vipClient_1);
	System.out.println ("Second VIP client name: " + vipClient_2);
	return "";
}

public void resetValues(int visitorsPerYear, String hotelName, int numberOfRooms, double avarageCost,
		int rate, String vipClient_1, String vipClient_2){
	this.visitorsPerYear = visitorsPerYear;
	this.hotelName = hotelName;
	this.numberOfRooms = numberOfRooms;
	this.avarageCost = avarageCost;
	this.rate = rate;
	this.vipClient_1 = vipClient_1;
	this.vipClient_2 = vipClient_2;
}

public void setavarageCost (int avarageCost){
	this.avarageCost = avarageCost;
}

public double getavarageCost () {
	return avarageCost;
}

public void setrate (int rate){
	this.rate = rate;
}

public double getrate () {
	return rate;
}

public static int printStaticHotelBudget() {
    return hotelBudget;
}

public int printHotelBudget() {
    return hotelBudget;
}

}
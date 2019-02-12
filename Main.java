
public class Main {
	public static void main(String[] args) {

		Hotel yorik = new Hotel();
		Hotel rius = new Hotel(490, "Rius", 22, 350.5);
		Hotel leff = new Hotel(8560, "Leff", 36, 220.0, 5, "Petruk", "Gnat");

		yorik.toString();
		rius.toString();
		System.out.println(leff.toString());

		System.out.println("hotel Budget : " + yorik.printHotelBudget());
		System.out.println("hotel Budget : " + rius.printHotelBudget());
		System.out.println("hotel Budget : " + leff.printHotelBudget());
		System.out.println("hotelBudget printed by static method: " + Hotel.printStaticHotelBudget());

	}
}

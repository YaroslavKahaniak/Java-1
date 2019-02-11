public class Main {
	 public static void main(String[] args) {

	        Hotel Yorik = new Hotel();
	        Hotel Rius = new Hotel (490, "Rius", 22, 350.5);
	        Hotel Leff = new Hotel(8560, "Leff", 36, 220.0, 5, "Petruk", "Gnat");

	        System.out.println(Yorik.toString());
	        System.out.println(Rius.toString());
	        System.out.println(Leff.toString());

	        System.out.println("hotel Budget : " + Yorik.printHotelBudget());
	        System.out.println("hotel Budget : " + Rius.printHotelBudget());
	        System.out.println("hotel Budget : " + Leff.printHotelBudget());
            System.out.println("hotelBudget printed by static method: " + Hotel.printStaticHotelBudget());

	    }
}

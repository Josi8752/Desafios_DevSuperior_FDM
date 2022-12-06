package utilities;

public class Bill {

	public static char gender;
	public static int beer;
	public static int barbecue;
	public static int softDrink;

	public static double feeding() {
		return (beer * 5.0) + (barbecue * 7.0) + (softDrink * 3.0);
	}

	public static double cover() {
		if (feeding() > 30.0) {
			return 0.0;
		} else {
			return 4.0;
		}
	}

	public static double ticket() {
			if(gender == 'F' ) {
				return 8.0;
			}
			else {
				return 10.0;
			}
		}
	public static double total() {
		return feeding() +  cover() + ticket();
				
	}
}

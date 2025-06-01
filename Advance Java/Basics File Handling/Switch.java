package Basics;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day ="Tuesday";
		String timeOfDay = "morni";
		switch(day) {
		case "monday":
		System.out.println("Morning Hii");
		switch(timeOfDay) {
		case "morning":
			System.out.println("Good morning!");
			break;
		case "Evening":
			System.out.println("good evening");
			break;
		default:
			System.out.println("Invalid day");
		    break;
		}
		break;
		case "Tuesday":
			System.out.println("it tuesday keep going");
		switch(timeOfDay) {
		case "morning":
			System.out.println("good moring! keep up the good work");
			break;
		case "Evening":
			System.out.println("good evening Done for the day");
			break;
		default:
			System.out.println("INvalid time of day");
			break;
		}
		break;
		}
	}

}

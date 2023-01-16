package SwichCase;

public class Project1 {

	public static void main(String[] args) {
	
		String day ="tuesday";
		switch(day)
		{
		case "Monday":
		System.out.println("Today is monday");
		break;
		case "tuesday":
		System.out.println("Today is tuesday");
		break;
		case "wednesday":
		System.out.println("Today is wednesday");
		break;
		case "thusday":
		System.out.println("Today is thusday");
		break;
		case "friday":
		System.out.println("Today is friday");
	
		default:
			System.out.println("Wow,its weekend");
		}
		System.out.println("Switch finished");
		}

	}


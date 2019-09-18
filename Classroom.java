
public class Classroom {

	public static void main(String[] args) {
		
		// Les instances de classes
		Wilder kaaris = new Wilder("Kaaris", 9);
		kaaris.setAware(true);
		System.out.println(kaaris.whoAmI());

		Wilder booba = new Wilder("Booba", 12);
		booba.setAware(false);
		System.out.println(booba.whoAmI());
	}

}

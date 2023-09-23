package hotel;

public class Test {

	public static void main(String[] args) {
		
		Soba soba1 = new Soba();
		soba1.setBrojSobe(123);
		soba1.setBrojKreveta(5);
		soba1.setZauzeto(false);
		
		System.out.println("Broj sobe je: " + soba1.getBrojSobe());
		System.out.println("Broj kreveta u sobi je: " + soba1.getBrojKreveta());
		System.out.println("Da li je soba zauzeta: " + soba1.isZauzeto());
		System.out.println("Da li je moguce da imam sobu: " + soba1.odobrenje(2));

	}

}

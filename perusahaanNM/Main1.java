package perusahaanNM;

public class Main1 {
	public static void main (String[] args) {
		Invoice inv1 = new Invoice ("Product1", 1, 3000 );
		Invoice inv2 = new Invoice ("Product2", 4, 2000 );
		Invoice inv3 = new Invoice ("Product3", 2, 3000 );
		Invoice inv4 = new Invoice ("Product4", 1, 4000 );
	
		Invoice[] invoices = {inv1, inv2, inv3, inv4};
		Employees nom = new Employees(14522, 10000000, "Marker", invoices);
		
		System.out.println(nom);
	}
	
	
}

package perusahaanNM;

public class Employees implements Payable{
	private int noReg;
	private int gjiPerBulan;
	private String name;
	private Invoice[] invoices;
	
	public Employees (int noReg, int gjiPerBulan, String name, Invoice[] invoices) {
		this.noReg = noReg;
		this.gjiPerBulan = gjiPerBulan;
		this.name = name;
		this.invoices = invoices;
	}
	@Override
	public double getPayableAmount() {
		double totalInv = 0;
		for(Invoice invoice : invoices) {
			totalInv += invoice.getPayableAmount();
		}
		return gjiPerBulan - totalInv;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGajiPB() {
		return gjiPerBulan;
	}
	
	public int getNoRef() {
		return noReg;
	}
	
	public Invoice[] getInv() {
		return invoices;
	}
	
	@Override 
	public String toString() {
		StringBuilder invDetails = new StringBuilder();
		for (Invoice invoice : invoices) {
			invDetails.append(invoice.toString()).append("\n");
			
		}
		return String.format("Employee [Reg. No: %d, Name: %s, Salary: %d, Payable Amount: %.2f]\nInvoices:\n%s"
				, noReg, name, gjiPerBulan, getPayableAmount(), invDetails.toString());
	}
}

package perusahaanNM;

public class Invoice implements Payable{
	
		private String nProduk;
		private int jumlah;
		private int hargaper;
		
		@Override
		public double getPayableAmount() {
			return  jumlah * hargaper;
		}
		public Invoice(String nProduk, int jumlah, int hargaper) {
			this.nProduk = nProduk;
			this.jumlah = jumlah;
			this.hargaper = hargaper;
		}
		public String getNProduk() {
			return nProduk;
		}
		public int getJumlah() {
			return jumlah;
		}
		
		public int getHargaPer() {
			return hargaper;
		}
		@Override
		public String toString() {
			return String.format("%s: %d x %d = %.2f", nProduk, jumlah, hargaper);
		}
}

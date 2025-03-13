public class Tabungan extends Rekening {
   double bungaTahunan;

   public Tabungan(String var1, String var2, double var3, double var5) {
      super(var1, var2, var3);
      this.bungaTahunan = this.bungaTahunan;
   }

   public double getBunga() {
      return this.bungaTahunan;
   }

   public void hitungBunga(int var1) {
      double var2 = this.bungaTahunan / 100.0 * this.getSaldo() * (double)var1;
      System.out.println("Bunga yang di dapatkan selama " + var1 + " bulan adalah : " + var2);
   }

   public void infoRekening() {
      System.out.println("Nama Pemilik : " + this.getNamaPemilik());
      System.out.println("Nomor Rekening : " + this.getNoRekening());
      System.out.println("Saldo : " + this.getSaldo());
      System.out.println("Bunga : " + this.getBunga());
   }
}

public class Giro extends Rekening {
   double limitPenarikan;

   public Giro(double var1, String var3, String var4, double var5) {
      super(var3, var4, var5);
      this.limitPenarikan = var1;
   }

   public double getLimitPenarikan() {
      return this.limitPenarikan;
   }

   public void setLimitPenarikan(double var1) {
      this.limitPenarikan = var1;
   }

   public void tarikTunai(double var1) {
      if (var1 <= this.saldo + this.limitPenarikan) {
         this.saldo -= var1;
         System.out.println("Saldo " + this.namaPemilik + " sekarang adalah : " + this.saldo);
      } else {
         System.out.println("Maaf, jumlah penarikan melebihi limit");
      }

   }
}

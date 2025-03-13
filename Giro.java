public class Giro extends Rekening {
    double limitPenarikan;

    public Giro(double limitPenarikan, String nama, String noRek, double saldo) {
        super(nama, noRek, saldo);
        this.limitPenarikan = limitPenarikan;
    }

    public double getLimitPenarikan() {
        return limitPenarikan;
    }

    public void setLimitPenarikan(double limitPenarikan) {
        this.limitPenarikan = limitPenarikan;
    }
    @Override
    public void tarikTunai(double jumlah){
        if (jumlah <= saldo + limitPenarikan) {
            saldo -= jumlah;
            System.out.println("Saldo " + namaPemilik + " sekarang adalah : " + saldo);
        } else {
            System.out.println("Maaf, jumlah penarikan melebihi limit");
        }
    }

    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Limit Penarikan : " + getLimitPenarikan());
    }

    
}

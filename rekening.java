public class Rekening {
    String namaPemilik;
    String noRekening;
    double saldo;

    public Rekening(String nama, String noRek, double saldo){
        namaPemilik = nama;
        noRekening = noRek;
        this.saldo = saldo;
    }   
    
    public String getNamaPemilik(){
        return namaPemilik;
    }

    public String getNoRekening(){
        return noRekening;
    }

    public double saldo(){
        return saldo;
    }
    
    public void setNamaPemilik(String nama){
        namaPemilik = nama;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setNoRekening(String noRek){
        noRekening = noRek;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setorTunai(double jumlah){
        saldo += jumlah;
        System.out.println("Saldo " + namaPemilik + " setelah setor  : " + saldo);
    }

    public void tarikTunai(double jumlah){
            if (jumlah <= saldo + jumlah) {
                saldo -= jumlah;
                System.out.println("Saldo " + namaPemilik + "  sekarang adalah : " + saldo);
            } else {
                System.out.println("Maaf, jumlah penarikan melebihi limit");
            }
        }

    public void tampilkanInfo(){
        System.out.println("Nama Pemilik : " + getNamaPemilik());
        System.out.println("Nomor Rekening : " + getNoRekening());
        System.out.println("Saldo : " + getSaldo());
    }

}    

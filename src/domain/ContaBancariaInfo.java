package domain;

public class ContaBancariaInfo{
    public int setCodigoConta;
    private String nomeTitular;
    private double saldo;
    private double dividas;
    private double dividaAtualizada;
    private int codigoConta;
    private String respUserSouN;

    public double getDividaAtualizada() {
        return dividaAtualizada;
    }

    public void setDividaAtualizada(double dividaAtualizada) {
        this.dividaAtualizada = dividaAtualizada;
    }

    public String getRespUserSouN() {
        return respUserSouN;
    }

    public void setRespUserSouN(String respUserSouN) {
        this.respUserSouN = respUserSouN;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDividas() {
        return dividas;
    }

    public void setDividas(double dividas) {
        this.dividas = dividas;
    }

    public int getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(int codigoConta) {
        this.codigoConta = codigoConta;
    }
}

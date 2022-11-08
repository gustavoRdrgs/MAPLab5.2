package contribuintes_Imposto;

public class Contribuinte implements Comparable<Contribuinte>{

    private String nome;
    private int numContribuinte;
    private double valorCasa;
    private double valorCarro;   
    private String profissao;

    public Contribuinte(String nome, int numContribuinte, double valorCasa, double valorCarro) {
        this.nome = nome;
        this.numContribuinte = numContribuinte;
        this.valorCasa = valorCasa;
        this.valorCarro = valorCarro;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public double calculaRiqueza() {
        double riqueza = valorCarro + valorCasa;
        return (riqueza + (riqueza / 2));
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumContribuinte() {
        return numContribuinte;
    }
    public void setNumContribuinte(int numContribuinte) {
        this.numContribuinte = numContribuinte;
    }
    public double getValorCasa() {
        return valorCasa;
    }
    public void setValorCasa(double valorCasa) {
        this.valorCasa = valorCasa;
    }
    public double getvalorCarro() {
        return valorCarro;
    }
    public void setvalorCarro(double valorCarro) {
        this.valorCarro = valorCarro;
    }

    public double getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(double valorCarro) {
        this.valorCarro = valorCarro;
    }

    @Override
    public int compareTo(Contribuinte outroContribuinte) {

        if ((this.valorCasa + this.valorCarro) > (outroContribuinte.getValorCasa() + outroContribuinte.getValorCarro())) { 
            return -1; 
        } if ((this.valorCasa + this.valorCarro) < (outroContribuinte.getValorCasa() + outroContribuinte.getValorCarro())) { 
            return 1; 
        } 
        return 0; 
    }
        
}

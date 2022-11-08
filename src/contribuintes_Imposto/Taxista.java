package contribuintes_Imposto;

public class Taxista extends Rodoviarios{

    private int numPassageiros;
    private String profissao = "Taxista";  

    public Taxista(String nome, int numContribuinte, double valorCasa, double valorCarro, double descontoRodoviarios,
    int kmAno, int numPassageiros) {
        super(nome, numContribuinte, valorCasa, valorCarro, descontoRodoviarios, kmAno, "Taxista");
        this.numPassageiros = numPassageiros;

    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }
    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double calcularImpostoTaxi(){
        double impostoTaxista;
        impostoTaxista = (numPassageiros * 0.5);
        return impostoTaxista;
    }

    public double calcularDescontoTaxi(){
        double descontoTaxi;
        descontoTaxi = (kmAno * 0.01);
        return descontoTaxi;
    }

    public String testaImposto() {
        if (calcularDescontoTaxi() > calcularImpostoTaxi()) {
            return "\nO profissional está isento do imposto pois seu desconto é maior que ele";
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        return "Informações para o taxista " + getNome() + "\n" + testaImposto() + "\nImposto: " + calcularImpostoTaxi() + "\nDesconto no imposto: " + calcularDescontoTaxi() +"\nRiqueza: " +calculaRiqueza()+"\n";
    }

}

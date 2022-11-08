package contribuintes_Imposto;

public class Medico extends Contribuinte {

    private int numPacientes;
    private double despesaCongresso;
    private String profissao = "Médico";

    public Medico(String nome, int numContribuinte, double valorCasa, double valorCarro, int numPacientes,
            double despesaCongresso) {
        super(nome, numContribuinte, valorCasa, valorCarro);
        this.numPacientes = numPacientes;
        this.despesaCongresso = despesaCongresso;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getNumPacientes() {
        return numPacientes;
    }
    public void setNumPacientes(int numPacientes) {
        this.numPacientes = numPacientes;
    }
    public double getDespesaCongresso() {
        return despesaCongresso;
    }
    public void setDespesaCongresso(double despesaCongresso) {
        this.despesaCongresso = despesaCongresso;
    }

    public double calcularImpostoMedico(){
        double impostoMedico;
        impostoMedico = (numPacientes * 10);
        return impostoMedico;
    }

    public double calculaDescontoMedico(){
        double descontoImpostoMedico;
        descontoImpostoMedico = (despesaCongresso);
       return descontoImpostoMedico;
    }

    public String testaImposto() {
        if (calculaDescontoMedico() > calcularImpostoMedico()) {
            return "\nO profissional está isento do imposto pois seu desconto é maior que ele";
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        return "Informações para o médico " + getNome() + "\n" + testaImposto() + "\nImposto: " + calcularImpostoMedico() + "\nDesconto no imposto: " + calculaDescontoMedico() + "\nRiqueza: " + calculaRiqueza();
    }
    
}

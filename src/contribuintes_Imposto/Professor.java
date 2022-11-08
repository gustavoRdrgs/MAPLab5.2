package contribuintes_Imposto;

public class Professor extends Contribuinte{

    private double salarioProfessor;
    private double materialDidatico;
    private String profissao = "Professor";
    
    public Professor(String nome, int numContribuinte, double valorCasa, double valorCarro, double salarioProfessor,
            double materialDidatico) {
        super(nome, numContribuinte, valorCasa, valorCarro);
        this.salarioProfessor = salarioProfessor;
        this.materialDidatico = materialDidatico;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public double getSalarioProfessor() {
        return salarioProfessor;
    }

    public void setSalarioProfessor(double salarioProfessor) {
        this.salarioProfessor = salarioProfessor;
    }

    public double getMaterialDidatico() {
        return materialDidatico;
    }

    public void setMaterialDidatico(double materialDidatico) {
        this.materialDidatico = materialDidatico;
    }

    public double calcularImpostoProfessor(){
        double impostoProfessor;
        double percentualUm = 5/100;
        double percentualDois = 10/100;
        double percentualTres = 20/100;

        if (salarioProfessor <= 1200){
        
            impostoProfessor = (salarioProfessor * percentualUm);
            return impostoProfessor;

        }else if (salarioProfessor > 1200 && salarioProfessor <= 6000 ){
        
            impostoProfessor = (salarioProfessor * percentualDois);
            return impostoProfessor;

        }else{
        
            impostoProfessor = (salarioProfessor * percentualTres);
            return impostoProfessor;
        }
        
    }

    public double calcularDescontoProfessor(){
      
       return materialDidatico / 2;
    }

    public String testaImposto() {
        if (calcularDescontoProfessor() > calcularImpostoProfessor()) {
            return "\nO profissional está isento do imposto pois seu desconto é maior que ele";
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        return "Informações para o professor " + getNome() + "\n" + testaImposto() + "\nImposto: " + calcularImpostoProfessor() + "\nDesconto no imposto: " + calcularDescontoProfessor() + "\nRiqueza: " + calculaRiqueza();
    }
  
}
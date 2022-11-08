package contribuintes_Imposto;

public class Caminhoneiro extends Rodoviarios{
    
    private double numToneladas;
   
    public Caminhoneiro(String nome, int numContribuinte, double valorCasa, double valorCarro,
            double descontoRodoviarios, int kmAno, double numToneladas) {
        super(nome, numContribuinte, valorCasa, valorCarro, descontoRodoviarios, kmAno, "Caminhoneiro");
        this.numToneladas = numToneladas;
    }

    public double getNumToneladas() {
        return numToneladas;
    }

    public void setNumToneladas(double numToneladas) {
        this.numToneladas = numToneladas;
    }

    public double calcularImpostoCaminhao(){
        double impostoCaminhoneiro;
        double impostoMaior;

        if (numToneladas < 10){
        impostoCaminhoneiro = 500;
        return impostoCaminhoneiro;
        } 
        else{  
        impostoMaior = (numToneladas - 10);
        impostoMaior = (500 + (impostoMaior * 100));
        if (impostoMaior < calcularDescontoCaminhao()) {
            return 0;
        }
        return impostoMaior - calcularDescontoCaminhao();
        }
    }

    public double calcularDescontoCaminhao(){
        double descontoCaminhao;
        descontoCaminhao = (kmAno * 0.01);
        return descontoCaminhao;
    }

    public String testaImposto() {
        if (calcularDescontoCaminhao() > calcularImpostoCaminhao()) {
            return "\nO profissional está isento do imposto pois seu desconto é maior que ele";
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        return "Informações para o professor " + getNome() + "\n" + testaImposto() + "\nImposto: " + calcularImpostoCaminhao() + "\nDesconto no imposto: " + calcularDescontoCaminhao() + "\nRiqueza: " + calculaRiqueza();
    }
    
}


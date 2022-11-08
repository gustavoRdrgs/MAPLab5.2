package contribuintes_Imposto;

public class Rodoviarios extends Contribuinte{

 protected double descontoRodoviarios;
 protected int kmAno;

public Rodoviarios(String nome, int numContribuinte, double valorCasa, double valorCarro, double descontoRodoviarios, int kmAno, String profissao) {
    super(nome, numContribuinte, valorCasa, valorCarro);
    this.descontoRodoviarios = descontoRodoviarios;
    this.kmAno = kmAno;
}

public double getDescontoRodoviarios() {
    return descontoRodoviarios;
}

public void setDescontoRodoviarios(double descontoRodoviarios) {
    this.descontoRodoviarios = descontoRodoviarios;
}

public int getKmAno() {
    return kmAno;
}

public void setKmAno(int kmAno) {
    this.kmAno = kmAno;
}

}

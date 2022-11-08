package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import contribuintes_Imposto.Caminhoneiro;
import contribuintes_Imposto.Contribuinte;
import contribuintes_Imposto.Medico;
import contribuintes_Imposto.Professor;
import contribuintes_Imposto.Taxista;

public class ClasseCriadora {
    
    public static Caminhoneiro criarCaminhoneiro (String nome, int numContribuinte, double valorCasa, double valorCarro,
    double descontoRodoviarios, int kmAno, double numToneladas) {

        return new Caminhoneiro(nome, numContribuinte, valorCasa, valorCarro, descontoRodoviarios, kmAno, numToneladas);
    }

    public static Medico criarMedico(String nome, int numContribuinte, double valorCasa, double valorCarro, int numPacientes,
    double despesaCongresso) {
        
        return new Medico(nome, numContribuinte, valorCasa, valorCarro, numPacientes, despesaCongresso);
    }

    public static Professor criarProfessor(String nome, int numContribuinte, double valorCasa, double valorCarro, double salarioProfessor,
    double materialDidatico) {

        return new Professor(nome, numContribuinte, valorCasa, valorCarro, salarioProfessor, materialDidatico);
    }

    public static Taxista criarTaxista(String nome, int numContribuinte, double valorCasa, double valorCarro,
    double descontoRodoviarios, int kmAno, int numPassageiros) {

        return new Taxista(nome, numContribuinte, valorCasa, valorCarro, descontoRodoviarios, kmAno, numPassageiros);
    }

    private static List<Contribuinte> contribuintes = new ArrayList<>();
    
    public static void addNovoProfissional(Contribuinte contribuinte) {
        
        contribuintes.add(contribuinte);
    }

    public static void exibirInfosList () {

        Collections.sort(contribuintes);
        
        double valorBens = 0;

        for(Contribuinte pr: contribuintes) {

            System.out.println("NOME: " + pr.getNome() + "\nFUNÇÃO: " + pr.getProfissao() + "\nPATRIMÔNIO: " + (pr.getValorCarro() + pr.getValorCasa()) + "\n");

            valorBens = valorBens + (pr.getValorCarro() + pr.getValorCasa());
        }

        System.out.println("VALOR DO LIMIAR: " + ((valorBens / contribuintes.size()) + 0.5 * (valorBens / contribuintes.size())) + "\n");
    }
}

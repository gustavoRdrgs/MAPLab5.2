import contribuintes_Imposto.Caminhoneiro;
import contribuintes_Imposto.Medico;
import contribuintes_Imposto.Professor;
import contribuintes_Imposto.Taxista;
import utils.ClasseCriadora;

public class App {
    public static void main(String[] args) {

        Taxista taxista1 = ClasseCriadora.criarTaxista("Jorge", 1234, 45468, 35000, 2.650, 150000, 10000);
        ClasseCriadora.addNovoProfissional(taxista1);

        // Os métodos toString exibem as informações de cada profissional
        System.out.println(taxista1.toString());

        Medico medico1 = ClasseCriadora.criarMedico("Carlos", 2222, 50000, 40000, 40, 2000);
        ClasseCriadora.addNovoProfissional(medico1);

        //System.out.println(medico1.toString());

        Professor professor1 = ClasseCriadora.criarProfessor("Maria", 5555, 38000, 30000, 3000, 2000);
        ClasseCriadora.addNovoProfissional(professor1);

        //System.out.println(professor1.toString());

        Caminhoneiro caminhoneiro1 = ClasseCriadora.criarCaminhoneiro("Ana", 7498, 55000, 48000, 2300, 500000, 8);
        ClasseCriadora.addNovoProfissional(caminhoneiro1);

        //System.out.println(caminhoneiro1.toString());

        /* O método exibirInfosList exibe todos os trabalhadores ordenados por lista e calcula qual o limiar
         * dos bens deles a partir do que é pedido na questão */
        ClasseCriadora.exibirInfosList();
    }
}

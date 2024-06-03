import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class ProcessoSeletivo {
    static int candidatoAtual = 0;
    public static void main(String[] args) throws Exception{
        selecionarCandidatos();
    }

    public void imprimirCandidatos(){
        String [] candidatos = {"Rodrigo", "Junior","Andre"};

        System.out.println();

    }

    static void selecionarCandidatos() throws Exception {
        String [] candidatos = {"Rodrigo", "Junior"};
        String [] candidatosSelecionados = {};
        int numCandidatosSelecionados = 0;
        int candidatoAtual = 0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            System.out.println("Digite o salario pretendido do candidato " +candidato);
            double salarioPretendido = scanner.nextDouble();
            candidatoAtual++;
            analisarCandidato(salarioPretendido);
        }
    }   

    static void analisarCandidato(double salarioPretendido) {
        String[] candidatos = {"Rodrigo", "Junior","Lucas","Gabriel"};
        double salarioBase = 2000.0;
        String candidato = candidatos[candidatoAtual];

            if (salarioBase > salarioPretendido) {
                System.out.println("Ligar para o candidato " + candidato);
                
            } else if (salarioBase == salarioPretendido) {
                System.out.println("Ligar para o candidato " + candidato + " com contra proposta");
                
            } else if(salarioBase < salarioPretendido){
                System.out.println("Ola candidato " + candidato + ". Aguarde resultado dos demais candidatos");
            }
            candidatoAtual++;    
    }      
}

public class SeletivaCandidatos {
    public static void main(String[] args) {
        System.out.println("Processo seletivo.");
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);


    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println(("LIGAR PARA O CANDIDATO."));

        }else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRAPROPOSTA.");
        }else {
            System.out.println("AGUARDADNDO O RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    
        
    }
}
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Aluno {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        LocalDate dataDoDia = LocalDate.now();
        DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/YY");
        System.out.println("Data do dia: " + dataDoDia.format(formatadorBarra));

        List<String> nomes = new ArrayList<>();
        nomes.add("Hera");
        nomes.add("Zeus");
        nomes.add("Ares");
        nomes.add("Dinísio");
        nomes.add("Atena");
        nomes.add("Hermes");

        System.out.println("Lista desordenada de alunos: "+ nomes);
        Collections.sort(nomes);
        System.out.println("Lista ordenanda de alunos: " + nomes);
        System.out.println();

        HashMap<String,String> chamada = new HashMap<>();

        char opcao;

        for (String nomeDoAluno : nomes) {
            System.out.println("O(A) aluno(a) " + nomeDoAluno + " está presente no dia " +dataDoDia.format(formatadorBarra) + "?");
            System.out.println("Digite 'A' para ausente e 'P' para presente");
            opcao = entrada.next().charAt(0);
            switch (opcao) {
                case 'A':
                case 'a':
                    System.out.println("Ausente");
                    chamada.put(nomeDoAluno,"Ausente");
                    break;
                case 'P':
                case 'p':
                    System.out.println("Presente");
                    chamada.put(nomeDoAluno,"Presente");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
                    }
                }

        System.out.println("Aluno(a)\t" + dataDoDia);
        for (Map.Entry<String,String> presenca: chamada.entrySet()){
            System.out.println(presenca.getKey() + "\t\t" + presenca.getValue());};
    }


    }

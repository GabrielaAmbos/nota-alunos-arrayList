import java.util.Scanner;

public class TestaDisciplina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Disciplina disciplina = new Disciplina();
        int opcao = 0;
        do {

            System.out.print("Informe o nome do aluno: ");
            String nomeAluno = in.next();

            System.out.println("Informe a nota A do: " + nomeAluno);
            double notaA = in.nextDouble();

            System.out.println("Informe a nota B do: " + nomeAluno);
            double notaB = in.nextDouble();

            Aluno aluno = new Aluno(nomeAluno, notaA, notaB);
            disciplina.adicionar(aluno);

            System.out.println("Deseja cadastrar outro aluno? \n1-Sim   2-Nao");
            opcao = in.nextInt();
            
        } while(opcao != 2);


        in.close();

        for(int i = 0; i < disciplina.tamanho(); i++) {
            Aluno aluno = disciplina.listar(i);
            System.out.println(aluno.toString());
        }

        System.out.println("Media geral da turma: " + disciplina.mediaGeral());
        System.out.println("Maior media: " + disciplina.maiorMedia());
        System.out.println("Menor media: " + disciplina.menorMedia());
        System.out.println("Maior nota: " + disciplina.maiorNota());
        System.out.println("Menor nota: " + disciplina.menorNota());
    }
}

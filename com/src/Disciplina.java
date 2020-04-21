import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private List<Aluno> alunos;

    public Disciplina() {
        this.alunos = new ArrayList<>();;
    }

    public void adicionar(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public Aluno listar(int posicao) {
        return this.alunos.get(posicao);
    }

    public double mediaGeral() {
        double soma = 0;
        for(int i = 0; i < alunos.size(); i++) {
            soma += alunos.get(i).getMedia();
        }
        return soma / alunos.size();
    }

    public double maiorNota() {
        double maior = alunos.get(0).getNotaA();
        for(int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getNotaA() > maior) {
                maior = alunos.get(i).getNotaA();
            }
            if(alunos.get(i).getNotaB() > maior) {
                maior = alunos.get(i).getNotaB();
            }
        }
        return maior;
    }

    public double menorNota() {
        double menor = alunos.get(0).getNotaA();
        for(int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getNotaA() < menor) {
                menor = alunos.get(i).getNotaA();
            }
            if(alunos.get(i).getNotaB() < menor) {
                menor = alunos.get(i).getNotaB();
            }
        }
        return menor;
    }

    public double maiorMedia() {
        double maiorMedia = alunos.get(0).getMedia();
        for(int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getMedia() > maiorMedia) {
                maiorMedia = alunos.get(i).getMedia();
            }
        }
        return maiorMedia;
    }

    public double menorMedia() {
        double menorMedia = alunos.get(0).getMedia();
        for(int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getMedia() < menorMedia) {
                menorMedia = alunos.get(i).getMedia();
            }
        }
        return menorMedia;
    }

    public int tamanho() {
        return alunos.size();
    }
}

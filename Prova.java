public class Prova {
    private String nome;
    private String matricula;
    private char[] respostas = new char[6];

    public Prova(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void respostaAluno(char[] resposta) {
        this.respostas = resposta;
    }

    public int acertos(char[] gabarito) {
        int quantidadeDeAcertos = 0;
        for (int i = 0; i < gabarito.length; i++) {
            if (gabarito[i] == respostas[i]) {
                quantidadeDeAcertos++;
            }
        }
        return quantidadeDeAcertos;
    }

    public int nota(char[] gabarito) {
        int nota = 0;
        for (int i = 0; i < 3; i++) {
            if (gabarito[i] == respostas[i]) {
                nota++;
            }
        }
        for (int i = 3; i < 6; i++) {
            if (gabarito[i] == respostas[i]) {
                nota += 2;
            }
        }
        return nota;
    }

    public int maior(Prova outra, String[] gabarito) {
        char[] cGabarito = new char[6];
        for (int i = 0; i < 6; i++) {
            cGabarito[i] = gabarito[i].charAt(i);
        }

        if (this.acertos(cGabarito) > outra.acertos(cGabarito)) {
            return this.nota(cGabarito);
        } else if (outra.acertos(cGabarito) > this.acertos(cGabarito)) {
            return outra.nota(cGabarito);
        } else {
            return -1;
        }
    }
}
public class Torre {
    private Pilha pilha;

    public Torre(int capacidade) {
        this.pilha = new Pilha(capacidade);
    }

    public void empilhar(Disco d) {
        pilha.empilhar(d);
    }

    public Disco desempilhar() {
        return pilha.desempilhar();
    }

    public Disco topo() {
        return pilha.verTopo();
    }

    public boolean estaVazia() {
        return pilha.pilhaVazia();
    }

    public int getQuantidade() {
        return pilha.qtdElementos();
    }

    public void mostrar() {
        pilha.mostrar();
    }
}
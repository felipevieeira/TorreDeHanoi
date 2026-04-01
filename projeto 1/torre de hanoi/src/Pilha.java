public class Pilha {

    private Disco[] p;
    private int topo;

    public Pilha(int tamanho) {
        this.p = new Disco[tamanho];
        this.topo = -1;
    }

    public boolean empilhar(Disco d) {
        if (pilhaCheia()) {
            return false;
        }
        p[++topo] = d;
        return true;
    }

    public Disco desempilhar() {
        if (pilhaVazia()) {
            return null;
        }
        return p[topo--];
    }

    public Disco verTopo() {
        if (pilhaVazia()) {
            return null;
        }
        return p[topo];
    }

    public boolean pilhaVazia() {
        return topo == -1;
    }

    public boolean pilhaCheia() {
        return topo == p.length - 1;
    }

    public int qtdElementos() {
        return topo + 1;
    }

    public void mostrar() {
        if (pilhaVazia()) {
            System.out.println("(vazia)");
            return;
        }

        for (int i = topo; i >= 0; i--) {
            System.out.print(p[i].tamanhoDisco() + " ");
        }
        System.out.println();
    }
}
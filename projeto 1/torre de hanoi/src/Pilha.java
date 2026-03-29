public class Pilha 
{

    private int [] p;
    private int topo;
    
    Pilha(int tamanho) 
    {
        this.p = new int[tamanho];
        this.topo = -1;
    }
    
    public boolean empilhar(int valor)
    {
        if(this.pilhaCheia())
            return false;
        this.p[++this.topo] = valor;
        return true;
        
    }
    
    public int desempilhar()
    {
        if(this.pilhaVazia())
            return -1; //ERRO
        return this.p[this.topo--];
    }

    public int verTopo()
    {
        if(this.pilhaVazia())
            return -1; // erro
        return this.p[this.topo]; 
    }
    
    public void exibirPilha()
    {
        for(int i = this.topo; i >= 0; i--)
            System.out.println(this.p[i]);
    }
    
    private boolean pilhaVazia()
    {
        if(this.topo == -1)
            return true;
        return false;
    }
    
    private boolean pilhaCheia()
    {
        if(this.topo == this.p.length-1)
            return true;
        return false;
    }
    
}
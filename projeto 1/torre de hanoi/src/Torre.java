public class Torre 
{
    Pilha pilha;
    Torre(int tamanho)
    {
        pilha = new Pilha(tamanho);
    }
    
    void empilharDisco(Disco disco)
    {
        pilha.empilhar(disco.tamanhoDisco());
    }

    void desempilharDisco(Disco disco)
    {
        pilha.desempilhar(disco);
    }
}
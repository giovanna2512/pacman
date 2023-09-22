
package com.mycompany.pacman;


public class Booster extends Item  {
    public int duracao;

    public Booster(int cordX, int cordY) {
        super(cordX, cordY);
    }

    public Booster(int duracao, int cordX, int cordY) {
        super(cordX, cordY);
        if (duracao < 0) {
            throw new RuntimeException("Duração inválida");
        }
        
        this.duracao = duracao;
    }
    
    public int getDuracao() {
        
        return duracao;
    }

    public void setDuracao(int duracao) {
         if (duracao < 0) {
            throw new RuntimeException("Duração inválida");
        }
        this.duracao = duracao;
    }
    
    
}

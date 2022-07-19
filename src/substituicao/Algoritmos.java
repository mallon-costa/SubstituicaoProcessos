package substituicao;

public class Algoritmos {
    private Processo primeiroProcesso;
    
    
    public void fifo(Processo matriz[][], Processo novo){
        int menorId = 10000;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if(matriz[i][j].getQuant() < menorId){
                    menorId = matriz[i][j].getQuant();
                    primeiroProcesso = matriz[i][j];
                }
            }
        }
        
        primeiroProcesso.setId(novo.getId());
        primeiroProcesso.setQuant(novo.getQuant());
        primeiroProcesso.setBitR(novo.getBitR());
        primeiroProcesso.setQuantFreq(novo.getQuantFreq());
    }
    
    
    public void segundaChance(Processo matriz[][], Processo novo){
        int menorId = 10000;
        int linha = 0, coluna = 0;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if(matriz[i][j].getQuant() < menorId){
                    menorId = matriz[i][j].getQuant();
                    linha = i;
                    coluna = j;
                }
            }
        }
        
        menorId = 10000;
        
        fim:
        for(int i = linha; i < matriz.length; i++){
            for(int j = coluna; j < matriz[0].length; j++){
                
                if( matriz[i][j].getBitR() == 0){
                    //menorId = matriz[i][j].getQuant();
                    primeiroProcesso = matriz[i][j];
                    break fim;
                }else{
                    matriz[i][j].setBitR(0);
                }
                
            }
        }
        
        primeiroProcesso.setId(novo.getId());
        primeiroProcesso.setQuant(novo.getQuant());
        primeiroProcesso.setBitR(novo.getBitR());
        primeiroProcesso.setQuantFreq(novo.getQuantFreq());
    }
    
    public void lfu(Processo matriz[][], Processo novo){
        int menorFreq = 100000;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){    
                if(matriz[i][j].getQuantFreq() < menorFreq){
                    menorFreq = matriz[i][j].getQuantFreq();
                    primeiroProcesso = matriz[i][j];
                }  
            }
        }
        
        
        primeiroProcesso.setId(novo.getId());
        primeiroProcesso.setQuant(novo.getQuant());
        primeiroProcesso.setBitR(novo.getBitR());
        primeiroProcesso.setQuantFreq(novo.getQuantFreq());
    }
    
}

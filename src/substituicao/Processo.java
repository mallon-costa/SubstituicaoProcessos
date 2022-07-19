package substituicao;

import java.util.Random;


public class Processo {
    private char id;
    private int quant;
    private int bitR;
    private int quantFreq;
    
    private static Processo matriz[][];
    private static int cont = 0;

    public Processo(char id, int bitR, int quantFreq){
       this.id = id;
       this.bitR = bitR;
       this.quantFreq = quantFreq;
       this.quant = Processo.cont++;
    }
    
    public static void geraMatriz(int n){
        cont = 0;
        Random random = new Random();
        
        Processo matrizProc[][] = new Processo[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                char caractAlea = (char) (random.nextInt(26)+'a');
                
                int bitAlea = (int) (random.nextInt(2));
                int freq = (int) (random.nextInt(101));
                matrizProc[i][j] = new Processo(caractAlea, bitAlea, freq);
                
            }
        }
        
        matriz = matrizProc;
    }
    
    public static Processo[][] getMatriz(){
        return matriz;
    }
    
    @Override
    public String toString() {
        return "id: " + id + "\nbitR:" + bitR + "\nFrequencia: " + quantFreq + "\nPosição: " + quant;
    }
    
    public static void zeraCont(){
        cont = 0;
    }
    
    public int getBitR() {
        return bitR;
    }

    public void setBitR(int bitR) {
        this.bitR = bitR;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
    public char getId() {
        return id;
    }
    
    public String getStringId(){
        return "" + this.id;
    }
    
    public String getStringBitR_EOrdem(){
        return "Pos: " + this.quant + " BitR: " + this.bitR; 
    }

    public void setId(char id) {
        this.id = id;
    }

    public int getQuantFreq() {
        return quantFreq;
    }
    
    public String getStringFreq(){
        return "Freq: " + quantFreq;
    }

    public void setQuantFreq(int quantFreq) {
        this.quantFreq = quantFreq;
    }
 
}

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class vendinha {
    public static void main(String[] args) {
        String nome = "fastback";
        String marca = "fiat";
        //int ano = 2022;
       // Double preço = 159.597;

        //System.out.println("o seu " + " " + marca + " " + nome + " " + ano + " " + "está custando em média R$:" + " " + preço + " " + "reais na tabela FIP");
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            nome =  reader.readLine();
            marca = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
       System.out.println("o nome do carro é" +" "+ marca +" "+ nome);
    }

}///
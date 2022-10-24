
import java.util.ArrayList;
 
public class caixa{    

    public static void main(String[] args ){

        System.out.println("\n olá aqui você pode fazer seu pedido, a vendinha agradece! \n");

        ArrayList<String> produtos = new ArrayList<String>();{

         produtos.add(" [1] blant do joão(1 un)---R$9,90");
         produtos.add(" [2] blant do higor(1 Un)---R$9,90");
         produtos.add(" [3] blant do aldry(2 Un)---R$14,50");
         produtos.add(" [4] carteira de mistos(20 un)---R$7,80");
         produtos.add(" [5] cerveja artesanal---R$6,99");
         produtos.add(" [6] chopp larger(400 ml)---R$5,79");
         
         for(int i=0; i<produtos.size(); i++) {
            System.out.println(produtos.get(i)+"\n");
         }
        
        }
        ArrayList<String> tiragosto= new ArrayList<String>();{


         tiragosto.add(" [7] salgadinho fandangos (70g)---R$2,99");
         tiragosto.add(" [8] empada de charque---R$1,99");
         tiragosto.add(" [9] empada de frango---R$1,99");
         tiragosto.add(" [10] hamburguer(ohana)---R$19,90");
         
         for(int i=0; i<tiragosto.size(); i++) {
            System.out.println(tiragosto.get(i)+"\n");

        }
        

        }
    
    
    }

}


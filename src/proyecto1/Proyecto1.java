
package proyecto1;

/**
 * Programa que permite instanciar un objeto y cambiar las propiedades de una matriz
 * @author Kevin Santiago Aguirre Giraldo
 */
public class Proyecto1 {
    public static void main (String [] args){
        
        System.out.println("HOLA MUNDO");
        Proyecto1 proyecto1 = new Proyecto1();
        
        String [][] molde = proyecto1.consultarMolde();
        System.out.println("Molde principal");      
        for(int i = 0; i < molde.length; i++){
            for (int j = 0; j < molde[i].length; j++){
                System.out.print(molde[i][j]+"");
            }
            System.out.println();
        }
        
        System.out.println("Molde lleno: ");
        proyecto1.llenarMolde(molde);
        proyecto1.vertirPlastico(molde);
        for(int i = 0; i < molde.length; i++){
            for(int j = 0; j < molde[i].length; j++){
                System.out.print(molde[i][j]+"");
            }
            System.out.println();
        }
        
        
        
    }
    
    public String [][] consultarMolde(){
        
        String [][] molde = {
            {"-", "#", "-"},
            {"#", "#", "#"},
            {"-", "#", "-"},
            {"-", "#", "-"},
            {"-", "#", "-"},
        };
        return molde;
    }
    
    public void llenarMolde(String [][] molde){
        
        for(int i = 0; i < molde.length; i++){
            for(int j = 0; j < molde[i].length; j++){
                if(molde[i][j].equals("-")){
                    molde[i][j] = " 000000 ";
                }
            }
        }
    }
    
    public void vertirPlastico(String [][] molde){
        
        for(int i = 0; i < molde.length; i++){
            for (int j = 0; j < molde[i].length; j++){
                if(molde[i][j].equals("#")){
                    molde[i][j] = " plastico ";
                }
            }
        }
    }

    
}

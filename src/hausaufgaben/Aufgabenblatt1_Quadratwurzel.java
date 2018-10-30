package hausaufgaben;

/**
 *
 * @author Pascal Meissner
 */
public class Aufgabenblatt1_Quadratwurzel {
    public static void main (String args[]){
        final double a = 30;
        double x_0=a/2;
        double x_neu=x_0-0.0002;
        System.out.println("x_0: " + x_0);
                
        for (int x_i=2;x_0-x_neu>0.0001;x_i++){
            x_0=x_neu;
            x_neu=(x_0+a/x_0)/2;
            System.out.println("x_" + x_i + " :" + x_neu);
        }
    }    
    
    
    
}
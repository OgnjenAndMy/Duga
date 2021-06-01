package duga;

import java.util.*;

public class Duga {
    
    static ArrayList<Integer> map = new ArrayList<>();
    static int naMestu=0;
    static int pogodak=0;
    
    static boolean tr=false;
    
    public static void main(String[] args) { 
        randomize();
        
        System.out.println("Unesi kombinaciju(od 1 do 4): ");
        System.out.println(map);
        
        main();
    }
    
    private static void randomize(){
        Random r = new Random();
        int f1 = r.nextInt(3)+1;
        int f2 = r.nextInt(3)+1;
        int f3 = r.nextInt(3)+1;
        int f4 = r.nextInt(3)+1;
        
        map.add(f1);
        map.add(f2);
        map.add(f3);
        map.add(f4);
    }
        
    /**
     * Just main class!
     */
    private static void main(){
        naMestu=0;
        pogodak=0;
        
        Scanner in = new Scanner(System.in);
        int u1 = in.nextInt();
        int u2 = in.nextInt();
        int u3 = in.nextInt();
        int u4 = in.nextInt();
        
        if(map.get(0)==u1){
            naMestu++;
        }
        if(map.get(1)==u2){
            naMestu++;
        }
        if(map.get(2)==u3){
            naMestu++;
        }
        if(map.get(3)==u4){
            naMestu++;
        }
         
        doUn(u1,u2,u3,u4);
        
        ///////Other///////
        if(naMestu==4){
            System.out.println("Tačno! Svi su tačni!");
        }
        else if(naMestu<4){
            System.out.println("Zamalo! Imaš "+naMestu+" na mestu i "+(pogodak-naMestu)+" koji niju na mestu!");
            main();
        }
    }
    
    private static void doUn(int u1, int u2, int u3, int u4){
        for(int i =0;i<4;i++){
            if(u1==map.get(i)){
                pogodak++;
                break;
            }
        }
        deux(u2, u3, u4);
    }
    private static void deux(int u2, int u3, int u4){
        for(int i =0;i<4;i++){
            if(u2==map.get(i)){
                pogodak++;
                break;
                
            }
            
        }
        trois(u3, u4);
    }
    private static void trois(int u3, int u4){
        for(int i =0;i<4;i++){
            if(u3==map.get(i)){
                pogodak++;
                break;
            }
        }
        quatre(u4);
    }
    private static void quatre(int u4){
        for(int i =0;i<4;i++){
            if(u4==map.get(i)){
                pogodak++;
                break;
            }
        }
    }
}

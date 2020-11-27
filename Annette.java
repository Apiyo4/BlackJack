import java.util.Random;

public class Annette{
    public static void main(String[] args){
        Random rand = new Random(); {0,1,2,3,4}
        Integer rand1 =  rand.nextInt(5);
        Integer rand2 =  rand.nextInt(5);
        Integer rand3 =  rand.nextInt(5);
        Integer rand4 =  rand.nextInt(5);
        Integer rand5 =  rand.nextInt(5);
        System.out.println( rand1.toString() +"\n" + rand2.toString() + "\n" + rand3+ "\n" +  rand4+ "\n" + rand5);
    }
}
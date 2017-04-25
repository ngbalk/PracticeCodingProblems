/**
 * Created by nbalkiss on 4/25/17.
 */
public class FizzBuzz {

    public static void printFizzBuzz(){
        for(int i=0;i<100;i++){
            String toPrint = "";
            if(i%3==0){
                toPrint+="fizz";
            }
            if(i%5==0){
                toPrint+="buzz";
            }
            if(i%5!=0 && i%3!=0){
                toPrint+=i;
            }
            System.out.println(toPrint);
        }
    }

    public static void main(String[] args){
        FizzBuzz.printFizzBuzz();
    }
}

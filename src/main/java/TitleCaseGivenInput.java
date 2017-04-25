/**
 * Created by nbalkiss on 4/13/17.
 */
public class TitleCaseGivenInput {

    public static String convertToTitleCase(String input){

        // use string builder, its a char array so it only creates a string at the end.
        // if we edited the string directly we would be creating a new string every time.
        StringBuilder sb = new StringBuilder(input.length());

        sb.append(Character.toUpperCase(input.charAt(0)));

        for(int i =1;i<input.length();i++){
            if(input.charAt(i)==' '){
                sb.append(input.charAt(i));
                sb.append(Character.toUpperCase(input.charAt(i+1)));
                //assumes that last character is not a space
                i++;
            }
            else{
                sb.append(Character.toLowerCase(input.charAt(i)));
            }
        }
        return sb.toString();
    }
}

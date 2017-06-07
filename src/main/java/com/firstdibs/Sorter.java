package com.firstdibs;
import java.util.*;

class Sorter {

    public class ValuePart implements Comparable{
        char value;
        String sortString;

        public ValuePart(char value, String sortString){
            this.value = value;
            this.sortString = sortString;
        }

        public int compareTo(Object other){
            int i = 0;
            ValuePart otherValue = (ValuePart) other;
            if(this.sortString.indexOf(this.value) == -1){
                i = 1;
            }
            else if(this.sortString.indexOf(otherValue.value) == -1){
                i = -1;
            }
            else if(this.sortString.indexOf(this.value) < this.sortString.indexOf(otherValue.value)){
                i = -1;
            }
            else{
                i =1;
            }
            return i;
        }
    }

    /**
     * Expected behavior is that the method takes the first string and sorts it based on the
     * order of characters in the second string. If there are characters that are not defined in
     * the sort string, then the result is valid as long as they are at the end/behind any character
     * which has a defined sort.
     *
     * sort("banana", "nab")  returns nnaaab
     * sort("house", "soup")  returns either soueh or souhe
     *
     * @param value
     * @param sortString
     * @return
     */
    public String sort(String value, String sortString)
    {
        ValuePart[] valueParts = new ValuePart[value.length()];
        for(int i=0;i<value.length();i++){
            ValuePart vp = new ValuePart(value.charAt(i), sortString);
            valueParts[i] = vp;
        }
        Arrays.sort(valueParts);
        StringBuilder sb = new StringBuilder();
        for(ValuePart vp : valueParts){
            sb.append(vp.value);
        }
        return sb.toString();
    }

    public static void  main (String args[])
    {
        Sorter sorter = new Sorter();
        String test1 = sorter.sort("banana", "nab");
        String test2 = sorter.sort("house", "soup");

        Boolean test1Pass = "nnaaab".equals(test1);
        Boolean test2Pass = "soueh".equals(test2) || "souhe".equals(test2);

        if(test1Pass && test2Pass)
        {
            System.out.println("it worked!");
            System.out.println("output: ");
            System.out.println(test1);
            System.out.println(test2);
            return;
        }

        if(!test1Pass)
        {
            System.err.println("test case 1 failed. output: " + test1);
        }

        if(!test2Pass)
        {
            System.err.println("test case 2 failed. output: " + test2);
        }
    }
}
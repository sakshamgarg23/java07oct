import java.util.*;

    class substring{
        public static void main(String[] args){
            String s="Hello and Welcome to Chitkara";
            LongestsubString( s);

        }
           public static String LongestsubString(String s){
         String abcd="";
        String[] ab=s.split(" ");
        //  System.out.print(ab);
          for(String abc : ab){
            if(abc.length()>abcd.length()){
             abcd=abc;
}


        return abcd;

        }
    }




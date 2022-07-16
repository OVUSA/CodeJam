import java.util.*;
/*
7
CAB
JAM
CODE
ABAAB
CABCBBABC
ABCABCABC
ZXCASDQWE

Case #1: CAB
Case #2: MJA
Case #3: OCDE
Case #4: BBAAA
Case #5: CCCABBBAB
Case #6: CCCBAABAB
Case #7: ZXCASDQWE
 */
public class LastWord {

 public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for ( int i =0; i< tests;i++){
            String st = sc.next();
            generateLastWord(st);
            var test = i+1;
            System.out.println("Case:"+ test+ " "+generateLastWord(st) );
        }
    }

    public static String generateLastWord(String word){

        List<String>words = new ArrayList<>();
        String st = ""+word.charAt(0);
        for ( int i = 1;i<= word.length()-1;i++){
            if(word.charAt(i)>st.charAt(0)){
                st=word.charAt(i)+st;
            }else{
                st+=word.charAt(i);
            }

            if(i==word.length()-1){
                words.add(st);
                words.add(word.charAt(word.length()-1)+st.substring(0,st.length()-1));
            }
        }

        Collections.sort(words);
        return words.get(words.size()-1);
    }

}

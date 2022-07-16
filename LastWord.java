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
            lastWord(i+1,st);
        }
    }
    public static void lastWord(int testCase, String word) {
        System.out.println("Case #"+ testCase+ ": "+generateLastWord(word) );
    }


    public static String generateLastWord(String word){
        Set<String>words = new HashSet<>();
        String st = ""+word.charAt(0);
        String last = "";
        for ( int i = 1;i<= word.length()-1;i++){
            if(word.charAt(i)>st.charAt(0)){
                st=word.charAt(i)+st;
            }else{
                st+=word.charAt(i);
            }
            if(i==word.length()-1){
                words.add(st);
                last = word.charAt(word.length()-1)+st.substring(0,st.length()-1);
                words.add(last);
            }
        }

      List<String>toSort = new ArrayList<>(words);
        Collections.sort(toSort);
        return toSort.get(toSort.size()-1);
    }

}

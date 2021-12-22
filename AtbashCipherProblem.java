package CodingExercise.Dec212021;

import java.util.*;

public class AtbashCipherProblem {
    final private char[] capitalAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    final private char[] lowerCaseAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    final private Map<Character,Character> capitalAlphabetMirror = new HashMap<>();
    final private Map<Character,Character> lowerCaseAlphabetMirror = new HashMap<>();

    public AtbashCipherProblem(){
        for(int i = 0; i < capitalAlphabet.length; i++){
            capitalAlphabetMirror.put(capitalAlphabet[i], capitalAlphabet[capitalAlphabet.length - i -1]);
            lowerCaseAlphabetMirror.put(lowerCaseAlphabet[i], lowerCaseAlphabet[lowerCaseAlphabet.length - i -1]);
        }
    }

    public String atbash(String myStr){
        StringBuilder tempString = new StringBuilder(myStr);
        for(int i = 0; i < tempString.length(); i++){
            Character tempChar = tempString.charAt(i);
            if(capitalAlphabetMirror.containsKey(tempChar)){
                tempString.setCharAt(i, capitalAlphabetMirror.get(tempChar));
            }
            else if(lowerCaseAlphabetMirror.containsKey(tempChar)){
                tempString.setCharAt(i, lowerCaseAlphabetMirror.get(tempChar));
            }
        }
        return tempString.toString();
    }

    public static void test(String myStr){
        AtbashCipherProblem myTest = new AtbashCipherProblem();
        System.out.println(myTest.atbash(myStr));
    }

    public static void main(String[] args) {
        test("apple");
        test("Hello world!");
        test("Christmas is the 25th of December");
    }
}

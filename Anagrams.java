/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin.carlisle
 */
public class Anagrams {
    /**
     * print all anagrams of word, with prefix in front
     * @param prefix appended to each anagram
     * @param word prints all anagrams of this
     */
    private static void printAnagramsHelper(String prefix, String word) {
        if (word.length()<=1){
            System.out.println(prefix+word);
        }
        else {
		      // do the recursion removing the first letter of word
            printAnagramsHelper(prefix+word.charAt(0),word.substring(1));
				// do the recursion removing each middle letter of word
            for (int i=1; i<=word.length()-2; i++) {
                printAnagramsHelper(prefix+word.charAt(i),
                        word.substring(0,i)+word.substring(i+1));
            }
		      // do the recursion removing the last letter of word
            printAnagramsHelper(prefix+word.charAt(word.length()-1),
                    word.substring(0, word.length()-1));
        }
    }
    /**
     * print all anagrams of word, with prefix in front
     * @param word prints all anagrams of this
     */
    public static void printAnagrams(String word) {
        printAnagramsHelper("",word);
    }
    public static void main(String[] args) {
       printAnagrams(args[0]);
      // printAnagrams("crust");
    }
}

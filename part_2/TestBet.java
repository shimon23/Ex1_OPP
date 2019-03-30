package Ex1_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/** 
 * @author zohar and shimon
 * The class reads the text file and divides it into rows and then into words, counting the number 
 * of words in the text, counting the number of the different words in the text, finding the longest word
 *,the word that appears the most, and its frequency.
 */
public class TestBet {

	
	public static void readFile(String fileName) {
		//hash map
		Map<String, Integer> uniqueWordsAndCount = new HashMap<>();
        String str="";
        //count of words
        int numOfWords=0;
       // count of the different words
        int diffWords=0;
        //the longest word
        String longest="";
        //the most frequency word
        String theMostFreq= "";
        //the frequency of the most frequency word
        int howMuch=0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			// divided to lines
			str= br.readLine();
			for(int i=0; str!=null;i++) {
				//Separates words by symbols
				StringTokenizer st=new StringTokenizer(str,"/-().;:, ");
				while (st.hasMoreTokens()) {
					String word=st.nextToken();
					numOfWords++;
					Integer counterOfFreq=uniqueWordsAndCount.get(word);
					//Make sure the key exists
					if (counterOfFreq!=null) {
						
						counterOfFreq++;
						uniqueWordsAndCount.put(word, counterOfFreq);
					
					}
					else {
						uniqueWordsAndCount.put(word, 1);
						diffWords++;
					}
					//Checks if it's the longest word
					
					if (word.length()>longest.length())
						longest=word;
					
					if (uniqueWordsAndCount.get(word)>howMuch) {
						theMostFreq=word;
						howMuch=uniqueWordsAndCount.get(word);
					}
						
				}
				str= br.readLine();
			}
			br.close();
		}
		catch(IOException ex) {
			System.out.println("error" + ex);
			System.exit(2);
		}
		
		//Print the Findings
		System.out.println("The Number of Differnt Words: " +diffWords);
		System.out.println("The Number of Words: "+ numOfWords);
		System.out.println("The Most Frequent Word:( "+ theMostFreq + ") "+"frequenncy:" + howMuch);
		System.out.println("The Longest Word: ("+ longest + ")");
		
	}
	
}

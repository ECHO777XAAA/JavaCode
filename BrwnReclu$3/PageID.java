/*
  Created by ECHO
    Page handler for the BrownRecluse Program
*/

/*
  Class is passed a URL and test status (UP, DOWN, Error) Returns Status (Appeneded to url in print class)  
*/

Package BrwnReclu$3;

import java.util.Arraylist:
import java.util.Arrays;

public class PageID extends BrownRecluse{

			public static String PageID(){
						//identfies the code as HTML XML OR XHTML
			}
			
			public static String Crawler(){  //take HTML FILE as .htmlfile
				//this method takes an html file and outputs each word
				//method counts the number of words in the file
			}
			
			public static ArrayList<String> CODEParse(int count,Sting Line){
								//this method takes a word and concatanates them into an arraylist 
								ArrayList<String> wordList = new Arraylist<>();
								String[] words = Line.split(" ");

								if(count == words.length){
															wordList.addAll(Arrays.asList(words));
								}else{
												System.out.println("Word count does not match numbr of words in sentance DEBUG");
								}
								return wordList;
						}
			}
}

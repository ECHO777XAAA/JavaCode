/*
  Created by ECHO
  Database for the BrwnResluse Program
*/

import java.util.ArrayList;
import java.util.HashMap;

package BrownRelu$3;

public class Database extends BrownRecluse{
    
	private HashMap<String, ArrayList<String>> DataB;

	public DBase(){
				DataB = new HashMap<>();
	}
	Public void addArrayList(Integer Index,ArrayList<String> arrayList){
				DataB.put(Index,arrayList);
	}
	public ArrayList<String> getArrayList(Integer Index){
				return DataB.get(Index);	
	}
	public boolean containsArrayList(Integer Index){
				return DataB.containsKey(Index);
	}
	//this class stores each array list as an object to be parsed through later
  
}

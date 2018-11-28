package algorithms.hashtable.designHashSet;

public class MainClass {
	public static void main(String[] args) {
		MyHashSet hashSet = new MyHashSet();
		hashSet.add(9);         
		hashSet.remove(19);       
		hashSet.add(14);        
		hashSet.remove(19);  
		hashSet.remove(9);  
		hashSet.add(0);       
		hashSet.add(3);       
		hashSet.add(4);       
		hashSet.add(0);     
		hashSet.remove(9);
//		System.out.println(hashSet.contains(19)); 
//		System.out.println(hashSet.contains(3)); 
//		hashSet.add(2);          
//		System.out.println(hashSet.contains(2)); 
//		hashSet.remove(2);          
//		System.out.println(hashSet.contains(2)); 
	}
}

/*
["MyHashSet","add","remove","add","remove","remove","add","add","add","add","remove"]
[[],          [9],    [19],  [14],  [19],    [9],    [0],   [3], [4],  [0],    [9]]
*/
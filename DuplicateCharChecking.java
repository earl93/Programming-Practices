//Implement an algorithm to determine if a string has all unique characters

public static boolean uniqueChecking (String str){
	boolean[] char_set = new boolean [256]; // ASCII
	for (int i = 0; i < str.length; i++){
		int val = str.charAt(i);
		if (char_set[val])
			return false;
		char_set[val] = true;
	}
	return true;
}

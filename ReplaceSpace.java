//Write a method to replace all spaces in a string with ‘%20’
public static void ReplaceSpace (char[] str, int length){
	int spaceCount = 0;
	for (int i = 0; i < length; i++){
		if(str[i] == ' ')
			spaceCount++;
	}
	int newLength = length + 2*spaceCount;
	str[newLength] = "\0"; // end of str
	for (int i = length-1; i >= 0; i--){
		if(str[i] == ' '){
			str[newLength-1] = '0';
			str[newLength-2] = '2';
			str[newLength-3] = '%';
			newLength -=3;
		}
		else{
			str[newLength-1] = str[i];
			newLength--;
		}
	}
}

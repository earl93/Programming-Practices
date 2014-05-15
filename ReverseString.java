// Reversing C-Style String (Last character null)
static void reverse (char[] val){
	int head = 0;
	int tail = val.length - 2; //last char being null
	while (head < tail){
		char temp = val[head];
		val[head] = val[tail];
		val[tail] = temp;
		head ++; tail --;
	}
}

// Reversing C-Style String (Last character null)
void reverse (char *val){
	char *tail = val;
	char temp;
	if (str) {
		while(*tail){
			++tail;
		}
		--tail; //last char being null
		while(val < tail){
			temp = *val;
			*val++ = *tail;
			*tail-- = temp;
		}
	}
}

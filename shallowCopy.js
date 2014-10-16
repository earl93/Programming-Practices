shallowCopy = function(array, start, end) {
	//REQUIRED: array
	//OPTIONAL: start, end
	
	if (start === undefined)
		start = 0;
	if (end === undefined)
		end = array.length;

	var result = array.slice(start, end);
	return result;
};

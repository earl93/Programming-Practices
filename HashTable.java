public HashMap <Integer, Object> buildMap (Object[] list){
	HashMap<Integer, Object> map = new HashMap<Integer, Object>
	for(Object s : list)
		map.put(s.getId(), s);
	return map
}

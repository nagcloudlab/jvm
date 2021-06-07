package example;

import java.util.HashMap;

public class MapManager {

	HashMap<Object, Object> myMap=new HashMap<Object, Object>();
	
	public void grow() {
		try {
			long counter=0;
			while(true) {
				myMap.put("key"+counter, "Large stringggggggggggggggggggggggggggg"
						+"ggggggggggggggggggggggggggggggggggggggggggggggggggggggg"
						+"ggggggggggggggggggggggggggggggggggggggggggggggggggggggg"
						+"ggggggggggggggggggggggggggggggggggggggggggggggggggggggg"
						+"ggggggggggggggggggggggggggggggggggggggggggggggggggggggg"
						+"ggggggggggggggggggggggggggggggggggggggggggggggggggggggg"
						+"ggggggggggggggggggggggggggggggggggggggggggggggggggggggg"
						+"ggggggggggggggggggggggggggggggggggggggggggggggggggggggg"
						+"ggggggggggggggggggggggggggggggggggggggggggggggggggggggg"
						+"ggggggggggggggggggggggggggggggggggggggggggggggggggggggg"
						+"ggggggggggggggggggggggggggggggggggggggggggggggggggggggg"
						+"ggggggggggggggggggggggggggggggggggggggggggggggggggggggg"
						);
				++counter;
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}

package com.basic;
//•	WAP to remove the third element from a array list.  

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Assignque20Remove {
public static void main(String[] args) {
	HashMap h1 =new HashMap();
	h1.put(10,123);
	h1.put(20,423);
	h1.put(30,526);
	h1.put(40,456);
	h1.put(50,122);
	
	h1.remove(40,456);
	System.out.println("default value is:"+h1);

	System.out.println("after Remove list: "+h1.size());
	
}
}

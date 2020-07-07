package com.epam.vijoosh.CustomList;

import customlist.CustomList;
public class CustomListExample {
	public static void main(String[] args) 
    {
        CustomList<Integer> list = new CustomList();
 
        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(20);
        list.add(19);
        list.add(18);
        list.add(17);
        list.add(16);
        list.add(5);
        
        System.out.println(list);
	     
	    //Remove elements from index
	    list.remove(2);
	    System.out.println(list);
	     
	    //Get element with index
        System.out.println(list.get(0));
        System.out.println(list.get(1));
	 
	    //List Size
	    System.out.println(list.size());
    }

}
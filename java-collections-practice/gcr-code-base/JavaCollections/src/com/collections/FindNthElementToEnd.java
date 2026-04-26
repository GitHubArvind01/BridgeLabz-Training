package com.collections;
import java.util.*;

public class FindNthElementToEnd {
	public static void main(String[] args) {
		LinkedList<Character> list = new LinkedList<>();
		list.add('A');
		list.add('S');
		list.add('F');
		list.add('G');
		list.add('W');
		list.add('U');
		
		int n = 2;
		
		Iterator<Character> fast = list.iterator();
        Iterator<Character> slow = list.iterator();
        
        for(int i=0;i<n;i++) {
        	if(fast.hasNext()) {
        		fast.next();
        	}else {
        		System.out.println("N is greater than list length!");
        		return;
        	}
        }
        Character result = null;
        
        while(fast.hasNext()) {
        	fast.next();
        	slow.next();
        }
        
        if(slow.hasNext()) {
        	result = slow.next();
        }
        
        System.out.println("Nth element form end: "+result);
	}
}

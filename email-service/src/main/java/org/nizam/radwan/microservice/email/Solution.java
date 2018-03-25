package org.nizam.radwan.microservice.email;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	
	public static void main(String[] args) {
		solution("RLRRLLRLRRLL"); //4
		solution("RLLLRRRLLR");//4
		solution("LLRLRLRLRLRLRR");//1
		
	}
	
    public static int solution(String s) {
    	Deque<Character> stack = new ArrayDeque<Character>();
    	char[] shoes = s.toCharArray();
    	
    	Character last = null;
    	int count = 0;
    	
    	for(Character shoe:shoes){
    		last = stack.peekLast();
    		
    		if (last!= null && !last.equals(shoe)){
    			stack.pollLast();
    		}else{
    			stack.push(shoe);
    		}
    		
    		count = stack.isEmpty() ? count+1 : count;
    	}
    	
    	return count;
    }
}
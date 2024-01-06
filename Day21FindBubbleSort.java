package main1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day21FindBubbleSort {
	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(10,2,43,2);
		boolean yes;
		do {
			yes=false;
			for(int i=1;i<list.size();i++) {
				if(list.get(i-1)>list.get(i)) {
					Collections.swap(list, i-1, i);
					yes=true;
				}
			}
		}while(yes);
		System.out.println(list);
	}

}

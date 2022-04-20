package com.training.model;

public class ArrayService {
	public static void arrayList() {
	 	 
	 int[] array= new int[] {1,5,2,1,2,6,7,1};
	 int[] list=new int [array.length];
	 int visited=-1;
	 
	 for(int i=0;i<array.length;i++) {
		 int count=1;
		 for(int j=i+1;j<array.length;j++)
		 {
			 if(array[i]==array[j]) {
				 count++;
				 list[j]=visited;
			 }
		 }
		 if(list[i]!=visited) {
			 list[i]=count;
		 }
	 }
	 for(int i=0;i<list.length;i++) {
		 if(list[i]!=visited) {
			 System.out.println("Item :"+array[i]+"  Occurence:"+list[i]);
		 }
	 }
	 
	
}
}
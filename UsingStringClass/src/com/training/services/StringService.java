package com.training.services;

public class StringService {
	public void StringEquals(String str1,String str2) {
		System.out.println("Is Values Same :="+str1.equals(str2));
		System.out.println("Are they pointing to same location:="+(str1==str2));
	}
	public void stringObjectEquals() {
		String ram=new String("Ram");
		String ramesh=new String("Ram");
		System.out.println("Is Values Same :="+ram.equals(ramesh));
		System.out.println("Are they pointing to same location:="+(ram==ramesh));
		
	}
	public String usingTrim(String name) {
		System.out.println("Without Trim = "+name);
		System.out.println("Trim="+name.trim());
		return name.trim();
		
	}
	
	public void lengthOfString(String name) {
		//trim the string by calling the already existing method
		//String resp=usingTrim(name);
		//System.out.println("String Length = "+resp.length());
		
		//using the method trim (.trim())
		System.out.println("String Length = "+name.trim().length());
	}
	public void usingSubString(String name) {
		System.out.println(name.substring(10));
		System.out.println(name.substring(0,6));
	}
	
	public void usingCharAtIndexOf(String name) {
		System.out.println("Index Position of @"+name.indexOf('@'));
		System.out.println("Character at postion 3:="+name.charAt(3));
	}
	
	public void usingReplace(String str1,String str2) {
		System.out.println(str1.replace(".com", ".org"));
		System.out.println(str2.replaceAll("Welcome", "Hello"));
	}
	
	public void usingConcat(String str1,String str2) {
		//string is immutable-cannot change
		System.out.println(str1.concat(str2));
		
		//string builder is mutable, it can be changed
		StringBuilder builder=new StringBuilder(str1);
		builder.append(str2);
		System.out.println(builder.toString());
	}
	public void usingCompareTo(String str1,String str2) {
		System.out.println(str1.compareTo(str2));
	}
	
	public void usingStringFormat(String str1,double mark) {
		String frmtString=String.format("Name %S", str1);
		System.out.println(frmtString);
		System.out.println(String.format("Mark %.2f", mark));
	}
	
	public void usingStringFormat(int mark) {
		System.out.println(String.format("Octal %o", mark));
		System.out.println(String.format("Hexa Decimal %x",mark));
	}
	public void usingStringFormat(int mark1,int mark2) {
		System.out.println(String.format("Octal %1$o, Hexa %2$x", mark1,mark2));
		
	}
	
	public void usingStringFormat(String str1,String str2) {
		System.out.println(String.format("%1$s,%2$S",str1,str2));
		
	}
	
	public void usingStringFormat(long value1) {
		System.out.println(String.format("%+d",value1));
		
	}
	
}

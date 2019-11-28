package test;



public class ReverseString {
	
	 public static void main(String[] args) {
		 String str = "hello";
		 String rev="";
		 
		 char ch[]=str.toCharArray();
		 
		 for(int i=ch.length-1;i>=0;i--) {
			 rev=rev+ch[i];
	
		 }
		 
		 System.out.println("reversed string "+rev);		 
		 
	 }
}

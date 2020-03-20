package aPLabs;

public class StringUtil {

	public StringUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public static String daVinci(String toReverse) {
		String reversed = "";
		for(int i = toReverse.length(); i>0; i--) {
			//reversed += toReverse.charAt(i-1);
			reversed += toReverse.substring(i-1,i);
		}
		return reversed;
	}


	
	public static String palindrome(String str) {
		
		String ret = "";
		boolean retVal = false;
		
		for(int i = 0; i<str.length(); i++) {
			//only allow lower case
			if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				ret += str.charAt(i);
			//if captial letters -> change to lower case
			}else if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				ret += (char)(str.charAt(i) + 32);
			}
		}
		
		//if even
		if(ret.length()%2==0) {
			System.out.println("even \n");
			if(ret.substring(0, ret.length()/2).equals(daVinci(ret.substring(ret.length()/2)))) {
				retVal = true;
			}else {
				retVal = false;
			}
			System.out.println(ret.substring(0, ret.length()/2));
			System.out.println(daVinci(ret.substring(ret.length()/2)));
		}else {
			
			System.out.println("odd \n");
			/*
			System.out.println(str.substring(0, str.length()/2));
			System.out.println(daVinci(str.substring(str.length()/2+1)));
			*/
			
			if(ret.substring(0, ret.length()/2).equals(daVinci(ret.substring(ret.length()/2+1)))) {
				retVal = true;
			}else {
				retVal = false;
			}
		}
		
		
	
		
		return "\n\n" +ret + "\n\n" +retVal;
	}
	
	public static String palindromewsubstring(String str) {
		
		String ret = "";
		boolean retVal = false;
		
		for(int i = 0; i<str.length(); i++) {
			//only allow lower case
			if(str.indexOf(str.substring(i,i+1)) >=97 && str.indexOf(str.substring(i,i+1))<=122) {
				ret += str.charAt(i);
			//if captial letters -> change to lower case
			}else if(str.indexOf(str.substring(i,i+1))>=65 && str.indexOf(str.substring(i,i+1))<=90) {
				ret += (char)(str.charAt(i) + 32);
			}
		}
		
		//if even
		if(ret.length()%2==0) {
			System.out.println("even \n");
			if(ret.substring(0, ret.length()/2).equals(daVinci(ret.substring(ret.length()/2)))) {
				retVal = true;
			}else {
				retVal = false;
			}
			System.out.println(ret.substring(0, ret.length()/2));
			System.out.println(daVinci(ret.substring(ret.length()/2)));
		}else {
			
			System.out.println("odd \n");
			/*
			System.out.println(str.substring(0, str.length()/2));
			System.out.println(daVinci(str.substring(str.length()/2+1)));
			*/
			
			if(ret.substring(0, ret.length()/2).equals(daVinci(ret.substring(ret.length()/2+1)))) {
				retVal = true;
			}else {
				retVal = false;
			}
		}
		
		
	
		
		return "\n\n" +ret + "\n\n" +retVal;
	}
	
	public static String pigLatinWord(String input) {
		
		String ret = "";
		
		if(!(input.indexOf('a')>=0 ||input.indexOf('e')>=0 ||
				input.indexOf('i')>=0 ||input.indexOf('o')>=0 ||
				input.indexOf('u')>=0) || input.indexOf('A')>=0 ||
				input.indexOf('E')>=0 || input.indexOf('I')>=0 ||
				input.indexOf('O')>=0 || input.indexOf('U')>=0) {
			ret = input + "ay";
		}else if(input.indexOf('a')==0 ||input.indexOf('e')==0 ||
				input.indexOf('i')==0 ||input.indexOf('o')==0 ||
				input.indexOf('u')==0 || input.indexOf('A')==0 ||
				input.indexOf('E')==0 || input.indexOf('I')==0 ||
				input.indexOf('O')==0 || input.indexOf('U')==0) {
			ret = input + "yay";
		}else{
			ret = input.substring(0,1) + input.substring(input.length()-1,input.length()) + "ay";
		}
			
		
		return ret;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(StringUtil.pigLatinWord("Tsubasa"));
		
		
	}

}

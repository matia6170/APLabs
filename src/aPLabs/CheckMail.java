package aPLabs;

public class CheckMail {
	
	private int pounds, h, w, l, girth;

	public CheckMail(int pounds, int h, int w, int l) {
		// TODO Auto-generated constructor stub
		this.pounds = pounds;
		this.h = h;
		this.w = w;
		this.l = l;
		girth = w*2 + h*2;
	}
	
	public static void main(String[] args) {
		CheckMail m = new CheckMail(1,1,1,1);
		
		System.out.println(m);
		
	}
	
	public String toString() {
		String ret = "";
		
		if(girth + l > 100 && pounds > 70) 
			ret = "Package is too large and too heavy";
		else if(girth + l > 100) 
			ret = "Package is too large";
		else if(pounds > 70) 
			ret = "Package is too heavy";
		else 
			ret = "Package is acceptable";
		
		
		return ret;
		
	}

}

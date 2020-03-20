package experiments;

public class LoopPlay {

	public LoopPlay() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void printStars() {
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
	
	public int printStars(int row, int col) {
		int ret = 0;
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				ret++;
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		return ret;
	}
	public int printStars(int row) {
		int ret = 0;
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<row; j++) {
				ret ++;
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		return ret;
	}
	
	public int printLTri(int row) {
		int ret = 0;
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<i; j++) {
				ret ++;
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		return ret;
	}
	
	

	
	public int printLCTri(int row) {
		int ret = 0;
		for(int i = row; i>0; i--) {
			for(int j = 0; j<i;j++) {
				ret ++;
				System.out.print(" ");

			}
			
			for(int k =0; k <(row-i); k++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
		return ret;
	}
	public int printLDTri(int row) {
		int ret = 0;
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<i; j++) {
				ret ++;
				System.out.print(" ");
			}
			for(int k = (row-i); k >0; k--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		return ret;
	}
	
	public int printLETri(int row) {
		int ret = 0;
		for(int i = row; i>0; i--) {
			for(int j = 0; j<i;j++) {
				ret ++;
				System.out.print(" ");

			}
			
			for(int k =0; k <(row-i); k++) {
				
				if(i%2==0) {
					System.out.print("* ");
				}
					
					
			}
			System.out.print("\n");
			
		}
		return ret;
	}
	
	public int printLFTri(int row) {
		int ret = 0;
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<i; j++) {
				ret ++;
				System.out.print(" ");
			}
			for(int k = (row-i); k >0; k--) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		return ret;
	}
	
	
	
	
	public static void main(String[] args) {
		LoopPlay lp = new LoopPlay();
		
		lp.printLFTri(10);
		
	//	System.outCprintln("asd");
		//lp.star(10);
		//System.out.println(lp.printStars(10));
		//System.out.println(lp.printStars(3,10));
		
	}

}

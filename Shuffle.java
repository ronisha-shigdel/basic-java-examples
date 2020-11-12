public class Shuffle{
	public static void main(String[] args){
		int x = 3;
		if (x>2){
			System.out.print("apple");
		}
		while (x>0){
			x = x-1;
			System.out.print ("-");
			if (x==2){
				System.out.print ("ball cat");
			}
			if (x==1){
				System.out.print ("dog");
				x = x-1;
			}
		}
			
	}
}
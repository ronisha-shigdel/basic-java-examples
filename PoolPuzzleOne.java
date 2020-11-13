class PoolPuzzleOne{
	public static void main (String[] args){
		int x=0;
		while (x<1){
			System.out.print("a");
			if (x<1){
				System.out.println(" noise");
			}
				x=x+2;
			if (x>1){
				System.out.println("annoys");
				x=x-1;
			}
			if (x==1){
				System.out.print("an");
			}
			if (x>0){
				System.out.println(" oyster");
			}
			System.out.println("");
			x=x+1;	
		}
	}
}

				
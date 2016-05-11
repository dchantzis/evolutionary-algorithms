import java.util.Random;

class randpop{
	public static int[][] randpop(int npop,int genepop){
		
		int[][] pop = new int[npop][genepop];
		Random r = new Random();
		
		for (int i=0;i<npop;i++){
			for (int y=0;y<genepop;y++){
				int temp=0;
				if (r.nextDouble()>=0.5) temp=1;
				else temp=0;
				pop[i][y] = temp;	
			}	
		}
	return pop;	
	}	
}
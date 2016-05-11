class elitism{
	public static int[][] elitism(double[] fitness,int[][] oldpop,int[][] newpop,int x,int y){
		
		double temp=fitness[0];
		int pos=0;
		int LE=fitness.length;
		//FIND THE BEST
		for (int i=1;i<LE;i++){
			if (temp<fitness[i]){temp = fitness[i];pos = i;} 	
		}
		//MOVE THE BEST TO THE NEW POPULATION
		for (int j=0;j<y;j++){
			newpop[pos][j] = oldpop[pos][j];	
		}
		
	return newpop;		
	}	
}
import java.util.Random;

class mutation{
	
	int ind[],indMUT[];
	
	mutation(int[] ind){
		int LE=ind.length;

		this.ind= new int[LE];
		this.indMUT= new int[LE];
		
		indMUT=ind;
		
		for (int i=0;i<LE;i++){
			if (Math.random()<=0.2){// 20% to be mutated
				if (indMUT[i]==1){indMUT[i]=0;}
				else {indMUT[i]=1;}	
			}	
		}
	}
	//GET
	public int[] getMutated(){return indMUT;}
}
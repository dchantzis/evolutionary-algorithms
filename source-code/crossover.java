import java.util.Random;

class crossover{
	
	protected int chd1[],chd2[],cut[],cut2[];
	Random r=new Random();
	//ind1-->parent 1
	//ind2-->parent 2
	//n-->cut points
	//chd1-->child 1
	//chd2-->child 2
	crossover(int[] ind1,int[] ind2,int n){
		int LE=ind1.length;
		chd1= new int[LE];
		chd2= new int[LE];	

		//Cutting
		cut2 = new int[n];
		cut = new int[n];
		
		for (int i=0;i<n;i++){cut2[i]=r.nextInt(LE);}
		
		cut=sort.sort(cut2);
		int status = 2;	
		
		for (int i=0;i<LE;i++){chd1[i] = ind1[i];}
		for (int i=0;i<LE;i++){chd2[i] = ind2[i];}
		
    	for (int i=0;i<cut.length;i++){
        	if (status==1) {
         	  for (int j=cut[i];j<LE;j++){chd1[j] = ind1[j];chd2[j] = ind2[j];status = 2;}
        	}
        	else if (status==2) {
          	  for (int j=cut[i];j<LE;j++){chd1[j] = ind2[j];chd2[j] = ind1[j];status = 1;}
        	}
    	}
    }
    //GET
	public int[] getChild1(){return chd1;}
	public int[] getChild2(){return chd2;}
		
}
//pairnei 2 goneis kai girnaei 2 paidia meso tis get
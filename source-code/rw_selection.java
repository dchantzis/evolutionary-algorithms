import java.util.Random;
import java.lang.Math;//->den douleuei to r.nextDouble()

class rw_selection{
	
	protected int indSELECCTED;
	protected double sum=0,rand=0;
	
	Random r=new Random();
	
	rw_selection(double[] fitnessPOP){
		int LE=fitnessPOP.length;
		
		//Sum the population
		for (int i=0;i<LE;i++){
			sum += fitnessPOP[i];	
		}
		//random number
		rand = ((Math.random())*(0-sum)+sum);
		//System.out.println("rand="+rand+"/sum/"+sum);
		//
		sum=0;
		int i=0,found=0;
		
		while (found!=1 && i<LE){
			sum += fitnessPOP[i];
			if (sum>rand){
				indSELECCTED = i;
				found=1;	
			}
			i++;	
		}
	}
	public int getSelected(){return indSELECCTED;}
}
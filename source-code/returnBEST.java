import java.io.*;

class returnBEST{
	public static int returnBEST(int[][] population,double[] fitness,int x,int y,int HD){
		
		double temp=fitness[0];
		int pos=0;
		int LE=fitness.length;
		//FIND THE BEST
		for (int i=1;i<LE;i++){
			if (temp<fitness[i]){temp = fitness[i];pos = i;} 	
		}
		System.out.println("BEST is "+fitness[pos]+" POS="+pos);
		//CALCULATE THE FREESPACE from posistion pos
		int sum=0;		
			try{
				BufferedReader infile = new BufferedReader(new FileReader("data.txt"));
				
				String size = infile.readLine();
				sum=0;
				for (int j=0;j<y;j++){
					String s = infile.readLine();
					if (population[pos][j]!=0){
						sum += Integer.parseInt(s);
					}
				}
			}
			catch(IOException e){}	
	return (HD - sum);
	}	
}
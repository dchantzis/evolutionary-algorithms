import java.io.*;

class fitness{
	public static double[] fitness(int[][] population,int x,int y,int HD) {
	
		int sum=0;
		double[] indSELECCTED = new double[x];
		
		for (int i=0;i<x;i++){
			try{
				BufferedReader infile = new BufferedReader(new FileReader("data.txt"));
				
				String size = infile.readLine();
				sum=0;
				for (int j=0;j<y;j++){
					String s = infile.readLine();
					if (population[i][j]!=0){
						sum += Integer.parseInt(s);
					}
				}
			}
			catch(IOException e){}	
			if (HD!=sum){
				indSELECCTED[i] = 1./(HD - sum);//se periptosi kati paei lathos bale 0.1
				//System.out.print((HD - sum)+" ");
			}
			else indSELECCTED[i]=1.1;
		}
	return 	indSELECCTED;
	}
}
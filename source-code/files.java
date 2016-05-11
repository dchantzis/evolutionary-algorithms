import java.io.*;
import java.util.Random;//<--skatodouleuei
import java.lang.Math;

class files{
	public static int[] createfiles(int size,int limit){
	
		Random r = new Random();
		int[] files = new int[size];
		int Random_number = 0;
		int sum=0;
		
		try{
			PrintWriter outfile = new PrintWriter(new FileWriter("data.txt", true));
			
			outfile.println(size);//The first record is array dimension
			
			for (int i=0;i<size;i++){
				//Random_number = r.nextInt(limit)+1;
				Random_number =(int)((Math.random())*(0-limit)+limit); 
				outfile.println(Random_number);
				files[i] = Random_number;
				//MEGETHOS SE KB
				sum+=files[i];
			}
			outfile.close();
		}
		catch(IOException e){}
	System.out.println("SUM FILES IN KB:"+sum);		
	return files;
	}
	
	public static int[] loadfiles(){
		
		int nul[] = {-1};
		int sum=0; 
		try{
			BufferedReader infile = new BufferedReader(new FileReader("data.txt"));
			
			String size = infile.readLine();
			int[] files = new int[Integer.parseInt(size)];
			
			for (int i=0;i<files.length;i++){
				String s = infile.readLine();
				files[i] = Integer.parseInt(s);
				//MEGETHOS SE KB
				sum+=files[i];
			}
			System.out.println("SUM FILES IN KB:"+sum);
			return files;
		}
		catch(IOException e){}
	return nul;	
	}	
}
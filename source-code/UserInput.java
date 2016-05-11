//Tsougaris Panagiotis T1 Ar.Mitroou:011758
//SIDAKSI
//metabliti=UserInput.getString();
//h
//metabliti=UserInput.getInteger();
//h
//metabliti=UserInput.getBoolean();
import java.io.*;
class UserInput {
	static String getString(){
		String line;
		
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(input);
		
		try{
			line=in.readLine();
			return line;	
		}	
		catch(Exception e){
			return "Exception";	
		}
	}
	
	static int getInteger(){
		String line;
		
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(input);
		
		try{
			line=in.readLine();
			int i=Integer.parseInt(line);
			return i;	
		}	
		catch(Exception e){
			return -1;	
		}
	}
	static boolean getBoolean(){
		String line;
		
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(input);
		
		try{
			line=in.readLine();
			boolean i=Boolean.parseBoolean(line);
			return i;	
		}	
		catch(Exception e){
			return false;	
		}
	}
	
}
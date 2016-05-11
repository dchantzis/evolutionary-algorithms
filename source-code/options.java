import java.io.*;

class options{
	
	protected int population;
	protected int generations;
	protected int cutpoints;
	protected boolean elitism;
	protected int penalty;
	protected int freespace;
	protected int HD;
	
	options(){
		population = 25;
		generations = 100;
		cutpoints = 1;
		elitism = false;
		penalty = 0;
		HD = 100000000;		
	} 	
	options(int pop,int gen,int cutp,boolean el,int pen){
		population = pop;
		generations = gen;
		cutpoints = cutp;
		elitism = el;
		penalty = pen;	
	}
	//GET
	public int getPopoulation(){return population;}
	public int getGenerations(){return generations;}
	public int getCutpoints(){return cutpoints;}
	public boolean getElitism(){return elitism;}
	public int getPenalty(){return penalty;}
	public int getFreespace(){return freespace;}
	public int getHD(){return HD;}
	//SET
	public void setPopulation(int o){population=o;}
	public void setGenerations(int o){generations=o;}
	public void setCutpoints(int o){cutpoints=o;}
	public void setElitism(boolean o){elitism=o;}
	public void setPenalty(int o){penalty=o;}
	public void setFreespace(int o){freespace=o;}
	public void setHD(int o){HD=o;}
	//toFile
	public void toFile(){
		
		try{
			PrintWriter outfile = new PrintWriter(new FileWriter("results.txt", true));
			
			outfile.println("*********** RESULT ************");
			outfile.println("POPULATION     : "+population);
			outfile.println("GENERATIONS    : "+generations);
			outfile.println("CUTPOINTS      : "+cutpoints);
			outfile.println("ELITISM        : "+elitism);
			outfile.println("PENALTY POINT  : "+penalty);
			outfile.println("");
			outfile.println("FREE SPACE LEFT: "+freespace);
			outfile.println("*******************************");
			
			outfile.close();
		}
		catch(IOException e){}
			
	} 
}
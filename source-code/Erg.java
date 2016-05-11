//Evolutionary Algorithm
//STUDENTS
//Tsougaris Panajiotis AM 01 1758
//Xantzis Dimitrios AM
class Erg{
	public static void main(String []args){
	
		int choose = 100;
		int[] filess = new int[500];//I am sorry but you got to initialize the arry
		
		//Creating OPRIONS
		options opt = new options();
		while (choose!=0){//while exit!-0
			System.out.println("********** EA OPTIONS *********");
			System.out.println("");
			System.out.println("1.POPULATION");
			System.out.println("2.GENERATIONS");
			System.out.println("3.CUTPOINTS");
			System.out.println("4.ELTISM");
			System.out.println("5.PENALTY");
			System.out.println("");
			System.out.println("7.CREATE NEW FILES");
			System.out.println("8.LOAD EXISTING FILES");
			System.out.println("");
			System.out.println("9.BEGIN EA");
			System.out.println("0.EXIT");
			System.out.println("");
			System.out.println("           SELECT YOUR CHOISE...");
			choose = UserInput.getInteger();
			
			for (int i=0;i<25;i++){System.out.println();}//blanking the screen
			
			switch(choose){
				case 1:
					System.out.println("********** POPULATION OPTIONS *********");
					System.out.println("Give the number of begging population :");
					System.out.println("(example POP='100')");
					opt.setPopulation(UserInput.getInteger());//SET POPULATION
					for (int i=0;i<25;i++){System.out.println();}//blanking the screen 
				break;
				case 2:
					System.out.println("********** GENERATIONS OPTIONS *********");
					System.out.println("Give the number of generations:");
					System.out.println("(example GENE='100')");
					opt.setGenerations(UserInput.getInteger());//SET GENERATIONS
					for (int i=0;i<25;i++){System.out.println();}//blanking the screen 
				break;
				case 3:
					System.out.println("********** CUTPOINTS OPTIONS *********");
					System.out.println("Give the number of cutpoints:");
					System.out.println("(example CUTPO='2')");
					opt.setCutpoints(UserInput.getInteger());//SET CUTPOINTS
					for (int i=0;i<25;i++){System.out.println();}//blanking the screen 
				break;
				case 4:
					System.out.println("********** ELITISM OPTIONS *********");
					System.out.println("Elitism? YES or NO");
					System.out.println("(example ELI='true' or 'false')");
					opt.setElitism(UserInput.getBoolean());//SET ELITISM
					for (int i=0;i<25;i++){System.out.println();}//blanking the screen 
				break;
				case 5:
					System.out.println("********** PENALTY OPTIONS *********");
					System.out.println("Give the grade of penalty:");
					System.out.println("ATTENTION:the grade of penalty is reverse");
					System.out.println("(example big penalty is 2||small penalty is 10");
					opt.setPenalty(UserInput.getInteger());//SET penalty
					for (int i=0;i<25;i++){System.out.println();}//blanking the screen 
				break;
				case 7:
					System.out.println("********** CREATE NEW FILES *********");
					System.out.println("Give the limit of file size:");
					System.out.println("(example until 700000 KB)");
					int fs = UserInput.getInteger();//get file size
					System.out.println("Give the number of files");
					System.out.println("(example NUM=500)");
					int num = UserInput.getInteger();//get size
					System.out.println("Give the size of Hard Disk");
					System.out.println("(example HD=50000000)");
					int hd1 = UserInput.getInteger();//get size of HD
					
					filess = files.createfiles(num,fs);//CREATE FILES
					opt.setHD(hd1);
					
					System.out.println("Files created in 'data.txt'");
					for (int i=0;i<25;i++){System.out.println();}//blanking the screen
				break;
				case 8:
					System.out.println("********** LOAD EXISTING FILES *********");
					System.out.println("Give the size of Hard Disk");
					System.out.println("(example HD=50000000)");
					int hd2 = UserInput.getInteger();//get size of HD
					opt.setHD(hd2);
					System.out.println("Loaded from 'data.txt'");
					
					filess = files.loadfiles();//LOAD FILES
					
					for (int i=0;i<25;i++){System.out.println();}//blanking the screen
				break;
				case 9:
					//CALL EA METHOD
					EA.EA(filess,opt);//<--CALL
					System.out.println("FREESPACE:"+opt.getFreespace());
					opt.toFile();
					
				break;	
			}
			
			
		}//end while 
	}
}
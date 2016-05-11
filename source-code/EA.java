import java.lang.Math;

class EA{
	public static void EA(int[] files,options opt){

		int[] temp = files;//the FILES
		int pop = opt.getPopoulation();
		int gene = files.length-1;
		int HD = opt.getHD();//HARD DISK SIZE
		
		//CREATING POPULATION
		int[][] PARE = new int[pop][gene];
		PARE = randpop.randpop(pop,gene);
		//so far ALL GOOD
		
		//FIRST FITNESS
		//FITNESS-EVALUATE population
		double[] fit = new double[pop];//size or limit
		
		fit = fitness.fitness(PARE,pop,gene,HD);//megethos HD = 60GB 
		
for (int g=0;g<opt.getGenerations();g++){//GENERATIONS
System.out.println(g);		
		
		int[][] newGENE = new int[pop][gene];
		//SELECT PARENTS
		 
		for (int i=0;i<pop;i++){
			if (Math.random()<=0.8){//80% CROSSOVER
				
				rw_selection rw1 = new rw_selection(fit);
				rw_selection rw2 = new rw_selection(fit);
			
				int[] ind1 = new int[gene];
				int[] ind2 = new int[gene];
							
				for (int j=0;j<gene;j++){//APLA EPILEGEI 2 KALOUS GONEIS GIA CROSSOVER
					ind1[j] = PARE[rw1.getSelected()][j];
					ind2[j] = PARE[rw2.getSelected()][j];
				
				}
		
				int[] chd1 = new int[gene];
				int[] chd2 = new int[gene];
			
				crossover c = new crossover(ind1,ind2,opt.getCutpoints());
				chd1 = c.getChild1();
				chd2 = c.getChild2();
			
				for (int j=0;j<gene;j++){
					newGENE[i][j] = chd1[j];
				}
			}
			else{
				for (int j=0;j<gene;j++){
					newGENE[i][j] = PARE[i][j];//JUST PASSING THE PARRENT TO THE NEW GENERATION
				}
			}//END CROSSOVER
			//20% MUTATION
			if (Math.random()<=0.2){
				
				int[] newwww = new int[gene];
				for (int l=0;l<gene;l++){
					newwww[l] = newGENE[i][l];
				}
				
				mutation m = new mutation(newwww);
		
				int[] muta = new int[gene];
				muta = m.getMutated();
				for (int t=0;t<gene;t++){
					newGENE[i][t] = muta[t];
				}				
			}//END MUTATION
		}
		//so far ALL GOOD
		if (opt.getElitism()){//ELITISM true or false
			
			int[][] newGENEeli = new int[pop][gene];
			newGENEeli = elitism.elitism(fit,PARE,newGENE,pop,gene);
			
			for(int i=0;i<pop;i++){
				for(int j=0;j<gene;j++){
					newGENE[i][j] = newGENEeli[i][j];	
			}
		}

		}//END ELTISM
		//FITENSS NEW GENERATION AND SWITCH PARENTS
					
			fit = fitness.fitness(newGENE,pop,gene,HD);//megethos HD = 60GB 

			//SWITCH NEW PARENTS
			for(int i=0;i<pop;i++){
				for(int j=0;j<gene;j++){
					PARE[i][j] = newGENE[i][j];
				}	
			}//END SWITCH
		
		//END FITNESS AND SWITCH
		//so far ALL GOOD
		if (opt.getPenalty()!=0){//PENALTY
			
			double[] fit2 = new double[pop];
			fit2 = penalty.penalty(fit,opt.getPenalty());
			
			for (int i=0;i<pop;i++){
				fit[i] = fit2[i];	
			}
		}//END PENALTY
		
}//END GENERATIONS

		//LAST FITNESS
		//FITNESS-EVALUATE population
		
		fit = fitness.fitness(PARE,pop,gene,HD);//megethos HD = 60GB 

	//BEST GENOPTYPE
	int BEST = returnBEST.returnBEST(PARE,fit,pop,gene,HD);
	//RETURN HIM
	opt.setFreespace(BEST);
	}	
}
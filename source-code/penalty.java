//OSO MIKROTERO EINAI TO N TOSO MEGALITERO PENALTY KANEI
//OSO MEGALO EINAI TO N TOSO MIKRO PENALTY KANEI
class penalty{
	public static double[] penalty(double[] fitnessPOP,double n){//n= o bathmos penalty	
		for (int i=0;i<fitnessPOP.length;i++){
			if (fitnessPOP[i]<0){
				
				double temp = 0;
				temp = fitnessPOP[i];
				fitnessPOP[i] = -1*(temp - (1./n*temp));///////////????
			}	
		}
	return fitnessPOP;
	}
}
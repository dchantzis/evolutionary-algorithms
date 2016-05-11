class sort{
	
	public static int[] sort(int[] numbers){
		
		for (int i = 0;i<numbers.length;i++){
			int key = numbers[i];
			int position = i;
			
			while (position>0 && numbers[position-1]>key){
				numbers[position] = numbers[position-1];
				position--;	
			}	
			numbers[position] = key;
		} 	
	return numbers;
	}	
}
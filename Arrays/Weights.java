class Weights{
	public static void main(String[] args){
	
	double somaWeight=65.3;
	double bhimaWeight=77.2;
	double banuWeight=66.4;
	double abhiWeight=88.53;
	double hrithikWeight=55.1;

	double[] weightsOfPeople={somaWeight,bhimaWeight,banuWeight,abhiWeight,hrithikWeight};
	
	int total=weightsOfPeople.length;
	System.out.println("Total number of weights Recorded :"+total);
	
	for(int index=0;index<total;)
	{
	double ref=weightsOfPeople[index];
		
	if(ref>70){
			System.out.println("Weight of person at Index "+index+"is :"+ref);
			  }
	index++;
	}
	
	}
}
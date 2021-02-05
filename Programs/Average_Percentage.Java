class Average_Percentage {
	public static void main(String args[]){
		int Marks1 = 78, Marks2 = 86, Marks3 = 94;
		float Total, Percentage, Average;
		
		Total = (Marks1 + Marks2 + Marks3);
		Average = (Total / 3);
		Percentage = ((Total / 300) * 100);

		System.out.println(" Total Marks = " + Total);
		System.out.println(" Average Marks = " + Average);
		System.out.println(" Percentage = " + Percentage);
	}
} 

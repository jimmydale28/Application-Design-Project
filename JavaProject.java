package Project;

public class JavaProject {

	public static void main(String[] args) {
		
		
		System.out.println("Item"+"\t\t"+ "Frequency"+ "\t"+"Times"+"\t\t"+ "Amount"+ "\t\t"+ "Annual Total");
		
		String[] Item= new String[7];
			for (int i=0; i<Item.length; i++) {
			Item[0]= "Coffee"; Item[1]= "Grocery"; Item[2] = "Gas"; Item[3] = "Utilities";
			Item[4]= "Rent"; Item[5] = "Phone"; Item[6]= "Tuition";
		}
		
		
		
		String[] Frequency = new String[7];
			for (int f=0; f<Frequency.length; f++) {
				Frequency[0]="Daily";Frequency[1]="Weekly";Frequency[2]="Weekly";Frequency[3]="Monthly";
				Frequency[4]="Monthly";Frequency[5]="Monthly";Frequency[6]="Semi Annual";
		}
		
		double amounts[][] = { {365, 3.00}, {52, 100.00}, {52, 25.00}, {12, 75.00}, {12, 120.00}, {2, 6500}};
			for ( double row = 0; row < amounts.length; row++){
				for ( int column = 0; column < amounts[(int) row].length; column++){
			
		}
			
			
			}	
		
		System.out.printf("%-10s\n%-10s\n%-10s\n%-10s\n%-10s\n%-10s\n", Item[0] + "  \t" + Frequency[0] + "\t\t" + amounts[0][0] + "\t\t" + amounts[0][1], 
				Item[1] + " \t" + Frequency[1] + "\t\t" + amounts[1][0] + "\t\t" + amounts[1][1],
				Item[2] + "\t\t" + Frequency[2] + "\t\t" + amounts[2][0] + "\t\t" + amounts[2][1],
				Item[3] + "\t" + Frequency[3] + "\t\t" + amounts[3][0] + "\t\t" + amounts[3][1],
				Item[4] + "\t\t" + Frequency[4] + "\t\t" + amounts[4][0] + "\t\t" + amounts[4][1],
				Item[6] + "\t\t" + Frequency[6] + "\t" + amounts[5][0] + "\t\t" + amounts[5][1]);
						

	}
}

/*double amounts[][] = { {365, 3.00}, {52, 100.00}, {52, 25.00}, {12, 75.00}, {12, 120.00}, {2, 6500}};
		
		for ( double row = 0; row < amounts.length; row++){
			for ( double column = 0; column < amounts[(int) row].length; column++){
				System.out.print(amounts[(int) row][(int) column]);
				
			}
		}*/
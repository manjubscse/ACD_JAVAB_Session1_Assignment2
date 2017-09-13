
public class AddNumbers {

	// Declare a variable of type integer
	int c; 	
	
	//Declare a method to calculate sum of two numbers without + Symbol
	public void sum(int a,int b) {
		
		// Adding Numbers using - Symbol
		this.c=a-(-b); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create instance of class AddNumbers
		AddNumbers add= new AddNumbers();
		
		// call the sum function add the numbers
		add.sum(15, 15); 
		
		//Print the out put of sum function 
		System.out.println("Sum of two numbers using - symbol :" + add.c);
	}

}

public class bubblesort{
	public static void main(String[] args){
		int[] number = {8, 9, 3, 54, 87, 90, 9}; // this the varriable we want to sort
		int temp; // we create a temp varriablethat will store the current value we wantto swap
		boolean fixed = false; // we set this back to true whan all the result are completely sort
		while(fixed ==false){
			fixed = true;
			for(int i = 0; i < number.length - 1; i++){
				if(number[i] > number[i + 1]){
					temp = number[i + 1];
					number[i + 1] = number[i];
					number[i] = temp;
					fixed = false;
				}
			}
		}
		for(int k = 0; k < number.length; k++){
			System.out.print(number[k] + ", ");
		}
	}
}
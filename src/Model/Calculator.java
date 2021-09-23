package Model;

public class Calculator {	
	
	private final String delimeter= ",|\n|;";
	
	public int calculate(String input) throws Exception {

		
		String[] numbers = input.split(delimeter);

		
		
		if(isEmpty(input)) {
			return 0;
		}
		if(input.length()==1) {
			return stringToInt(input);	
		}
		else {
			return Sum(numbers);
		}
		
		}
	
	
	private int Sum(String[] numbers) throws Exception {
		findUnwantedInput(numbers);
				return calculateValues(numbers);
	}
	
	
	private int calculateValues(String[] numbers) {
		int sum=0;		
		for(String i:numbers)
		{
			if(stringToInt(i)>1000) {
				continue;
			}
			sum += stringToInt(i);
		}
		return sum;
	}
	
	
	public void findUnwantedInput(String[] numbers) throws Exception {
		for(String i:numbers) {
	
			if(stringToInt(i) < 0) {
				throw new Exception("negatives not allowed");
			}
		}
	}
	
	public boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

}

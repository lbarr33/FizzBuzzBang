
public class FizzBuzzBang {

	public static void main(String[] args) {
		for(int i=1; i<101; i++)
		{
			String output = Integer.toString(i) + " ";
			if(i%3==0) output += "FIZZ";
			if(i%5==0) output += "BUZZ";
			if(i%7==0)output  +="BANG";
			System.out.println(output);
		}
	}
}

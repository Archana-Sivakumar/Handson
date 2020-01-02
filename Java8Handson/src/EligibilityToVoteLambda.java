import java.util.Scanner;
import java.util.function.Predicate;

public class EligibilityToVoteLambda {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int newAge  = sc.nextInt();
		
		Predicate<Integer> predicateObj =  age -> age > 18;
		boolean voteAge = predicateObj.test(newAge);
		
		if(voteAge == true) {
			System.out.println(voteAge);
			System.out.println("Valid to Vote");
		}
		else {
			System.out.println(voteAge);
			System.out.println("Not Valid to Vote");
		}
        sc.close();
	}
   
}

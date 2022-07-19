package arrayusingscanner;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the physics mark");
		float  physicsmarks;
		physicsmarks=sc.nextFloat();
		//System.out.println(physicsmarks);
		System.out.println("Enter the chemistry mark");
		float  chemistrysmarks;
		chemistrysmarks=sc.nextFloat();
		//System.out.println(chemistrysmarks);
		System.out.println("Enter the maths mark");
		float  mathmarks;
		mathmarks=sc.nextFloat();
		float totalmarks=physicsmarks+chemistrysmarks+mathmarks;
		System.out.println("The total marks is " +totalmarks );
		float percentage=(physicsmarks+chemistrysmarks+mathmarks)/3;
		System.out.println("The percentage is " +percentage+"%");
		if(percentage>90) {
			System.out.println("The grade is O ");
			System.out.println("Congratulations, you are in schlorship list ");
		}
		if(percentage>80 && percentage<=90) {
			System.out.println("The grade is A");
			System.out.println("Congratulations, you are in schlorship list ");
		}
		if(percentage>70 && percentage<=80) {
			System.out.println("The grade is A");
		}
		if(percentage>60 && percentage<=70) {
		System.out.println("The grade is B+");
		}
		if(percentage>50 && percentage<=60) {
			System.out.println("The grade is B");
			}
		if(percentage>=40 && percentage<=50) {
			System.out.println("The grade is C");
			}
		if(percentage>=0 && percentage<40) {
			System.out.println("The grade is F");
			System.out.println("Sorry you have to repeat the semester");
			
			}
		

		
		/*if(percetage>=0 && percentage<40) {
					System.out.println("The grade is F");
					System.out.println(" Sorry,you have to repeat the semester");
		}*/
}
	
}
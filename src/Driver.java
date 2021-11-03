import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
		
		public static void main (String[] args){
			ArrayList<Students> students = new ArrayList<Students>();

			students.add(new Students("Sky Silver", "Ed", 45));
			students.add(new Students("Billy Bob", "EE", 50));
			students.add(new Students("Jenny Jobs", "EE", 69));
			students.add(new Students("Stan Smiley", "CS", 72));
			students.add(new Students("Seth Smith", "CS", 74));
			students.add(new Students("Amber Anniston", "CS", 77));
			students.add(new Students("Debra Denton", "ME", 78));
			students.add(new Students("John Jenson", "CS", 81));
			students.add(new Students("Mike Moore", "CS", 83));
			students.add(new Students("Ian Imlay", "CS", 86));
			students.add(new Students("Stan Lee", "CS", 89));
			students.add(new Students("Neil Nelson", "CS", 90));
			students.add(new Students("Pual Pounds", "CS", 93));
			students.add(new Students("Dan Brown", "CS", 95));
			students.add(new Students("Bob Jones", "EE", 99));
			students.add(new Students("Susan Smith", "CS", 100));
			
			Scanner in = new Scanner(System.in);
			
		
			// create a Scanner object
			
			int grade = 0;
			System.out.println("Welcome to the grade finder!");
			System.out.println();
			System.out.println("Enter a grade or -1 to exit");
			grade = in.nextInt();

			//add the while loop
			while(grade != -1){
			
				binarySearch(students, grade);
				int value = binarySearch(students, grade);
				if(value == -1 ){
					System.out.println("The grade wasn't found.");
				}
				else{
					System.out.println((students.get(value).toString()));
				}
				System.out.println();
				System.out.println("Welcome to the grade finder!");
				System.out.println();
				System.out.println("Enter a grade or -1 to exit");
				grade = in.nextInt();	
				in.close();
			}
			
			
			}

	

		//add a binary search method

	public static int binarySearch(ArrayList<Students> students, int value){
		int first = 0;
		int last = students.size() - 1;
		while(last >= first){
			int mid = (first + last)/2;
			if(students.get(mid).getGrade() == value ){
				return mid;
			}
			else if(students.get(mid).getGrade() > value){
				last = mid -1;
			}
			else first = mid + 1;
		}
		return -1;
	}
}

package gui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainApp {
	
	private static Integer[] CoursesIsc= {1,2,3,4,5,6,7,8,9,10};
	private static Integer [] CoursesLdi = {1,2,3,4,5,11,12,13,14,15};
	private static Integer [] CoursesMc = {1,2,3,4,5,16,17,18,19,20};
	
	public static ArrayList<String> PrintableCourses (Integer[] Courses) {
		
		ArrayList<String> result = new ArrayList<String>();
		
		Map<Integer, String> AssignNumToString = new HashMap<Integer, String>();
		AssignNumToString.put( 1, "Math");
		AssignNumToString.put( 2, "Physics 1");
		AssignNumToString.put( 3, "Verbal Expression");
		AssignNumToString.put( 4, "English");
		AssignNumToString.put( 5, "Ethics");
		AssignNumToString.put( 6, "Poo");
		AssignNumToString.put( 7, "Mobile Apps");
		AssignNumToString.put( 8, "Algorithms");
		AssignNumToString.put( 9, "Data Structure");
		AssignNumToString.put( 10, "Operative Systems");
		AssignNumToString.put(11, "Drawing");
		AssignNumToString.put( 12, "Descriptive Geometry");
		AssignNumToString.put( 13, "Computarized Drawing");
		AssignNumToString.put( 14, "Creativity & Innovation");
		AssignNumToString.put( 15, "Prototypes Workshop");
		AssignNumToString.put( 16, "Metabolism");
		AssignNumToString.put( 17, "Biostatistics");
		AssignNumToString.put( 18, "Morfofisiology");
		AssignNumToString.put( 19, "Pediatrics");
		AssignNumToString.put( 20, "Gynecology");


		
		for(Integer Course : Courses)
		{
			result.add(AssignNumToString.get(Course));
		}	
		return result;
	}
	
	
	public static void main( String [] args) {
		//System.out.println("hello world");

		
		Tree Isc = new Tree(CoursesIsc);
		Tree Ldi = new Tree(CoursesLdi);
		Tree Mc = new Tree(CoursesLdi);


		System.out.println(Isc.first());
		System.out.println(Ldi.first());
		System.out.println(Mc.first());


		System.out.println(PrintableCourses(CoursesIsc).toString());
		System.out.println(PrintableCourses(CoursesLdi).toString());
		System.out.println(PrintableCourses(CoursesMc).toString());
		
		
		String original = PrintableCourses(CoursesIsc).toString();
		
		int indexOfOpenBracket = original.indexOf("[");
		int indexOfLastBracket = original.lastIndexOf("]");

		String originalBL = original.substring(indexOfOpenBracket+1, indexOfLastBracket);
		
		String[] array = (originalBL.split("\\s*,\\s*"));
		System.out.println(array[0]);
		
		new ApplicationWindow().startMain();

	}
	
	public String valoresPLan(int x, int y) {
		
		String original="";
		
		switch (x) {
			case 1: original = PrintableCourses(CoursesIsc).toString();
					break;
			case 2: original = PrintableCourses(CoursesLdi).toString();
					break;
			case 3: original = PrintableCourses(CoursesMc).toString();
					break;
		}
		
		int indexOfOpenBracket = original.indexOf("[");
		int indexOfLastBracket = original.lastIndexOf("]");
		
		String originalBL = original.substring(indexOfOpenBracket+1, indexOfLastBracket);
		String[] array = (originalBL.split("\\s*,\\s*"));
		
		return array[y];
		
	}
	
}
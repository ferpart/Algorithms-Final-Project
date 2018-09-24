package gui;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainApp {
	
	public String Isc= "Ingeniería en Sistemas Computacionales";
	public String Ldi= "Licenciatura en Diseño Industrial";
	public String Mc= "Médico Cirujano";
	public String Null= "No careers match";
	
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
	
	public Integer[] ChosenCarrer(Integer[] espArray) {
		int CountIsc=0;
		int CountIdi=0;
		int CountMc=0;
		Integer[] finalStr= {0,0,0};
		
		for(int i=0; i<espArray.length; i++) {
			if (espArray[i]!=null) {
				if(espArray[i]>=6 && espArray[i]<=10) {
					CountIsc++;
				}
				if(espArray[i]>=11 && espArray[i]<=15){
					CountIdi++;
				}
				if(espArray[i]>=16 && espArray[i]<=20) {
					CountMc++;
				}
			}
		}
		
		if(CountIsc!=0) {
			//return Isc;
			finalStr[0]=1;
		}
		if(CountIdi!=0) {
			//return Ldi;
			finalStr[1]=1;
		}
		if(CountMc!=0) {
			//return Mc;
			finalStr[2]=1;
		}
		

		
		return finalStr;
	}
	
	public static void main( String [] args) {


		
		/*Tree Isc = new Tree(CoursesIsc);
		Tree Ldi = new Tree(CoursesLdi);
		Tree Mc = new Tree(CoursesLdi);
		
		
		String original = PrintableCourses(CoursesIsc).toString();
		
		int indexOfOpenBracket = original.indexOf("[");
		int indexOfLastBracket = original.lastIndexOf("]");

		String originalBL = original.substring(indexOfOpenBracket+1, indexOfLastBracket);
		
		String[] array = (originalBL.split("\\s*,\\s*"));*/

		
		new ApplicationWindow().startMain();

	}
	

	
}

package Day06_controlFlow;

public class Grades {

	public static void main(String[] args) {
		
/*/*
         *  Grade score    GPA
            A+     97–100 4.0
            A     93–96    3.9
            A−     90–92    3.7
            B+     87–89    3.3
            B     83–86    3.0
            B−     80–82    2.7
            C+     77–79    2.3
            C     73–76    2.0
            C−     70–72    1.7
            D+     67–69    1.3
            D     63–66    1.0
            D−     60–62    0.7
            F     0–59    0.0
       */
 
		
		int score = 99;
		String grade= "";
		double gpa = 0;
		
		if (score >= 0 && score <= 100) {
			
			if (score >= 97 && score <= 100) {
				grade = "A+";
				gpa = 4.0;	
			}
			if (score >= 93 && score <= 96) {
				grade = "A";
				gpa = 3.9;	
			}
			
			
			
		}else {
			System.out.println("Invalid score");
		}
			
			
		System.out.println(grade);
		System.out.println(gpa);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
	}

}

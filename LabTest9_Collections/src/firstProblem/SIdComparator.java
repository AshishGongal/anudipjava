package firstProblem;

import java.util.Comparator;

public class SIdComparator implements Comparator<Student> 
{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.getsId().compareTo(s2.getsId());
	}

	
}

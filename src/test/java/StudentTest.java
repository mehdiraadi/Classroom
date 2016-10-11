
import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {
	Student st=new Student("Shaheer","Jasmi",28,'F');

	@Test
	public void testCalculateAvg() {
		assertEquals(st.calculateAverage(6.0),2);
		//assertEquals(st.calculateAverage(3.0),1.0);
		
		
	}



}

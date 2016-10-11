import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {
	Person p=new Person("Jsmi", "Shheer", 30, 'M');

	@Test
	public void testFirstName() {
		//Person p=new Person("Jasmi", "Shaheer", 30, 'M');
		p.setFirstName("Shaheer");
		assertEquals(p.getFirstName().equals("Shaheer"),true);
		assertTrue(p.getFirstName().equals("Shaheer"));
		assertEquals(p.getFirstName(),"Shaheer");
		
		
		}
	@Test
	public void testAge(){
		p.setAge(32);
		assertEquals(p.getAge(),32);
		//assertTrue(p.getFirstName().equals("Shaheer"));
		//assertEquals(p.getFirstName(),"Shaheer");
		//assertTrue(p.getFirstName()=="Shaheer");
		
	}
	@Test
	public void testLastName(){
		p.setLastName("Rahiman");
		assertEquals(p.getLastName().equals("Rahiman"),true);
		
	}
	@Test
	public void testGender(){
		p.setGender('M');
		assertEquals(p.getGender(),'M');
	}

}

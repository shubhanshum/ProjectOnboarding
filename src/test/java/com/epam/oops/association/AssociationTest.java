package com.epam.oops.association;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class AssociationTest {

	@Test
	public void validateAssociation() {
		Person person = new Person();  
        person.setName("Shubham Mishra");  
         
        Mobile number1 = new Mobile();  
        number1.setMobileNo("8868923136");  
        Mobile number2 = new Mobile();  
        number2.setMobileNo("8630023310");  
  
        List<Mobile> numberList = new ArrayList<Mobile>();  
        numberList.add(number1);  
        numberList.add(number2);  
        person.setNumbers(numberList);  
        System.out.println(person.getNumbers()+" are mobile numbers of the person "+  
        person.getName());  
    }  
		
}

package com.epam.oops.association;

import java.util.List;

public class Person {

	private String name;  
    List<Mobile> numbers;  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public List<Mobile> getNumbers() {  
        return numbers;  
    }  
    public void setNumbers(List<Mobile> numbers) {  
        this.numbers = numbers;  
    }  
	
}

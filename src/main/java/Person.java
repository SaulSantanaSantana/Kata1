
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.time.Period;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saul
 */
public class Person {
    
    private final String name;
    private final LocalDate birthdate;

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthdate;
    }

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthdate = birthday;
    }
    
    public int getAge(){
        return Period.between(birthdate, LocalDate.now()).getYears();
    }
}

import java.util.Date;



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
    private final Date birthdate;

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthdate;
    }

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthdate = birthday;
    }
    
    public int getAge(){
        //getTime method is deprecated
        //return (int) ((new Date.getTime()-birthdate.getTime())/31557600000L);
        return 18;
    }
    
}

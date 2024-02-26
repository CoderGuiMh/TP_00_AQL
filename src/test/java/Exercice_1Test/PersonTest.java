package Exercice_1Test;

import ClassATester.PersonExercice_1.Person;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    void getFullNameShouldPrintsTheFullName(){

        // Arrange
        Person person = new Person("Mohamed", "GUIDOUM", 23);
        Person person1 = new Person("Mohamed1", "GUIDOUM1", 24);

        String[] firstName = new String[2];
        String[] lastName  = new String[2];
        int[] age          = new int[2];

        firstName[0] = person.getFirstName();
        firstName[1] = person1.getFirstName();
        lastName[0]  = person.getLastName();
        lastName[1]  = person1.getLastName();
        age[0]       = person.getAge();
        age[1]       = person1.getAge();

        // Act
        String result  = person.getFullName();
        String result1 = person1.getFullName();

        // Assert
        assertEquals(firstName[0] + " " + lastName[0], result );
        assertEquals(firstName[1] + " " + lastName[1], result1 );

    }

    @Test
    void isAdultShouldReturnTrueIfAgeIsGraterThanOrEquals18(){
        // Arrange
        Person person = new Person("Mohamed", "GUIDOUM", 23);
        // Act
        boolean adult = person.isAdult();
        // Assert
        assertEquals(true, adult);
    }
}

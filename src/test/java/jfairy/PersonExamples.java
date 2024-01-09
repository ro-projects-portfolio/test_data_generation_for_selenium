package jfairy;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import io.codearte.jfairy.producer.person.PersonProperties;

public class PersonExamples {

    public static void main(String[] args) {
        Fairy fairy = Fairy.create();

        // To check all possible example check package (External Libraries) io.codearte.jfairy

        Person person = fairy.person();
        System.out.println(person.getFirstName());
        System.out.println(person.getEmail());
        System.out.println(person.getTelephoneNumber());

        Person adultMale = fairy.person(PersonProperties.male(), PersonProperties.minAge(21));
        System.out.println(adultMale.isMale());
        System.out.println(adultMale.getDateOfBirth());

    }
}

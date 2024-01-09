package faker;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerExamples {
    // http://dius.github.io/java-faker/apidocs/index.html
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("en-CA")); // for Canada

        System.out.println(faker.address().state());

        // Check link above to check all variety of fake data

    }
}

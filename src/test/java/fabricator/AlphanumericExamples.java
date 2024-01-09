package fabricator;

public class AlphanumericExamples {
    public static void main(String[] args) {
        Alphanumeric an = Fabricator.alphaNumeric();

        System.out.println(an.randomInt()); // random integer in 0 to 1000 range
        System.out.println(an.randomInt(100)); // random integer in 0 to 100 range
        System.out.println(an.randomInt(200, 300));  // random integer in 100 to 300 range
    }


}

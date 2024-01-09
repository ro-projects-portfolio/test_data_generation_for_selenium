package fabricator;

public class ContactExamples {
    public static void main(String[] args) {
        Contact contact = Fabricator.contact();

        System.out.println(contact.fullName(true, false));
        System.out.println(contact.firstName());
        System.out.println(contact.lastName());
        System.out.println(contact.birthday(25));
        System.out.println(contact.eMail());
        System.out.println(contact.phoneNumber());
        System.out.println(contact.postcode());
        System.out.println(contact.state());
        System.out.println(contact.city());
        System.out.println(contact.address());
        System.out.println(contact.streetName());
        System.out.println(contact.height(true));
        System.out.println(contact.height(false));
        System.out.println(contact.weight(true));
        System.out.println(contact.occupation());
        System.out.println(contact.religion());
        System.out.println(contact.zodiac());
    }
}

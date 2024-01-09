package fabricator;

public class InternetExamples {
    public static void main(String[] args) {

        Internet internet = Fabricator.internet();

        System.out.println(internet.appleToken()); // generate token
        System.out.println(internet.urlBuilder().toString()); // generate random url
        System.out.println(internet.urlBuilder()
                .scheme("https")
                .host("google.com")
                .port(8080)
                .path("getNewId")
                .toString()); // generate custom url with provided parameters
        System.out.println(internet.urlBuilder()
                .host("test.com")
                .toString());
        System.out.println(internet.ip()); // ip address
        System.out.println(internet.color()); // color code
        System.out.println(internet.twitter()); // twitter acc name
        System.out.println(internet.facebookId()); // facebook id
        System.out.println(internet.avatar()); // img url

    }
}

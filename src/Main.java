public class Main {
    public static void main(String[] args) {

        Author kathy = new Author("Kathy", "Bert");
        Author bert = null;

        Book headFirstJava = new Book("Head First Java", kathy, 2022);

        System.out.println(headFirstJava.getTitle() + " " + headFirstJava.getPublisherYear());

        headFirstJava.setPublisherYear(2020);
        System.out.println(headFirstJava.getTitle() + " " + headFirstJava.getPublisherYear());

        System.out.println(headFirstJava);
        System.out.println(kathy.hashCode());
        System.out.println(headFirstJava.hashCode());
    }
}


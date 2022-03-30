package pl.oremczuk.builderpattern;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account.AccountBuilder()
                .setFirstName("Artur")
                .setLastName("Jarząbek")
                .setPhoneNumber("+48 530 123 456")
                .setEmail("ajarzabek@gmail.com")
                .setCountry(Country.POLAND)
                .build();

        Account account2 = new Account.AccountBuilder()
                .setFirstName("Jan")
                .setLastName("Stworek")
                .build();

        System.out.println(account1);
        System.out.println(account2);

    }

}

package pl.oremczuk.builderpattern;

public class Account {

    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String email;
    private final Country country;


    private Account(String firstName, String lastName, String phoneNumber, String email, Country country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.country = country;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", email='").append(email).append('\'');
        sb.append(", country=").append(country);
        sb.append('}');
        return sb.toString();
    }

    static AccountBuilder builder() {
        return new AccountBuilder();
    }


     static class AccountBuilder {

         private String firstName;
         private String lastName;
         private String phoneNumber;
         private String email;
         private Country country;

         AccountBuilder() {
         }

         public AccountBuilder setFirstName(String firstName) {
             this.firstName = firstName;
             return this;
         }

         public AccountBuilder setLastName (String lastName) {
             this.lastName = lastName;
             return this;
         }

         public AccountBuilder setPhoneNumber (String phoneNumber) {
             this.phoneNumber = phoneNumber;
             OwnValidators.validatePhoneNumber(phoneNumber);
             return this;
         }

         public AccountBuilder setEmail (String email) {
             this.email = email;
             OwnValidators.validateEmailAddress(email);
             return this;
         }

         public AccountBuilder setCountry (Country country) {
             this.country = country;
             return this;
         }

         public Account build() {
             return new Account(firstName, lastName, phoneNumber, email, country);
         }
    }



}

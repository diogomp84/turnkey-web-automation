package cloudapp.authentication;

public enum User {
    VALID_CREDENTIAL("cloudapp_NSZX0J@automation.com","CloudApp123"),
    INVALID_EMAIL_OR_PASSWORD_COMBINATION("cloudapp_NSZX0J@automation.com","Invalid123");


    private final String email;
    private final String password;

    User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}

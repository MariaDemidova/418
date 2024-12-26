package data.classes;

public class User implements Comparable<User> {
    private final String name;
    private final String password;
    private final String mail;

    public String getName() {
        return name;
    }

    public User(UserBuilder userBuilder) {
        name = userBuilder.name;
        password = userBuilder.password;
        mail = userBuilder.mail;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public int compareTo(User o) {
        if(!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        }
        if(!this.password.equals(o.password)) {
            return this.password.compareTo(o.password);
        }
        return this.mail.compareTo(o.mail);
    }

    @Override
    public String toString(){

        return "Юзер{" +
                "имя='" + name + '\'' +
                ", пароль='" + password + '\'' +
                ", почта=" + mail +
                '}';
    }

    public static class UserBuilder{
        private String name;
        private String password;
        private String mail;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder mail(String mail) {
            this.mail = mail;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}

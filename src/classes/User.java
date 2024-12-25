package classes;

public class User implements Comparable<User>{
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
        int result=this.name.compareTo(o.name);
        return result;
    }

    @Override
    public String toString(){
        return (name+", mail: "+mail+", password: "+ password);
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

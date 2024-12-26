package util.comparator.compareUser;

import data.classes.User;

import java.util.Comparator;

public class CompareUserByPassword {
    public Comparator<User> UserComparator = new Comparator<User>() {

        public int compare(User s1, User s2) {
            String userPassword1 = s1.getPassword().toUpperCase();
            String userPassword2 = s2.getPassword().toUpperCase();

            // Sorting in ascending order
            return userPassword1.compareTo(userPassword2);

        }};
}

package util.comparator.compareUser;

import data.classes.User;

import java.util.Comparator;

public class CompareUserByName {
    public  Comparator<User> UserComparator = new Comparator<User>() {

        public int compare(User s1, User s2) {
            String userName1 = s1.getName().toUpperCase();
            String userName2 = s2.getName().toUpperCase();

            // Sorting in ascending order
            return userName1.compareTo(userName2);

        }};
}

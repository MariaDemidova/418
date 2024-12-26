package util.comparator.compareUser;

import data.classes.User;

import java.util.Comparator;

public class CompareUserByMail {
    public  Comparator<User> UserComparator = new Comparator<User>() {

        public int compare(User s1, User s2) {
            String userMail1 = s1.getMail().toUpperCase();
            String userMail2 = s2.getMail().toUpperCase();

            // Sorting in ascending order
            return userMail1.compareTo(userMail2);

        }};
}

package util.generator;

import data.classes.User;
import util.DataError;

import java.util.Map;

import static util.Checker.checkUser;

public class UserGenerator {
    public static User generateUser(Map<String, String> entity) throws DataError {
        User.UserBuilder userBuilder = new User.UserBuilder();

        checkUser(entity);

        userBuilder.name(entity.get("имя"));
        userBuilder.password(entity.get("пароль"));
        userBuilder.mail(entity.get("почта"));
        return userBuilder.build();
    }
}

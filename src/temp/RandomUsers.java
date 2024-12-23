package temp;

public class RandomUsers {
    private static final String[] NAMES = new String[]{
            "Мстислав", "Святополк", "Ярополк", "Ингвар", "Мальфред", "Ярогнеда ", "Гремислава", "Рюрик", "Святослав II", "Брячислав Ярославич"};
    private static final String[] PASSWORD = new String[]{
            "qwerty", "12345", "01.03.99", "asdf", "petrusha", "biba", "boba", "lupa", "pupa", "123qaz"};
    private static final String[] EMAIL = new String[]{
            "qwe@yandex.ru", "pupa123@gmail.com", "sweety15062000@yandex.ru", "trololo@gmail.com", " upyachka@gmail.com", "jopa123@yandex.ru",
            "leopold@yandex.ru", "etoneia@yandex.ru", "rurikovich@yandex.ru", "lollipop@yandex.ru"};

    public String[] getRandomNames() {
        return NAMES;
    }
    public String[] getRandomPassword() {
        return PASSWORD;
    }
    public String[] getRandomEmail() {
        return EMAIL;
    }
}

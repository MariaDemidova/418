package data.randomEntity;

public class RandomBuses {
    private static final String[] NUMBER = new String[]{
            "Л235ОХ", "У543ХО", "М654ОХ", "Х156ЙУ", "К652ЕК", "Б733УМ", "А666АА", "З256ОВ", "М345ЯУ", "М245ЕЕ"};
    private static final String[] MODELS = new String[]{
            "Пазик", "Мерс", "Гармошка", "Икарус", "МАЗ", "ЗИЛ", "Фольцваген", "Рено", "Оранжевый", "Резиновый"};
    private static final int[] KM = new int[]{
            123, 12, 567, 1235, 2, 75, 13, 666, 69, 55};

    public String[] getRandomNumbers() {
        return NUMBER;
    }
    public String[] getRandomModels() {
        return MODELS;
    }
    public int[] getRandomKM() {
        return KM;
    }
}

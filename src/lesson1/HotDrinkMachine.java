package lesson1;

public class HotDrinkMachine implements VendingMachine {

    @Override
    public String getProduct(int name, int volume) {
        // Получить продукт по имени и объёму
        // Возвращаем строку с информацией о выбранном горячем напитке
        return "Выбрано " + volume + " мл " + getNameById(name) + ".";
    }

    public String getProduct(int name, int volume, int temperature) {
        return "Выбрано " + volume + " мл " + getNameById(name) + " с температурой " + temperature + " градусов.";
    }

    private String getNameById(int id) {
        // Возвращаем имя горячего напитка
        switch (id) {
            case 1:
                return "Чай";
            case 2:
                return "Кофе";
            case 3:
                return "Какао";
            default:
                return "Неизвестный напиток";
        }
    }
}


package lesson1;

public class HotDrink {
    private String name;
    private int volume;
    public HotDrink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getvolume() {
        return volume;
    }

    public void setvolume(int volume) {
        this.volume = volume;
    }
}

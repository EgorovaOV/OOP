package lesson1;

public class Coffee extends HotDrink{
    private int temperatura;
    public Coffee(String name, int volume, int temperatura) {
        super(name, volume);
        this.temperatura = temperatura;
    }

    public int gettemperatura() {
        return temperatura;
    }

    public void settemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    public void print(){
        System.out.println("URA!!!" + getname() +" " + getvolume() + " " + gettemperatura());
    }
}

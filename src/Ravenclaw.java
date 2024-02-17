import java.util.Arrays;

public class Ravenclaw extends HogwartsStudents {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, String surname, int powerOfMagic, int transgressionDistance, int smart, int wise, int witty, int creative){
        super(name, surname, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " свойства характера - " + getSmart() + "  ум " + getWise() + " мудрость" + getWitty() + " остроумность и " + getCreative() + " творчество, " + getPowerOfMagic() + " - сила магии, " + getTransgressionDistance() + " - расстояние трансгрессии.";
    }
}

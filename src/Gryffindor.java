public class Gryffindor extends HogwartsStudents {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage){
        super(name, surname, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int sumHyrryPotter (int sumHyrryPotter){
        sumHyrryPotter = getCourage() + getHonor() +getNobility();
        return sumHyrryPotter;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " свойства характера - " + getNobility() + "  благородство " + getHonor() + " честь и " + getCourage() + " храбрость, " + getPowerOfMagic() + " - сила магии, " + getTransgressionDistance() + " - расстояние трансгрессии.";
    }


}

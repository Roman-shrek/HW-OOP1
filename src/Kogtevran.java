import java.util.Objects;

public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int wit;
    private int creation;

    public Kogtevran(String name, int characterTraits, int powerOfMagic,
                     int distanceTransgression, int smart, int wise, int wit, int creation) {
        super(name, characterTraits, powerOfMagic, distanceTransgression);
        this.smart = smart;
        this.wise = wise;
        this.wit = wit;
        this.creation = creation;
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

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Kogtevran kogtevran = (Kogtevran) object;
        return smart == kogtevran.smart && wise == kogtevran.wise && wit == kogtevran.wit && creation == kogtevran.creation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), smart, wise, wit, creation);
    }

    //Сделайте метод, который выводит на экран описание студента. В описание надо включать качества,
// которые присущи всем студентам, плюс качества, которые присущи студенту, потому что он учится
// на конкретном факультете.
    public void printStudents() {
        System.out.println("Имя: " + getName() + "; Характер-" + getCharacterTraits() +
                "; Сила Магии-" + getPowerOfMagic() +
                "; Трансгрессия-" + getDistanceTransgression()
                + "; Умственные способности" + getSmart() + "; Мудрость " + getWise()
                + "; Остроумие-" + getWit() + "; Творчество-" + getCreation());
    }

}
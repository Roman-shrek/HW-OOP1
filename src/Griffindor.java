import java.util.Objects;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int characterTraits, int powerOfMagic,
                      int distanceTransgression, int nobility, int honor, int bravery) {
        super(name, characterTraits, powerOfMagic, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
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

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Griffindor that = (Griffindor) object;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }

    //Сделайте метод, который выводит на экран описание студента. В описание надо включать качества,
// которые присущи всем студентам, плюс качества, которые присущи студенту, потому что он учится
// на конкретном факультете.
    public void printStudents() {
        System.out.println("Имя: " + getName() + "; Характер-" + getCharacterTraits() +
                "; Сила Магии-" + getPowerOfMagic() +
                "; Трансгрессия-" + getDistanceTransgression()
                + "; Благородство-" + getNobility() + "; Честь- " + getHonor()
                + "; Храбрость-" + getBravery());
    }
}


import java.util.Objects;

public class Puffendui extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, int characterTraits, int powerOfMagic,
                     int distanceTransgression, int hardWork, int loyalty, int honesty) {
        super(name, characterTraits, powerOfMagic, distanceTransgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Puffendui puffendui = (Puffendui) object;
        return hardWork == puffendui.hardWork && loyalty == puffendui.loyalty && honesty == puffendui.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardWork, loyalty, honesty);
    }

    //Сделайте метод, который выводит на экран описание студента. В описание надо включать качества,
// которые присущи всем студентам, плюс качества, которые присущи студенту, потому что он учится
// на конкретном факультете.
    public void printStudents() {
        System.out.println("Имя: " + getName() + "; Характер-" + getCharacterTraits() +
                "; Сила Магии-" + getPowerOfMagic() +
                "; Трансгрессия-" + getDistanceTransgression()
                + "; Трудолюбие-" + getHardWork() + "; Верность- " + getLoyalty()
                + "; Честность-" + getHonesty());
    }
}

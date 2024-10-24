import java.util.Objects;

public class Slizeren extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slizeren(String name, int characterTraits, int powerOfMagic, int distanceTransgression,
                    int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(name, characterTraits, powerOfMagic, distanceTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Slizeren slizeren = (Slizeren) object;
        return cunning == slizeren.cunning && determination == slizeren.determination && ambition == slizeren.ambition && resourcefulness == slizeren.resourcefulness && power == slizeren.power;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resourcefulness, power);
    }

    //Сделайте метод, который выводит на экран описание студента. В описание надо включать качества,
// которые присущи всем студентам, плюс качества, которые присущи студенту, потому что он учится
// на конкретном факультете.
    public void printStudents() {
        System.out.println("Имя: " + getName() + "; Характер-" + getCharacterTraits() +
                "; Сила Магии-" + getPowerOfMagic() +
                "; Трансгрессия-" + getDistanceTransgression()
                + "; Хитрость-" + getCunning() + "; Решительность- " + getDetermination()
                + "; Амбициозность-" + getAmbition() + "; Находчивость-" + getResourcefulness()
                + "; Жажада власти-" + getPower());
    }
}
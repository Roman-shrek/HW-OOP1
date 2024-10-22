import java.util.Objects;

public class Hogwarts {
    private String name;
    private int characterTraits;
    private int powerOfMagic;
    private int distanceTransgression;

    public Hogwarts(String name, int characterTraits, int powerOfMagic, int distanceTransgression) {
        this.name = name;
        this.characterTraits = characterTraits;
        this.powerOfMagic = powerOfMagic;
        this.distanceTransgression = distanceTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCharacterTraits() {
        return characterTraits;
    }

    public void setCharacterTraits(int characterTraits) {
        this.characterTraits = characterTraits;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }

    @Override
    public String toString() {
        return "Имя " + name +
                ", Характер-" + characterTraits +
                ", Сила Магии-" + powerOfMagic +
                ", Расстояние трансгрессии-" + distanceTransgression;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) object;
        return characterTraits == hogwarts.characterTraits && powerOfMagic == hogwarts.powerOfMagic && distanceTransgression == hogwarts.distanceTransgression && Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, characterTraits, powerOfMagic, distanceTransgression);
    }

    // Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и
// расстоянию трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками.
    public static void compareHogwartsStudents(Hogwarts hogwarts, Hogwarts hogwarts1) {
        int sum = hogwarts.getPowerOfMagic() + hogwarts.getDistanceTransgression();
        int sum1 = hogwarts1.getPowerOfMagic() + hogwarts1.getDistanceTransgression();
        if (sum > sum1) {
            System.out.println(hogwarts.getName() + " обладает большей мощностью магии, чем "
                    + hogwarts1.getName());
        } else if (sum < sum1) {
            System.out.println(hogwarts1.getName() + " обладает большей мощностью магии, чем "
                    + hogwarts.getName());
        } else {
            System.out.println("Оба хороши");
        }
    }
}
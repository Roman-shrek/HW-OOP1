public class PrintService {
    // Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух
    // учеников одного факультета по свойствам. Чтобы сравнить учеников, нужно сложить баллы по каждому
    // свойству, которое присуще ученику данного факультета. Тот ученик, у которого сумма свойств больше,
    // считается лучшим учеником. Метод должен выводить в консоль результат сравнения учеников.

    public static void compareFacultyStudents(Griffindor griffindor, Griffindor griffindors) {
        int sum = griffindor.getNobility() + griffindor.getHonor() + griffindor.getBravery();
        int sum1 = griffindors.getNobility() + griffindors.getHonor() + griffindors.getBravery();
        if (sum > sum1) {
            System.out.println(griffindor.getName() + " лучший Гриффиндорец, в отличии от "
                    + griffindors.getName());
        } else if (sum < sum1) {
            System.out.println(griffindors.getName() + " лучший Гриффиндорец, в отличии от "
                    + griffindor.getName());
        } else {
            System.out.println("Оба хороши");
        }
    }

    public static void compareFacultyStudents(Slizeren slizeren, Slizeren slizerens) {
        int sum = slizeren.getCunning() + slizeren.getDetermination() + slizeren.getResourcefulness() + slizeren.getAmbition()
                + slizeren.getPower();
        int sum1 = slizerens.getCunning() + slizerens.getDetermination() + slizerens.getResourcefulness()
                + slizerens.getAmbition() + slizerens.getPower();
        if (sum > sum1) {
            System.out.println(slizeren.getName() + " лучший в Слизерене, в отличии от "
                    + slizerens.getName());
        } else if (sum < sum1) {
            System.out.println(slizerens.getName() + " лучший в Слизерене, в отличии от "
                    + slizeren.getName());
        } else {
            System.out.println("Оба хороши");
        }
    }

    public static void compareFacultyStudents(Kogtevran kogtevran, Kogtevran kogtevrans) {
        int sum = kogtevran.getSmart() + kogtevran.getWit() + kogtevran.getWise() + kogtevran.getCreation();
        int sum1 = kogtevrans.getSmart() + kogtevrans.getWit() + kogtevrans.getWise() + kogtevrans.getCreation();
        if (sum > sum1) {
            System.out.println(kogtevran.getName() + " лучший Когтевранец, в отличии от "
                    + kogtevrans.getName());
        } else if (sum < sum1) {
            System.out.println(kogtevrans.getName() + " лучший в Когтевранец, в отличии от "
                    + kogtevran.getName());
        } else {
            System.out.println("Оба хороши");
        }
    }

    public static void compareFacultyStudents(Puffendui puffendui, Puffendui puffenduis) {
        int sum = puffendui.getHardWork() + puffendui.getLoyalty() + puffendui.getLoyalty();
        int sum1 = puffenduis.getHardWork() + puffenduis.getLoyalty() + puffenduis.getLoyalty();
        if (sum > sum1) {
            System.out.println(puffendui.getName() + " лучший Пуфиндуец, в отличии от "
                    + puffenduis.getName());
        } else if (sum < sum1) {
            System.out.println(puffenduis.getName() + " лучший в Пуфиндуец, в отличии от "
                    + puffendui.getName());
        } else {
            System.out.println("Оба хороши");
        }
    }
}
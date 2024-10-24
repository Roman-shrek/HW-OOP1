public class Main {

    public static void main(String[] args) {
        Hogwarts[] students = {new Hogwarts("Гарри Поттер", 10, 20, 15), new Hogwarts("Гермиона Гренджер", 20, 10, 30), new Hogwarts("Рон Уизли", 14, 15, 14), new Hogwarts("Драко Малфой", 5, 23, 20), new Hogwarts("Грэхэм Монтегю", 12, 12, 13), new Hogwarts("Грегори Гойл", 3, 17, 12), new Hogwarts("Захария Смит", 7, 15, 13), new Hogwarts("Седрик Диггори", 7, 22, 20), new Hogwarts("Джастин Финч-Флетчли", 8, 21, 16), new Hogwarts("Чжоу Чанг", 9, 10, 17), new Hogwarts("Падма Патил", 11, 15, 8), new Hogwarts("Маркус Белби", 5, 11, 12),};
        System.out.println("Количество студентов в Хогвартсе " + students.length);

        Griffindor[] griffindors = {new Griffindor("Гарри Поттер", 10, 20, 15, 12, 30, 12), new Griffindor("Гермиона Гренджер", 20, 10, 30, 22, 1, 2), new Griffindor("Рон Уизли", 14, 15, 14, 15, 2, 11)};
        Slizeren[] slizerens = {new Slizeren("Драко Малфой", 5, 23, 20, 11, 2, 3, 4, 1), new Slizeren("Грэхэм Монтегю", 12, 12, 13, 1, 2, 3, 6, 7), new Slizeren("Грегори Гойл", 3, 17, 12, 2, 2, 4, 3, 1)};
        Kogtevran[] kogtevrans = {new Kogtevran("Чжоу Чанг", 9, 10, 17, 2, 1, 13, 2), new Kogtevran("Падма Патил", 11, 15, 8, 2, 2, 13, 2), new Kogtevran("Маркус Белби", 5, 11, 12, 2, 10, 22, 1)};
        Puffendui[] puffenduis = {new Puffendui("Захария Смит", 7, 15, 13, 1, 1, 1), new Puffendui("Седрик Диггори", 7, 22, 20, 11, 2, 1), new Puffendui("Джастин Финч-Флетчли", 8, 21, 1, 1, 1, 1)};
        System.out.println();
        System.out.println("Реализация метода печати ученика");
        griffindors[1].printStudents();
        slizerens[0].printStudents();
        kogtevrans[1].printStudents();
        puffenduis[2].printStudents();
        System.out.println();
        System.out.println("Реализация метода сравнения учеников на факультете");
        PrintService.compareFacultyStudents(griffindors[2], griffindors[0]);
        PrintService.compareFacultyStudents(slizerens[1], slizerens[0]);
        PrintService.compareFacultyStudents(kogtevrans[0], kogtevrans[1]);
        PrintService.compareFacultyStudents(puffenduis[0], puffenduis[1]);
        System.out.println();
        System.out.println("Метод для сравнения учеников всего Хогвартса");
        Hogwarts.compareHogwartsStudents(students[0], students[5]);
    }

}
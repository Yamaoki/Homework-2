public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        var dog =8.0;
        System.out.println(dog);
        var cat =3.6;
        System.out.println(cat);
        var paper =763789;
        System.out.println(paper);

        System.out.println("Задача 2");

        dog = dog +4;
        System.out.println(dog);
        cat = cat +4;
        System.out.println(cat);
        paper = paper +4;
        System.out.println(paper);

        System.out.println("Задача 3");

        dog -= 3.5;
        System.out.println(dog);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);

        System.out.println("Задача 4");

        var friend =19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);

        System.out.println("Задача 5");

        var frog =3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        System.out.println("Задача 6");

        var weightBoxerOne =78.2;
        var weightBoxerTwo =82.7;
        var totalWeight = weightBoxerOne + weightBoxerTwo;
        System.out.println("Общий вес " + totalWeight + " кг");
        var difference = weightBoxerOne - weightBoxerTwo;
        System.out.println("Разница " + difference + " кг");

        System.out.println("Задача 7");

        difference = weightBoxerTwo - weightBoxerOne;
        System.out.println(difference);
        var weightDifference = weightBoxerTwo %weightBoxerOne;
        System.out.println("Разница весов " + weightDifference + " кг");

        System.out.println("Задача 8");

        var hours =640;
        var everyEmployee =8;
        var employees = hours /everyEmployee;
        System.out.println("Всего работников в компании " + employees + " человек");
        var moreWorkers =94;
        var totalEmployees = employees + moreWorkers;
        var hoursForEach = hours /totalEmployees;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + hoursForEach + " часов работы может быть поделено междк сотрудниками");
    }
}
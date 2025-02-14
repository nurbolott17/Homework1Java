public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var m1 = 78.2;
        var m2 = 82.7;
        var totalM = m1 + m2;
        System.out.println(totalM);
        var  R = m2 - m1;
        System.out.println(R);
        var result =  m2 % m1;
        System.out.println(result);


        var S = 640;
        var time = 8;
        var x = S / time;
        System.out.println("Всего работников в компании " + x + " человек");
        x = x + 96;
        S = x * 8;
        System.out.println("Если в компании работает " + x + " человек, то всего " + S + " асов работы может быть поделено между сотрудниками");

    }
}
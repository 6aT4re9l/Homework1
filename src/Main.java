public class Main {

    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var boxersWeight = oneBoxer + twoBoxer;
        System.out.println(boxersWeight);
        System.out.println(twoBoxer - oneBoxer);
        System.out.println(twoBoxer % oneBoxer);
        var countWorker = 0;
        countWorker = 640 / 8;
        System.out.println("Всего работников в компании — " + countWorker + " человек");
        var countWorker2 = countWorker + 94;
        System.out.println("Если в компании работает " + countWorker2 + " человек, то всего " + countWorker2 * 8 + " часов работы может быть поделено между сотрудниками");
    }
}
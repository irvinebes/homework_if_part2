import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 task");
        int yearsOld = 3;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад");
        } else if (yearsOld > 6 && yearsOld <= 18) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу");
        } else if (yearsOld > 18 && yearsOld <= 25) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет");
        } else if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить на работу");
        }

        System.out.println("2 task");
        if (yearsOld < 5) {
            System.out.println("Ребёнок не может кататься на аттракционе");
        } else if (yearsOld < 14) {
            System.out.println("Ребёнок может кататься на аттракционе в присутствии взрослого");
        } else {
            System.out.println("Ребёнок может кататься на аттракционе");
        }
        System.out.println("3 task");
        int one = 4;
        int two = -5;
        int three = 101;
        if (one > two) {
            if (one > three) {
                System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println("Числа " + one + " и " + three + " равны");
            }
        }

        }
}
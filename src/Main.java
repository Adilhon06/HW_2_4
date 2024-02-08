import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listA = new ArrayList<>();
        System.out.println("Введите 5 строк: anime ");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }

        System.out.println("Список 1: ");
        System.out.println(listA );

        List<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк:ad ");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }

        System.out.println("Список 2:");
        System.out.println(listB);

        List<String> listC = new ArrayList<>();

        Iterator<String> iterA = listA.iterator();
        Iterator<String> iterB = listB.iterator();
        while (iterA.hasNext() && iterB.hasNext()) {
            listC.add(iterA.next());
            listC.add(iterB.next());
        }

        System.out.println("Список C:");
        System.out.println(listC + "\n");

        Collections.sort(listC, Comparator.comparingInt(String::length));

        System.out.println("Отсортированный список C по длине строк:");
        System.out.println(listC);
    }
}

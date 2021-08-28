import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("запускаем программу");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        logger.log("просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка N:");
        int n = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений M:");
        int m = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        for (int i=0; i < n; i++){
            list.add(random.nextInt(m));
        }

        System.out.println("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра F:");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);
        list = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + list);

        logger.log("завершаем программу");
    }
}
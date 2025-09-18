import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tasks task = new Tasks();

        while (true) {
//            System.out.println("0. Выход из программы");
//            System.out.println("1. Добавить дело");
//            System.out.println("2. Показать дела");
//            System.out.println("3. Удалить дело по номеру");
//            System.out.println("4. Удалить дело по названию");
//            System.out.println("5. Удаление по ключевому слову");
//            System.out.println("Ваш выбор: ");

            System.out.print("\n" +
                    "0. Выход из программы\n" +
                    "1. Добавить дело\n" +
                    "2. Показать дела\n" +
                    "3. Удалить дело по номеру\n" +
                    "4. Удалить дело по названию\n" +
                    "5. Удаление по ключевому слову\n" +
                    "Ваш выбор: "
            );
//            System.out.print("\n" +
//                    "0. Выход из программы\n" +
//                    "1. Добавить дело\n" +
//                    "2. Показать дела\n" +
//                    "3. Удалить дело по номеру\n" +
//                    "4. Удалить дело по названию\n" +
//                    "5. Удаление по ключевому слову\n" +
//                    "Ваш выбор: "
//            );

            String input = scanner.nextLine();

            if (Integer.parseInt(input) == 0) {
                break;
            } else {
                switch (Integer.parseInt(input)) {
                    case 1:
                        System.out.print("Введите название задачи: ");
                        String addTask = scanner.nextLine();
                        if(task.setTask(addTask)) {
                            System.out.println("Добавлено!");

                            task.getTask();
                        }
                        break;
                    case 2:
                        task.getTask();
                        break;
                    case 3:
                        System.out.print("Введите номер для удаления: ");
                        String numTask = scanner.next();
                        if(task.removeTaskNum(Integer.parseInt(numTask))) {
                            System.out.println("Удалено!");
                            task.getTask();
                        } else {
                            System.out.println("Такой задачи нет");
                        }
                        break;
                    case 4:
                        System.out.print("Введите задачу для удаления: ");
                        String textTask = scanner.nextLine();
                        if(task.removeTaskText(textTask)) {
                            System.out.println("Удалено!");
                            task.getTask();
                        } else {
                            System.out.println("Такой задачи нет");
                        }
                        break;
                    case 5:
                        System.out.print("Введите ключевое слово для удаления: ");
                        String word = scanner.nextLine();
                        if(task.removeToWord(word)) {
                            System.out.println("Удалено!");
                            task.getTask();
                        } else {
                            System.out.println("Такой задачи нет");
                        }
                        break;

                }
            }
        }
        System.out.println("Вы вышли из программы!");
    }
}

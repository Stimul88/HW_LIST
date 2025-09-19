import java.util.ArrayList;
import java.util.List;

public class Tasks {
    List<String> listTasks = new ArrayList<>();

    public boolean setTask(String task) {
        return listTasks.add(task);
    }

    public void getTask() {
        if (listTasks.isEmpty()) {
            System.out.println("Задач нет");
        } else {
            System.out.println("Ваш список дел:");
            for (int i = 0; i < listTasks.size(); i++) {
                System.out.println(i + 1 + "." + listTasks.get(i));
            }
        }
    }

    public boolean removeTaskNum(int number) {
        if (listTasks.size() >  number - 1) {
            listTasks.remove(number - 1);
            return true;
        }
        return false;
    }

    public boolean removeTaskText(String text) {
        return listTasks.remove(text);
    }

    public boolean removeToWord(String text) {
        List<String> toSaveList = new ArrayList<>();
        for (String elem : listTasks) {
            if (!elem.contains(text)) {
                toSaveList.add(elem);
            }
        }
        return listTasks.retainAll(toSaveList);
    }
}

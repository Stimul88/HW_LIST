import java.util.ArrayList;
import java.util.List;

public class Tasks {
    List<String> list = new ArrayList<>();

    public boolean setTask (String task) {
        list.add(task);
        return true;
    }

    public void getTask() {
        if(list.isEmpty()) {
            System.out.println("Задач нет");
        } else {
            System.out.println("Ваш список дел:");
            for(int i = 0; i < list.size(); i++) {
                System.out.println(i+1 + "." + list.get(i));
            }
        }
    }

    public boolean removeTaskNum(int number) {
        if (list.size() >= number - 1) {
            list.remove(number - 1);
            return true;
        }
        return false;
    }

    public boolean removeTaskText(String text) {
        if (list.contains(text)) {
            list.remove(text);
            return true;
        }
        return false;
    }

    public boolean removeToWord(String text) {
        int count = 0;

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(text)) {
                list.remove(i);
                count++;
            }
        }

        if(count > 0) {
            return true;
        }
        return false;

    }
}

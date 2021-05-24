import java.util.ArrayList;

public class TodoList {

    ArrayList<String> arrayList = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        arrayList.add(todo);

        if (arrayList.size() <= 10){
            System.out.println("Отлично! Так держать! " +
                    "\nТы добавил дело " + todo);
        }
        else if (arrayList.size() > 10 && arrayList.size() < 15){
            System.out.println("Ого! Сколько дел!");
        }
        else {
            System.out.println("Давай что-нибудь перенесём на завтра...");
        }
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления

        if (index > arrayList.size()){
            arrayList.add(todo);
            System.out.println("Номер не существует. Дело добавлено в конец списка.");
        }
        else if (index < arrayList.size()){
            arrayList.add(index, todo);
            System.out.println("Дело добавлено под номером " + index + ": " + todo);
        }

    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения

        if (arrayList.size() > index){
            arrayList.set(index, todo);
            System.out.println("Ты заменил дело номер " + index + " на: " + todo);
        }
        if (arrayList.size() < index){
            System.out.println("Номер не существует");
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела

        if (arrayList.size() > index){
            arrayList.remove(index);
            System.out.println("Ты удалил дело номер: " + index);
        }
        else {
            System.out.println("Данный индекс отсутствует. Дело удалить невозможно.");
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        System.out.println("Список дел:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        return arrayList;
    }

}
import java.util.*;

public class PhoneBook {


    TreeMap<String, String> treeMap = new TreeMap<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента
        if (isValidInputName(name) & isValidInputPhone(phone)){
            treeMap.put(phone, name);
        }

    }

    public String getNameByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        if (treeMap.containsKey(phone) & isValidInputPhone(phone)) {
            return treeMap.get(phone) + " - " + phone;
        }
        else return "";
    }

    public Set<String> getPhonesByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        TreeSet<String> phones = new TreeSet<>();
        for (Map.Entry entry : treeMap.entrySet()){
            if(entry.getValue().equals(name)){
                phones.add(name + " - " + entry.getKey().toString());
            }
        }

        return phones;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeSet<String> allContacts = new TreeSet<>();
        for (String key : treeMap.keySet()){
            allContacts.add(treeMap.get(key) + " - " + key);
        }
        return allContacts;
    }

    public boolean isContactExist(String phone){
        return treeMap.containsKey(phone);
    }

    public boolean isNameExist(String name){
        return treeMap.containsValue(name);
    }


    public boolean isValidInputName(String input){
        // Проверка имени
        return input.matches("(^LIST)([A-z]+)|([А-яё]+)");
    }

    public boolean isValidInputPhone(String input){
        // Проверка номера телефона
        return input.matches("([7|8]\\d{10})");
    }

}
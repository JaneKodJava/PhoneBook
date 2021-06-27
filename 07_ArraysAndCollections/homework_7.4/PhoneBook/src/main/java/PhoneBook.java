import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static final HashMap<String, ArrayList<String>> phonesBook = new HashMap<>();

    public void addContact(String name, String phone){
        if (!phonesBook.containsKey(name)){
            phonesBook.put(name, new ArrayList<String>());
        }
        phonesBook.get(name).add(phone);
    }

    public void getAllContacts(){
        for (String names : phonesBook.keySet()){
            System.out.print(names + " - ");
            for (String phones : phonesBook.get(names)){
                System.out.print(phones + ", ");
            }
            System.out.println();
        }
    }

    public boolean isPhoneExist(String phone){
        boolean phoneExist = false;
        for (String names : phonesBook.keySet()){
            for (String phones : phonesBook.get(names)){
                if (phones.equals(phone)){
                    System.out.println(names + " - " + phone);
                    phoneExist = true;
                    return phoneExist;
                }
            }
        }
        if (phoneExist) return true;
        else return false;
    }

    public boolean isNameExist(String name){
        boolean nameExist = false;
        nameExist = phonesBook.containsKey(name);
        for (Map.Entry entry : phonesBook.entrySet()){
            if (entry.getKey().equals(name)){
                System.out.print(name + " - ");
                for (String phones : phonesBook.get(name)){
                    System.out.print(phones + ", ");
                }
            }
        }
        return nameExist;
    }

    public boolean isValidNameFormat(String input){
        return input.matches("([A-z]+)|([А-яё]+)");
    }

    public boolean isValidPhoneFormat(String input){
        return input.matches("[7|8]\\d{10}");
    }

    public boolean isValidList(String input){
        return input.matches("LIST");
    }


   }
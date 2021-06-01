import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class EmailList {

    TreeSet<String> emailContacts = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется
        if (validEMail1(email)){
            char[] chars = email.toCharArray();
            char[] caseChars = new char[chars.length];

            for (int i = 0; i < chars.length; i++) { // Замена заглавных букв на строчные
                caseChars[i] = Character.toLowerCase(chars[i]);
            }
            String caseIgnoreEmail = new String(caseChars);
            emailContacts.add(caseIgnoreEmail);
            System.out.println("э-мэил " + caseIgnoreEmail + " добавлен в список");
        }

    }

    public TreeSet<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        System.out.println("Список контактов:");
        for (String mail : emailContacts){
            System.out.println(mail);
        }
        //return Collections.emptyList();
        return emailContacts;
    }
    public static boolean validEMail1(String mail){
        return mail.matches(".+@.+\\..+");
    }

}

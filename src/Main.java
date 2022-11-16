public class Main {
    public static void main(String[] args) {
        String phone = "985-547-12-58";
        phone = phone.replace("-","");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас постороний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79855471258";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        System.out.println();

        //Задание 1
        System.out.println("Задание 1");
        String firstName = "ivan";
        String middleName = "ivanovich";
        String lastName = "ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");
        fullName = fullName.replace("i", "I");
        System.out.println(fullName);
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println(fullName);
    }
}
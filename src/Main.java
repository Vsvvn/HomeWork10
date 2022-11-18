public class Main {
    public static void main(String[] args) {

        System.out.println("Задание № 1");
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println();

        System.out.println("Задание № 2");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);

        System.out.println();

        System.out.println("Задание № 3");
        String fullName1 = "Иванов Семён Семёнович";
        String fullNameCharChange = fullName1.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullNameCharChange);

        System.out.println();

//        Проверка замены букв е на ё в ФИО сторудника.

        System.out.println("Проверка корректного написания ФИО с заменой буквы ё на е.");
        System.out.println();

        String[] splitFullName1 = fullName1.split(" ");
        String[] splitFullNameCharChange = fullNameCharChange.split(" ");

        for (int i = 0; i < splitFullNameCharChange.length - 2 && i < splitFullName1.length - 2; i++) {
            if (splitFullNameCharChange[i].contains("е")) {
                System.out.println("В фамилии " + splitFullName1[i] + " буква ё заменена на букву е: " + splitFullNameCharChange[i] + ".");
            } else {
                if (splitFullNameCharChange[i].contains("ё")) {
                    System.out.println("В фамилии" + splitFullName1[i] + " буква ё заменена на букву е: " + splitFullNameCharChange[i] + ".");
                } else {
                    System.out.println("Буквы ё или е нет в данной фамилии: " + splitFullNameCharChange[i] + ". Ничего исправлять не нужно");
                    break;
                }
            }
        }

        for (int i = 1; i < splitFullNameCharChange.length - 1 && i < splitFullName1.length - 1; i++) {
            if (splitFullNameCharChange[i].contains("е")) {
                System.out.println("В имени " + splitFullName1[i] + " буква ё заменена на букву е: " + splitFullNameCharChange[i] + ".");
            } else {
                if (splitFullNameCharChange[i].contains("ё")) {
                    System.out.println("В имени" + splitFullName1[i] + " буква ё заменена на букву е: " + splitFullNameCharChange[i] + ".");
                } else {
                    System.out.println("Буквы ё или е нет в данном имени: " + splitFullNameCharChange[i] + ". Ничего исправлять не нужно.");
                    break;
                }
            }
        }

        for (int i = 2; i < splitFullNameCharChange.length && i < splitFullName1.length; i++) {
            if (splitFullNameCharChange[i].contains("е")) {
                System.out.println("В отчестве " + splitFullName1[i] + " буква ё заменена на букву е: " + splitFullNameCharChange[i] + ".");
            } else {
                if (splitFullNameCharChange[i].contains("ё")) {
                    System.out.println("В отчестве " + splitFullName1[i] + " буква ё заменена на букву е: " + splitFullNameCharChange[i] + ".");
                } else {
                    System.out.println("Буквы ё или е нет в данном отчестве: " + splitFullNameCharChange[i] + ". Ничего исправлять не нужно.");
                    break;
                }
            }
        }

        System.out.println();

        if (fullNameCharChange.contains("ё")) {
            System.out.println("Ошибка буква ё не заменена на букву е в данной ФИО сотрудника — " + fullNameCharChange);
        } else if (fullName1.contains("е"))
            System.out.println("Проверка проведена успешно. В данных ФИО сотрудника — " + fullNameCharChange + ". Все буквы ё заменены на е, если таковые есть.");
        else {
            System.out.println("Буквы ё или е нет в данных ФИО сотрудника —  " + fullNameCharChange + ". Ничего исправлять не нужно.");
        }
    }
}
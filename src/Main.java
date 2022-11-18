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

        String[] SplitFullName1 = fullName1.split(" ");
        String[] SplitFullNameCharChange = fullNameCharChange.split(" ");

        for (int i = 0; i < SplitFullNameCharChange.length - 2 && i < SplitFullName1.length - 2; i++) {
            if (SplitFullNameCharChange[i].contains("е")) {
                System.out.println("В фамилии " + SplitFullName1[i] + " буква ё заменена на букву е: " + SplitFullNameCharChange[i] + ".");
            } else {
                if (SplitFullNameCharChange[i].contains("ё")) {
                    System.out.println("В фамилии" + SplitFullName1[i] + " буква ё заменена на букву е: " + SplitFullNameCharChange[i] + ".");
                } else {
                    System.out.println("Буквы ё или е нет в данной фамилии: " + SplitFullNameCharChange[i] + ". Ничего исправлять не нужно");
                    break;
                }
            }
        }

        for (int i = 1; i < SplitFullNameCharChange.length - 1 && i < SplitFullName1.length - 1; i++) {
            if (SplitFullNameCharChange[i].contains("е")) {
                System.out.println("В имени " + SplitFullName1[i] + " буква ё заменена на букву е: " + SplitFullNameCharChange[i] + ".");
            } else {
                if (SplitFullNameCharChange[i].contains("ё")) {
                    System.out.println("В имени" + SplitFullName1[i] + " буква ё заменена на букву е: " + SplitFullNameCharChange[i] + ".");
                } else {
                    System.out.println("Буквы ё или е нет в данном имени: " + SplitFullNameCharChange[i] + ". Ничего исправлять не нужно.");
                    break;
                }
            }
        }

        for (int i = 2; i < SplitFullNameCharChange.length && i < SplitFullName1.length; i++) {
            if (SplitFullNameCharChange[i].contains("е")) {
                System.out.println("В отчестве " + SplitFullName1[i] + " буква ё заменена на букву е: " + SplitFullNameCharChange[i] + ".");
            } else {
                if (SplitFullNameCharChange[i].contains("ё")) {
                    System.out.println("В отчестве " + SplitFullName1[i] + " буква ё заменена на букву е: " + SplitFullNameCharChange[i] + ".");
                } else {
                    System.out.println("Буквы ё или е нет в данном отчестве: " + SplitFullNameCharChange[i] + ". Ничего исправлять не нужно.");
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
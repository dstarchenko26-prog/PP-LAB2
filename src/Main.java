import java.util.Scanner;

public class Main {

    static Customer[] array = createCustomerArray(40);
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Меню:\n1 - Роздрукувати всі записи\n2 - Роздрукувати записи за ім'ям\n3 - Роздрукувати записи за номером карти\n4 - Роздрукувати записи з від'ємним балансом\n0 - Завершити роботу\n-> ");
            int f = console.nextInt();
            if (f == 1) {
                PrintArray();
            } else if (f == 2) {
                PrintArrayByName();
            } else if (f == 3) {
                PrintArrayByBankID();
            } else if (f == 4) {
                PrintArrayByBalance();
            } else {
                break;
            }
        }
    }

    /**
     * creates a random array of customers with a given dimension
     * @param count
     * @return array of Customer
     */
    static Customer[] createCustomerArray(int count) {
        String[] surnames = new String[]{"Мельник", "Шевченко", "Коваленко", "Бондаренко", "Бойко", "Ткаченко", "Кравченко", "Коваль", "Олійник", "Шевчук", "Поліщук", "Савченко", "Бондар", "Марченко", "Мороз", "Руденко", "Лисенко", "Петренко", "Клименко", "Павленко", "Пономаренко", "Савчук", "Левченко", "Харченко", "Карпенко"};
        String[] names = new String[]{"Анастасія", "Вікторія", "Катерина", "Дарина", "Софія", "Наталія", "Олена", "Анна", "Андрій", "Володимир", "Владислав", "Богдан", "Денис", "Віктор", "Ярослав"};
        Customer[] array = new Customer[count];
        for (int i = 0; i < count; i++) {
            int rs = (int) (Math.random() * 25);
            String surname = surnames[rs];
            int rn = (int) (Math.random() * 15);
            String name = names[rn];
            int rp = (int) (8 + Math.random() * 7);
            String patronymic = names[rp];
            if (rn > 7) {
                patronymic = String.join("",patronymic, "ович");
            } else {
                patronymic = String.join("",patronymic, "івна");
            }
            long bankID = (long) (10000000 + 90000000 * Math.random());
            int bal = (int) (-1000 + 2000 * Math.random());
            array[i] = new Customer(i + 1, surname, name, patronymic, bankID, bal);
        }
        return array;
    }

    /**
     * prints an array
     */
    static void PrintArray() {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.print(array[i].toString());
        }
    }

    /**
     * prints customers according to the given name
     */
    static void PrintArrayByName() {
        System.out.print("Введіть шукане ім'я -> ");
        console.nextLine();
        String name = console.nextLine();
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (name.equals(array[i].getValueFirstName())) {
                System.out.print(array[i].toString());
            }
        }
    }

    /**
     * prints customers according to the given interval bankID
     */
    static void PrintArrayByBankID() {
        System.out.print("Задайте діапазон шуканих номерів карт\n");
        long stBankID = console.nextLong();
        long fnBankID = console.nextLong();
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (stBankID <= array[i].getValueBankID() && fnBankID >= array[i].getValueBankID()) {
                System.out.print(array[i].toString());
            }
        }
    }

    /**
     * prints customers with a negative balance
     */
    static void PrintArrayByBalance() {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (0 > array[i].getValueBalance()) {
                System.out.print(array[i].toString());
            }
        }
    }
}
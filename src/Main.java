import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //    Java 8 үчүн практикалык тапшырма
//
//     1. Жаңы массив тизмесин түзүү үчүн Java программасын жазыңыз,
//      бир нече шаарларды  кошуп, аларды консольго чыгарыныз.
        System.out.println("1:");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Osh");
        strings.add("Bishkek");
        strings.add("Gulcha");
        strings.add("Naryn");
        System.out.println(strings);

//            2. Массив тизмесине элементти биринчи орунга киргизүү үчүн Java программасын жаз.
        System.out.println("2:");
        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("Osh");
        strings1.add("Bishkek");
        strings1.add("Gulcha");
        strings1.add("Ozgon");
        strings1.add(0, "Batken");
        System.out.println(strings1);

//            3. Берилген массивдердин тизмесинен элементти (белгиленген индексте) алуу үчүн Java программасын жазыңыз.
        System.out.println("3:");
        ArrayList<String> strings2 = new ArrayList<>();
        strings2.add("Osh");
        strings2.add("Bishkek");
        strings2.add("Gulcha");
        strings.add("Talas");
        System.out.println(strings2.get(0));

//            4. Берилген элемент боюнча белгилүү бир массив элементин озгортуу үчүн Java программасын жазыңыз.
        System.out.println("4:");
        ArrayList<String> strings3 = new ArrayList<>();
        strings3.add("Osh");
        strings3.add("Bishkek");
        strings3.add("Gulcha");
        strings3.set(0, "Batken");
        System.out.println(strings3);
//            5. Массив тизмесинен үчүнчү элементти очуруп салуу үчүн Java программасын жазыңыз.
        System.out.println("5:");
        ArrayList<String> strings4 = new ArrayList<>();
        strings4.add("Osh");
        strings4.add("Bishkek");
        strings4.add("Gulcha");
        strings4.add("Talas");
        System.out.println(strings4);
        strings4.remove(2);
        System.out.println(strings4);
//            6. Массив тизмесиндеги элементти издөө үчүн Java программасын жазыңыз.
        System.out.println("6:");
        ArrayList<String> strings5 = new ArrayList<>();
        strings5.add("Osh");
        strings5.add("Bishkek");
        strings5.add("Gulcha");
        strings5.add("Chui");
        System.out.println(strings5.contains("Bishkek"));

//            7. Берилген массивдердин тизмесин сорттоо үчүн Java программасын жазыңыз.
        System.out.println("7:");
        ArrayList<String> strings6 = new ArrayList<>();
        strings6.add("Osh");
        strings6.add("Bishkek");
        strings6.add("Gulcha");
        strings6.add("Talas");
        System.out.println(strings6);
        Collections.sort(strings6);
        System.out.println("List after sort: " + strings6);

//            8. Бир массив тизмесин экинчи масивге көчүрүү үчүн Java программасын жазыңыз.
        System.out.println("8:");
        ArrayList<String> strings7 = new ArrayList<>();
        strings7.add("Osh");
        strings7.add("Bishkek");
        strings7.add("Gulcha");
        strings7.add("Talas");
        System.out.println("List1 :" + strings7);
        ArrayList<String> strings8 = new ArrayList<>();
        strings8.add("1");
        strings8.add("2");
        strings8.add("3");
        strings8.add("4");
        System.out.println("list: " + strings8);

        //copy list2 to list1
        Collections.copy(strings8, strings7);
        System.out.println("Copy list to list2, \nAfter copy: ");
        System.out.println("List1: " + strings8);
        System.out.println("List2: " + strings7);

//            9. Массив тизмесиндеги элементтерди аралаштыруу үчүн Java программасын жазып.
//    Маанилерин консольго чыгарыныз.
        System.out.println("9:");
        ArrayList<String> strings9 = new ArrayList<>();
        strings9.add("Osh");
        strings9.add("Bishkek");
        strings9.add("Gulcha");
        strings9.add("Batken");
        strings9.add("Talas");
        System.out.println(strings9);
        Collections.shuffle(strings9);
        System.out.println(strings9);

//10. Массив тизмесиндеги элементтерди тескери өзгөртүү үчүн Java программасын жазыңыз.
        System.out.println("10:");
        ArrayList<String> strings10 = new ArrayList<>();
        strings10.add("Osh");
        strings10.add("Bishkek");
        strings10.add("Gulcha");
        strings10.add("Batken");
        strings10.add("Talas");
        System.out.println(strings10);
        Collections.reverse(strings10);
        System.out.println(strings10);
//11. Аррейлисттин бир бөлүгүн алуу үчүн Java программасын жазыңыз
        System.out.println("11:");
        try {
            ArrayList<String> strings11 = new ArrayList<>();
            strings11.add("Osh");
            strings11.add("Bishkek");
            strings11.add("Gulcha");
            strings11.add("Batken");
            strings11.add("Talas");
            System.out.println(strings11);
            ArrayList<String> arrayList = new ArrayList<>(strings11.subList(0, 2));
            System.out.println(arrayList);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exeption while getting sublist: " + e);
        }
    }
}
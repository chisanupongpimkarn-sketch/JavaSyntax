

import  java.util.ArrayList;
import java.util.List;

import java.util.Map;
import java.util.HashMap;

import java.util.HashSet;
import java.util.Set;

import java.util.stream.Collectors;

void main() {
//    Dog d1 = new Dog();
//    Dog d2 = new Dog();
//    d1.setName("late");
//    d1.setBreed("Siberain Husky");
//    d1.setAge(3);
//    IO.print(String.format("Hello "+ d1.getName()));
//    IO.print(String.format(" my bress is "+d1.getBreed()));
//    IO.print(String.format(" i'm "+d1.getAge()+" Year Old "));
//    d1.run();
//    d1.bark(5);
//    Bicycle bike1 = new Bicycle();
//    bike1.move();
//    bike1.stop();
//    Motobike moto1 =new Motobike();
//    moto1.pushStart();
//    moto1.move();
//    moto1.stop();
//    CreditPayment man1 = new CreditPayment();
//    PromptPay man2 = new PromptPay();
//
//    man1.pay(120);
//    man2.pay(120);

//    List<String> fruits = new ArrayList<>();
//    fruits.add ("Apple");
//    fruits.add ("Banana");
//    fruits.add ("Orange");
//    fruits.add ("Kiwi");
//    fruits.add ("PieApple");
//    IO.println(String.format(fruits.get(0)));
//    fruits.set(1, "Mango");
//    IO.println(String.format(fruits.get(1)));
//    fruits.remove("Orange");
//    IO.println(String.format(fruits.get(2)));
//    System.out.println("จำนวนผลไม้: "+ fruits.size());
//    for (String fruit : fruits) {
//        System.out.println(fruit);
//    }

    Map<Integer, String> employees = new HashMap<>();
    employees.put(101, "สมชาย");
    employees.put(102, "สมหญิง");
    employees.put(103, "สมหมาย");
    employees.put(104, "สมรวย");

    System.out.println("พนักงานรหัส 102 คือ: "+ employees.get(102));
    System.out.println("พนักงานรหัส 101 คือ: "+ employees.get(101));

    System.out.println("มีงานรหัส 103 ไหม? "+ employees.containsKey(103));
    employees.remove(103);
    System.out.println("จำนวนพนักงานทั้งหมด: "+ employees.size());
    for (Map.Entry<Integer, String> entry : employees.entrySet()){
        System.out.println("รหัส: " + entry.getKey() + " ชื่อ: " + entry.getValue());
    }

    Set<String> color = new HashSet<>();
    color.add("Red");
    color.add("Green");
    color.add("Blue");
    color.add("Yello");

    System.out.println("จำนวนสีทั้งหมด: " + color.size());
    System.out.println("มีสี Green ไหม? " + color.contains("Green"));
    color.remove("Blue");
    for (String color : color){
        System.out.println("สี: "+ color);
    }

//    list<String> filteredNames = employees.stream()
//            .filter(e -> e.getSalary() > 20000)
//            .map(e -> e.getName().toUpperCase())
//            .sordted()
//            .collect(Collectors.toList());
}

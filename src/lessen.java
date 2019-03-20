public class lessen {
    public static void main(String[] args) {
//        exercise 2 Создать переменные всех пройденных типов данных, и инициализировать их значения;

//byte
        byte a= 1;
//short
        short b= 20000;
//int
        int c = 2000000000;
//long
        long secondYear;
        secondYear=(365*24)*60*60;
        System.out.println("секунд в календарном году -"+secondYear);
//float
        float d = 112.2f;
//double
        double pi = 3.14159;
//boolean
        boolean x =true;
        boolean z =false;
//char
        char ch ='S';
        char ch1 ='9';
        System.out.println(ch +ch1);
//String
        String St1 = "I";
        String St2 = " am";
        String ST3 = " Aleksey";
        String name = St1+St2+ST3;
        System.out.println("name:"+name);

// exercise 3 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;

        int a1=2;
        int b1=3;
        int c1=4;
        int d1=2;
        int m1=a1*(b1+(c1/d1));
        System.out.println("Ответ на задание №3 :" +m1);

// exercise 4 Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;


    int a2 =15;
    int a3 =5;
    int summ = a2+ a3;
    if ((summ >=10)&&(summ<=20)){
        System.out.println("true");
    }else {
        System.out.println("false");
    }

//    exercise 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

    int a4 = 5;
    if(a4<0){
        System.out.println("число отрицательное");
    }else {
        System.out.println("число положительное ");
    }

//   exercise 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;



//   exercise 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

        System.out.println("Привет,"+ST3+'!');

//    exercise 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
//    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.










    }
}

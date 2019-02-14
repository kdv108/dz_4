package com.itschool;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Dz_4_Example_1();
	    Dz_4_Example_2();
	    Dz_4_Example_3();
	    Dz_4_Example_4();
	    Dz_4_Example_5();
	    Dz_4_Example_6();
	    Dz_4_Example_7();
	    Dz_4_Example_8();
	    Dz_4_Example_9();
    }
    private static void Dz_4_Example_1(){
        System.out.println(" Example_1  -  Программа определяет является ли общее число книг в библиотеке шестизначным числом:");
        int[] biblioteka = {6350, 1200, 3250, 2654, 900, 3521, 1620, 6350, 1200, 3250, 2654, 900, 3521, 1620, 6350, 1200, 3250, 2654, 900, 3521, 1620, 6350, 1200, 3250, 2654, 900, 3521, 1620, 6350, 1200, 3250, 2654, 900, 3521, 1620};
        int sumKnig = 0;
        int minX = 100000;  // самое маленькое шестизначное число
        int maxX = 1000000; // cамое маленькое семизначное число
        for (int a:biblioteka){
            System.out.print(a+", ");
            sumKnig += a;
        }
        if ((minX <= sumKnig) & (sumKnig < maxX)) {
            System.out.println("\nОбщее число книг в 35-ти разделах библиотеки является шестизначным числом: "+sumKnig);
        } else System.out.println("\nОбщее число книг в 35-ти разделах библиотеки не является шестизначным числом: "+sumKnig);
    }
    private static void Dz_4_Example_2(){
        System.out.println("\n\n Example_2  -  Программа определяет набрал ли спортсмен десятиборец достаточно баллов \n чтоб пройти в следующий этап соревнований, из массива баллов полученных в десяти видах спорта");
        int planka = 65;
        int[] Alexandr = {6, 8, 5, 5, 4, 9, 7, 5, 8, 7};
        int plankaAlexandr = 0;
        for (int a:Alexandr){
            System.out.print(a+"  ");
            plankaAlexandr += a;
        }
        if (planka <= plankaAlexandr) System.out.println("\nПоздравляем! Ваш спортсмен вышел в следующий этап соревнований! \n С проходным баллом: "+plankaAlexandr+" из необходимых: "+planka);
        else System.out.println("\nУвы, Ваш спортсмен не набрал необходимое колличество баллов для выхода в следующий этап соревнований. \n Его балл: "+plankaAlexandr+" из необходимых: "+planka);
    }
    private static void Dz_4_Example_3(){
        System.out.println("\n\n Example_3  -  Программа определяет из массива 18 оценок по какому виду программы - обязательной (1-6 оценки),\n короткой (7-12), или произвольной(12-18) был получен лучший результат спортсмена по фигурному катанию.");
        int[] vseBall = {5, 4, 3, 4, 5, 6, 5, 2, 3, 0, 4, 5, 3, 4, 5, 5, 6, 4};
        int pro = 0;   //произвольная программа
        int ob = 0;    //обязательная
        int kor = 0;   //короткая
        int x = 6;
        for (int a:vseBall){
            System.out.print(a+"  ");
        }
        System.out.println(";");
        for(int i = 0; i < vseBall.length; i++){
            if (i < x) ob += vseBall[i];
            if ((i >= x) & (i < (x + x))) kor += vseBall[i];
            if (i >= (x+x)) pro += vseBall[i];
        }
        if ((ob > kor) & (ob > pro)) System.out.println("Лучший результат спортсмен получил по обязательной программе: "+ob);
        else if ((kor > ob) & (kor > pro)) System.out.println("Лучший результат спортсмен получил по короткой программе: "+kor);
        else if ((pro > ob) & (pro > kor)) System.out.println("Лучший результат спортсмен получил по произвольной программе: "+pro);
        else if ((ob == kor) & (ob > pro)) System.out.println("Лучший результат спортсмен получил по 2-ум программам обязательной и короткой: "+ob+" и "+kor);
        else if ((ob == pro) & (ob > kor)) System.out.println("Лучший результат спортсмен получил по 2-ум программам обязательной и произвольной: "+ob+" и "+pro);
        else if ((pro == kor) & (pro > ob)) System.out.println("Лучший результат спортсмен получил по 2-ум программам произвольной и короткой: "+pro+" и "+kor);
        else System.out.println("Лучший результат спортсмен получил по 3-ем программам одинаковый: обязательной - "+ob+", короткой - "+kor+", и произвольной - "+pro+" баллов." );
    }
    private static void Dz_4_Example_4(){
        System.out.println("\n\n Example_4  -  Программа определяет в массиве вещественных чисел наибольшее число последовательно расположенных положительных чисел: ");
        int[] arrV = {5, -9, -6, 5, 6, -4, 1, 9, 1, 32, 68, 2, 4, -58, -45, 8, 9, 63, 4};
        int maxN = 0;
        int n =0;
        for (int a:arrV){
            System.out.print(a+"  ");
        }
        for (int i = 0; i < arrV.length; i++){
            if (arrV[i] > 0){
               for (int y = i; y < arrV.length; y++){
                   if (arrV[y] > 0) n++;
                   else {
                       i = y;
                       break;
                   }
               }
               if (maxN < n) maxN = n;
               n = 0;
            }
        }
        System.out.println("\nВ данном массиве наибольшее число последовательно расположенных положительных чисел: "+maxN);
    }
    private static void Dz_4_Example_5(){
        System.out.println("\n\n Example_5  -  Программа определяет есть ли в целочисленном массиве простые числа, если есть выводит их номера.");
        int[] prostoArr = {12, 25, -95, 135, 14, 2, 97, 67, 139, -25, 13, 4};
        int x = 2;
        int indicator = 0;
        for (int a:prostoArr){
            System.out.print(a+"  ");
        }
        System.out.print("\nПростые числа: ");
        for (int i = 0; i < prostoArr.length; i++){
            if (prostoArr[i] >= x){
                for (int y = 2; y <= prostoArr[i];){
                    if ((prostoArr[i] % y) != 0) y++;
                    else if (prostoArr[i] == y) {
                        System.out.print(prostoArr[i]+" под индексом "+i+", ");
                        indicator++;
                        break;
                    }else break;
                }
            }
        }
        if (indicator == 0) System.out.println("в данном массиве отсутствуют.");
        else System.out.println("\n Всего найдено простых чисел "+indicator);
    }
    private static void Dz_4_Example_6(){
       System.out.println("\n\n Example_6  -  Программа заменяет нулем максимальный и минимальный элементы в массиве где все элементы различны.");
       int[] z = {5, 85, 12, 4, 36, 9, 54, 62, 87, 2, 57, 97, 67, 21};
       int x = 0;
       Arrays.sort(z);
       z[0] = x;
       z[z.length - 1] = x;
       for (int a:z){
           System.out.print(a+" ");
       }
    }
    private static void Dz_4_Example_7(){
        System.out.println("\n\n Example_7  -  Программа заменяет нулями все повторяющиеся элементы в массиве, оставляя их первые вхождения");
        int[] y = {2, 69, 35, 48, 2, 4, 35, 4, 48, 4};
        int x = 0;
        for (int a:y){
            System.out.print(a+"  ");
        }
        System.out.println(";");
        for (int i = 0; i < y.length - 1; i++){
            if (y[i] != 0){
                for (int p = i + 1; p < y.length; p++){
                    if (y[i] == y[p]) y[p] = x;
                }
            }
        }
        for (int a:y){
            System.out.print(a+"  ");
        }
        System.out.println(".");
    }
    private static void Dz_4_Example_8(){
        System.out.println("\n\n Example_8  -  Программа заменяет нулями все элементы в массиве которые: отрицательные, больше числа n, находяться от n1 до n2:");
        int[] arr = {1, 35, -9, 64, -21, -36, 54, 2, 19, 17, 13, 22, 16, -25, 3};
        int x = 0;
        int n = 30;
        int n1 = 8;
        int n2 = 12;
        System.out.println("Массив до замены:");
        for (int a:arr){
            System.out.print(a+"  ");
        }
        for (int i = 0; i < arr.length; i++){
            if ((arr[i] < x) || (arr[i] > n)) arr[i] = x;    // можно было в одну строчку записать условие,
            if ((i >= n1) & (i <= n2)) arr[i] = x;           // но мне кажется так будет понятней для других
        }
        System.out.println("\n Массив после замены:");
        for (int a:arr){
            System.out.print(a+"  ");
        }
    }
    private static void Dz_4_Example_9(){
        System.out.println("\n\n Example_9  -  Программа из заданного целочисленного массива удаляет элементы которые кратные 3 или 5, и все четные числа стоящие на нечетных местах: ");
        int[] z = {22, 15, 45, 67, 65, 33, 12, 24, 57, 97};
        int n = 10;
        int x = 2;
        System.out.print("Массив до обработки: ");
        for (int a:z){
            System.out.print(a+"  ");
        }
        System.out.println(". ");
        for (int i = 0; i < n; i++){
            if (((z[i] % 5) == 0) || ((z[i] % 3) == 0)) {
                for (int y = i; y < n; y++){
                    if (y == (n-1)) z[y] = 0;
                    else z[y] = z[y + 1];
                }
                --n;
                --i;
                continue;
            }
            if (((i % x) != 0) & ((z[i] % x) == 0)){
                for (int y = i; y < n; y++){
                    if (y == (n-1)) z[y] = 0;
                    else z[y] = z[y + 1];
                }
                --n;
                --i;
            }
        }
        System.out.println("Массив после обработки:  ");
        for (int a:z){
            System.out.print(a+"  ");
        }
        System.out.println(". ");
    }
}

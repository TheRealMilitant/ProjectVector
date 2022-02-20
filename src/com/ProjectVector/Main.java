package com.ProjectVector;

public class Main {

    public static void main(String[] args) {

        //Проектирование и создание класса, описывающего вектор
        Vector vtr1 = new Vector(8, 2, 0);
        Vector vtr2 = new Vector(3, -5, 1);

        //1. метод, вычисляющий длину вектора
        System.out.println("№1: " + vtr1.getVectorLength());

        //2. метод, вычисляющий скалярное произведение
        System.out.println("№2: " + vtr1.getVectorDotProduct(vtr2));

        //3. метод, вычисляющий векторное произведение с другим вектором
        System.out.println("№3: " + vtr1.getVectorProduct(vtr2));

        //4. метод, вычисляющий угол между векторами (или косинус угла)
        System.out.println("№4 (угол в градусах):  " + Math.toDegrees(Math.acos(vtr1.getVectorAngle(vtr2))));

        //5. методы для суммы и разности векторов
        System.out.println("№5: " + vtr1.getSumOrMinVectors(vtr2, true));

        //6. статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
        int N = 4;
        Vector[] array = Vector.getArrayVectors(N);

        for (Vector element : array) {
            System.out.println(element);
        }


    }
}

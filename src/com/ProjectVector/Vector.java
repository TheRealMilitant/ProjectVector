package com.ProjectVector;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Метод, вычисляющий длину вектора
    public double getVectorLength() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    //Метод, вычисляющий скалярное произведение
    public double getVectorDotProduct(Vector vctr) {
        return x * vctr.x + y * vctr.y + z * vctr.z;
    }

    //Метод, вычисляющий векторное произведение с другим вектором
    public Vector getVectorProduct(Vector vctr) {
        return new Vector(y * vctr.z - z * vctr.y, z * vctr.x - x * vctr.z, x * vctr.y - y * vctr.x);
    }

    //Метод, вычисляющий угол между векторами (или косинус угла)
    public double getVectorAngle(Vector vctr) {
        return this.getVectorDotProduct(vctr) / (this.getVectorLength() * vctr.getVectorLength());
    }

    //Методы для суммы и разности
    //Если flagSum = true - возвращает сумму, иначе разность векторов.
    public Vector getSumOrMinVectors(Vector vctr, boolean flagSum) {
        return flagSum ? new Vector(x + vctr.x, y + vctr.y, z + vctr.z)
                       : new Vector(x - vctr.x, y - vctr.y, z - vctr.z);
    }

    //Статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
    public static Vector[] getArrayVectors(int N) {

        Vector[] arrayVector = new Vector[N];

        for (int i = 0; i < N; i++) {
            arrayVector[i] = new Vector(Math.random(), Math.random(), Math.random());
        }

        return arrayVector;
    }

    @Override
    public String toString() {
        return "Вектор: [" + x + "; " + y + "; " + z + "]";
    }
}

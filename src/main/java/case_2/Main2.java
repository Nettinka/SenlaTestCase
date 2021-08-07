package case_2;

public class Main2 {
    public static void main(String[] args) {
        NewVector vector1 = new NewVector(2.0, 3.0, 4.0, 8.0);
        NewVector vector2 = new NewVector(5.0, -8.0, 3.0, 14.0);

        System.out.println("Длина вектора 1 = " + vector1.vectorLength());
        System.out.println("Длина вектора 2 = " + vector2.vectorLength());

        System.out.println("Произведение первого вектора на второй: " + VectorProduct.newVector(vector1, vector2));
        System.out.println("Произведение второго вектора на первый: " + VectorProduct.newVector(vector2, vector1));
    }
}

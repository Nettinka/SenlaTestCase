package case_2;

import java.text.DecimalFormat;

public class VectorProduct {
    public static String newVector(NewVector vector1, NewVector vector2){
        Double a1Forv1 = vector1.getX2() - vector1.getX1();
        Double a2Forv1 = vector1.getY2() - vector1.getY1();

        Double b1Forv2 = vector2.getX2() - vector2.getX1();
        Double b2Forv2 = vector2.getY2() - vector1.getY1();

        Double cosAngle = (a1Forv1 * b1Forv2 + a2Forv1 * b2Forv2) /
                ((Math.sqrt(Math.pow(a1Forv1,2) + Math.pow(a2Forv1,2))) * (Math.sqrt(Math.pow(b1Forv2,2) + Math.pow(b2Forv2,2))));

        Double angle = Math.acos(cosAngle);

        Double scalarProduct = (a1Forv1*b1Forv2 + a2Forv1*b2Forv2) * Math.sin(angle) ;

        DecimalFormat df = new DecimalFormat("#.###");

        return "длина вектора с = " + df.format(scalarProduct);
    }
}

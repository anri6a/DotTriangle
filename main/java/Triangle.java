public class Triangle {
    //    int X1,X2,X3,Y1,Y2,Y3;
//    Dot first =new Dot(X1,Y1);
//    Dot second =new Dot(X2,Y2);
//    Dot third =new Dot(X3,Y3);

    double x1 = 1;
    double x2 = 2;
    double x3 = 3;
    double y1 = 4;
    double y2 = 5;
    double y3 = 6;
    double perimetr;
    double square;

    public double Perimetr() {
        perimetr = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)) + Math.sqrt(Math.pow((x3 - x2), 2) +
                Math.pow((y3 - y2), 2)) +
                Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        System.out.println("периметр = " + perimetr);
        return perimetr;
    }

    public double Square() {
        square = 1 / 2 * Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3));
        System.out.println("площадь = " + square);
        return square;
    }

}

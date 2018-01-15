public class Logic {


    public double perimetrCalculation() {
        perimetr = Math.sqrt(Math.pow((x2 - x1), exponent) + Math.pow((y2 - y1), exponent)) +
                Math.sqrt(Math.pow((x3 - x2), exponent) + Math.pow((y3 - y2), exponent)) +
                Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), exponent));
        return perimetr;
    }

    public double squareCalculation() {
        square = 1 / factor * Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3));
        return square;
    }
}

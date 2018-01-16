public class Logic {

    int exponent = 2;
    int factor = 2;
    double perimetr;
    double square;

    Triangle triangle = new Triangle() {
        public double calculatePerimetr(Triangle) {
            perimetr = Math.sqrt(Math.pow((getCoordinateX2() - getCoordinateX1()), exponent) +
                    Math.pow((getCoordinateY2() - getCoordinateY1()), exponent)) +
                    Math.sqrt(Math.pow((getCoordinateX3() - getCoordinateX2()), exponent) +
                            Math.pow((getCoordinateY3() - getCoordinateY2()), exponent)) +
                    Math.sqrt(Math.pow((getCoordinateX3() - getCoordinateX1()), 2) +
                            Math.pow((getCoordinateY3() - getCoordinateY1()), exponent));
            return perimetr;
        }

        public double calculateSquare(Triangle) {
            square = 1 / factor * Math.abs((getCoordinateX1() - getCoordinateX3()) *
                    (getCoordinateY2() - getCoordinateY3()) - (getCoordinateX2() - getCoordinateX3()) *
                    (getCoordinateY1() - getCoordinateY3()));
            return square;
        }

    };


}

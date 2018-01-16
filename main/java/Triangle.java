public class Triangle {
    private double coordinateX1;
    private double coordinateY1;
    private double coordinateX2;
    private double coordinateY2;
    private double coordinateX3;
    private double coordinateY3;

    Dot firstDot = new Dot(coordinateX1, coordinateY1);
    Dot secondDot = new Dot(coordinateX2, coordinateY2);
    Dot thirdDot = new Dot(coordinateX3, coordinateY3);

    public Triangle(double coordinateX1, double coordinateY1,
                    double coordinateX2, double coordinateY2,
                    double coordinateX3, double coordinateY3) {
        this.coordinateX1 = coordinateX1;
        this.coordinateY1 = coordinateY1;
        this.coordinateX2 = coordinateX2;
        this.coordinateY2 = coordinateY2;
        this.coordinateX3 = coordinateX3;
        this.coordinateY3 = coordinateY3;

    }


    public double getCoordinateX1() {
        return coordinateX1;
    }

    public void setCoordinateX1(double coordinateX1) {
        this.coordinateX1 = coordinateX1;
    }

    public double getCoordinateY1() {
        return coordinateY1;
    }

    public void setCoordinateY1(double coordinateY1) {
        this.coordinateY1 = coordinateY1;
    }

    public double getCoordinateX2() {
        return coordinateX2;
    }

    public void setCoordinateX2(double coordinateX2) {
        this.coordinateX2 = coordinateX2;
    }

    public double getCoordinateY2() {
        return coordinateY2;
    }

    public void setCoordinateY2(double coordinateY2) {
        this.coordinateY2 = coordinateY2;
    }

    public double getCoordinateX3() {
        return coordinateX3;
    }

    public void setCoordinateX3(double coordinateX3) {
        this.coordinateX3 = coordinateX3;
    }

    public double getCoordinateY3() {
        return coordinateY3;
    }

    public void setCoordinateY3(double coordinateY3) {
        this.coordinateY3 = coordinateY3;
    }

    public Dot getFirstDot() {
        return firstDot;
    }

    public void setFirstDot(Dot firstDot) {
        this.firstDot = firstDot;
    }

    public Dot getSecondDot() {
        return secondDot;
    }

    public void setSecondDot(Dot secondDot) {
        this.secondDot = secondDot;
    }

    public Dot getThirdDot() {
        return thirdDot;
    }

    public void setThirdDot(Dot thirdDot) {
        this.thirdDot = thirdDot;
    }
}

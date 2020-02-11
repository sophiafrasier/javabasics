public class Runner {
    public static void main(String[] args){
        Car myCar= new Car(2002, "BMW", "Sedan", 5000);
        myCar.drive(100);
        System.out.print(myCar.toString());

        Rectangle test=new Rectangle(4, 4);
        System.out.println(test.getArea());
        System.out.println(test.getDiagonal());
        System.out.println(test.isSquare());
    }
}

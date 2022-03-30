public class PrototypeMain
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Cars myCar = new Cars();
        myCar.insertCars("benz");
        myCar.insertCars("Audi");
        myCar.insertCars("mini cooper");
        myCar.insertCars("lamborghini");

        System.out.println(myCar.getCarList());

        Cars myCar2 = (Cars) myCar.clone();
        myCar2.removeCars("Audi");
        System.out.println(myCar2.getCarList());

        System.out.println(myCar.getCarList());
    }
}

import java.util.*;

public class Cars implements Cloneable
{
    private List<String> carList;

    public Cars()
    {
        this.carList = new ArrayList<String>();
    }

    public Cars(List<String> carList)
    {
        this.carList = carList;
    }

    public void insertCars(String car)
    {
       carList.add(car);
    }

    public void removeCars(String car)
    {
        carList.remove(car);
    }

    public List<String> getCarList()
    {
        return carList;
    }

    public Object clone() throws CloneNotSupportedException
    {
        List<String> temporaryCarList = new ArrayList<>();

        temporaryCarList.addAll(this.getCarList());
        return new Cars(temporaryCarList);
    }
}

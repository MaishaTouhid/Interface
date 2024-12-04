
public class Country implements Measurable{
    public  double area;
    public  String countryName;
    public Country(String countryName, double area) {
        this.area = area;
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public double getMeasure()
    {
        return area;
    }

}


public interface Measurable
{
    double getMeasure();
    //alada alada class eer jonno alada alada page creat na kore sob ek jaigai aivabeo kora jai
    /*
     public class BankAccount implements Measurable {
        public double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public double getMeasure() {
            return balance;
        }

    }


    public class Country implements Measurable {
        public double area;
        public String countryName;

        public Country(String countryName, double area) {
            this.area = area;
            this.countryName = countryName;
        }

        public String getCountryName() {
            return countryName;
        }

        public double getMeasure() {
            return area;
        }

    }


    public class Data {
        public static double average(Measurable[] objects) {
            double sum = 0;
            for (Measurable obj : objects) {
                sum = sum + obj.getMeasure();
            }
            if (objects.length > 0) {
                return sum / objects.length;
            } else {
                return 0;
            }
        }
    }
     */
}
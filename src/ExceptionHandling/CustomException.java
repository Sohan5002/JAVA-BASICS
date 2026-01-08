package ExceptionHandling;

public class CustomException {
    public  static  void main (String[]args) {
        DrivingLicense d1 = new DrivingLicense();
        d1.takeUserAge();
        try {
            d1.verify();
        } catch (UnderageException e) {
            e.printStackTrace();
        } catch (OverAgeException o) {
           o.printStackTrace();
        }


    }
}


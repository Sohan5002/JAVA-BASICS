package ExceptionHandling;

import java.util.Scanner;

public class DrivingLicense {

    int age;

    void takeUserAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = sc.nextInt();
    }

    void verify() throws UnderageException, OverAgeException {

        if (age < 18) {
            throw new UnderageException();
        }
        else if (age > 60) {
            throw new OverAgeException();
        }
        else {
            System.out.println("✅ Driving License Issued Successfully");
        }
    }
}

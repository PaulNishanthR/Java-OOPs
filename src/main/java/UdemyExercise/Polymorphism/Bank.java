package UdemyExercise.Polymorphism;

public class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.1f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.7f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.3f;
    }
}

class TestPolymorphism {
    public static void main(String args[]) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Interest rate: " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Interest rate: " + b.getRateOfInterest());
    }
}

// Base class
class Bank {
    public int getRateOfInterest() {
        return 0;  // Default rate of interest
    }
}

// Subclass for SBI
class SBI extends Bank {
    @Override
    public int getRateOfInterest() {
        return 8;  // SBI offers 8% interest
    }
}

// Subclass for ICICI
class ICICI extends Bank {
    @Override
    public int getRateOfInterest() {
        return 7;  // ICICI offers 7% interest
    }
}

// Subclass for AXIS
class AXIS extends Bank {
    @Override
    public int getRateOfInterest() {
        return 9;  // AXIS offers 9% interest
    }
}

public class Quo3 {
    public static void main(String[] args) {
        // Create bank objects using dynamic method dispatch
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        // Display rate of interest for each bank
        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest() + "%");
        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest() + "%");
        System.out.println("AXIS Rate of Interest: " + axis.getRateOfInterest() + "%");
    }
}


/* Output
SBI Rate of Interest: 8%
ICICI Rate of Interest: 7%
AXIS Rate of Interest: 9%
*/

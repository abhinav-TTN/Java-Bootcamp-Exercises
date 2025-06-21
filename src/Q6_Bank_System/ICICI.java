package Q6_Bank_System;

public class ICICI extends Bank {
    ICICI(String Name, String headOfficeAddress, String chairmanName, int branchCount, double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super(Name, headOfficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }

    @Override
    public String toString() {
        return "ICICI BANK DETAILS --\n" + super.toString();
    }
}

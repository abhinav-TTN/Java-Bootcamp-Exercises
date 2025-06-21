package Q6_Bank_System;

public class SBI extends Bank {
    SBI(String Name, String headOfficeAddress, String chairmanName, int branchCount, double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super(Name, headOfficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }

    @Override
    public String toString() {
        return "SBI BANK DETAILS --\n" + super.toString();
    }
}

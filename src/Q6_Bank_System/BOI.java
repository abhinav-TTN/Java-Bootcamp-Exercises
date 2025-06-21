package Q6_Bank_System;

public class BOI extends Bank {
    BOI(String Name, String headOfficeAddress, String chairmanName, int branchCount, double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super(Name, headOfficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }

    @Override
    public String toString() {
        return "BOI BANK DETAILS --\n" + super.toString();
    }
}

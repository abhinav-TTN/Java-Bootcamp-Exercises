package Q6_Bank_System;
/*
Q6) Implement a banking system using java.
Create 3 subclass of Bank : SBI, BOI, ICICI
Classes should have attributes like Name, headofficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate.
All 3 should have the following methods:
1. add getters and setters for the fields
2. print details of every bank (override toString)
 */
public class Bank {
    private String Name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    Bank(String Name, String headOfficeAddress, String chairmanName, int branchCount, double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        this.Name = Name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    public String getName() {
        return Name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    @Override
    public String toString() {
        return "Bank Name: " + Name + "\n" +
                "Head Office: " + headOfficeAddress + "\n" +
                "Chairman: " + chairmanName + "\n" +
                "Branch Count: " + branchCount + "\n" +
                "FD Interest Rate: " + fdInterestRate + "%" + "\n" +
                "Personal Loan Interest Rate: " + personalLoanInterestRate + "%" + "\n" +
                "Home Loan Interest Rate: " + homeLoanInterestRate + "%";
    }
}

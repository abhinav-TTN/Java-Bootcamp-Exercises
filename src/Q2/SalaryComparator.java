package Q2;

import java.util.Comparator;

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.Salary.compareTo(o2.Salary);
    }
}
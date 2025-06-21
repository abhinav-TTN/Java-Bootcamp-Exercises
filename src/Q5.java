/*
Q5) Create a class named Employee with fields firstname,lastname,age and designation.
The class should:
1. have all types of constructors to initialize the object
2. class should also have setter methods to update a particular field
3. Override its toString method to display a meaningful message using all these fields.
*/
class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    public Employee() {
        firstName = "";
        lastName = "";
        age = 0;
        designation = "";
    }

    public Employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this .designation = designation;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee Details:\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Designation: " + designation + "\n";
    }
}

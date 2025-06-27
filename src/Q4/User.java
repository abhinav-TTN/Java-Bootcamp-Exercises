package Q4;

class User {
    final public String name;

    User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name= '" + name + "'\n";
    }
}
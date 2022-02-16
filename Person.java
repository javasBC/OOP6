public class Person {
    public String name;
    public double age;
    public int id;

    public Person(String name, double age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Person) || obj == null)
            return false;

        Person other =(Person)obj;

        if (this.name.equals(other.name) && this.age==other.age
                && this.id == other.id){
            System.out.println("its the same object ");
            return true;
        }
        return  false;



    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

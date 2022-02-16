public class Computer {
    public String color;
    public double speed;
    public int memory;
    public String make ;

    public Computer(String color, double speed, int memory, String make) {
        this.color = color;
        this.speed = speed;
        this.memory = memory;
        this.make = make;
    }



    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if (!(obj instanceof Computer))
            return false;
        Computer other=(Computer)obj;
        return this.memory==other.memory&&this.speed==other.speed&&this.make.equals(other.make)
                &&this.color.equals(other.color);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", memory=" + memory +
                ", make='" + make + '\'' +
                '}';
    }
}

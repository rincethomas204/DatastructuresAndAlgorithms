package learning.datastructures.adt;

public class Counter {
    private int counterVal;
    private String name;

    public Counter(String name){
        this.name = name;
        this.counterVal = 0;
    }

    public void increment(){
        this.counterVal++;
    }

    public int getCurrentVal(){
        return counterVal;
    }

    @Override
    public String toString() {
        return "Counter {" +
                "counterVal=" + counterVal +
                ", name='" + name + '\'' +
                '}';
    }
}

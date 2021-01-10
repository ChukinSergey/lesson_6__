package lesson6;

public class animal {
    private String tongue;//язык звуки издает
    private String tail;//хвост двигается
    private String mouth;//рот кушает

    public animal(String tongue, String tail, String mouth) {
        this.tongue = tongue;
        this.tail = tail;
        this.mouth = mouth;
    }
    String make_sounds(){
        return tongue;
    }
    String move(){
        return tail;
    }
    String to_eat(){
        return mouth;
    }
    void climb_trees(){};//пустой метод для теста
    void swim(){};

    public String getTongue() {
        return tongue;
    }

    public void setTongue(String tongue) {
        this.tongue = tongue;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }
}

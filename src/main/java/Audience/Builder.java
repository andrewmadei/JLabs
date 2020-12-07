package Audience;

public interface Builder {

    void setNumberOfAudience(int number);
    void setFloor(int floor);
    void setSquare(float square);
    void setLessons(boolean[] lessons);
    void addTables(int tables);
    void addChairs(int chairs);
    void setProjector(boolean projector);

}

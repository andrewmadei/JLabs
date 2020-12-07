package Audience;

/**
 * Project on Java <b>classes</b>.
 * @autor Schur Oleksandr
 * @version 2.0
 */
public class LectureAudienceBuilder implements Builder {

    private LectureAudience lectureAudience;

    @Override
    public void setNumberOfAudience(int number) {
        lectureAudience.number_of_audience = number;
    }

    @Override
    public void setFloor(int floor) {
        this.lectureAudience.floor = floor;
    }

    @Override
    public void setSquare(float square) {
        this.lectureAudience.square = square;
    }

    @Override
    public void setLessons(boolean[] lessons) {
        for (int i = 0; i < this.lectureAudience.lessons.length && i < lessons.length; i++) {
            this.lectureAudience.lessons[i] = lessons[i];
        }
    }

    @Override
    public void addTables(int tables) {
        if (tables * 3 <= this.lectureAudience.max_count_of_stud && tables * 4 <= this.lectureAudience.square) {
            this.lectureAudience.countOfTable += tables;
        }
    }

    @Override
    public void addChairs(int chairs) {
        if (this.lectureAudience.countOfTable * 2 >= chairs) {
            this.lectureAudience.countOfChair += chairs;
        }
    }

    @Override
    public void setProjector(boolean projector) {
        this.lectureAudience.haveProjector = projector;
    }

    public void setAvailableWIFI(boolean wifi) {
        this.lectureAudience.availableWIFI = wifi;
    }

    public LectureAudience getLectureAudience() {
        return this.lectureAudience;
    }
}

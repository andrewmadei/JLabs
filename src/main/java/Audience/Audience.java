package Audience;

import Validation.NameAttribute;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * version 2.0
 * class Audience.Audience
 */
public abstract class Audience<compareTo> implements Serializable, Comparable<Audience> {

    @Positive(message = "Must be great than 0")
    public int number_of_audience;

    @Positive(message = "Must be great than 0")
    protected int floor;

    @Positive(message = "Must be great than 0")
    protected float square = 0;

    @Positive(message = "Must be great than 0")
    protected int max_count_of_stud = 1;

    protected boolean[] lessons = new boolean[] {false, false, false, false, false, false, false, false};

    @Positive(message = "Must be great than 0")
    protected int countOfTable;

    @Positive(message = "Must be great than 0")
    protected int countOfChair;

    protected boolean haveProjector;

    @Size(min = 3, max = 40, message = "Must be between 3 and 40 characters!")
    public String nameOfAudience;

    @Size(min = 1, max = 20, message = "Must be between 1 and 6 characters!")
    public String number;

    public int getNumber_of_audience() {
        return this.number_of_audience;
    }

    public int getFloor() {
        return this.floor;
    }

    public float getSquare() {
        return this.square;
    }

    public int getMax_count_of_stud() {
        return this.max_count_of_stud;
    }

    public boolean checkAvailable(int numberOfLesson) {
        if (numberOfLesson > 0 && numberOfLesson < 9) {
            return this.lessons[numberOfLesson];
        }
        return false;
    }

    public void takeAddLesson(int numberOfLesson) {
        if (!this.checkAvailable(numberOfLesson)) {
            this.lessons[numberOfLesson] = true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Audience)) return false;
        Audience audience = (Audience) o;
        return number_of_audience == audience.number_of_audience &&
                floor == audience.floor &&
                Float.compare(audience.square, square) == 0 &&
                max_count_of_stud == audience.max_count_of_stud &&
                countOfTable == audience.countOfTable &&
                countOfChair == audience.countOfChair &&
                haveProjector == audience.haveProjector &&
                Arrays.equals(lessons, audience.lessons);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(number_of_audience, floor, square, max_count_of_stud, countOfTable, countOfChair, haveProjector);
        result = 31 * result + Arrays.hashCode(lessons);
        return result;
    }

    @Override
    public String toString() {
        return "Audience.Audience{" +
                "number_of_audience=" + number_of_audience +
                ", floor=" + floor +
                ", square=" + square +
                ", max_count_of_stud=" + max_count_of_stud +
                ", countOfTable=" + countOfTable +
                ", countOfChair=" + countOfChair +
                '}';
    }

    public abstract int compareTo(Audience audience);

    public abstract int findMaxCountOfStudents();
}

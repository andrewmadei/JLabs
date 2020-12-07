package Audience;

import java.util.Objects;

/**
 * version 1.0
 */
public class LectureAudience extends Audience{

    protected boolean availableWIFI;

    public boolean getAvailableWIFI() {
        return this.availableWIFI;
    }

    @Override
    public int findMaxCountOfStudents() {
        return Math.min(this.countOfTable * 3, this.countOfChair);
    }

    @Override
    public String toString() {
        return super.toString() + "Audience.LectureAudience{" +
                "availableWIFI=" + availableWIFI +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LectureAudience)) return false;
        if (!super.equals(o)) return false;
        LectureAudience that = (LectureAudience) o;
        return availableWIFI == that.availableWIFI;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), availableWIFI);
    }

    public int squareWifiConnection() {
        int radius = (int) Math.random() * 20 + 1;
        if (this.square > 2 * Math.PI * radius) {
            return -1;
        }
        else {
            return 1;
        }
    }

    @Override
    public int compareTo(Audience o) {
        return 0;
    }
}

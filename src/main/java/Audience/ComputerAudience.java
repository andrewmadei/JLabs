package Audience;

import javax.validation.constraints.*;
import java.util.Objects;

public class ComputerAudience extends Audience{

    @Positive(message = "Must be great than 0")
    protected int countOfComputer;

    protected boolean interactiveBlackBoard;

    public int getCountOfComputer() {
        return this.countOfComputer;
    }

    public boolean getInteractiveBlackBoard() {
        return this.interactiveBlackBoard;
    }

    @Override
    public int findMaxCountOfStudents() {
        return Math.min(this.countOfTable, this.countOfChair);
    }

    @Override
    public String toString() {
        return super.toString() + "Audience.ComputerAudience{" +
                "countOfComputer=" + countOfComputer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComputerAudience)) return false;
        if (!super.equals(o)) return false;
        ComputerAudience that = (ComputerAudience) o;
        return countOfComputer == that.countOfComputer &&
                interactiveBlackBoard == that.interactiveBlackBoard;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), countOfComputer, interactiveBlackBoard);
    }

    public int numberOfBrokenComputers() {
        int brokenComputer = 0;
        int randNumber = (int) (Math.random() * 10);
        if (randNumber > this.countOfComputer) {
            return brokenComputer;
        }
        return randNumber;
    }

    @Override
    public int compareTo(Audience audience) {
        return (int) (this.square - audience.square);
    }
}

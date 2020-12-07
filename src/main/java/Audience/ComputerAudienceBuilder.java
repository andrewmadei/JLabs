package Audience;

public class ComputerAudienceBuilder implements Builder  {

    private final ComputerAudience computerAudience = new ComputerAudience();

    @Override
    public void setNumberOfAudience(int number) {
        this.computerAudience.number_of_audience = number;
    }

    @Override
    public void setFloor(int floor) {
        this.computerAudience.floor = floor;
    }


    @Override
    public void setSquare(float square) {
        this.computerAudience.square = square;
    }

    @Override
    public void setLessons(boolean[] lessons) {
        for (int i = 0; i < this.computerAudience.lessons.length && i < lessons.length; i += 2) {
            this.computerAudience.lessons[i] = lessons[i];
        }
    }

    @Override
    public void addTables(int tables) {
        this.computerAudience.countOfTable += tables;
    }

    @Override
    public void addChairs(int chairs) {
        this.computerAudience.countOfChair += chairs;
    }

    @Override
    public void setProjector(boolean projector) {
        this.computerAudience.haveProjector = projector;
    }

    public void addComputer(int addComputer) {
        this.computerAudience.countOfComputer += addComputer;
    }

    public void setInteractiveBlackBoard() {
        this.computerAudience.interactiveBlackBoard = true;
    }

    public ComputerAudience getComputerAudience() {
        return this.computerAudience;
    }
}

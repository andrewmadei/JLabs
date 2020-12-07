package Comparators;
import java.util.Comparator;
import Audience.Audience;

public class AudienceCapacityComparator implements Comparator<Audience> {

    @Override
    public int compare(Audience audience1, Audience audience2) {
        return (audience1.getFloor() - audience2.getFloor());
    }
}

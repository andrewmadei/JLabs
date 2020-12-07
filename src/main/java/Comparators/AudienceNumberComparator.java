package Comparators;
import java.util.Comparator;
import Audience.Audience;

public class AudienceNumberComparator implements Comparator<Audience> {

    @Override
    public int compare(Audience audience1, Audience audience2) {
        return audience1.getNumber_of_audience() - audience2.getNumber_of_audience();
    }
}

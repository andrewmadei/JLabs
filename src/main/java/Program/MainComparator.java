package Program;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import Audience.*;
import Comparators.*;

public class MainComparator {

    static List<Audience> sortByCompareTo(List<Audience> audiences) {
        audiences.sort(Audience::compareTo);
        return audiences;
    }

    static List<Audience> sortByCapacity(List<Audience> audiences) {
        audiences.sort(new AudienceCapacityComparator());
        return audiences;
    }

    static List<Audience> sortByNumber(List<Audience> audiences) {
        Comparator<Audience> comparator = new AudienceNumberComparator().thenComparing(new AudienceNumberComparator());
        audiences.sort(comparator);
        return audiences;
    }

    public static void main(String[] args) {
        ComputerAudienceBuilder audienceBuilder21 = new ComputerAudienceBuilder();
        audienceBuilder21.addTables(20);
        audienceBuilder21.setFloor(2);
        audienceBuilder21.setNumberOfAudience(21);
        audienceBuilder21.addChairs(24);
        audienceBuilder21.setSquare(32.9f);

        ComputerAudience audience21 = audienceBuilder21.getComputerAudience();

        ComputerAudienceBuilder audienceBuilder19 = new ComputerAudienceBuilder();

        audienceBuilder19.setNumberOfAudience(19);
        audienceBuilder19.addChairs(22);
        audienceBuilder19.setSquare(22.9f);

        ComputerAudience audience19 = audienceBuilder19.getComputerAudience();

        ComputerAudienceBuilder audienceBuilder31 = new ComputerAudienceBuilder();
        audienceBuilder31.setNumberOfAudience(31);
        audienceBuilder31.setFloor(3);
        audienceBuilder31.setSquare(24.9f);

        ComputerAudience audience31 = audienceBuilder31.getComputerAudience();

        ComputerAudienceBuilder audienceBuilder27 = new ComputerAudienceBuilder();
        audienceBuilder27.setNumberOfAudience(27);
        audienceBuilder27.setFloor(2);
        audienceBuilder27.setSquare(20.9f);

        ComputerAudience audience27 = audienceBuilder27.getComputerAudience();

        List<Audience> faculty = Arrays.asList(
                audience31,
                audience19,
                audience21,
                audience27
        );

        System.out.println("Sorted list of audiences by compareTo");
        sortByCompareTo(faculty).forEach(a -> System.out.println("\t" + a));

        System.out.println("Sorted list of audiences by number");
        sortByNumber(faculty).forEach(a -> System.out.println("\t" + a));

        System.out.println("Sorted list of audiences by Capacity");
        sortByCapacity(faculty).forEach(a -> System.out.println("\t" + a));

        System.out.println("\n\n1)Sorted list of all audiences:");
        faculty.stream().sorted().forEach(System.out::println);

    }
}

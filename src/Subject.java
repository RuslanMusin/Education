import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Subject {

    private Integer id;

    private String name;

    private Integer semesterId;

    private Block block;

    private List<Requirement> requirements = new ArrayList<>();

    private List<String> nextSubjects = new ArrayList<>();

    private List<Subject> pastSubjects = new ArrayList<>();

    private Integer markValue;

    private Integer interestValue = 2;

    private String status;

}


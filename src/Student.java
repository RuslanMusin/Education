public class Student {

    private Integer id;

    private String name;

    private EduGraph eduGraph;

    private Integer semesterId;

    public Student(String name, EduGraph eduGraph) {
        this.name = name;
        this.eduGraph = eduGraph;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EduGraph getEduGraph() {
        return eduGraph;
    }

    public void setEduGraph(EduGraph eduGraph) {
        this.eduGraph = eduGraph;
    }

}

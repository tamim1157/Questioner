public class GetterSetter {
    int id;
    String name;
    float grade;

    public int getId() {
        return id;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GetterSetter(int id) {
        this.id = id;
        this.name=name;
        this.grade=grade;
    }
}

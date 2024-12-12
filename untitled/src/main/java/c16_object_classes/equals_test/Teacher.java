package c16_object_classes.equals_test;

public class Teacher {

    private String name;
    private String schoolName;

    //AllArgsConstructor
    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }
    //Getter/setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //toString
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof c16_object_classes.Teacher){
            c16_object_classes.Teacher teacher = (c16_object_classes.Teacher) obj;
            return this.name.equals(teacher.name) && this.schoolName.equals(teacher.schoolName);
        }
        return false;
    }

    //hashCode
    @Override
    public int hashCode() {
        return name.hashCode() + schoolName.hashCode();
    }
}


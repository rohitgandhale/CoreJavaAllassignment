package OOPS.ObjectClass;

public class course {
    int courseId;
    String courseName;
    public course(){
    }
    public course(int courseId,String courseName){
        this.courseId=courseId;
        this.courseName=courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String toString(){
        return "course{"+
                "courseID="+courseId+
                ", courseName='"+courseName+'\''+'}';
    }
    protected void finalize() throws Throwable{
        System.out.println("course object being deleted");
    }
}

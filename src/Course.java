public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozNote;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
    }

    void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
        this.teacher=teacher;}
    else{
        System.out.println("ogretmen ve ders eslesmiyor");}}


    String printTeacher(){
       return this.teacher.toString();
    }


}

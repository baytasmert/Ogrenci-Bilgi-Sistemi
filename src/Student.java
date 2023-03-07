public class Student {

    Course c1;
    Course c2;
    Course c3;
    String classes;
    String name;
    String studentNo;
    double average;
    boolean isPass;

    Student(String name,String studentNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.studentNo=studentNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0;
        this.isPass=false;

    }

    void addBulkExamNote(int note1,int note2, int note3){
        if(note1>=0 && note1<=100)
        c1.note=note1;
        if(note2>=0 && note2<=100)
        c2.note=note2;
        if(note3>=0 && note3<=100)
        c3.note=note3;
    }

    void addBulkSozNote(int sozNote1,int sozNote2,int sozNote3){
        if(sozNote1>=0 && sozNote1<=100)
            c1.sozNote=sozNote1;
        if(sozNote2>=0 && sozNote2<=100)
            c2.sozNote=sozNote2;
        if(sozNote3>=0 && sozNote3<=100)
            c3.sozNote=sozNote3;

    }

    void printNote(){
        System.out.println(c1.name +" notu = "+c1.note);
        System.out.println(c2.name +" notu = "+c2.note);
        System.out.println(c3.name +" notu = "+c3.note);


    }

    void isPass(){
        this.average=(this.c1.note*0.8+this.c1.sozNote*0.2+this.c2.note*0.9+c2.sozNote*0.1+this.c3.note)/3.0;
        System.out.println("notunuz ="+this.average);
        if(this.average>55){
            System.out.println("Sinifi basarili sekilde gectiniz");

        }else {
            System.out.println("sinif tekrari!");
    }

}}

public class Main {
    public static void main(String[] args) {

    Teacher t1= new Teacher("mahmut","trh","5312083443");
        Teacher t2= new Teacher("ahmet","fzk","5325083443");
        Teacher t3=new Teacher("ali","bio","531539990");

        Course biyoloji=new Course("Biyoloji","103","bio");
        Course tarih=new Course("Tarih","101","trh");
        Course fizik=new Course("Fizik","102","fzk");

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        biyoloji.addTeacher(t3);

        Student s1=new Student("mert","123","3",biyoloji,tarih,fizik);
        s1.addBulkExamNote(93,76,81);
        s1.addBulkSozNote(80,100,91);
        s1.printNote();
        s1.isPass();
    }



}
public class Teacher {
    String name;
    String telnr;
    String branch;

    Teacher(String name,String branch,String telnr){
        this.name=name;
        this.branch=branch;
        this.telnr=telnr;

    }

    @Override
    public String toString() {
        return   "name='" + name + '\'' +
                ", telnr='" + telnr + '\'' +
                ", branch='" + branch + '\'' ;
    }
}

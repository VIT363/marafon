package day6;

public class Teacher {
    String name;
    String subject;
    String name1;

    public Teacher() {
        this.name = "Сидоров Павел Петрович";
        this.subject = "физика";
        this.name1 = "Иванов Алексей";
    }
    public void evaluate(){
        int grade= (int) (2+ (Math.random()*(6-2)));
        String gradeRes=null;
        if (grade==2){
             gradeRes="неудовлетворительно";
        }else {
            if (grade==3){
                gradeRes="удовлетворительно";
            } else {
                if (grade==4){
                    gradeRes="хорошо";
                } else {
                    if (grade==5){
                    gradeRes="отлично";
                    }
                }
            }
        }
        System.out.println("Преподаватель "+name+" оценил студента с именем "+name1+" по предмету "+subject+" на оценку: "+gradeRes);
    }
}





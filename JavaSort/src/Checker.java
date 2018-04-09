import java.util.Comparator;

public class Checker implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getCgpa() == o2.getCgpa()){
            if (o1.getFname() == o2.getFname()){
                return Integer.compare(o2.getId(), o1.getId());
            }else{
                return o1.getFname().compareTo(o2.getFname());
            }
        }else{
            return Double.compare(o2.getCgpa(), o1.getCgpa());
        }
    }

}

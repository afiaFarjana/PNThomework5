package Super_this_final;

public class StudentInfo {
    private int stId;
    private String name;
    private String address;

    public StudentInfo(){
        System.out.println("No information recorded.");
    }

    //use of this operator
    public StudentInfo(int id, String name, String address){
        stId = id;
        this.name = name;
        this.address = address;
    }

    public int getStudentId(){
        return stId;
    }
    public String getStudentName(){
        return name;
    }

}

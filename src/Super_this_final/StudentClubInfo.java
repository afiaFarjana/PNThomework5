package Super_this_final;

public class StudentClubInfo extends StudentInfo{
    private int clubId;
    private double clubFee;

    //use of super
    public StudentClubInfo(){
        super();
    }
    public StudentClubInfo(int id,String name,String address,int clubId){
        super(id,name,address);
        this.clubId = clubId;
    }

    //use of final method
    public final double getClubFee(){
        this.clubFee = 30.00;
        return clubFee;
    }
    public int getClubId(){
        return clubId;
    }

    public static void main(String[] args) {
        StudentClubInfo st1 = new StudentClubInfo(1,"a","greenhouse",101);
        System.out.println("Student ID: "+ st1.getStudentId());
        System.out.println("Student Name: "+ st1.getStudentName());
        System.out.println("Student Club Id: "+ st1.getClubId());
        System.out.println("Necessary club fee: $"+ st1.getClubFee());
    }

}

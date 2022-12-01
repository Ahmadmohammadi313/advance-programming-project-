package initil;
class student{
    int rollNumber;
    String name;
    float Fee;
    public student(int roll,String name,float fee)
    {
  rollNumber=roll;
 name=name;
  Fee=fee;   
       }
    public void displ(){
        System.out.println(rollNumber+"    "+name+"   "+Fee);
        
    }

}
public class Initil {
    public static void main(String[] args) {
student n=new student(0011, "ahmmad", 2000);
n.displ();

    }
    
}

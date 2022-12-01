package innerclass;
class MyOuterClass{
    int y=200;
    class MyInnerClass{
        int x=300;
    }
}
public class InnerClass {
    public static void main(String[] args) {
        MyOuterClass myouterclassobject=new MyOuterClass();
        MyOuterClass.MyInnerClass myinnerclass=myouterclassobject.new MyInnerClass();
        System.out.println(myouterclassobject.y+myinnerclass.x);
        
    }
    
}

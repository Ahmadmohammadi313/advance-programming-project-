package filehandalingpart2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileHandalingpart2 {
    public static void main(String[] args) {
        //*************create our file ********
//      try{
//          File createfile=new File("teretewrxt.txt");
//          if(createfile.createNewFile()){
//              System.out.println("file has been created!!"+createfile.getAbsoluteFile());
//              System.out.println();
//          }else{
//              System.out.println("File already Exsist!!!");
//          }
//      }catch(IOException e){
//          System.out.println("Error has been occured!!");
//      }
//************Write in our file************
//try{
//FileWriter writemyfile=new FileWriter("text.txt");
//writemyfile.write("Please Add Me on your text!!!");
//writemyfile.close();
//    System.out.println("File Added Successfully!!");
//}catch(IOException n){
//    System.out.println("An Error Accured!!!");
//    n.printStackTrace();
//}    
//------------------------Read File ----------
//try{
//    File readmyfile=new File("text.txt");
//    Scanner readfile=new Scanner(readmyfile);
//    while(readfile.hasNextLine()){
//        String data=readfile.nextLine();
//        System.out.println(data);
//    }
//    readfile.close();
//}catch(IOException n){
//    System.out.println("Error has been Occured !!!");
//    n.printStackTrace();
//}
//File n = new File("text.txt");
//if(n.delete()){
//    System.out.println("File Successfully Deleted!!!");
//}else{
//    System.out.println("Failed canno Deleted File"+n.getName());
//}
try{
    File n=new File("text.txt");
    Scanner m=new Scanner(n);
    while(m.hasNextLine()){
            String date=m.nextLine();
            System.out.println(date);
     }
}catch(IOException i){
    System.out.println("dksfjsdlfjdsklfjdslkfj");
}
}
    
}

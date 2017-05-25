import java.util.*;
class Student{
       private String name=new String();
       private int rollno;
       private int Mphy,Mchem,Mmath;//here Mphy,Mchem,Mmath are marks of a studentin physics chemistry and maths respectively
         Scanner s=new Scanner(System.in); 
           
             public void setData(){//this function sets data of students as entered by the user. 
                   name=s.next();
                   rollno=s.nextInt();
                   Mphy=s.nextInt();
                   Mchem=s.nextInt();
                   Mmath=s.nextInt();
             }
               
                public void showData(){//this function shows the student records and their marks 
                     System.out.println("Name-"+name+" rollno-"+rollno+" Mphy-"+Mphy+" Mchem-"+Mchem+" Mmath-"+Mmath);//printing data of a student
                }

}
public class Result{
    public static void main(String []args){
        int n,i;
        System.out.println("Enter no of students whose data u want to store");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();//n contains no of data user wants to enter i.e. number of students  
        Student s[]=new Student[n];//an array of n size which will act as reference variable for n students
             
             for(i=0;i<n;i++){
                s[i] = new Student();//object declaration for student class
                System.out.println("Enter name  rollno and marks in physics chemistry and math in given order ");
                s[i].setData();//calls setdata()for object s[i]
      
             }
       
       System.out.println("following is data of students\n");
       
            for(i=0;i<n;i++){
                
                s[i].showData();//calls showdata() for object s[i]
      
           }
       
    }
}

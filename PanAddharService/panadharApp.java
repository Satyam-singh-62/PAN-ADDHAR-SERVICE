import java.util.*;
public class panadharApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        addharService as=new addharService();
        panService ps=new panService();
        System.out.print("Enter the Addhar number :");
        String addharNumber=sc.nextLine();
        addhar Addhar=as.getAddharByNumber(addharNumber);
        Pan pan=ps.getpanaddharNumber(addharNumber);
        sc.close();
        if(Addhar!=null && pan!=null){
            System.out.println("Addhar Details ="+Addhar);     
            System.out.println("pan Details ="+pan);
        }
        else{
            System.out.println("no result found......");
        }
    }
}

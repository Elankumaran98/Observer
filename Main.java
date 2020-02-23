package Exam.com;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i,n=1,k;
        do{
            Scanner in=new Scanner(System.in);
            System.out.println("1.Binary:\n2.Hexa:\n3.Both:\n4.Exit:\n");
            k=in.nextInt();
            Subject subject=new Subject();
            Observer OctaObserver=new OctalObserver(subject);
            Observer BinaryObserver=new BinaryObserver(subject);
            switch (k){
                case 1:
                    System.out.println("Enter number");
                    i=in.nextInt();
                    subject.deattach(OctaObserver);
                    System.out.println("Set State Change:");
                    subject.setState(i);
                    break;
                case 2:
                    System.out.println("Enter number");
                    i=in.nextInt();
                    subject.deattach(BinaryObserver);
                    System.out.println("Set State Change:");
                    subject.setState(i);
                    break;
                case 3:
                    System.out.println("Enter number");
                    i=in.nextInt();
                    System.out.println("Set State Change:");
                    subject.setState(i);
                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Error...\nTry Again");
                break;
            }
        }while (n==1);
    }
}

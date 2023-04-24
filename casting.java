import java.util.Scanner;

public class casting{
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int A=scanner.nextInt();
    long B=(long)A;

    System.out.println("_________________");
    System.out.print(B);
    System.out.println("_________________");
    System.out.println(CasttoLong(A));


}
/**
 * @param A
 * @return 
 */
static long CasttoLong(int A){
    long X=(long)A;





    return X;
}




}
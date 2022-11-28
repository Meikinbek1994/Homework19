import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner=new Scanner(System.in);
        String days=scanner.nextLine();


        if(Objects.equals(days,"MONDAY")){
            System.out.println(Days.MONDAY);
        } else if (Objects.equals(days,"TUESDAY")) {
            System.out.println(Days.TUESDAY);
        } else if (Objects.equals(days,"WEDNESDAY")) {
            System.out.println(Days.WEDNESDAY);
        } else if (Objects.equals(days,"THURSDAY")) {
            System.out.println(Days.THURSDAY);
        } else if (Objects.equals(days,"FRIDAY")) {
            System.out.println(Days.FRIDAY);
        } else if (Objects.equals(days,"SATURDAY")) {
            System.out.println(Days.SATURDAY);
        } else if (Objects.equals(days,"SUNDAY")) {
            System.out.println(Days.SUNDAY);
        }
        else{
            System.out.println("Not available.");
        }


    }
}
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nums = new double[20];

        double input = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            nums[i] = 0;
        }

        for(int i = 0; i < nums.length; i++) {
                System.out.println("Enter "+i+" element (Enter 9999 to stop): ");
                input = sc.nextDouble();
                if(input == 9999){
                    break;
                }else {
                    nums[i] = input;
                    count++;
                }

        }
        double newNums[] = new double[count];

        for(int i = 0; i < newNums.length; i++) {
            newNums[i] = nums[i];
        }

        count = 0;
        for(int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i]+" ");
            if(newNums[i] == 0){
                count++;
            }
            if(count == newNums.length){
                System.out.println();
                System.out.print("Error, no user numbers!");
            }

        }
    }
}

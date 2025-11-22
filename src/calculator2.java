import java.util.Scanner;
public class calculator2 {
    public static void  main (String[] args) {
        char operator;
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.print(0);
        num1 = input.nextInt();
        num2 = input.nextInt();
        int result = num1 + num2;
        System.out.print(0);
        operator = input.next().charAt(0);
        input.close();
        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + result + "\n");
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + result + "\n");
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + result + "\n");
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + result + "\n");
                break;
        }
    }
    class Solution
    public:string intToRoman (int num){
        string roman;
        vector<string> notations = {"РЎ", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        vector<int> value = {100, 90, 50, 40, 10, 9, 5, 4, 1 };
        for(int pos = 0; num>0; ++pos) {
            while (num >= value[pos]) {
                roman += notation[pos];
                num -= value[pos];

            }
        }
        return roman;
    }

}

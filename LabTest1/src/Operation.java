
public class Operation {

	public static void main(String[] args) {
		int num1=5, num2=6;
        int Output;
    

        switch ('+')
        {
            case '+':
            	Output = num1 + num2;
                break;

            case '-':
            	Output = num1 - num2;
                break;

            case '*':
            	Output = num1 * num2;
                break;

            case '/':
            	Output = num1 / num2;
                break;

            
            default:
                System.out.println("invalid operator");
                return;
        }

        System.out.println(+Output);

	}

}

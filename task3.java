import java.util.LinkedList;
import java.util.Scanner;


public class task3 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        System.out.print("Введите число: ");
        Integer num1 = x.nextInt();
        LinkedList<Integer> linklist=new LinkedList<>();
        linklist.add(num1);
        Integer result=0;
        while(true){
        Scanner y = new Scanner(System.in);
        System.out.print("Введите оператор +, -, *, /, n-для отмены последний операции: ");
        String op = y.nextLine();
        if (op.equals("n") & linklist.size()<2) {
            System.out.println("Ошибка ввода" );
        }
        else if (op.equals("n")) {
            
            linklist.remove(linklist.size()-1);
            linklist.remove(linklist.size()-1);
            result = linklist.get(linklist.size()-1);
            System.out.println("Ответ " + result);
            continue;
        
           
        }  
        Scanner z = new Scanner(System.in);
               
        System.out.print("Введите число: ");
        Integer num2 = z.nextInt();
        linklist.add(num2);
        
        if (op.equals("+")) {
            result=linklist.get(linklist.size()-2) + linklist.get(linklist.size()-1); 
            linklist.add(result);
       } else if (op.equals("-")) {
        result=linklist.get(linklist.size()-2) - linklist.get(linklist.size()-1);
        linklist.add(result);
        } else if (op.equals("*")) {
            result=linklist.get(linklist.size()-2) * linklist.get(linklist.size()-1);
            linklist.add(result); 
        } else if (op.equals("/")) {
            result=linklist.get(linklist.size()-2) / linklist.get(linklist.size()-1);
            linklist.add(result);
        }

        System.out.println("Ответ " + linklist.get(linklist.size()-3)+ op + linklist.get(linklist.size()-2) + "=" + result);
        
    }
    

}
}

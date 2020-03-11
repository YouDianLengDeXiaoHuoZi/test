import java.util.Scanner;

public class Computing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字");
        String name = sc.nextLine();
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入你的工资：");
        String salary = sc.nextLine();
        if (name.equals("张三")){
            System.out.println(zhangsan(age, salary));
        }
        else if (name.equals("李四")){
            System.out.println(lisi(age, salary));
        }
        else if (name.equals("退出")){
            exit();
        }

    }

    public static String zhangsan(int age, String salary){
        if (age<18){
            System.out.println("你是童工！");
            return "张三是童工";
        }
        else{
            System.out.println("你的工资是：" + salary);
            return "张三！";
        }

    }

    public static String lisi(int age, String salary){
        if (age>60){
            System.out.println("你已退休！");
            return "李四已退休";
        }
        else{
            System.out.println("你的工资是：" + salary);
            return "李四";
        }

    }

    public static void exit(){
        System.exit(1);
    }

}

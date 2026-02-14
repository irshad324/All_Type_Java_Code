public class NestedIf {
    public static void main(String[] args) {
        int age=18;
        int weight=55;
        if(age>18){
            if(weight>50){
                System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("weight is low");
        }
       
    }
     else{
            System.out.println("under age");
        }
}
}

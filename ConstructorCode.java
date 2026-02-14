public class ConstructorCode {
    String name;
    int roll;
    
         

    ConstructorCode( String N int r ){
        name=N;
        roll = r;

    }
         
    public static void main(String[] args) {
        ConstructorCode S = new ConstructorCode("irshad",12);
        System.out.println("Student all roll Num and name");
        System.out.println("Student name -"+S.name+" : "+"Roll_N  "+S.roll);
        ConstructorCode d= new ConstructorCode("israr", 13);
        System.out.println(d.name+"  "+S.roll);
         ConstructorCode c=new ConstructorCode("sufiyan", 45);
        
    }
}

package automationbasics;

public class ThisExample extends ClassA {


    int a= 1;

    public static void main(String[] args) {

           ThisExample ff = new ThisExample();
           ff.m1();
    }

    public void m1(){
        int a = 2;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

}

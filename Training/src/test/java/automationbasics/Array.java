package automationbasics;

public class Array {

    public static void main(String[] args) {

        int [] a = {22,56,4,1};

        for(int i=0;i<4;i++){  // 0 <4  1<4 2<4

            System.out.println(a[i]); //a[0] a[1] a[2]
        }

        for(int k:a){
            System.out.println(k);
        }


        String [] b ={"as","bg"};

        for (int j=0 ;j<b.length;j++){
            System.out.println(b[j]);
        }

        for(String output:b){
            System.out.println(output);
        }



    }
}

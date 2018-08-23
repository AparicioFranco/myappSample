public class This {

    public static void thisRate(){
        System.out.println("Im Fekar");
    }

    public static void shower(int[] array){
        for(int x: array){
            System.out.println(x);
        }


    }


    public static void main(String[] args){


        thisRate();

        int[] array = {3,2,1,6,8};
        shower(array);



    }

}

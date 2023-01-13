public class test{

    public static void main(String [] args){
        int[] arr1 = {-3,-12,22,10,4,7};

                                                    //more debug code delete maybe???
        System.out.print("Initial Array is: ");
        for(int x : arr1){
            System.out.print(x + ", ");
        }
        System.out.println();
                                                    //end of debug
        src objSrc = new src();
        System.out.println("Final Array list is: " + objSrc.convert(arr1));

    }

}
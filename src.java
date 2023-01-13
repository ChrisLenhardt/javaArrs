import java.util.ArrayList;
public class src {
    

    public ArrayList<Integer> convert(int [] array){
        ArrayList<Integer> convertArray = new ArrayList<Integer>(array.length);
        array = this.filter(array);
        this.sort(array);

        return convertArray;
    }

    public int[] sort(int[] array){ //sorting helper method
        
        for(int i = 0; i < array.length; i++){  //this is using something like bubble sort
            boolean notSwapped = true;
            for(int j = 0; j < array.length-1; j++){
                if(array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    notSwapped = false;
                     }
            }
            if(!notSwapped) break;
        }
                                                   //use for debugging delete later
        for(int x : array){
            System.out.print(x + ", ");
        }
        System.out.println();
        return array;
    }

    public int[] filter(int[] array){
        ArrayList<Integer> arrayFilteredAL = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                arrayFilteredAL.add(array[i]);
            }
        }


                                                    //use for debugging delete later
        int[] arrayFiltered = new int[arrayFilteredAL.size()];
        for(int i =0; i < arrayFiltered.length; i++ ){
            arrayFiltered[i] = arrayFilteredAL.get(i);
        }
        for(int x : arrayFiltered){
            System.out.print(x + ", ");
        }
        System.out.println();

            //end debug
                    
        return arrayFiltered;
    }

}

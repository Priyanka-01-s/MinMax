public class GenericMax<T extends Comparable<T>>{
    
    private T[] values;

    public GenericMax(T... values){
        this.values = values;
        
    }
    public static <T extends Comparable<T>> T Compare(T... values) {
        
        if(values == null || values.length == 0){
            return null;
        }

        T maxi = values[0];
        for(int i=1;i<values.length; i++){
            if(values[i].compareTo(maxi)>0){
                maxi = values[i];
            }
        }
        return maxi;
    }

    public static <T> void printMax(T max) {
        System.out.println("Maximum value: " + max);
    }

    public void testMax(){
        T maxi = Compare(values);
        printMax(maxi);
    }

}

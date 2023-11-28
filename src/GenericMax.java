public class GenericMax<T extends Comparable<T>>{
    private T var1;
    private T var2;
    private T var3;

    public GenericMax(T var1, T var2, T var3){
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }
    public static <T extends Comparable<T>> T Compare(T obj1, T obj2, T obj3) {
        int res1 = obj1.compareTo(obj2);
        int res2 = obj2.compareTo(obj3);
        int res3 = obj3.compareTo(obj1);

        if (res1 > 0 && res2 > 0) {
            return obj1;
        } else if (res2 > 0 && res3 > 0) {
            return obj2;
        } else {
            return obj3;
        }
    }

    public void testMax(){
        T maxi = Compare(var1, var2, var3);
        System.out.println("THE MAXIMUM VALUE :"+ maxi);
    }

}

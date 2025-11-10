public class Loop {
    public static  void main(String [] args){
        int a[][]= {{4,5,6},{8,9}};
        for(int i=0; i< a.length; i++){
            for (int j=0; j<a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }

    }
}

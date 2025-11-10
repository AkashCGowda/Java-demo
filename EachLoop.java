public class EachLoop {
    public static void main(String[] args){
        int a [][][] ={{{5,6,7},{2,9,10,8},{7,7,7},{8,8}},{{4}},{{5,6,1}}};
        System.out.println( "The length :" +a.length);
        for(int x1 [][]:a){

            for (int x2[]:x1) {

                for (int x3 : x2) {
                    System.out.println(x3);
                }
            }
        }

    }
}

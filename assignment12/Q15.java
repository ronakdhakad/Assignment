//15. Shelly has a rectangular garden of length 22 m and breath 15 m.
// Her friend Rachel has a square garden of side 21 m.
// Whose garden is bigger and by how much?
class Main{
    public static void main(String args[]){
        int len1=22;
        int bre1=15;
        int side=21;

        int area1;
        int area2;

        area1=len1*bre1;
        area2=side*side;

        if(area1>area2){
            int diff=area1-area2;
            System.out.println(diff+" m Shelly's garden is bigger. ");
        }else{
            int diff=area2-area1;
            System.out.println(diff+" m Rachel's garden is bigger. ");
        }

    }
}
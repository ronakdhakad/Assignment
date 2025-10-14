// 3) WAP to take n number of elements of an array from user and find out the average of all the elements.

// 5) WAP to reverse individual elements of an array
class Q3{
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i<args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        double avg = (double)sum / args.length;
        System.out.println("Average of elements: " + avg);
    }
}

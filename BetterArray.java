public class BetterArray{
    private int[] arr;
    private int size = 0;
    //Main method will be deleeted for separate driver class
    public static void main(String[] args) {
        BetterArray ba = new BetterArray();
        System.out.println(ba); ba.add(7);
        System.out.println(ba.getSize());
        System.out.println(ba);
        // Add 0-9 to ba, should resize to 20
        for (int i = 0; i < 10; i++)
        {
            ba.add(i);
        }
        System.out.println(ba.getSize());
        System.out.println(ba);
        //System.out.println(ba.count(7)); // Should print 2
    }
    public BetterArray(){
        //Make default length 10
        arr = new int[10];
    }
    public void add(int a){
        if (size == arr.length){
            int[] tmp = arr;
            System.out.println("Resizing to size " + arr.length*2);
            arr = new int[arr.length*2];
            for(int i = 0; i < tmp.length; i++){
                arr[i] = tmp[i];
            }
        }
        arr[size] = a;
        size+=1;
    }
    public void clear(){
        arr = new int[10];
        size = 0;
    }
    public int getSize(){
        return size;
    }
    public int get(int index){
        if(index <= size && index >= 0){
            return arr[index];
        }
        System.err.println("Invalid Index");
        return 0;
    }
    public void set(int index, int num){
        //set sepecific values whithn the array
        if (index <= size && index >= 0){
            System.err.print("ERROR: Index invalid");
        }
        else{
            arr[index] = num;
        }
    }
    //METHODS THAT ARE YET TO BE DONE
    /*
    public void remove(int index){
        //removes a value AND shrink arry size aka NO INTERNAL BLANKS
    }
    public Boolean contains(int num){
        //returns boolean of weher or not it is contained
    }
    //Xtra Methods?
    public int count(int num){
        //returns the number of times a specified element occurs
    }
    public int indexOf(int num){
        //returns index of first ccurency of this value
    }
    public int average(){
        //returns average
    }
    */
    public String toString(){
        String ans = "[";
        for(int i = 0; i < size; i++){
            ans += (arr[i] + " " );
        }
        ans +=  ("]");
        return ans;
    }

}

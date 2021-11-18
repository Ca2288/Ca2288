
public class AssertTest {

    public static void main(String[] args) {
//        char ch = 'z';
//        switch(ch){
//        case 'a':System.out.println("a");break;
//        case 'b':System.out.println("B");break;
//        default :
//            assert(false):"oops got here";
//        }
        
        if (args.length !=1){
            System.out.println("Usage: java Asserttest <val>");
            return;
        }
        int val = Integer.parseInt(args[0]);
        new AssertTest().runMe(val);
    }
    private void runMe(int val){
        int ans = addFuelValue(val);
        System.out.println("ans: " + ans);
    }
    /*Making it private is best practise,
    do not try to assert on command line arguments,
    must use where u know where know u should'nt get to the point*/
    private int addFuelValue(int f){
        assert (f >=0):"The value caroline is: "+f;
    return f+f;
    }
}

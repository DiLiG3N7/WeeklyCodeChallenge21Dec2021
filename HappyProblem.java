package CodingExercise.Dec212021;

public class HappyProblem {
    public static void main(String[] args) {
        test(203);
        test(11);
        test(107);
    }

    public Boolean happy(Integer num){
        String myNumberString = String.valueOf(num);
        char[] charArr = myNumberString.toCharArray();
        int result = 0;
        for(Character myChar: charArr){
            int temp = Character.getNumericValue(myChar);
            result += (temp*temp);
        }
        if( result == 1){
            return true;
        }
        else if(result == 4){
            return false;
        }
        else{
            return happy(result);
        }
    }

    static void test(Integer num){
        HappyProblem myTest = new HappyProblem();
        System.out.println(myTest.happy(num));
    }
}
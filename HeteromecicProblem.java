package CodingExercise.Dec212021;

public class HeteromecicProblem {
    public static void main(String[] args) {
        test(0);
        test(2);
        test(7);
        test(110);
        test(136);
        test(156);
    }

    public Boolean isHeteromecic(int num){
        int checkNum = 0;
        int count = 1;
        while(checkNum <= num){
            if(checkNum == num){
                return true;
            }
            else{
                checkNum = (count)*(count+1);
            }
            count++;
        }
        return false;
    }

    public static void test(int num){
        HeteromecicProblem myTest = new HeteromecicProblem();
        System.out.println(myTest.isHeteromecic(num));
    }
}

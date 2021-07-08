import java.util.ArrayList;

public class SkillTest {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add(2);
	nums.add(4);
	nums.add(5);
	nums.add(7);
	nums.add(6);
	nums.add(4);
	nums.add(7);
        System.out.println(question1(nums));

    }

    //Question 1 to return a list of integer that is not less than 0 if it's substracted by other elements
    private static ArrayList question1(ArrayList<Integer> nums){
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i = 0; i < nums.size(); ++i){
            boolean notZero = true;
            for(int j = 0; j < nums.size(); ++j){
                if(i != j){
                    if(nums.get(i)-nums.get(j) < 0){
                        notZero = false;
                    }
                }
            }
            if(notZero){
                results.add(nums.get(i));
            }
        }
        return results;
    }
}

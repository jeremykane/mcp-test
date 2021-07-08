/* Created By Jeremy Kane for MC Payment Software Engineer Test */
import java.util.ArrayList;

public class SkillTest {
    public static void main(String[] args){
        //Hardcode an ArrayList of Integer for testing q1 and q2 
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add(2);

        //Testing Question 1
        System.out.println("----------------------------------\nQuestion 1: \nnums = "+nums);
        System.out.println(question1(nums));

        //Testing Question 2
        int x = 4;
        System.out.println("----------------------------------\nQuestion 2: \nnums = "+nums+ "\nx = " + x);
        System.out.println(question2(nums,x));

        //Testing Question 3
        String word = "souvenir loud four lost";
        System.out.println("----------------------------------\nQuestion 3: \nword = "+word+ "\nx = " + x);
        System.out.println(question3(word,4));

        //Advanced Testing Question3
        word = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        System.out.println("----------------------------------\nAdvanced Question 3: \nword = "+word+ "\nx = " + x);
        System.out.println(question3(word,x));

    }

    //Question 1 to return a list of integer that is not less than 0 if it's substracted by other elements
    private static ArrayList question1(ArrayList<Integer> nums){
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i = 0; i < nums.size(); ++i){
            boolean notZero = true;
            for(int j = 0; j < nums.size(); ++j){
                if(nums.get(i)-nums.get(j) < 0){
                    notZero = false;
                }
            }
            if(notZero){
                results.add(nums.get(i));
            }
        }
        return results;
    }

    //Question 2 to return a list of integer that is not equal to integer x if it's divided by other elements
    private static ArrayList question2(ArrayList<Integer> nums, int x){
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i = 0; i < nums.size(); ++i){
            boolean notEqualToX = true;
            for (int j = 0; j < nums.size(); ++j){
                if(nums.get(i)/nums.get(j) == x){
                    notEqualToX = false;
                }
            }
            if(notEqualToX){
                results.add(nums.get(i));
            }
        }
        return results;
    }

    //Question 3 to return array of string with length of x
    private static ArrayList question3(String word, int x){
        ArrayList<String> results = new ArrayList<String>();
        String noSpecialWord = word.replaceAll("[^a-zA-Z0-9]", " ");  
        String[] stringArray = noSpecialWord.split(" ");
        for( String i: stringArray){
            if(i.length() == x){
                results.add(i);
            }
        }

        return results;
    }
}

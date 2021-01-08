public class InClass {
    public static void main(String[] args) {

        int i;
        int fact = 1;

        for(i=1; i<=5; i++){
          fact = fact*i;
        }

        System.out.println("Question 1." + "\n" +  "Answer: " + fact +"\n");

        int value = 10;
        int exp = 4;
        int result = 1;
        for(;exp !=0; --exp) {
            result *= value;
        }

        System.out.println("Question 2." + "\n" + "Answer: " + result +"\n");

        int[] ar1 = {12, 24};
        int[] ar2 = {13, 48};
        int slope;

        slope = ((ar2[1]-ar1[1])/(ar2[0]-ar1[0]));
        System.out.println("Question 3." + "\n" + "Answer: " + slope +"\n");
        int intercept = slope*(-ar1[0])+ar1[1];
        System.out.println("Question 4." + "\n" + "Answer: " + intercept + "\n");

        System.out.println("Question 5." + "\n" + "Answer: y = " + slope + "x+(" + intercept + ')');
    }
}

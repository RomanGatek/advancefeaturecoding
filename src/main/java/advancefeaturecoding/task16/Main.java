package advancefeaturecoding.task16;

public class Main {
    public static void main(String[] args) {
        int marathonTime = 150;
        Runner fitnessLevel = Runner.getFitnessLEvel(marathonTime);

        System.out.println("The runner's fitness level is: " + fitnessLevel);
    }
}

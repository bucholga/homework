package day8.my_spring;


public class CleanerImpl implements Cleaner {

    @InjectRandomInt(min = 3, max = 5)
    private int repeat;


    public CleanerImpl() {
        System.out.println("repeat = " + repeat);
    }

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVvvvvvvvvvvvvvvvvv");
        }
    }
}

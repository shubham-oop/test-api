

public class TestConditon {
    public static void main(String[] args) {
        String country = "US";
        Integer x = 14;
        if (x > 15 || country.equals("US")) {
            System.out.println("Run Experiment");
        } else System.out.println("Not Run Experiment");
        if(country.equals("US")) {
            System.out.println("Main branch push");
        }else System.out.println("Main branch pop");

        if(true) System.out.println("Feature Branch push");

        // Rebasing Done
    }
}

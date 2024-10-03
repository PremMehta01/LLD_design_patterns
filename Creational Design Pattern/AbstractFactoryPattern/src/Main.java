public class Main {
    public static void main(String[] args) {

        UniversityFactory universityFactory = UniversityFactory.getUniversityFactory(200);

        int fee = universityFactory.getFeeCalculator("CSE").getFeeCalculator();

        System.out.println(fee);
    }
}
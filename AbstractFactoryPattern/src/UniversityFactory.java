// abstract class
public abstract class UniversityFactory {

    private static int cutoff = 150;

    public static UniversityFactory getUniversityFactory(int score) {

        if(score > cutoff) {
            return new IITUniversity();
        }else {
            return new BPUTUniversity();
        }
    }


    public abstract AdmitCard getAdmidCard(String course);

    public abstract FeeCalculator getFeeCalculator(String course);

}

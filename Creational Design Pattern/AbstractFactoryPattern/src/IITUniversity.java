public class IITUniversity extends UniversityFactory {

    @Override
    public AdmitCard getAdmidCard(String course) {
        switch(course) {
            case "CSE":
                return new IITMumbaiAdmitCard();
            case "MECH":
                return new IITPatnaAdmitCard();
            case "ELEC":
                return new IITBhuAdmitCard();
            default:
                break;
        }

        return null;
    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        switch(course) {
            case "CSE":
                return new IITMumbaiFeeCalculator();
            case "MECH":
                return new IITPatnaFeeCalculator();
            case "ELEC":
                return new IITBhuFeeCalculator();
            default:
                break;
        }

        return null;
    }
}

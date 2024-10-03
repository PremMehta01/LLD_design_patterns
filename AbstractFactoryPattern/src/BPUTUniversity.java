public class BPUTUniversity extends UniversityFactory {

    @Override
    public AdmitCard getAdmidCard(String course) {
        switch(course) {
            case "CSE":
                return new BPUTKhordhaAdmitCard();
            case "MECH":
                return new BPUTGangaPatnamAdmitCard();
            case "ELEC":
                return new BPUTBhuAdmitCard();
            default:
                break;
        }

        return null;
    }


    @Override
    public FeeCalculator getFeeCalculator(String course) {
        switch(course) {
            case "CSE":
                return new BPUTKhordhaFeeCalculator();
            case "MECH":
                return new BPUTGangaPatnamFeeCalculator();
            case "ELEC":
                return new BPUTBhuFeeCalculator();
            default:
                break;
        }

        return null;
    }
}

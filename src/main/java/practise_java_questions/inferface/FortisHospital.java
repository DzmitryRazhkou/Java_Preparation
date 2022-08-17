package practise_java_questions.inferface;

public class FortisHospital extends MedicalAssociation implements USMedical, UKMedical{

//    US:
    @Override
    public void orthoServices() {
        System.out.println("FH - OrthoServices");
    }

    @Override
    public void physioServices() {
        System.out.println("FH - physioServices");
    }

    @Override
    public void cardioServices() {
        System.out.println("FH - cardioServices");
    }

//    UK:
    @Override
    public void pediaServices() {
        System.out.println("FH - pediaServices");
    }

    @Override
    public void ENTServices() {
        System.out.println("FH - ENTServices");
    }

    public void medicalInsurance(){
        System.out.println("PH - MedicalInsurance");
    }


    @Override
    public void billing(){
        System.out.println("FH - Billing");
    }
}

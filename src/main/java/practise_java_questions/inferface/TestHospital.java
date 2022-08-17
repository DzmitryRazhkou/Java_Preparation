package practise_java_questions.inferface;

public class TestHospital {
    public static void main(String[] args) {

        FortisHospital fh = new FortisHospital();
        fh.physioServices();
        fh.cardioServices();
        fh.medicalInsurance();
        fh.medicalTraining();

//        Top Casting:
        USMedical us = new FortisHospital();    // child object can be referred by parent interface ref variable

        us.cardioServices();
        us.physioServices();
        us.orthoServices();
        USMedical.totalDocs();
        us.billing();

    }
}

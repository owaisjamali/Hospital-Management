
package System;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class HospitalManagement{
    private static Scanner input = new Scanner(System.in);
    private static List<Surgeon> surgeons = new ArrayList<>();
    private static List<Patient> patients = new ArrayList<>();
    private static List<Receipt> receipts = new ArrayList<>();
    private static List<TestingFacility> testingFacilities = new ArrayList<>();
    private static List<Facility> facilities = new ArrayList<>();
    private static List<Workforce> workforce = new ArrayList<>();

    public static void main(String[] args) {
        int status = 1;

        while (status == 1) {
            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.println("                       **HOSPITAL MANAGEMENT SYSTEM**");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1. Surgeon\n2. Patient\n3. Receipt\n4. Testing Facility\n5. Facility\n6. Workforce");
            System.out.println("Enter your choice:");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    surgeonMenu();
                    break;
                case 2:
                    patientMenu();
                    break;
                case 3:
                    receiptMenu();
                    break;
                case 4:
                    testingFacilityMenu();
                    break;
                case 5:
                    facilityMenu();
                    break;
                case 6:
                    workforceMenu();
                    break;
            }

            System.out.println("\nReturn to Main Menu Press 1 and for Exit Press 0");
            status = input.nextInt();
        }
    }

    private static void surgeonMenu() {
        int surgeonMenuStatus = 1;

        while (surgeonMenuStatus == 1) {
            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.println("                       **SURGEON SECTION**");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1. Add New Surgeon\n2. Existing Surgeon List");
            System.out.println("Enter your choice:");
            int surgeonChoice = input.nextInt();

            switch (surgeonChoice) {
                case 1:
                    addSurgeon();
                    break;
                case 2:
                    displaySurgeons();
                    break;
            }

            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            surgeonMenuStatus = input.nextInt();
        }
    }

    private static void addSurgeon() {
        input.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter Surgeon ID: ");
        String surgeonId = input.nextLine();
        System.out.print("Enter Surgeon Name: ");
        String surgeonName = input.nextLine();
        System.out.print("Enter Surgeon Specialization: ");
        String specialization = input.nextLine();

        Surgeon surgeon = new Surgeon(surgeonId, surgeonName, specialization);
        surgeons.add(surgeon);
    }

    private static void displaySurgeons() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Surgeon ID \t Name \t Specialization");
        System.out.println("--------------------------------------------------------------------------------");
        for (Surgeon surgeon : surgeons) {
            surgeon.displaySurgeon();
        }
    }

    private static void patientMenu() {
        int patientMenuStatus = 1;

        while (patientMenuStatus == 1) {
            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.println("                       **PATIENT SECTION**");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1. Add New Patient\n2. Existing Patient List");
            System.out.println("Enter your choice:");
            int patientChoice = input.nextInt();

            switch (patientChoice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    displayPatients();
                    break;
            }

            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            patientMenuStatus = input.nextInt();
        }
    }

    private static void addPatient() {
        input.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter Patient ID: ");
        String patientId = input.nextLine();
        System.out.print("Enter Patient Name: ");
        String patientName = input.nextLine();
        System.out.print("Enter Patient Age: ");
        int patientAge = input.nextInt();

        Patient patient = new Patient(patientId, patientName, patientAge);
        patients.add(patient);
    }

    private static void displayPatients() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Patient ID \t Name \t Age");
        System.out.println("--------------------------------------------------------------------------------");
        for (Patient patient : patients) {
            patient.displayPatient();
        }
    }

    private static void receiptMenu() {
        int receiptMenuStatus = 1;

        while (receiptMenuStatus == 1) {
            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.println("                       **RECEIPT SECTION**");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1. Add New Receipt\n2. Existing Receipt List");
            System.out.println("Enter your choice:");
            int receiptChoice = input.nextInt();

            switch (receiptChoice) {
                case 1:
                    addReceipt();
                    break;
                case 2:
                    displayReceipts();
                    break;
            }

            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            receiptMenuStatus = input.nextInt();
        }
    }

    private static void addReceipt() {
        input.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter Receipt ID: ");
        String receiptId = input.nextLine();
        System.out.print("Enter Patient ID: ");
        String patientId = input.nextLine();
        System.out.print("Enter Surgeon ID: ");
        String surgeonId = input.nextLine();
        System.out.print("Enter Amount: ");
        double amount = input.nextDouble();

        Receipt receipt = new Receipt(receiptId, patientId, surgeonId, amount);
        receipts.add(receipt);
    }

    private static void displayReceipts() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Receipt ID \t Patient ID \t Surgeon ID \t Amount");
        System.out.println("--------------------------------------------------------------------------------");
        for (Receipt receipt : receipts) {
            receipt.displayReceipt();
        }
    }

    private static void testingFacilityMenu() {
        int testingFacilityMenuStatus = 1;

        while (testingFacilityMenuStatus == 1) {
            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.println("                       **TESTING FACILITY SECTION**");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1. Add New Testing Facility\n2. Existing Testing Facility List");
            System.out.println("Enter your choice:");
            int testingFacilityChoice = input.nextInt();

            switch (testingFacilityChoice) {
                case 1:
                    addTestingFacility();
                    break;
                case 2:
                    displayTestingFacilities();
                    break;
            }

            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            testingFacilityMenuStatus = input.nextInt();
        }
    }

    private static void addTestingFacility() {
        input.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter Facility ID: ");
        String facilityId = input.nextLine();
        System.out.print("Enter Facility Name: ");
        String facilityName = input.nextLine();
        System.out.print("Enter Facility Type: ");
        String facilityType = input.nextLine();

        TestingFacility testingFacility = new TestingFacility(facilityId, facilityName, facilityType);
        testingFacilities.add(testingFacility);
    }

    private static void displayTestingFacilities() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Facility ID \t Name \t Type");
        System.out.println("--------------------------------------------------------------------------------");
        for (TestingFacility testingFacility : testingFacilities) {
            testingFacility.displayTestingFacility();
        }
    }

    private static void facilityMenu() {
        int facilityMenuStatus = 1;

        while (facilityMenuStatus == 1) {
            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.println("                       **FACILITY SECTION**");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1. Add New Facility\n2. Existing Facility List");
            System.out.println("Enter your choice:");
            int facilityChoice = input.nextInt();

            switch (facilityChoice) {
                case 1:
                    addFacility();
                    break;
                case 2:
                    displayFacilities();
                    break;
            }

            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            facilityMenuStatus = input.nextInt();
        }
    }

    private static void addFacility() {
        input.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter Facility ID: ");
        String facilityId = input.nextLine();
        System.out.print("Enter Facility Name: ");
        String facilityName = input.nextLine();
        System.out.print("Enter Facility Type: ");
        String facilityType = input.nextLine();

        Facility facility = new Facility(facilityId, facilityName, facilityType);
        facilities.add(facility);
    }

    private static void displayFacilities() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Facility ID \t Name \t Type");
        System.out.println("--------------------------------------------------------------------------------");
        for (Facility facility : facilities) {
            facility.displayFacility();
        }
    }

    private static void workforceMenu() {
        int workforceMenuStatus = 1;

        while (workforceMenuStatus == 1) {
            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.println("                       **WORKFORCE SECTION**");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("1. Add New Workforce\n2. Existing Workforce List");
            System.out.println("Enter your choice:");
            int workforceChoice = input.nextInt();

            switch (workforceChoice) {
                case 1:
                    addWorkforce();
                    break;
                case 2:
                    displayWorkforce();
                    break;
            }

            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            workforceMenuStatus = input.nextInt();
        }
    }

    private static void addWorkforce() {
        input.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter Workforce ID: ");
        String workforceId = input.nextLine();
        System.out.print("Enter Workforce Name: ");
        String workforceName = input.nextLine();
        System.out.print("Enter Workforce Type: ");
        String workforceType = input.nextLine();

        Workforce workforceMember = new Workforce(workforceId, workforceName, workforceType);
        workforce.add(workforceMember);
    }

    private static void displayWorkforce() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Workforce ID \t Name \t Type");
        System.out.println("--------------------------------------------------------------------------------");
        for (Workforce workforceMember : workforce) {
            workforceMember.displayWorkforce();
        }
    }
}

class Surgeon {
    private String surgeonId;
    private String surgeonName;
    private String specialization;

    public Surgeon(String surgeonId, String surgeonName, String specialization) {
        this.surgeonId = surgeonId;
        this.surgeonName = surgeonName;
        this.specialization = specialization;
    }

    public void displaySurgeon() {
        System.out.println(surgeonId + "\t" + surgeonName + "\t" + specialization);
    }
}

class Patient {
    private String patientId;
    private String patientName;
    private int patientAge;

    public Patient(String patientId, String patientName, int patientAge) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAge = patientAge;
    }

    public void displayPatient() {
        System.out.println(patientId + "\t" + patientName + "\t" + patientAge);
    }
}

class Receipt {
    private String receiptId;
    private String patientId;
    private String surgeonId;
    private double amount;

    public Receipt(String receiptId, String patientId, String surgeonId, double amount) {
        this.receiptId = receiptId;
        this.patientId = patientId;
        this.surgeonId = surgeonId;
        this.amount = amount;
    }

    public void displayReceipt() {
        System.out.println(receiptId + "\t" + patientId + "\t" + surgeonId + "\t" + amount);
    }
}

class TestingFacility {
    private String facilityId;
    private String facilityName;
    private String facilityType;

    public TestingFacility(String facilityId, String facilityName, String facilityType) {
        this.facilityId = facilityId;
        this.facilityName = facilityName;
        this.facilityType = facilityType;
    }

    public void displayTestingFacility() {
        System.out.println(facilityId + "\t" + facilityName + "\t" + facilityType);
    }
}

class Facility {
    private String facilityId;
    private String facilityName;
    private String facilityType;

    public Facility(String facilityId, String facilityName, String facilityType) {
        this.facilityId = facilityId;
        this.facilityName = facilityName;
        this.facilityType = facilityType;
    }

    public void displayFacility() {
        System.out.println(facilityId + "\t" + facilityName + "\t" + facilityType);
    }
}

class Workforce {
    private String workforceId;
    private String workforceName;
    private String workforceType;

    public Workforce(String workforceId, String workforceName, String workforceType) {
        this.workforceId = workforceId;
        this.workforceName = workforceName;
        this.workforceType = workforceType;
    }

    public void displayWorkforce() {
        System.out.println(workforceId + "\t" + workforceName + "\t" + workforceType);
    }
}

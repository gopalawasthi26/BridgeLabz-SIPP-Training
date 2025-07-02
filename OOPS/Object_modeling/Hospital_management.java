import java.util.ArrayList;
import java.util.List;

// Patient class
class Patient {
    String name;
    List<Doctor> doctors;

    Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    void consultDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); // bidirectional association
        }
    }

    void viewDoctors() {
        System.out.println("Patient: " + name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println("  Dr. " + d.name + " (" + d.specialization + ")");
        }
    }
}

// Doctor class
class Doctor {
    String name;
    String specialization;
    List<Patient> patients;

    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    // Communication method: consultation
    void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.name);
        addPatient(patient);
        patient.consultDoctor(this); // ensure bidirectional
    }

    void viewPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("  " + p.name);
        }
    }
}

// Hospital class
class Hospital {
    String name;
    List<Doctor> doctors;
    List<Patient> patients;

    Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void displayAll() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("  Dr. " + d.name + " - " + d.specialization);
        }

        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("  " + p.name);
        }
    }
}
public class Hospital_management {
    public static void main(String[] args) {
        // Create hospital
        Hospital hospital = new Hospital("Sunrise Hospital");

        // Create doctors
        Doctor doc1 = new Doctor("Mehta", "Cardiologist");
        Doctor doc2 = new Doctor("Singh", "Neurologist");

        // Create patients
        Patient p1 = new Patient("Aarav");
        Patient p2 = new Patient("Kriti");

        // Add doctors and patients to hospital
        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Consultations (communication)
        doc1.consult(p1);  // Dr. Mehta sees Aarav
        doc1.consult(p2);  // Dr. Mehta sees Kriti
        doc2.consult(p1);  // Dr. Singh sees Aarav

        // Display all hospital members
        hospital.displayAll();

        // Show consultations
        System.out.println();
        doc1.viewPatients();
        doc2.viewPatients();

        System.out.println();
        p1.viewDoctors();
        p2.viewDoctors();
    }
}

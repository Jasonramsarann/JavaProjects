import java.util.ArrayList;
import java.util.Scanner;

public class DoctorAppointmentScheduler {

    public static void main(String[] args) {

        // Create an array list to store appointments
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();

        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many appointments they want to schedule
        System.out.print("How many appointments do you want to schedule? ");
        int numAppointments = scanner.nextInt();

        // Loop through the number of appointments and ask for details
        for (int i = 0; i < numAppointments; i++) {
            System.out.println("\nAppointment " + (i + 1));

            // Ask for the patient's name
            System.out.print("Patient name: ");
            String patientName = scanner.next();

            // Ask for the doctor's name
            System.out.print("Doctor name: ");
            String doctorName = scanner.next();

            // Ask for the appointment date and time
            System.out.print("Appointment date and time (MM/DD/YYYY HH:MM AM/PM): ");
            String appointmentDateTime = scanner.next();

            // Create a new appointment object and add it to the array list
            Appointment appointment = new Appointment(patientName, doctorName, appointmentDateTime);
            appointments.add(appointment);
        }

        // Display the appointments that have been scheduled
        System.out.println("\nScheduled Appointments:");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }

        // Close the scanner
        scanner.close();
    }

}

class Appointment {

    private String patientName;
    private String doctorName;
    private String appointmentDateTime;

    public Appointment(String patientName, String doctorName, String appointmentDateTime) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentDateTime = appointmentDateTime;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public String toString() {
        return "Patient: " + patientName + " | Doctor: " + doctorName + " | Date and Time: " + appointmentDateTime;
    }
}

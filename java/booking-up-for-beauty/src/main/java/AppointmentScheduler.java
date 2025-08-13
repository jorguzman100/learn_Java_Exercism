import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {

    // 1. Parse appointment date
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter theFormat =  DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, theFormat);
    }

    // 2. Check if an appointment has already passed
    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    // 3. Check if appointment is in the afternoon
    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    // 4. Describe the time and date of the appointment
    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        return "You have an appointment on " + appointmentDate.format(formatter) + ".";
    }

    // 5. Return the anniversary date
    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDate.now().getYear();
        return LocalDate.of(currentYear, 9, 15);
    }

    /* public static void main(String[] args) {
        // 1. Parse appointment date
        AppointmentScheduler scheduler = new AppointmentScheduler();
        System.out.println(scheduler.schedule("7/25/2019 13:45:00"));; // => LocalDateTime.of(2019, 7, 25, 13, 45, 0)


        // 2. Check if an appointment has already passed
        AppointmentScheduler scheduler2 = new AppointmentScheduler();
        System.out.println(scheduler2.hasPassed(LocalDateTime.of(1999, 12, 31, 9, 0, 0)));; // => true

        // 3. Check if appointment is in the afternoon
        AppointmentScheduler scheduler3 = new AppointmentScheduler();
        System.out.println(scheduler3.isAfternoonAppointment(LocalDateTime.of(2019, 03, 29, 15, 0, 0)));; // => true

        // 4. Describe the time and date of the appointment
        AppointmentScheduler scheduler4 = new AppointmentScheduler();
        System.out.println(scheduler4.getDescription(LocalDateTime.of(2019, 03, 29, 15, 0, 0)));; // => "You have an appointment on Friday, March 29, 2019, at 3:00 PM."

        // 5. Return the anniversary date
        AppointmentScheduler scheduler5 = new AppointmentScheduler();
        System.out.println(scheduler5.getAnniversaryDate()); // => LocalDate.of(<current year>, 9, 15)

    } */
}

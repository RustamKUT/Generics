import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket ticket1, Ticket ticket2) {
        int time1 = ticket1.getTimeTo() - ticket1.getTimeFrom();
        int time2 = ticket2.getTimeTo() - ticket2.getTimeFrom();

        if (time1 > time2) {
            return 1;
        } else if (time1 < time2) {
            return -1;
        } else {
            return 0;
        }

    }
}

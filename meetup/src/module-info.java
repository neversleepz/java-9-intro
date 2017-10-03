module melbjvm.oct2017 {
    opens venue;
    requires beer;
    requires pizza;
    requires cake;
    opens pizza to attendees;
    opens beer to attendees;
    opens cake to attendees;
    requires attendees;
    exports thanks to aconex, hays, organisers, attendees;
    requires agenda;
    exports jetbrains.prize to raffle.winner;

}

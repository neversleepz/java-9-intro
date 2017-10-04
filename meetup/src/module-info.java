module melbjvm.oct2017 {
    opens venue;  // packages in this module that can have reflection

    requires beer;  // name of dependent modules
    requires pizza;
    requires cake;
    requires attendees;

    // packages in this module that can be exported to other ones
    exports thanks to aconex, hays, organisers, attendees;

    requires agenda;

    exports jetbrains.prize to raffle.winner;

    requires util;

}

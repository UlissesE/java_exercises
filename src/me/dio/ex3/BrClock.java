package me.dio.ex3;

public non-sealed class BrClock extends Clock {

    @Override
    Clock convert(final Clock clock) {
        this.minute = clock.getMinute();
        this.second = clock.getSecond();

        switch (clock) {
            case UsClock usClock -> {
                this.hour = (usClock.getPeriod().equals("PM")) ? usClock.getHour() + 12 : usClock.hour;
            }
            case BrClock brClock -> this.hour = brClock.getHour();
        }

        return this;
    }
}

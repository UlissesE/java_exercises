package me.dio.inheritance.ex3;

public non-sealed class UsClock extends Clock {

    private String period;

    @Override
    Clock convert(final Clock clock) {
        this.minute = clock.getMinute();
        this.second = clock.getSecond();

        switch (clock) {
            case UsClock usClock -> {
                this.hour = usClock.getHour();
                this.period = usClock.getPeriod();
            }
            case BrClock brClock -> this.setHour(brClock.getHour());
        }

        return this;
    }

    public String getPeriod() {
        return period;
    }

    public void setAfterMidday() {
        this.period = "PM";
    }

    public void setAfterMidnight() {
        this.period = "AM";
    }

    public void setHour(int hour) {
        setAfterMidnight();
        if (hour >= 12 && hour <= 23) {
            setAfterMidday();
            this.hour = hour - 12;
            this.period = "PM";
        } else if (hour >= 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }

    }

    @Override
    public String getTime() {
        return super.getTime() + period;
    }

}

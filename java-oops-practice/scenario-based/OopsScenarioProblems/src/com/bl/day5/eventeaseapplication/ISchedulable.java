package com.bl.day5.eventeaseapplication;

public interface ISchedulable {
	void schedule();
    void reschedule(String newDate);
    void cancel();
}

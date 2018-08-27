package com.sangjun.Object_oriented_Programming1;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour(){return hour;}
    public int getMinute(){return minute;}
    public int getSecond(){return second;}

    public void setHour(int h) {
        if(h < 0 || h > 23)
            return;
        hour = h;
    }

    public void setMinute(int m){
        if(m < 0 || m > 60)
            return;
        minute = m;
    }

    public void setSecond(int s){
        if(s < 0 || s > 60)
            return;
        second = s;
    }

    static Time compareTime(Time t1, Time t2){
        Time result = new Time();
        result.hour = (t1.getHour() - t2.getHour());
        result.minute = (t1.getMinute() - t2.getMinute());
        result.second = (t1.getSecond() - t2.getSecond());
        return result;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args){
        Time time1 = new Time();
        time1.setHour(1);
        time1.setMinute(29);
        time1.setSecond(32);

        Time time2 = new Time();
        time2.setHour(14);
        time2.setMinute(7);
        time2.setSecond(22);


        System.out.println(time1);
        System.out.println(time2);
        System.out.println(compareTime(time1, time2));
    }
}


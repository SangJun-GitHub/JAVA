package com.sangjun.Object_oriented_Programming1;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public long getHour(){return hour;}
    public long getMinute(){return minute;}
    public long getSecond(){return second;}

    public void setHour(long h) {
        if(h < 0 || h > 23)
            return;
        hour = h;
    }

    public void setMinute(long m){
        if(m < 0 || m > 60)
            return;
        minute = m;
    }

    public void setSecond(long s){
        if(s < 0 || s > 60)
            return;
        second = s;
    }
    public static long convertTOSecond(Time t)
    {
        long totalSecond = t.second;
        totalSecond += t.minute * 60;
        totalSecond += t.hour * 60 * 60;
        return totalSecond;
    }
    public static Time convertToTime(long totalSecond)
    {
        Time result = new Time();
        result.setHour(totalSecond / 60 / 60);
        result.setMinute((totalSecond - (result.getHour() * 60 * 60)) / 60);
        result.setSecond(totalSecond - ((result.getHour() * 60 * 60) +(result.getMinute() * 60)));
        return result;
    }

    public static Time compareTime(Time t1, Time t2){
        long a = convertTOSecond(t1);
        long b = convertTOSecond(t2);
        if(a < b) {
            long c;
            c = a;
            a = b;
            b = c;
        }
        return convertToTime(a - b);
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
        time1.setHour(14);
        time1.setMinute(29);
        time1.setSecond(32);

        Time time2 = new Time();
        time2.setHour(14);
        time2.setMinute(7);
        time2.setSecond(22);


        System.out.println(time1);
        System.out.println(time2);
        System.out.println( "time1 and time2 difference is "+ compareTime(time1, time2));
    }
}


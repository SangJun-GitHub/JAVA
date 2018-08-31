package com.sangjun.Object_oriented_Programming1;

public class Time {
    private String name;
    private long hour;
    private long minute;
    private long second;

    public String getName() {return name;}
    public long getHour(){return hour;}
    public long getMinute(){return minute;}
    public long getSecond(){return second;}

    public void setName(String n){
        name = n;
    }

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
    public long convertTOSecond(Time t)
    {
        long totalSecond = t.second;
        totalSecond += t.minute * 60;
        totalSecond += t.hour * 60 * 60;
        return totalSecond;
    }

    @Override
    public String toString() {
        return
                name + '['+
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second + ']'
                ;
    }

    public Time convertToTime(long totalSecond)
    {
        Time result = new Time();
        result.setName("result");
        result.setHour(totalSecond / 60 / 60);
        result.setMinute((totalSecond - (result.getHour() * 60 * 60)) / 60);
        result.setSecond(totalSecond - ((result.getHour() * 60 * 60) +(result.getMinute() * 60)));
        return result;
    }

    public void timeGap(Time t1, Time t2){
        if(!comparator(t1, t2)) {
            Time t3 = t1;
            t1 = t2;
            t2 = t3;
        }
        System.out.println("Between " +t1.getName() + " and " + t2.getName()+", difference is "
                + convertToTime(convertTOSecond(t1) - convertTOSecond(t2)));
    }

    public boolean comparator(Time t1, Time t2){
        long a = convertTOSecond(t1);
        long b = convertTOSecond(t2);
        if (a > b)
            return true;
        return false;
    }

    public void comparatorPrint(Time t1, Time t2){

        if(convertTOSecond(t1) == convertTOSecond(t2)){
            System.out.println(t1.getName() + " and " + t2.getName() + " are same");
        } else{
            if(comparator(t1, t2))
                System.out.println(t1.getName() + " is much than " + t2.getName());
            else
                System.out.println(t2.getName() + " is much than " + t1.getName());
        }
    }


    public static void main(String[] args){
        System.out.println("Test1");
        Time time1 = new Time();
        time1.setName("T1");
        time1.setHour(14);
        time1.setMinute(7);
        time1.setSecond(22);

        Time time2 = new Time();
        time2.setName("T2");
        time2.setHour(14);
        time2.setMinute(7);
        time2.setSecond(22);

        System.out.println(time1);
        System.out.println(time2);

        Time compare = new Time();
        compare.comparatorPrint(time1, time2);
        compare.timeGap(time1, time2);

        System.out.println("\nTest2");

        time1.setHour(15);
        time1.setMinute(18);
        time1.setSecond(25);

        time2.setHour(16);
        time2.setMinute(7);
        time2.setSecond(22);

        System.out.println(time1);
        System.out.println(time2);

        compare.comparatorPrint(time1, time2);
        compare.timeGap(time1, time2);

        System.out.println("\nTest3");

        time1.setHour(18);
        time1.setMinute(25);
        time1.setSecond(57);

        time2.setHour(16);
        time2.setMinute(7);
        time2.setSecond(22);

        System.out.println(time1);
        System.out.println(time2);

        compare.comparatorPrint(time1, time2);
        compare.timeGap(time1, time2);


    }
}


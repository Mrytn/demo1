package com.demo1;

import java.time.*;
import java.util.BitSet;
import java.util.Scanner;

/**
 * @author PeiDong Yan
 * @date 2021/01/25 16:44
 */
public class Test {
    public static void main(String[] args) {
        //Test.weiYi();
        //Test.bitSet();
        Test.time();
    }
//    static boolean bitSet(){
//        //输入数字
//        int n;
//        Scanner sc = new Scanner(System.in);
//        n =sc.nextInt();
//
//                System.out.println(1);
//
//        BitSet bitSet = new BitSet();
//
//        for (int i = n; i>0;i--) {
//            bitSet.set(sc.nextInt());
//            System.out.println(bitSet.size());
//            System.out.println(bitSet.cardinality());
//            System.out.println(bitSet.length());
//            System.out.println("---------------");
//        }
//
//        //输出
//        for (int i = bitSet.size(); i>0; i--) {
//            if (bitSet.get(i))
//            {System.out.print(i + " ");}
//        }
//    }
    static void weiYi(){
        System.out.println(Integer.toBinaryString(-2));

        int i1=Integer.MIN_VALUE;
        System.out.println(i1);
        System.out.println(Integer.toBinaryString(i1));
        int i2 = i1 >> 5;
        System.out.println(i2);
        System.out.println(Integer.toBinaryString(i2));
       // byte i3 = i1 << 1;
        //System.out.println(Integer.toBinaryString(i3));
    }
    static void time(){
        Instant now = Instant.now();
        LocalDate now1 = LocalDate.now();
        LocalTime now2 = LocalTime.now();
        LocalDateTime now3 = LocalDateTime.now();
        long l = System.currentTimeMillis();
        System.out.println("1:"+now);
        System.out.println("2:"+now1);
        System.out.println("3:"+now2);
        System.out.println("4:"+now3);
        System.out.println("5:"+l);
        System.out.println("6:"+now.toEpochMilli());
        System.out.println("6:"+now.getEpochSecond());
        System.out.println("7:"+now1.atStartOfDay(ZoneOffset.ofHours(8)).toInstant().toEpochMilli());
        System.out.println("7:"+now1.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
        System.out.println("8:"+now2.toSecondOfDay());
        System.out.println("9:"+now3.toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
        //获取一天开始时间和结束时间
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
        LocalDateTime localDateTime3 = localDateTime.minusSeconds(1);
        //LocalDateTime localDateTime2 = localDateTime.minus(1, new TemporalUnit());
        System.out.println(localDateTime);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
        System.out.println(localDateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
        System.out.println(localDateTime2.toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
        System.out.println(localDateTime3.toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
    }
}

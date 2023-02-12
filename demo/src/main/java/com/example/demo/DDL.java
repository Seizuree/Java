package com.example.demo;

import java.util.Locale;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.github.javafaker.Faker;

public class DDL {
  Faker fake = new Faker(new Locale("in-ID"));

  String name = fake.name().fullName();
  Date birthday = fake.date().birthday(10, 30);
  int isStudent = getIsStudent(0, 1);

  Format dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
  String birthdayFormatted = dateFormatter.format(birthday);

  String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
  String time = new SimpleDateFormat("HH.mm.ss").format(Calendar.getInstance().getTime());
  String datetime = String.format("%sT%s.000Z", date, time);

  public int getIsStudent(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }
}

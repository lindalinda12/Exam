

public class QOD {
 public static void main(String[] args){
  Device c1 = new Computer();
  //Tablet t1 = (Tablet) c1;
  Tablet t1 = new Tablet();
  System.out.println("\t\t");
  t1.powerOn();
 }
}
class Device { 
 public void powerOn(){
  System.out.println("Powering on Device.."); 
 }
}

class Computer extends Device {
  public void powerOn(){
   System.out.println("Powering on Computer.."); 
 } 
}

class Tablet extends Computer {
  public void powerOn(){
   System.out.println("Powering on Tablet.."); 
  }
}
/*
Q: What is the output of class QOD (if any?)

A: Powering on Device..
B: Powering on Computer..
C: Powering on Tablet..
D: The program fails to compile (there is no output).
E: The program compiles but throws a runtime exception.

*/

/*
interface Adjustable{
 abstract boolean adjust(Object o);

 boolean equals(Object obj);

 public static void pullCord(){
  System.out.println("Cord pulled.");
 }

 public default void coilUp(){
  System.out.println("Wind into a ring.");
 }
}
public class QOD {
 public static void main(String[] args){
   Adjustable adjuster = bootstrap -> true;
   System.out.println(adjuster.adjust(new Bootstrap()));
 } 
}
class Bootstrap{}
/*
Q: What is the output of class QOD (if any?)

A: true
B: false
C: The program fails to compile (there is no output).
D: The program compiles but throws an exception at runtime.

 

External reference to read after you have attempted the question: Link

*/

/*
class QOD {
 public static void main(String... args){
  Tool t1 = new Spanner();
  t1.adjustHandle(5);
 }
}
class Tool {
  Tool(){}
 private float size;

 public Tool(int size){
  this.size = size;
 } 

 public void setSize(int size){
  this.size=size;
 }

 public float getSize(){
  return size;
 }

 public void adjustHandle(){
  System.out.println("A generic way to adjust a handle.");
 }
}

class Spanner extends Tool {
 public void adjustHandle(int noOfTurns){ 
   System.out.println("A specific way to adjust a handle using a Spanner.");
 }
}
/*
Q: What is the output of class QOD (if any?)

A: A generic way to adjust a handle.
B: The program fails to compile (there is no output).
C: A specific way to adjust a handle using a Spanner.
D: The program compiles but throws a runtime exception.

*/

/*
public class QOD {

 public static void main(String[] args){
  int no_Zeros = 0;
  int[][] numbers = new int[][]{{1,3,5,7},{2,4,5,8}};

   for(int x=0; x<numbers.length; x++){
    for(int y=0; y<numbers[x].length; y++){
      if(numbers[x][y] % 2 == 0){ 
       no_Zeros++;
      } 
    }
   }
  System.out.println(no_Zeros); 
 }
}
/*
Q: What number is printed to the console?

A: 2
B: 8
C: 4
D: 3
E: Zero times as the program fails to compile.

/*
public class QOD {
 public static void main(String[] args){
  System.out.println("Take " + 5 + 5);
  System.out.println(5 + 5 + " take ");
 }
}
 

/*
Q: What is the output of class QOD (if any?)

A: Take 55
    55 take

B: Take 10
    10 take

C: Take 55
     10 take

D: The program fails to compile.

E: None of these answers are correct.

*/

/*
public class QOD {
  static int i;
 public static void main(String[] args){
  for (int x=0; x<3; x++){
   for (int y=0; y<5; y++){
    if(y==3){
     continue;
    }

    System.out.println("Hello World! " + i++); 
   } 
  }
 }
}
/*
Q: How many times is Hello World! printed to the console?

A: 9 times
B: 12 times
C: 15 times
D: Some other number of times
E: The program fails to compile (there is no output).

Bonus Q: Would your answer differ, if a labelled loop had been used instead, as shown below?

outer: for (int x=0; x<3; x++){

....

if(y==3){
 continue outer;
}

*/

/*
class Parent {
 static int x;
 int y;
 static {
  x=10;
  System.out.println("Hello from static parent init!");
 }
 {
  y=12;
  System.out.println("Hello from instance parent init!");
 }
 public Parent(){
  System.out.println("Hello from Parent constructor!");
  y=14;
  System.out.println("x=" + x + " y=" + y);
  }
 }

class QOD extends Parent {
 static int a;
 int b;

 static {
  a=50;
  System.out.println("Hello from static child init!"); 
 }

 {
  b=19;
  System.out.println("Hello from instance child init!"); 
 }

 public QOD(){
  super();
  System.out.println("Hello from Child constructor!");
  b=14;
  System.out.println("a=" + a + " b=" + b);
 } 

 public static void main(String[] args){
  new QOD();
 } 
}

/*
import java.io.IOException;
public class QOD {
 public static void main(String[] args){
  QOD qod = new QOD();
   qod.throwMe();


 }
 public void throwMe()  {
  return null;
 }
}
/*
Q: What is the output of class QOD (if any?)

A: null
B: A stack trace of method calls.
C: The program fails to compile, because of unreachable code.
D: The program fails to compile for another reason.
E: The program compiles and there is no output.
F: None of these answers are correct.

*/

/*
public class QOD {
 int x = 10;
 static int y = 20;

 public QOD(){
  this.y = 200; 
 }

 public static void main(String[] args){
  QOD qod1 = new QOD();
  QOD qod2 = new QOD();

  System.out.println(qod1.x + qod2.x);
  System.out.println(QOD.y);
 }

 static {
  y = 40; 
 }

 {
  x = y--;
 }
}
/*

Q: What is the output of class QOD (if any?)

A: 78
    200

B: 240
    200

C: 40
     200

D: The program fails to compile (there is no output).

E: None of these answers are correct.

*/

/*

import java.util.function.Predicate;
import java.util.List;
import java.util.Arrays;

public class QOD {
 public static void main(String[] args){
  List<Integer> numbers = Arrays.asList(10,-5,-6,100);
  Predicate<Integer> p = param -> param > 0;
  for (int param:numbers){
   System.out.print(p.test(param) + " "); 
  }
 }
}
/*
Q: What is the output of class QOD (if any?)

A: true false false true
B: false true true false
C: The program fails to compile (there is no output).
D: The program compiles but throws a runtime exception.
E: None of these answers are correct.

*/

 

/*
public abstract class QOD {

 static int x = 10;
  int y = 12;

  class Nested {
  public void testAccess(){
   System.out.println(x+y);
  } 
 }
 public static void main(String[] args){
  Nested nested = new Nested();
  nested.testAccess();
 }
}
/*
Q: What is the output of class QOD (if any?)

A: 22
B: 0
C: The program fails to compile (there is no output).
D: The program compiles but throws an exception at runtime.

*/

/*
interface Doable {
 void doIt();
}
class QOD { 
 public static void main(String... args){
  Doable passOCPExam = new Doable() {
   public void doIt(){
    System.out.println("Passing the OCP exam is a realistic achievement!");
   }
  };
  passOCPExam.doIt();
 }
}
/*
Q: What is the output of class QOD (if any?)

A: Passing the OCP exam is a realistic achievement!
B: null
C: The program fails to compile (there is no output).
D: The program compiles but throws a runtime exception.

*/

/*
public class QOD {
 class Valve extends QOD {
  public void releasePressure(){
   System.out.println("Pressure Off");
  }
 }
 public static void main(String... args){
  // Line 10
QOD qod = new QOD();
QOD.Valve valve = qod.new Valve();
valve.releasePressure();
 }
}

/*
Q: Which of the following statements, when inserted in the main method (from Line 10 onward), will produce the output, Pressure Off

Choose all that apply.

A: 
QOD qod = new QOD();
Valve valve = qod.new().Valve();
valve.releasePressure();

B:
QOD qod = new QOD();
Valve valve = qod.new Valve();
valve.releasePressure();

C: 
QOD qod = new QOD();
Valve valve = qod.new.Valve();
valve.releasePressure();

D:
QOD qod = new QOD();
Valve valve = qod.new() Valve();
valve.releasePressure();

E:
QOD qod = new QOD();
QOD.Valve valve = qod.new Valve();
valve.releasePressure();

*/

/*
import java.util.Objects;

 public class QOD {
  String questionID;

  public static void main(String... args){
   QOD qod1 = new QOD();
   qod1.questionID = "1";

   QOD qod2 = new QOD();
   qod2.questionID = "1";

   System.out.println(qod1 == qod2);
   System.out.println(qod1.equals(qod2));
  } 

  public boolean equals(QOD qod){
   if(! (qod instanceof QOD) ){
    return false;
   }else if(qod == null){
    return false;
   }else{
    return Objects.equals(this.questionID,qod.questionID);
   }
 }
}
/*
Q: What is the output of class QOD (if any?)

A: false
    true

B: false
    false

C: true
    false

D: true
    true

E: The program fails to compile (there is no output).

F: The program compiles but throws a runtime exception.

*/

/*

enum COLOR {RED,ORANGE,GREEN;
  int counter = 0;
 COLOR(){
  counter++;
 }
}
public class QOD {
 public static void main(String[] args){
  COLOR myFaveColor = COLOR.RED; 
  COLOR yourFaveColor = COLOR.ORANGE;
  COLOR hisFaveColor = COLOR.GREEN;

  System.out.println(hisFaveColor.counter); // Line 8
  System.out.println(COLOR.counter); // Line 9
 }
}
/*
Q: What is the output of class QOD (if any?)

Choose all that apply.

A: Compilation error on Line 8 in class QOD.

B: Compilation error on Line 9 in class QOD.

C: Compilation error in the program for another reason.

D: 3
    3

E: 1
    1

*/


/*
public class QOD {
 public static void main(String[] args){
  Wizard wizard = new Wizard();
  Spellable spellable = wizard;
  Magic_Potion m_potion = new Magic_Potion();

  System.out.println(wizard instanceof Wizard); 
  System.out.println(wizard instanceof Spellable); 
  System.out.println(m_potion instanceof Spellable);
 }
}
interface Spellable {
 abstract void castSpell(); 
}
class Wizard implements Spellable {
 public void castSpell(){
  System.out.println("The wizard has cast a spell.."); 
 }
}
class Magic_Potion {
 // code goes here 
}
/*
Q: What is the output of class QOD (if any)?

A: true 
    false 
    true

B: false
    true
    false

C: The program fails to compile (there is no output).

D: true
    true
    false

E: None of these answers are correct. 

*/

/*
import java.util.*;


public class QOD {
 public static void main(String[] args){
   new Car().drive();
 }
}
interface Drivable {
 default void drive(){
  System.out.println("Driving in a standard way..");
 }
}
class Car implements Drivable {
 @Override
 public void drive(){
  System.out.println("Driving in a car..");
  Drivable.super.drive();
  // Line 22
 }
}

/*

public class QOD {

public static <E extends Number> List<E> process(List<E> nums){return new ArrayList();}
 public static void main(String[] args){

 // ArrayList<Integer> input = null; 
 // ArrayList<Integer> output = null;

  ArrayList<Number> input = null; 
  ArrayList<Number> output = null; 
  
  output = process(input);

  Frog f1 = new Frog();
  f1.canHop = true;

  Frog f2 = new Frog();
  f2.canHop = false;

  Hoppable h1 = frog -> frog.canHop == true;
  Hoppable h2 = (Frog bert) -> bert.canHop == true;
  Hoppable h3 = (Frog leo) -> {return leo.canHop == true;};

  System.out.println(h1.canHop(f1));
  System.out.println(h2.canHop(f2));
  System.out.println(h3.canHop(f1));
 }
}
class Frog {
 boolean canHop; 
}
interface Hoppable {
 public boolean canHop(Frog a); 
}

/*
Q: What is the output of class QOD (if any?)

A: false
    true
    false

B: true
    true
    false

C: true
    false
    true

D: The program fails to compile.

*/

/*
interface Hungry<E> { void munch(E x); }
interface Carnivore<E extends Animal> extends Hungry<E> {}
interface Herbivore<E extends Animal> extends Hungry<E> {}
abstract class Plant {}
class Grass extends Plant {}
abstract class Animal {}
class Sheep extends Animal implements Herbivore<Sheep> {
  public void munch(Sheep x) {}
}
class Wolf extends Animal implements Carnivore<Sheep> {
  public void munch(Sheep x) {}
}

public class QOD {}

/*
import java.nio.file.*;
import java.util.stream.Stream;
import java.io.IOException;

public class QOD {
 public static void main(String[] args) throws IOException{
   Path path = Paths.get(".\\MyNotes.txt"); 
   Stream<String> notes = Files.lines(path);
   notes.forEach(p -> System.out.println(p));
 }
}

/*
import java.util.*;

public class QOD {
  private Map<String, Integer> accountTotals = new HashMap<String, Integer>();
  private int retirementFund;

  public int getBalance(String accountName) {
Integer total = accountTotals.get(accountName);
    if (total == null)
        total = 0;
    return total;
  }
  public void setBalance(String accountName, int amount) {
    accountTotals.put(accountName, amount);
  }
}

public class QOD {
  private Map accountTotals = new HashMap();
  private int retirementFund;

  public int getBalance(String accountName) {
    Integer total = (Integer) accountTotals.get(accountName);
    if (total == null)
     total = Integer.valueOf(0);
    return total.intValue();
  }
  public void setBalance(String accountName, int amount) {
    accountTotals.put(accountName, Integer.valueOf(amount));
  }
}

/*

import java.util.*;

class QOD {

  public static void before() {

  Set set = new TreeSet();
  set.add("2");
  set.add("3");
  //set.add(3);  // will cause run time error ClassCastException
  set.add("1");
  Iterator it = set.iterator();
    while (it.hasNext())
  System.out.println(it.next() + " ");
}
public static void main(String[] args) {
     Map<ToDos, String> m = new HashMap<ToDos, String>();
    ToDos t1 = new ToDos("Monday");
    ToDos t2 = new ToDos("Monday");
    ToDos t3 = new ToDos("Tuesday");
    m.put(t1, "doLaundry");
    m.put(t2, "payBills");
    m.put(t3, "cleanAttic");
    System.out.println(m.size()); 

  before();

  // INSERT DECLARATION HERE
  List<List<Integer>> table = new ArrayList<List<Integer>>();
  for (int i = 0; i <= 10; i++) {
    List<Integer> row = new ArrayList<Integer>();
    for (int j = 0; j <= 10; j++)
      row.add(i * j);
    table.add(row);
  }
  for (List<Integer> row : table)
    System.out.println(row);
}

}

class ToDos{
  String day;
  ToDos(String d) { day = d; }
  public boolean equals(Object o) {
    return ((ToDos)o).day.equals(this.day);
  }
   public int hashCode() { return 10; }
}

/*
import java.io.*;
 
class LastError<Number> {
     private Number lastError;
     void setError(Number t){
             //lastError = t;
             System.out.println("LastError: setError");
     }
}
 
class StrLastError<S extends Number> extends LastError<Number>{
     public StrLastError(Number s) {
     }
      void setError(Number s){
             System.out.println("StrLastError: setError");
     }
}
 
class QOD {
     public static void main(String []args) {
            
             LastError<Number> err = new LastError<Number>();
             //StrLastError<String> err = new StrLastError<String>("Error");
             err.setError(5);

             LastError<Number> err2 = new StrLastError<Number>(6);
             err2.setError(5);
     }
}

/*
import java.io.*;
 
class LastError<T> {
     private T lastError;
     void setError(T t){
             lastError = t;
             System.out.println("LastError: setError");
     }
}
 
class StrLastError<S extends CharSequence> extends LastError<String>{
     public StrLastError(S s) {
     }
     void setError(S s){
             System.out.println("StrLastError: setError");
     }
}
 
class QOD {
     public static void main(String []args) {
            
             StrLastError<CharSequence> err = new StrLastError<CharSequence>("Error");
             //StrLastError<String> err = new StrLastError<String>("Error");
             err.setError("Last error");
     }
}

/*
public class QOD {
 public static void main(String[] args){
  Tree t = new Tree();
  Animal a = new Horse();
  Animal animal = new Animal();

  Horse mrEd = (Horse) a; 
  Horse aHorse = (Horse) t; 
  Horse anAnimal = (Horse) animal;
 }
}
class Tree{}
class Animal{}
class Horse extends Animal{}
/*
Q: How many statements fail to compile in class QOD?

A: 1
B: 2
C: 3
D: 0

*/

/*
/*
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.*;

public class QOD {
 public static void main(String[] args) throws IOException {
   
  InputStream is = new BufferedInputStream(new FileInputStream(".\\Input.txt"));
  
 /* is.read();
  if(is.markSupported()) {
   is.mark(100);
   is.read();
   is.read();
   is.reset();
   is.read();
   is.skip(1);
   System.out.print((char)is.read());
   */
   /*
   System.out.println((char)is.read() + "1");
  if(is.markSupported()) {
   is.mark(100);
   System.out.println((char)is.read() + " After Mark 2");
   System.out.println((char)is.read() + "3");
   is.reset();
   System.out.println((char)is.read() + " After reset 4");
   is.skip(1);
   System.out.println((char)is.read() + "5");
  }
 }
}
/*
Q: Given a text file called, Input.txt in your current folder, with the contents ABCD.

What is the ouput of class QOD (if any?).

A: A
B: B
C: C
D: D

*/

/*
import java.io.Closeable;
 public class QOD  {
  public static void main(String[] args){
   try{} catch(Exception e){} 
  }
  public void close() throws ArrayIndexOutOfBoundsException{
   System.out.println("Closing QOD"); 
  }
}
/*
Q: What is the output of class QOD (if any?)

A: Closing QOD
B: The program compiles but throws an ArrayIndexOutOfBoundsException at runtime.
C: The program fails to compile (there is no output).
D: The program compiles but there is no output.

*/

/*
import java.util.stream.Stream;
public class QOD {
 public static void main (String[] args){
  Stream<String> names = Stream.of("Sandy","Billy","James","Rick");
  System.out.println(names.map(name -> name.toUpperCase())                      
                          .findAny()
                          .get() 
                          );
 }
}
/*
Q: What is the output of class QOD (if any?).

A: SANDY BILLY JAMES RICK
B: SANDY BILLY JAMES
C: sandy
D: SANDY
E: The program fails to compile (there is no output).
F: None of these answers are correct.

*/

/*
import java.util.List;
import java.util.ArrayList;

public class QOD {

 public static void main(String[] args){
  List<Object> obj = new ArrayList<>(); // Line 7
  //List<Object> obj2 = new ArrayList<String>(); // Line 8
  List obj3 = new ArrayList<>(); // Line 9
  List obj4 = new ArrayList(); // Line 10
  List<> obj5 = new ArrayList(); // Line 11
 }
}

/*
Q: Which of the following statements in class QOD, fail to compile (if any)?

Choose all that apply.

A: Line 7
B: Line 8 
C: Line 9 
D: Line 10
E: Line 11 
F: There are no compiler errors in class QOD.

*/

/*
import java.util.List;
import java.util.ArrayList;
public class QOD {
 public static void main(String[] args){
  // Line 7
  List<? super String> contacts = new ArrayList<>();
  contacts.add("Teddy");
  System.out.println(contacts);
 }
}
/*
Q: Which of the following statements can be inserted (independently) at Line 7, to allow the program to compile?

Choose all that apply.

A: List contacts = new ArrayList();
B: List<?> contacts = new ArrayList<>();
C: List<? super String> contacts = new ArrayList<>(); 
D: List<? extends String> contacts = new ArrayList<>();

*/

/*
import java.util.List;
import java.util.ArrayList;

public class QOD {
 public static void main(String[] args){
  List<String> strings = new ArrayList<>();
  strings.add("Davey");
  strings.add("Maggie");
  TestGenerics(strings);
  System.out.println(strings);
 }

 public static void TestGenerics(List<String> args){
  args.add("Tony");
 }
}
/*
Q: Which of the following statement(s) are correct?

Choose all that apply.

A: Class QOD fails to compile.

B: Class QOD generates a runtime exception.

C: Class QOD compiles and runs without issue.

D: Class QOD generates a compiler warning.
*/

/*
interface Formula {
 double calculate(int a);
 default double sqrt(int a) {
  return Math.sqrt(a);
 }
}
public class QOD implements Formula{
 public static void main(String[] args){
  Formula formula = (a) -> new QOD().sqrt(a * 1);

 } 

 public double calculate(int a){
  return 0; 
 }
}
/*
Q: What is the output of class QOD (if any?)

A: 64
B: 8
C: 1
D: The program fails to compile (there is no output).
E: The program compiles but generates a runtime exception.

Reference: This question is based on a discussion on the StackOverflow website. Please review it after you have attempted the question. Link.

*/

/*
import java.util.Locale;
import java.util.Locale.Builder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class QOD {
 public static void main(String[] args){
  Locale locale = new Locale.Builder()
  .setLanguage("FR")
  .setRegion("CA")
  .setVariant("POSIX")
  .setScript("Latn")
  .build();

  LocalDateTime localDateTime = LocalDateTime.of(2019, 7, 23, 11, 20, 00, 500);
  String pattern = "dd-MMMM-yyyy HH:mm:ss.nnn";
  DateTimeFormatter date_time_formatter = DateTimeFormatter.ofPattern(pattern, locale);
  System.out.println(date_time_formatter.format(localDateTime));
 }
}
/*
Q: What is the output of class QOD (if any?).

A: 23-juillet-2019 11:20:00.000
B: The program fails to compile (there is no output).
C: The program compiles but generates a runtime exception.
D: None of these answers are correct.

/*
interface Animal {
 static void sleep(){
  System.out.println("An Animal is sleeping in a generic way..."); 
 } 
}
interface Parrot extends Animal {
 static void sleep(){
  System.out.println("A Parrot sleeps standing up, with one foot up."); 
 } 
}
public class QOD {
 public static void main(String[] args){
  Parrot.sleep();
 }
}
/*
import java.time.*;

public class QOD {
 public static void main(String[] args){
  Instant now = Instant.now();
  Instant later = now.plus(Duration.ofDays(30));
  Duration time_gap = Duration.between(now, later);
  System.out.println(time_gap.toMillis());
 }
}
/*
Q: Class QOD successfully compiles and outputs a number of milliseconds.

Is this statement true or false?

A: true
B: false

*/

/*
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import static java.time.format.FormatStyle.SHORT;

public class QOD {
 public static void main(String[] args){
  LocalTime lt = LocalTime.of(10,47,34);
  DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(SHORT);
  String formatStr = dtf.format(lt);
  System.out.println(formatStr);
 }
}
/*
Q: What is the output of class QOD (if any?).

Assume that the current date is today's date (18/07/2019).

A: 18/07/19 10:47:34
B: 10:47:34
C: The program fails to compile (there is no output).
D: The program compiles but generates a runtime exception.

*/

/*
import java.time.*;

public class QOD {
 public static void main(String[] args){
  LocalDate date = LocalDate.of(2016, 3, 13);
  LocalTime time = LocalTime.of(1, 30);
  ZoneId zone = ZoneId.of("US/Eastern");
  ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
    System.out.println(dateTime);

  dateTime = dateTime.plusHours(1);
  System.out.println(dateTime);
 }
}
/*
Q: What is the output of class QOD (if any?).

Note, 'the clocks go forward' at 02:00am on 13/03/2016 in the US/Eastern time zone.

A: 2016–03–13T03:30–04:00[US/Eastern]
B: 2016–03–13T03:30–05:00[US/Eastern]
C: 2016–03–13T02:30–05:00[US/Eastern]
D: 2016–03–13T02:30–04:00[US/Eastern]
E: The program fails to compile (there is no output).
F: The program compiles but throws a runtime exception.

*/


/*

public class QOD {

 public static void main(String[] args){

  final String instructions = "Turn on the computer and then.."; 

  Programmable p = new Programmable(){
   @Override public void program(){
    System.out.println("Programming instructions..." + instructions); 
    }
   }; 

   instructions=null;

   p.program();
 } 
}
interface Programmable{
 void program(); 
}
/*
Q: What is the output of class QOD (if any?)

A: Programming instructions...Turn on the computer and then..
B: Programming instructions...null
C: Programming instructions...
D: The program fails to compile (there is no output).
E: The program compiles but generates a runtime exception.

*/

/*
class Tool {
 public int slide(){
  return 10;
 }
 public static void measure(){
  System.out.println("Measure with a tool");
 }
}
class Sliding_Bevel extends Tool {
 public int slide(){
  return 8;
 }
 public static void measure(){
  System.out.println("Measure with a sliding bevel");
 }
}
public class QOD {
 public static void main(String[] args){
  Tool tool = new Sliding_Bevel();
  System.out.println(tool.slide());
  tool.measure();
 }
}

/*
interface Programmable {
 abstract boolean code(String code);
 boolean program(String code);
}
public class QOD {
 public static void main(String[] args){
  Programmable p = p -> true;
 } 
}
/*
Q: Is the following statement true or false?

Class QOD compiles and produces a .class file.

A: true
B: false

Note: the interface and class definitions are stored in a .java file named QOD.java

*/

/*
enum Sizes {
 SMALL(5){
  public void scoop(){
   System.out.println("small scoop");
  } 
 },MEDIUM(10){
   @Override public void scoop(){
    System.out.println("medium scoop");
   } 
 },LARGE(15){
   @Override public void scoop(){
    System.out.println("medium scoop");
   } };

 float weight;

 Sizes(float weight){
  this.weight = weight;
 }

 public abstract void scoop();
}
public class QOD {
 public static void main(String[] args){
  Sizes s1 = Sizes.MEDIUM;
  System.out.println(s1.weight);
  s1.scoop();
 }
}
/*
Q: Is the following statement true or false?

The output of class QOD is:

10.0
medium scoop

A: true
B: false

*/

/*
enum claw_type {CURVED,ROUNDED,ARKED};
abstract class Hammer {
 float weight;
 float price;

 public Hammer(float weight, float price){
  this.weight = weight;
  this.price = price;
 }

 public abstract void hammer();
}
class Curved_Steel_Claw_Hammer extends Hammer{
 private claw_type clawType;

 public Curved_Steel_Claw_Hammer(claw_type ct, float weight, float price){
  super(weight,price);
  this.clawType = ct;
 }

 @Override public void hammer(){
  System.out.println("Hammering in a Curved_Steel_Claw_Hammer way...");
 }

}
class QOD {
 public static void main(String[] args){
  Curved_Steel_Claw_Hammer curve_hammer = new Curved_Steel_Claw_Hammer(claw_type.CURVED,50.00f,20.00f);
  curve_hammer.hammer();
 } 
}
/*
Q: What is the output of class QOD (if any?)

Choose all that apply.

A: Hammering in a Curved_Steel_Claw_Hammer way...
B: The program fails to compile because of an error in class Hammer.
C: The program fails to compile because of an error in class Curved_Steel_Claw_Hammer.
D: The program fails to compile because of an error in the declaration of the enum.

*/

/*
import java.util.Arrays;
import java.util.List;

public class QOD {
 public static void main(String[] args){
  List<Cat> cats = Arrays.asList(new Cat(2),new Cat(4),new Cat(1),new Cat(2));
  cats.stream()
      .sorted((c1,c2) -> c2.age-c1.age)
      .forEach(System.out::print);
 }
}
class Cat implements Comparable<Cat> {
 int age;

 Cat(int age){
  this.age=age;
 } 

 public int compareTo(Cat c1){
  return 5; 
 }

 public String toString(){
  return String.valueOf(age); 
 }
}

/*
import java.io.File;
import java.io.IOException;

public class QOD {
 public static void main(String[] args) throws IOException{
   File myDir = new File("mydir");
   // myDir.mkdir();
   File myFile = new File(myDir,"myFile.txt");
   System.out.println(myFile.createNewFile());
 }
}
/*
Q: Assuming that the contents of the current folder is only QOD.java, what is the output of class QOD (if any?)

A: true
B: false
C: The program fails to compile (there is no output).
D: The program compiles but generates a runtime exception.

*/

/*
public class QOD {
 static String x = "Hi";

 public static void main(String[] args) {
  new QOD().testX(x);
  System.out.println("2 " + x); 
 }

 public void testX(String x){
  x = "Hi";
  this.x = x.toLowerCase(); 
  System.out.println("1 " + x);
 }
}
/*
Q: What is the output of class QOD (if any?)

A: 1 hi
    2 hi

B: 1 HI
    2 hi

C: 1 HI
     2 HI

D: The program fails to compile (there is no output).

E: None of these answers are correct.

*/

/*
public class QOD implements Doable {
 public static void main(String[] args){
  System.out.println(new QOD() instanceof QOD); // Line 3
  System.out.println(new QOD() instanceof Doable); // Line 4
  System.out.println(new Turtle() instanceof Object); // Line 5
  System.out.println(new Turtle() instanceof Doable); // Line 6
//  System.out.println(new Turtle() instanceof QOD); // Line 7
 } 
}
interface Doable{}
class Turtle{}
/*
Q: Which statements in class QOD result in a compile time error (if any?)

Choose all that apply.

A: Line 3
B: Line 4
C: Line 5 
D: Line 6
E: Line 7
F: None of the statements in class QOD result in a compile time error.
*/

/*
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.List;

public class QOD{
 public static void main(String[] args) throws IOException {
 Path p1 = Paths.get("D:\\OCPExam\\QOD.txt");
 List<String> lines = null;
 try{
  lines = Files.readAllLines(p1)
               .filter( i -> i.startsWith("Creamy"))
               .forEach( i -> System.out.println(i));
 }catch(IOException e){
  e.printStackTrace(); 
 }
  for(String line:lines){
   System.out.println(line);
  }
 }
}

/*
Assume that p1 correctly reference a text file on the hard drive, with the contents:
Creamy Donuts
Ice Lollies
Fresh Fruits
Southern Freez
Creamy Treats

Q: Is the following statement true or false?

Class QOD only reads in lines from the text file that start with the String "Creamy" and outputs them to the console.

A: true
B: false

/*

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.*;

public class QOD {
 public static void main(String[] args){
        //Create list         
          ArrayList<Integer> arrlist = new ArrayList<Integer>();  
          arrlist.add(10);  
          arrlist.add(-20);  
          arrlist.add(30);  
          arrlist.add(-40);  
          arrlist.add(50);  
          //Print List 
          Collections.sort(arrlist);
          System.out.println("Provided List are: "+arrlist);  
          //Search the list for key '-20'  
          int index = Collections.binarySearch(arrlist, -20,  Collections.reverseOrder());       
                    System.out.println("Provided List2 are: "+arrlist);  

          System.out.println("Index '-20' is available at position: "+index);
 }
}

/*
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
public class QOD {
 public static void main(String[] args){
  List<Integer> myList = Arrays.asList(1,4,2,3);
 // Collections.sort(myList);
  int x = Collections.binarySearch(myList,3, (i1,i2) ->{
    //System.out.println(i1 + " " + i2 + " " + (i2 - i1));
   //  System.out.println(myList);

    return i2-i1;});
 // System.out.println(myList);
    System.out.println(x);

 }
}

/*
import java.util.List;
import java.util.Arrays;

public class QOD {
 public static void main(String[] args){
  List<Integer> nums = Arrays.asList(1,2,3);
  float avgWithReduce = nums.stream()
                            .mapToDouble(r -> r)
                            .reduce((v1,v2) -> (v1+v2) / 2);
  System.out.println("Average is " + avgWithReduce);
 }
}
/*
Q: Is the following statement true or false?

The average of the values in the stream is correctly calculated and displayed in the console.

A: true
B: false

*/

/*
import java.util.*;
import java.util.stream.*;

public class QOD{

  public static void main(String[] args){
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13);

    Stream<Integer> myStream = nums.stream().parallelStream( i -> i);
    



  }
}

/*
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class QOD extends Thread {
 static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

 public void run(){ 
  list.add("D");
 } 

 public static void main(String[] args)throws InterruptedException {
  list.add("A");
  list.add("B");
  list.add("c");

  QOD qod = new QOD();
  qod.run();

  Iterator<String> itr = list.iterator();
  list.add("E");

  while (itr.hasNext()) { 
   String s = itr.next();
   System.out.print(s);
  }
 }
}

/*
Q: What are possible outputs for class QOD?

Choose all that apply.

A: ABc
B: ABcD
C: ABcDE
D: The program fails to compile (there is no output).
E: None of these answers are correct.

Reference: external site.

*/

/*
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

/**
 *
 * @author admin
 */
 /*
public class MultiCatchBlock {
    static void transferFile() throws FileNotFoundException, UnknownHostException{ // notice here.. subtypes can be thrown

        boolean found=true;
        
        try{
                if(found==false){
                    throw new FileNotFoundException();
                }else{
                    throw new UnknownHostException();
                }
        }catch(final IOException e){
            // do something;
            throw e;
        }
    }
    
    public static void main(String []args){
        try{
                transferFile();
        }catch(UnknownHostException | FileNotFoundException e){
        }
    }
        
}

/*

public class BinaryLiterals {
    public static void main(String []args){
        int b1 = 0b10100010010111;
        int b2 = 0b10_100_010_010_111;
        
        System.out.printf ("%d%n", b1); // Output: 10391
        System.out.printf ("%d%n", b2); // Output: 10391
        System.out.printf ("%s%n", Integer.toBinaryString(b2)); // Output: 10100010010111
        
        int h1 = 0xCAFE;
        int h2 = 0xCA_FE;
        
        System.out.printf ("%d%n", h1); // Output: 51966
        System.out.printf ("%d%n", h2); // Output: 51966
        System.out.printf ("%s%n", Integer.toHexString(h2)); // Output: cafe
    }
    
}


/*
import java.util.ArrayList;
import java.util.List;

 class ArrayBuilder {

  public static <T> void addToList (List<T> listArg, T... elements) {
    for (T x : elements) {
      listArg.add(x);
    }
  }

  @SuppressWarnings({"unchecked", "varargs"})
  public static <T> void addToList2 (List<T> listArg, T... elements) {
    for (T x : elements) {
      listArg.add(x);
    }
  }

  @SafeVarargs
  public static <T> void addToList3 (List<T> listArg, T... elements) {
    for (T x : elements) {
      listArg.add(x);
    }
  }

  // ...

}

public class ImprovedVarargs {

  // ...

  public static void main(String[] args) {

 List<String> stringListA = new ArrayList<>();
    List<String> stringListB = new ArrayList<>();


List<List<String>> listOfStringLists = new ArrayList<>();

    ArrayBuilder.addToList(listOfStringLists, stringListA, stringListB);
    ArrayBuilder.addToList2(listOfStringLists, stringListA, stringListB);
    ArrayBuilder.addToList3(listOfStringLists, stringListA, stringListB);

    // ...

  }
}



/*

/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author admin
 */

 /*
public class DiamondOperator {
    public static void main(String[] args){
        
        // Click on the warning and "use diamond inference"
        
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

    
}
}

/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author admin
 */
 /*
public class TryWithResources {

    
        static String readFile(String path) throws IOException {
  //BufferedReader br = new BufferedReader(new FileReader(path));
  try (BufferedReader br = new BufferedReader(new FileReader(path))){
    return br.readLine();
  } 
}
public static void main(String args[]){
        try {
            System.out.println(readFile("D:\\Java SE 7&8 Professional\\Labs SE 8\\Java SE 7 New Features\\soln\\less_03\\my_data.txt"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}



/*
import java.util.concurrent.atomic.AtomicLong;

 public class QOD {
   static class Counter {
    private AtomicLong c = new AtomicLong(0);

    public void increment() {
     c.getAndIncrement(); // Line 9 
    }

    public long value() {
     return c.get();
    }
   }

  public static void main(String[] args) throws InterruptedException {
    final Counter counter = new Counter();

    for(int i = 0; i < 3; i++) {
      new Thread(new Runnable() {
        public void run() {
         counter.increment();
        }
      }).start(); 
    }
   Thread.sleep(1);
   System.out.println(counter.value());
  }
}
/*
Q: What is the output of class QOD (if any?).

A: 2
B: 3
C: 4
D: 0
E: The program fails to compile (there is no output).
F: The program compiles but generates a runtime exception.

Reference:

Note: this question is based on an example at the external web site: tutorialspoint.com

Comment: would the result have differed if we substitute Line 9 for:
c.incrementAndGet();

*/

/*
interface CanWalk 
{
    static void walk() { System.out.println("Walking"); }
}
interface CanRun 
{
    public static void walk() { System.out.println("Walking"); }  //line 5
    public abstract void run();                                    //line 6
}
public interface QOD extends CanWalk, CanRun                 //line 8
{
    void sprint();                                                 //line 9
}

/*
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class QOD {
 public static void main(String[] args){

  ExecutorService service = Executors.newCachedThreadPool();

  Future<String> res1 = service.submit( () -> "I like eating Apples");
  Future<String> res2 = service.submit( () -> "You like eating Oranges");

  try{
   System.out.println(res1.get());
   System.out.println(res2.get());
   service.shutdown();
  }catch (ExecutionException | InterruptedException e) {
   System.out.println("There was a problem with the executor service");
  }
 }
}


/*
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class QOD {
 public static void main(String[] args){
  ExecutorService myService = Executors.newFixedThreadPool(1);

    // convert 10 miles to km.
  Future<Float> milesToKM = myService.submit( new Callable(){
   public Float call() throws Exception {
    // convert 10 miles to km.
    float miles = 10;
    float milesToKmConversion = 1.60934f;
    return miles*milesToKmConversion;
   }}); 

   // convert 10 km to miles.
   Future<Float> kmToMiles = myService.submit( () -> (10*0.621371f) );
   
   try{
    System.out.println(milesToKM.get());
    System.out.println(kmToMiles.get());
    myService.shutdown();
   }catch (ExecutionException | InterruptedException e) {
    System.out.println("There was a problem with the executor service");
   }
   
  }
}
/*
Q: What is the output of class QOD (if any?)

A: The program fails to compile (there is no output).

B: 6.21371
    16.0934

C: 16.0934
     6.21371

D: The program compiles but throws a runtime exception.

E: None of these answers are correct.

*/

/*
import java.util.Map;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class QOD {
 public static void main(String[] args){
  Stream<String> names = Stream.of("Jerry","Amy","Sam","Billy","Fran");
  Map<Integer,List<String>> myOutput = names.collect(Collectors.groupingBy( i -> i.length() ) );
  System.out.println(myOutput);
 }
}
/*
Q: Is the following statement true or false.

myOutput is a map whose key value is a boolean value.

A: true
B: false

Interesting Read:
https://stackoverflow.com/questions/27993604/whats-the-purpose-of-partitioningby
*/

/*
import java.util.ArrayDeque;

 public class QOD {
  public static void main(String[] args){
   ArrayDeque<String> queue = new ArrayDeque<>();
   queue.add("Jenny");
   queue.add("Bill");
   queue.add("Tony");

   queue.pop(); 
   queue.push("Sarah"); 
   queue.peek(); 
   queue.poll(); 
   queue.remove();

   System.out.println(queue); 
  }
}
/*
Q: What is the output of class QOD, if any?

A: [Bill, Tony]
B: [Jenny, Bill]
C: [Sarah]
D: [Tony]
E: The program fails to compile (there is no output).
F: The program compiles but generates a runtime exception.
G: None of these answers are correct.

*/

/*
import java.util.stream.Stream;
import java.util.stream.IntStream;
public class QOD {
public static void main(String[] args){
Stream<Integer> ints = Stream.of(10,20,30);
IntStream i_Stream = ints.mapToInt(i -> i);
int sum = i_Stream.sum();
System.out.println(sum);  // 60
}
}
/*
Q: What is the output of class QOD (if any)?

A: 60
B: 0
C: The program compiles but generates a runtime exception.
D: The program fails to compile (there is no output).

*/

/*
import java.util.stream.DoubleStream;
import java.util.DoubleSummaryStatistics;
 public class QOD {
  public static void main(String[] args){
   DoubleSummaryStatistics statistics = DoubleStream.of(10.0,20.0,30.0)
                                                    .summaryStatistics();
   System.out.println(statistics);
  }
}
/*
Q: What is the output of class QOD (if any?).

A: Summary statistics will be printed, including sum, average, min and max values.
B: Only the sum value of 60 will be printed to the console.
C: The program fails to compile (there is no output).
D: As no terminal operation was specified, the stream was never executed.
E: A runtime exception occurs.

*/

/*
import java.util.stream.Stream;
 public class QOD {
  public static void main (String... args){
   Stream<String> message = Stream.of("T","H","E","Q","U","I","C","K","F","O","X");
   String myString = message.reduce("",String::concat);
   System.out.println(myString);
 }
}
/*
Q: What is the output of class QOD, (if any)?

A: The program fails to compile (there is no output).
B: THEQUICKFOX
C: The program compiles but generates a runtime exception.
D: An empty string is output.
E: null is output.

*/

/*
import java.util.stream.Stream;
import java.util.Optional;
public class QOD {
 public static void main(String[] args){
  Stream<Integer> numbers = Stream.of(10,20,30,40);
  Optional<Integer> result = numbers.reduce((i1,i2) -> i1+i2 );
  if(result.isPresent()){
    System.out.println(result.get());
  }
 }
}
/*
Q: What is the output of class QOD (if any?)

A: 100
B: 0
C: 10
D: 120
E: The program fails to compile.
F: The program compiles but generates a runtime exception.

*/

/*
import java.util.List;
import java.util.ArrayList;
 public class QOD {
  public static void main(String[] args){
   List<Object> names = new ArrayList<>();
   names.add("Jenny");
   names.add("Ron");
   updateList(names);
  }
  public static void updateList(List<? super Object> args){
   args.add("Harry");
   for(Object s:args){
    System.out.println(s);
   }
 }
}
/*
Q: What is the output of class QOD (if any?).

A: Jenny
     Ron

B: Jenny
    Ron
    Harry

C: The program fails to compile (there is no output).

D: The program compiles but generates a runtime exception.

*/

/*
import java.io.IOException;
import java.io.FileNotFoundException;

 public class QOD {
  public static void main(String[] args) throws IOException, FileNotFoundException {
   try{
    throwAnException();
   }catch(Exception e){
     try{
    throw e;
     }catch(Exception ex){
       ex.printStackTrace();

     }
   } 
 }
 public static void throwAnException() throws IOException, FileNotFoundException{
  throw new FileNotFoundException(); 
 }
}
/*
Q: What is the output of class QOD (if any?)

A: The program fails to compile.
B: The program compiles and throws a FileNotFoundException at runtime.
C: The program compiles and throws an IOException at runtime.
D: The program compiles but generates no output.

*/

/*
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
 public class QOD {
  public static void main(String[] args){
   LocalDate date = LocalDate.of(2019,5,30);
   DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
   String text = date.format(formatter);
   LocalDate parsedDate = LocalDate.parse(text, formatter);
   parsedDate.plusMonths(1);
   System.out.println(parsedDate);
 }
}
/*
Q: What is the output of class QOD (if any?)

A: 2019-05-30
B: 2019-06-30
C: The program fails to compile (there is no output)
D: The program compiles but throws a runtime exception.
E: None of these answers are correct.

*/

/*
import java.util.stream.Stream;
public class QOD {
 public static void main(String[] args){
  Stream<Integer> nos = Stream.of(1,2,3,4,5,1,2);
  Object count = nos.filter(i -> (i%2 == 0))
                  .count()
                  .forEach( d -> System.out.println(d));
                  //.count();
  //System.out.println(count);
 }
}
/*
Q: What is the output of class QOD (if any?)

A: 2
B: 3
C: 0
D: The program fails to compile (there is no output)
E: The program compiles but generates a runtime exception.

*/

/*
import java.io.*;
import java.util.*;

 public class QOD {
  public static void main(String[] args){
    try (PrintWriter writer = new PrintWriter(new File("Goodbye.txt"));
         Scanner scanner = new Scanner(new File("Hello.txt"))) {
    }catch(FileNotFoundException | RuntimeException e){
         e = null;
    }
  }
}
/*
Q: Class QOD fails to compile.

Is this statement true or false?

A: true
B: false

/*
public class QOD {

 public static void main(String[] args){
  try(TestOne ct2 = new TestOne(); 
      TestTwo ct1 = new TestTwo(); ){
  } catch(java.io.IOException e){
     e.printStackTrace(); 
  } catch(Exception e){
     e.printStackTrace(); 
  }
 }
}
class TestOne implements CustomOne{}
class TestTwo implements CustomTwo{}
interface CustomOne extends AutoCloseable {
 public default void close() throws Exception{
  // code to close CustomOne goes here.
  System.out.println("Closing CustomOne Resource");
  throw new Exception();
 } 
}
interface CustomTwo extends java.io.Closeable {
 public default void close() throws java.io.IOException{
  // code to close CustomTwo goes here.
  System.out.println("Closing CustomTwo Resource");
  throw new java.io.IOException();
 } 
}
/*
Q: What is the output of class QOD (if any?).

A: Closing CustomOne Resource
    Closing CustomTwo Resource
    java.lang.Exception
    Suppressed: java.io.IOException

B: Closing CustomTwo Resource
    Closing CustomOne Resource
    java.io.IOException
    Suppressed: java.lang.Exception

C: The program fails to compile.

D: None of these answers are correct.

*/

/*
import java.io.File;
 public class QOD {
  public static void main(String[] args) { 
   boolean result = false;
   try {
    File f = new File("C:/QOD/22_05_19/FileIO");
    result = f.mkdirs();
    System.out.println(result);
   } catch(Exception e) {
    e.printStackTrace();
  }
 }
}
/*
Q: What folder hierarchy will be created on the local drive, when class QOD runs? Assume the path C:/QOD/22_05_19/FileIO doesn't already exist.

A: C:\QOD\22_05_19\FileIO
B: C:\QOD\22_05_19
C: C:\QOD\
D: C:\FileIO\
E: No folder hierarchy will be created.

*/

/*
public class QOD {
 public static void main(String[] args){
  java.util.function.Predicate <Integer> o = p -> p>10; // Line 3
 }
}
/*
Q: Which statement(s) in class QOD result in compiler errors or runtime errors (if any?).

A: Only Line 3
B: Only Line 4
C: Both Line 3 and Line 4
D: There are no compilation errors or runtime errors.

*/

/*
public class QOD {
 public int x = 3;
 public void run() {
  int x = 9;
  Runnable r = new Runnable(){
   public int x = 7;
   public void run(){
    int x = 2;
    System.out.println(this.x);
   }
 };
 r.run();
}
 public static void main(String...args) {
  QOD qod = new QOD();
  qod.run();
 }
}

/*
public class QOD{
 public static void main(String[] args){
  boolean doCheck = new QOD() instanceof Doable;
  System.out.println(doCheck);
 }
 public void doIt(){}
}
 class Doable {
 public void doIt(){}; 
}

/*

import java.time.*;
 public class QOD {
  public static void main(String[] args) {
   LocalDateTime oldDateTime = LocalDateTime.of(2019, Month.APRIL, 25, 10, 00, 00);
   LocalDateTime newDateTime = LocalDateTime.of(2019, Month.APRIL, 25, 11, 00, 00);
   Duration duration = Duration.between(oldDateTime, newDateTime);
   System.out.println(duration.getSeconds() + " seconds");
 }
}

/*
import java.util.Optional;
 public class QOD {
  static Optional<String> getMessage(String input) {
   return input == null ? Optional.empty() : Optional.of("output for " + input);
 }
 public static void main(String[] args) {
  Optional<String> s = Optional.of("Hello");
  System.out.println(s.map(QOD::getMessage));
  System.out.println(s.flatMap(QOD::getMessage));
 }
}
/*
Q: What is the output of class QOD (if any?)

A: output for Hello
B: Optional[Optional[output for Hello]]
C: Optional[output for Hello]
D: The program fails to compile (there is no output).
E: The program compiles but generates a NoSuchElementException.
F: The program compiles but generates a NullPointerException.
G: There is no output.

*/

/*
import java.util.function.Predicate;

 public class QOD {
  public static void main (String[] args){ 
   // String message = new String("Happy Easter");
   //Predicate<String> tester = new String("Happy Easter")::contains;
   Predicate<String> tester = "Happy Easter"::contains;
   System.out.println(tester.test("Happy Eoaster"));
     }
}
/*
Q: What is the output of class QOD (if any?)

A: true
B: false

*/

/*
public class QOD {

 String qRef = "1";

 public static void main(String[] args){
  QOD q = new QOD();
  QOD q2 = new QOD();
  System.out.println(q.equals(q2));
 }
 public boolean equals(QOD q){
  if( ! (q instanceof QOD) ){
   return false;
  }
  return this.qRef.equals(q.qRef);
 }
}
 

/*
Q: What is the output of class QOD (if any?)

A: true
B: false
C: The program fails to compile.
D: The program compiles but generates a runtime exception.

*/

/*
import java.util.stream.Stream;
import java.util.Arrays;

public class QOD {
 public static void main(String[] args) {
  String[] arr1 = new String[]{"Hello", "World"};
  String[] arr2 = new String[]{"Goodbye", "World"};

  Stream<String[]> strings = Stream.of(arr1,arr2);
  //strings.forEach(System.out::println);
  
  Stream<String> allFlat = strings.flatMap(x -> Arrays.stream(x));
  allFlat.forEach(System.out::println);
  //allFlat.forEach(System.out::println);

 }
}



/*
import java.util.stream.Stream;
import java.util.Arrays;

public class QOD {
 public static void main(String[] args) {
  String[] arr1 = new String[]{"Hello", "World"};
  String[] arr2 = new String[]{"Goodbye", "World"};

  Stream<String> strings = Stream.of(arr1[0], arr2[0]);
  strings.forEach(System.out::println);

 }
}
/*
Q: What is the output of class QOD (if any?)

A: Hello
    World
    Goodbye
    World

B: It is impossible to predict the output of the program.

C: World
    Goodbye
    World
    Hello

D: None of these answers are correct.

E: The program fails to compile.

*/

/*
import java.util.Optional;
 public class QOD{
  static String str;
  public static void main(String[] args){
   Optional<String> opt = Optional.ofNullable(str);
   System.out.println(opt.get());
   System.out.println("Hello World");
  }
}

/*
public class QOD 
{
    private static int staticPageNumber = 5;
    private int instancePageNum = 10;
    
    public static void main(String[] args){
      BookReader ms = new BookReader();
      System.out.println(ms.getPage());

      BookWriter ws = new QOD().new BookWriter();
      System.out.println(ws.getPage2());

    }

    private static class BookReader     //line 3
    { 
       //Inner classes are not allowed to contain static methods or static variables. 
       //Only nested static classes are permitted to contain statics.
       public static int x  = 10;  // will compile 

        public int getPage() 
        {
          QOD ms = new QOD();
            //return QOD.staticPageNumber + new QOD().instancePageNum;  // will work also 
            return staticPageNumber + new QOD().instancePageNum;   //
        } 
    } 

    private class BookWriter    
    {  
       //Inner classes are not allowed to contain static methods or static variables. 
       //Only nested static classes are permitted to contain statics.
       //public static int x  = 10;  // will not compile

        public int getPage2() 
        {
            //return QOD.this.staticPageNumber + new QOD().instancePageNum;   //
            return QOD.this.staticPageNumber + instancePageNum;   //line 5

        } 

    } 
}

/*
import java.util.Optional;
 public class QOD {
  static String str;
  public static void main(String[] args){
   Optional<String> opt = Optional.of(str);
   System.out.println(opt.get());
  }
}
/*
Q: What is the output of class QOD (if any?)

A: null
B: ""
C: There is no output.
D: The program compiles but a runtime exception occurs.
E: The program fails to compile.
F: Optional.empty

* An interesting discussion for after you have attempted the question. External Link.
*/


/*
import java.util.Map;
import java.util.HashMap;
public class QOD {
 public static void main(String... args){
  Map<String,String> courses = new HashMap<>();
  courses.put("101","Java Foundations");
  //courses.put("102",);
  courses.put("103","Java Professional");
  courses.compute("101", (k,v) -> v.concat(" Junior Associate"));
  courses.compute("102", (k,v) -> v.concat(" Associate"));
  courses.compute("103", (k,v) -> v.concat(" Developer"));
  System.out.println(courses);
 }
}
/*
Q: The output (if any) for class QOD, will include which of the following Key Value combinations:

Choose all that apply.

A: Key: 101 Value: Java Foundations Junior Associate
B: Key: 102 Value: Associate
C: Key: 103 Value: Java Professional Developer
D: No output is produced as the program fails to compile.
E: No output is produced due to a runtime exception.

*/

/*
import java.util.Map;
import java.util.HashMap;

public class QOD {
 public static void main(String[] args){
  Map<String,Float> payroll = new HashMap<>();
  payroll.put("John",32000F);
  payroll.put("Brenda",null);

  payroll.computeIfAbsent("Bill", k -> 30000F);
  payroll.computeIfAbsent("Brenda", k -> 30000F);
  payroll.computeIfAbsent("John", k -> 30000F);

  payroll.computeIfPresent("Bill", (k,v) -> 40000F);
  payroll.computeIfPresent("Tim", (k,v) -> 40000F);
  payroll.computeIfPresent("Brenda", (k,v) -> 40000F);
  //payroll.computeIfPresent("John", (k,v) -> 40000F);

  System.out.println(payroll);
 }
}
 /*

Q: In the HashMap named payroll, which of the following statements are true?

Choose all that apply.

A: The key "Bill" has a value of 40000 
B: The key "Brenda" has a value of 30000 
C: The key "John" has a value of 30000 
D: The key "Tim" has a value of 40000

*/

 


/*
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
public class QOD {
 public static void main(String[] args){
  List<Integer> ints = Arrays.asList(10,20,30,40);
  Optional<Integer> optSum = ints.stream().reduce((x,y) -> x+y);
  System.out.println(optSum.get());

  int sum = ints.stream().reduce(0,(x,y) -> x+y);
  System.out.println(sum);
 }
}
 

/*
Q: What is the output of class QOD, if any?

A: The program fails to compile (there is no output).

B: 100
    1100

C: 100
     0

D: 100
    100

E: The program compiles but throws a runtime exception.

*/

/*
import java.util.Map;
import java.util.HashMap;
public class QOD {
 public static void main(String[] args){
  Map<String,String> myMap = new HashMap<>();
  myMap.put("Key1","Value1");
  myMap.put("Key2", "Value2");
  myMap.merge("Key1","23",(v1,v2)->v1.concat(v2));
  String str = myMap.merge("Key4","99'er",(v1,v2)->v1.concat(v2));
  System.out.println(myMap);
 }
}
/*
Q: What is the output of class QOD, if any?

A: The program fails to compile (there is no output).
B: {Key2=null, Key1=Value123, Key4=null}
C: {Key2=value2, Key1=Value123, Key4=null}
D: {Key2=Value2, Key1=Value123, Key4=99'er}
E: None of these answers are correct.

*/
/*
public class QOD {
public static void main(String[] args) {
      String str = "Key1";
      for (char c : str.toCharArray()) {
         System.out.printf("\\u%04x \n", (int) c); 
      }
   }
}

/*
import java.util.ResourceBundle;
import java.util.Locale;

public class QOD {
 public static void main(String[] args){
  Locale locale_japan = new Locale("ja","JP");
  ResourceBundle japanBundle = ResourceBundle.getBundle("rb",locale_japan);     
  System.out.println(japanBundle.getObject("hello"));
  System.out.println(japanBundle.getString("goodbye"));
 }
}


/*
import java.text.SimpleDateFormat;
import java.util.Date;
public class QOD {
 public static void main(String... args){
  SimpleDateFormat sdf = new SimpleDateFormat("d-m-y");
  System.out.println(sdf.format(new Date()));
 }
}
/*
Q: Assuming the date is 04/04/2019, and the time is 10:22:20.

What is the output of class QOD (if any?).

A: There is no output, the program fails to compile.
B: The program compiles but throws an IllegalArgumentException at runtime.
C: 4-22-2019
D: 4-20-2019
E: 4-4-2019

Comment: Does SimpleDateFormat in Java 8 support the new Date and Time API?

*/

/*
public class QOD {
 public static void main(String[] args){
  assert(); 
 }

 public static void assert(){
  System.out.println("Assert"); 
 }

}
/*
Q: A programmer is working with a legacy Java source code file (shown above).

Which command line flag to javac can be used to compile the code?
Choose all that apply.

A: javac -enableassertions QOD.java
B: javac -source 1.4 QOD.java
C: javac -version 1.3 QOD.java
D: javac -ea QOD.java
E: javac -source 1.3 QOD.java
*/

/*
import java.time.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Duration;
import java.time.format.*;
import java.time.temporal.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.*;
import java.time.temporal.ChronoField;
import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;
import static java.time.Month.*;
import java.time.*;
import java.util.*;
import java.util.Arrays;

public class QOD {
  public class Inner {}
  public static void main(String[] args){
    QOD.Inner inner1 = new QOD().new Inner(); 
    Inner inner2 = new QOD().new Inner();
    Inner inner3 = new Inner();
   // Line 6
  }
}


/*
Q: How can I instantiate class Inner, on Line 6?

Choose all that apply.

A: Inner inner = new Inner(); 
B: QOD.Inner inner = new QOD().new Inner(); 
C: Inner inner = new QOD().new Inner();
D: Inner inner = QOD().new Inner();
E: None of these options are correct.

*/

/*
interface Vessel { }
interface Toy { }
class Boat implements Vessel { }
class Speedboat extends Boat implements Toy { }
public class QOD {
  public static void main(String[] args) {
    String s = "0";
    Boat b = null;
    Boat b2 = null;
    Speedboat s2 = null;
    if((b instanceof Vessel) | (b2 instanceof Toy)) s += "1";
    if((s2 instanceof Vessel) | (s2 instanceof Toy)) s += "2";
    System.out.println(s);
  }
}
/*
public class QOD {
 public static void main(String args[]){
int numFish = 4;
String fishType = "tuna";
String anotherFish = "" + 3 + 5;
anotherFish = 4 + 5;
System.out.println(anotherFish + " " + fishType);
System.out.println(numFish + " " + 1);
 }
}

/*
public class QOD {
 public static void main(String args[]){
  int x=0;
  for(; x<3; x+=x++ ){
   System.out.println("Hello World! " + x); 
  }
 } 
}


/*
Q: How many times is Hello World! displayed in the console?

A: zero times
B: one time
C: two times
D: three times
E: four times
F: five times 
G: None of these answers are correct.
*/
/*
The answer is;

G: None of these answers are correct.

since it will infinitely print Hello World!. This is because we are 
reassigning the same value back to x, in this case it's zero, so that 
the for condition will always be true.

Also, x += x++ = x + x++ is actually similar to x = x++.

Both cases will reassign the same value back to x when x = 0, but If x > 0, 
where x = 1, then x += x++ will cause x to be updated and the program stops 
after two Hello World! prints.
*/
/*
public class QOD {
  public static void main(String[] args) {
    Days d1 = Days.TH;
    Days d2 = Days.M;
    for(Days d: Days.values()) {
      if(d.equals(Days.F)) break;
      d2 = d;
    }
    System.out.println((d1 == d2)?"same old" : "newly new");
    System.out.println(d1.equals(d2)?"same old2" : "newly new2");

    System.out.println(d1);
    System.out.println(d2);
  }
  enum Days {M, T, W, TH, F, SA, SU};
}


/*
public class QOD {
  public static void main(String[] args) {
    int x = 12;
    int a = 5; int b = 7;
    System.out.println(" " + x/a + " " + x/b); //2 1
    System.out.println(" " + x%a + " " + x%b); //2 5
    System.out.println(" " + x*a + " " + x*b); //60 84
    System.out.println(x + a + " " + x + b); //17 127
    //System.out.println(x - a + " " + x - b);// will not compile
    System.out.println(" " + (x - a) + " " + (x - b)); //7 5
    //System.out.println([x + a] + " " + [x + b]); // will not compile
  }
}

/*
interface Vessel { }
interface Toy { }
class Boat implements Vessel { }
class Speedboat extends Boat implements Toy { }
public class QOD {
  public static void main(String[] args) {

    String sa = "0";
    Boat bs = new Boat();
    Boat bs2 = new Speedboat();
    Speedboat sd2 = new Speedboat();
    if((bs instanceof Vessel) | (bs2 instanceof Toy)) sa += "1";
    if((sd2 instanceof Vessel) | (sd2 instanceof Toy)) sa += "2";
    System.out.println(sa);

    String s = "0";
    Boat b = null;
    Boat b2 = null;
    Speedboat s2 = null;
    if((b instanceof Vessel) | (b2 instanceof Toy)) s += "1";
    if((s2 instanceof Vessel) | (s2 instanceof Toy)) s += "2";
    System.out.println(s);
  }
}*/

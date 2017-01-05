import java.util.Scanner;

class Ses3Assignment2
{
  public static void main(String ss[])
  {
    boolTest bl = new boolTest();
	bl.stringTest();
  }
  
}


class boolTest 
{
boolean bool;
String s1,s2,s3,s4;
  boolTest()
  {
	  s1="Shabbir";
	  s2="Akhter";
	  s3="abcd";
	  s4="abcd";
  }
 void stringTest()
 {  
  if(s1!=s2)
  {
  bool=false;
  System.out.println(s1+ " and "+s2+" both values are not same : "+bool);
  }
  if(s3==s4)
  {
  bool=true;
  System.out.println(s3+ " and "+s4+" both values are same : "+bool);
  }
}
}

/*
class boolTest 
{
boolean bool;
String S1,S2;
Scanner sc;
 void stringTest()
 {
  sc = new Scanner(System.in);
  System.out.print("Enter value for String S1: ");
  S1=sc.next();
  System.out.println();
  System.out.print("Enter value for String S2: ");
  S1=sc.next();
  if(S1==S2))
  {
  bool=true;
  System.out.println("Entered values are same : "+bool);
  }
  else
  {
  bool=false;
  System.out.println("Entered values are not same : "+bool);
  }
}
}

*/

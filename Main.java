import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Main
{
  public static void main(String [] args)
  {
 ArrayList<Double> a = new ArrayList();
a.add(12.4);
a.add(23.5);
a.add(4.56);
a.add(236.67);
ArrayList<String> b = new ArrayList();
b.add("at");
b.add("the");
b.add("to");
String s="happy birthday"; 
 char p = 'h';


//Quick way to make a copy of an arraylist
ArrayList<Integer> c = new ArrayList();
for(int i =0; i < c.size(); i ++)
{
  c.add(c.get(i));
}

System.out.println(b);
removeEvenLength(b);
System.out.println(b);
  }
public static double findLargest(ArrayList<Double>  a)
{
  Collections.sort(a);
  Collections.reverse(a);
  return a.get(0);
}
//Search an ArrayList of Doubles and return the largest number found in the ArrayList.



public static int indexOfLargest(ArrayList<Double>  a)
{
  
 double biggestNumber =Collections.max(a);
  int numberSpot = a.indexOf(biggestNumber);
  return numberSpot;
}

//Search an ArrayList of Doubles and return the index of the largest element found in the ArrayList.



public static int indexOfInt(ArrayList<Integer>  a, int target)
{
  int index = a.indexOf(target);
  return index;
}




public static void removeEvenLength(ArrayList<String> b)
{
  //Look at each string
  Iterator<String> iter = b.iterator();

  while(iter.hasNext())
  {
    String str = iter.next();
    //remove the even ones
    if(str.length() % 2 == 0)
    {
      iter.remove();
    }
   }

  
}

public static boolean hasSameElements(ArrayList<Integer> a, ArrayList<Integer> b)
{
  Collections.sort(a);
  Collections.sort(b);
  
  for(int i = 0; i < a.size(); i++)
  {
    if(a.get(i) != b.get(i))
    {
      return false; 
    }
  }
  return true; 
}

public static void removeDuplicates(ArrayList<Integer>  a)
{
//Could also do: while(i < a.size()) or a for loop
//for (int i = a.size() -1; i >=0; i--)
int i = 0;
while(i < a.size() - 1) //loop only runs if 2 or more things in list
{
  if(a.get(i) == a.get(i + 1))
  {
    a.remove(i + 1);
    //Stay where you are since i + 1 is now a NEW element
  }
  else 
  {
    i++;
  }
}
}

public static void swapPairs(ArrayList<String>  a)
{
    int number = 1;
    int listposition = 0;
    for (int i = 0; i <a.size(); i++)
    {
      if(number == 1)
      {
        number = 2;
      }
      else
      {
        listposition = i - 1;
        Collections.swap(a, listposition,i);
        number =1;
      }
    }  

}

//Replace all occurances of character c with * in the string 
//For example , if s="happy birthday" and c = 'h'
//would return "*appy birt*day"
public static String censor(String s, char p)
{
  //Option 1
 //return s.replace( p,'*');

 //Option 2
 String str = "";
 for(int i = 0; i < s.length(); i++)
 {
   if(s.charAt(i) == p)
   {
     str = str + "*";
   }
   else
   {
     str = str + s.charAt(i);
   }
 }
 return str;
}

public static void doubleList(ArrayList<String> a)
{
  for(int i = 0; i< a.size(); i++)
  {
    String duplicate = a.get(i);
    a.add(i+1, duplicate);
  }
}

public static void removeShorterStrings(ArrayList<String>  a)
{
  for (int i = 0; i < a.size() / 2; i++)
  {
    int String1 = a.get(i).length();
    int String2 = a.get(i+1).length();

    if(String1 > String2)
    {
      a.remove(i + 1);
    } 
    else if (String1 < String2)
    {
      a.remove(i);
    }
    else if(String1 == String2)
    {
      a.remove(i);
    }
  }
}

}
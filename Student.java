public class Student
{
  static int total_marks = 500;
  public int m1;
  public int m2;
  public int m3;
  public int m4;
  public int m5;
  private String name;
  private String father_name;
  private String department;
  private String degree;
  private String enrollment;
  private int seat;
  
  public void setname(String name)
  {
    this.name = name;
  }
  public void setfathername(String father_name)
  {
    this.father_name = father_name;
  }
  public void setdepartment(String department)
  {
    this.department = department;
  }
  public void setdegree(String degree)
  {
    this.degree = degree;
  }
  public void setenrollment(String enrollment)
  {
    this.enrollment = enrollment;
  }
  public void setseat(int seat)
  {
    this.seat = seat;
  }
  public String getname()
  {
    return name;
  }
  public String getfathername()
  {
    return father_name;
  }
  public String getdepartment()
  {
    return department;
  }
  public String getdegree()
  {
    return degree;
  }
  public String getenrollment()
  {
    return enrollment;
  }
  public int getseat()
  {
    return seat;
  }
  public void getinfo()  
  {
    System.out.println("Result card");
    System.out.println("Name : " + getname());
    System.out.println("Degree : " + getdegree());
    System.out.println("Enrollment : " + getenrollment());
    System.out.println("Seat number : " + getseat());
    System.out.println("Department : " + getdepartment());
  }
  public void setmarks(int m1, int m2, int m3, int m4, int m5)
  {
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
    this.m4 = m4;
    this.m5 = m5;
  }
  public int getmarks()
  {
   return (m1 + m2 + m3 + m4 + m5);
  }
  public void printmarks()
  {
    System.out.println("Marks obtained : " + this.getmarks());
  }
 
  public float getpercentage()
  {
    float percentage = this.getmarks() * 100 / total_marks;
    return percentage;
  }
 public void printpercentage()
 {
   System.out.println("Percentage obtained : " + this.getpercentage() + "%");
 }
 public char getgrade()
 {
   int val = (int)this.getpercentage();
   char grade; 
   switch(val/10)
   {
     case 9:
       grade = 'A';
       break;
     case 8:
       grade = 'B';
       break;
     case 7:
       grade = 'C';
       break;
     case 6:
       grade = 'D';
       break;
     default:
       grade = 'F';
       break;
   }
   return grade;
   }
  public void printgrade()
  {
    System.out.println("Grade : " + this.getgrade());
  }
  public void printinfo()
  {
    this.getinfo();
    System.out.println("Marks" + "\n" + this.m1 + "\n" + this.m2 + "\n" + this.m3 + "\n" + this.m4 + "\n" +this.m5);
    this.printmarks();
    this.printpercentage();
    this.printgrade();
  }
       
   }

    
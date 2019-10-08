import java.util.Scanner;
class Triangle
{
  double s1;
  double s2;
  double hyp;
  Scanner takeinp = new Scanner(System.in);
  double setHyp(double s1, double s2)
  {
    this.s1 = Math.pow(s1, 2);
    this.s2 = Math.pow(s2, 2);
    hyp = Math.sqrt(this.s1 + this.s2);
    this.hyp = hyp;
    return this.hyp;
  }
  double getHyp()
  {
    return (this.setHyp(s1,s2));
  }
  void setS1()
  {
    System.out.println("Enter lenght of side 1 : ");
    s1 = takeinp.nextDouble();
    this.s1 = s1;
  }
  void setS2()
  {
    System.out.println("Enter lenght of side 2 : ");
    s2 = takeinp.nextDouble();
    this.s2 = s2;
  }
  double getS1(double s1)
  {
    return this.s1;
  }
  double getS2(double s2)
  {
    return this.s2;
  }
}
  
    
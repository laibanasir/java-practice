class Employee
{
  String f_name;
  String l_name;
  double m_salary;
  double r_salary;
  double y_salary;
  Employee(String f_name, String l_name, double m_salary)
  {
    this.f_name = f_name;
    this.l_name = l_name;
    this.m_salary = m_salary;
  }
  void setF_name()
  {
    this.f_name = f_name;
  }
  void setL_name()
  {
    this.l_name = l_name;
  }
  void setM_salary()
  {
    if (m_salary > 1)
      this.m_salary = m_salary;
  }
  String getF_name()
  {
    return this.f_name;
  }
  String getL_name()
  {
    return this.l_name;
  }  
  double getM_salary()
  {
    return this.m_salary;
  }  
  double getY_salary()
  {
    y_salary = this.m_salary * 12;
    this.y_salary = y_salary;
    return this.y_salary;
  }
  double getRaised_salary()
  {
    r_salary = this.getY_salary() / 100 * 10;
    this.r_salary = r_salary;
    return this.r_salary;
  }
  void printAll()
  {
    System.out.println("Monthly salary : " + getM_salary());
    System.out.println("Yearly salary : " + getY_salary());
    System.out.println("Raised salary : " + getRaised_salary());
  }
}
  
  
  
  
  
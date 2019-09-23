public class Bicycle
{
  static int numberofbicycles;
  int gear;
  int speed;
  String color;
  int id;
  Bicycle(int gear, int speed, int id, String color)
  {
    numberofbicycles += 1;
    this.gear = gear;
    this.id = id;
    this.speed = speed;
    this.color = color;
  }
  public int SpeedUp(int x)
  {
    return(this.speed += x);
  }
  public int BreakApplied(int y)
  {
    return(this.speed -= y);
  }
  public int CarStopped()
  {
    return(this.speed = 0);
  }
}
  
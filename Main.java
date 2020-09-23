class Main {
  public static void main(String[] args) {
    int myAge = 16;
    int myBirthday = 1015;
    int todayDate = 923;
    if (myBirthday >= todayDate)
    {
      System.out.println("Your Birthday has not happen yet");
      System.out.println("Your age is " + myAge);
    }else{
      myAge ++;
      System.out.println("Your Brithday has happened");
      System.out.println("Your age is " + myAge);
    }
  }
}
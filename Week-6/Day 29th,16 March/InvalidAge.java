class InvalidAgeException extends Exception{
  InvalidAgeException(String str){
    super(str);
  }
}

class VoteEligibility{
  static void validAge(int age) throws InvalidAgeException{
  if(age<18){
   throw new InvalidAgeException("Invalid age");
  }
    else{
      System.out.println("Age eligiable");
        
    }
  }
}

class InvalidAge{
  public static void main(String args[]){
    try{
      VoteEligibility.validAge(10);
    }
    catch(InvalidAgeException e){
      System.out.println(e);
    }
  }
}
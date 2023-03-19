class InvalidMobileNumberException extends Exception{
  InvalidMobileNumberException(String str){
    super(str);
  }
}

class CheckMobileNumber{
  void validMobileNumber(String number) throws InvalidMobileNumberException{
    if(number.length()==10){
      System.out.println("valid moblie number");
    }
    else{
      throw new InvalidMobileNumberException("Invalid Mobile Number");
    }
  }
}

class MobileNumber{
  public static void main(String args[]){
    CheckMobileNumber num=new CheckMobileNumber();
    try{
      num.validMobileNumber("98765");
    }
    catch(InvalidMobileNumberException e){
      System.out.println(e);
    }
  }
}
class RunThread extends Thread{
  public void run(){
    System.out.println("running the Thread");
  }
}
class ThreadClass{
  public static void main(String args[]){
    RunThread t1=new RunThread();
    t1.start();
  }
}
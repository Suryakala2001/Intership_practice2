class RunThread implements Runnable{
  public void run(){
    System.out.println("running the Thread");
  }
}
class ThreadInterface{
  public static void main(String args[]){
    RunThread t1=new RunThread();
    Thread th=new Thread(t1);
    th.start();
  }
}
class Song{
  public void play(){
    System.out.println("playing song audio");
  }
}
class PopSong extends Song{
  public void play(){
    super.play();
    System.out.println("playing the audio with a catchy beat and chorus ");
  }
}
class JazzSong extends Song{
  public void play(){
    System.out.println("playing the audio with a smooth melody and improvisation ");
  }
}
class OverridingTask4{
  public static void main(String args[]){
    PopSong p=new PopSong();
    JazzSong j=new JazzSong();
    p.play();
    j.play();
  }
}
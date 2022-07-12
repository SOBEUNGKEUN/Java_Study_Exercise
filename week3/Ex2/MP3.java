public class MP3 implements Playable{

    public String title;

    public MP3(String mp3Title){
        title = mp3Title;
    }
    @Override
    public void play() {
        System.out.println("MP3:playing "+title);
    }
}

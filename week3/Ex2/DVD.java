public class DVD implements Playable{

    public String title;

    public DVD(String dvdTitle){
        title = dvdTitle;
    }
    @Override
    public void play() {
        System.out.println("DVD:playing "+title);
    }
}

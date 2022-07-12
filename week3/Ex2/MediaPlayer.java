import java.util.Scanner;

public class MediaPlayer {
    Playable[] items;
    final private int MAX_ITEMS = 30;
    int numItems;

    public MediaPlayer(){
        Scanner input = new Scanner(System.in);
        items = new Playable[MAX_ITEMS]; // 배열크기 설정
        System.out.print("Number of items : ");
        numItems = input.nextInt();

        for (int i=0; i< numItems; i++){
            System.out.print("1:DVD, 2:CD, 3:MP3 ------->");
            int choice = input.nextInt();

            input.nextLine(); //nextLine 메소드 특성 : enter값 초기화해주는 과정
            System.out.println();
            System.out.print("Title : ");
            String title = input.nextLine();

            switch (choice)
            {
                case 1 : items[i] = new DVD(title);
                break;
                case 2 : items[i] = new CD(title);
                break;
                case 3 : items[i] = new MP3(title);
                break;
            }

        }
        System.out.println("ALL iitems loaded\n");
    }

    public void playAll()
    {
        for (int i =0; i< numItems; i++)
            items[i].play();
    }

    public static void main(String[] args){
        MediaPlayer player = new MediaPlayer();
        player.playAll();
    }
}

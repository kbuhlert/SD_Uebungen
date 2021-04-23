package Command_TV_2_Training;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Fernbedienung fb = new Fernbedienung();
        TV tv = new TV();

        CommandChanelUp up = new CommandChanelUp(tv);
        CommandChanelDown down = new CommandChanelDown(tv);

        fb.setCommand(1,up);
        fb.setCommand(2,down);

        /*fb.execute();
        fb.execute();
        fb.execute();
        fb.execute();
        fb.zurueck();
        fb.zurueck();*/

        //Scanner implementieren

        Scanner scanner = new Scanner(System.in);
        while (true){
            String eingabe = scanner.next();
            if (eingabe.equals("x")){
                break;
            }
            try {
                if (eingabe.equals("undo")){
                    fb.zurueck();
                }
                else {
                    Integer position = Integer.parseInt(eingabe);
                    fb.execute(position);
                }
            }catch (NumberFormatException ex){
                System.out.println("Eingabe inkorrekt");
            }
        }

    }
}

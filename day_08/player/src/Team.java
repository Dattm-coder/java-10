import java.util.ArrayList;
import java.util.Random;

public class Team {
    public ArrayList<Player> getAllPlayer(){
        ArrayList<Player> allPlayers = new ArrayList<>();
        allPlayers.add(new Player(1,"Nguyễn Văn Toản",Position.GK));
        allPlayers.add(new Player(2,"Nguyễn Văn Lâm",Position.GK));
        allPlayers.add(new Player(3,"Nguyễn Văn Toàn",Position.DF));
        allPlayers.add(new Player(4,"Trần Văn Hậu",Position.DF));
        allPlayers.add(new Player(5,"Nguyễn Văn Lâm",Position.DF));
        allPlayers.add(new Player(6,"Nguyễn Văn Toàn",Position.DF));
        allPlayers.add(new Player(7,"Trần Văn Hậu",Position.DF));
        allPlayers.add(new Player(8,"Nguyễn Văn Lâm",Position.MF));
        allPlayers.add(new Player(9,"Nguyễn Văn Toản",Position.MF));
        allPlayers.add(new Player(10,"Trần Văn Hậu",Position.MF));
        allPlayers.add(new Player(11,"Nguyễn Văn Lai",Position.MF));
        allPlayers.add(new Player(12,"Nguyễn Văn Toản",Position.MF));
        allPlayers.add(new Player(13,"Nguyễn Văn Lâm",Position.MF));
        allPlayers.add(new Player(14,"Nguyễn Văn Toản",Position.MF));
        allPlayers.add(new Player(15,"Nguyễn Văn Lai",Position.FW));
        allPlayers.add(new Player(16,"Nguyễn Văn Toản",Position.FW));
        allPlayers.add(new Player(17,"Nguyễn Văn Lâm",Position.FW));
        allPlayers.add(new Player(18,"Nguyễn Văn Toản",Position.FW));
        allPlayers.add(new Player(19,"Nguyễn Văn Lai",Position.FW));
        allPlayers.add(new Player(20,"Nguyễn Văn Toản",Position.FW));

        return allPlayers;
    }

    public void show(ArrayList<Player> list){
        for(Player p: list){
            System.out.println(p.getNumber() + " - " + p.getFullName() + " - " + p.getPosition());
        }
    }

    public ArrayList<Player> buildTeam(ArrayList<Player> allPlayers, int df, int mf, int fw){
        ArrayList<Player> choiceTeam = new ArrayList<>();
        Random rd = new Random();
        int gkSize = 0;
        int dfSize = 0;

        //Chọn GK
        while (gkSize < 1){
            int rdGoadKeeper = rd.nextInt(20);
            //System.out.println(allPlayers.get(rdGoadKeeper).getNumber());
            if(allPlayers.get(rdGoadKeeper).getPosition()==Position.GK){
                choiceTeam.add(allPlayers.get(rdGoadKeeper));
                gkSize++;
            }
        }

        while (dfSize<df){
            int dfRandom = rd.nextInt(20);
            if(allPlayers.get(dfRandom).getPosition()==Position.DF){
                if(!choiceTeam.contains(allPlayers.get(dfRandom))){
                    choiceTeam.add(allPlayers.get(dfRandom));
                    dfSize++;
                }
            }
        }

        return choiceTeam;

    }
}

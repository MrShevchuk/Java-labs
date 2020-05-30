package lab19;


import java.util.ArrayList;
import java.util.List;

public class PlayRoom {



    public static void main(String[] args) {


        List <Game.GameDisk> diskArrayList = new ArrayList <Game.GameDisk> ();
        diskArrayList.add(Game.getDisk("PES 20",Genre.SPORT, "PES 2020 is a football simulation video game developed by PES Productions and published by Konami"));
        diskArrayList.add(Game.getDisk("Grand Theft Auto V", Genre.ACTION, "Grand Theft Auto V is an action-adventure game played from either a third-person or first-person perspective. Players complete missions — linear scenarios with set objectives — to progress through the story. Outside of the missions, players may freely roam the open world."));
        diskArrayList.add(Game.getDisk("Dirt Rally 2.0", Genre.RACE, "Dirt Rally 2.0 is focused on rallying and rallycross. Players compete in timed stage events on tarmac and off-road terrain in varying weather conditions. The game features stages in Argentina, Australia, New Zealand, Poland, Spain and the United States."));
        diskArrayList.add(Game.getDisk("Assassin's Creed Odyssey", Genre.RPG, "Assassin's Creed Odyssey is an action role-playing video game. Set in the years 431-422 BCE, the plot tells a mythological history of the Peloponnesian War between Athens and Sparta. Players control a male or female mercenary (Ancient Greek: μίσθιος misthios) who fights for both sides as they attempt to unite their family."));


        List<Game.VirtualGame> virtualGameArrayList = new ArrayList <Game.VirtualGame> ();
        virtualGameArrayList.add(Game.getVirtualGame("Forza horizon 4", Genre.RACE));
        virtualGameArrayList.add(Game.getVirtualGame("Red Dead Redemption 2", Genre.RPG));
        virtualGameArrayList.add(Game.getVirtualGame("Uncharted 4", Genre.ACTION));
        virtualGameArrayList.add(Game.getVirtualGame("NHL 20", Genre.SPORT));

        GameConsole gameConsole = new GameConsole(Brand.MICROSOFT, "XC123QeWR");


        for (Game.GameDisk disk : diskArrayList) {
            System.out.println(disk.getData());

            for (Game.VirtualGame vr : virtualGameArrayList) {
                System.out.println(vr.getRating());
            }
        }

    }

}

import java.util.*;
public class RankHR {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> ranked=new ArrayList<>();
        ArrayList<Integer> player=new ArrayList<>();
        ArrayList<Integer> playerRank=new ArrayList<>();

        ranked.add(100);
        ranked.add(100);
        ranked.add(50);
        ranked.add(40);
        ranked.add(40);
        ranked.add(20);
        ranked.add(10);

        player.add(5);
        player.add(25);
        player.add(50);
        player.add(120);

        arr.add(ranked.get(0));
        for(int i=1;i<ranked.size();i++)
        {
            if(ranked.get(i)!=ranked.get(i-1))
            {
                arr.add(ranked.get(i));
            } 
        }
        // for(int i=0;i<arr.size();i++)
        // {
        //     System.out.println(arr.get(i));
        // }
        for(int i=0;i<player.size();i++)
        {
            int rank=1;
            boolean set=false;
            for(int j=0;j<arr.size();j++)
            {
                if(player.get(i)>=arr.get(j))
                {
                    playerRank.add(rank);
                    set=true;
                    j=arr.size();
                }
                rank++;
            }
            if(set==false)
            {
                playerRank.add(rank);
            }
        }
        // System.out.println(playerRank.size());

        for(int i=0;i<playerRank.size();i++)
        {
            System.out.println(playerRank.get(i));
        }
    }
}

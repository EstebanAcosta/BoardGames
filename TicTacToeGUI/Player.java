package TicTacToeGUI;

public class Player
{
    private String name;

    private int playerId;
    
    private String XorO;


    public Player(int id)
    {
        setPlayerId(id);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPlayerId()
    {
        return playerId;
    }

    public void setPlayerId(int playerId)
    {
        this.playerId = playerId;
    }

    public String getXorO()
    {
        return XorO;
    }

    public void setXorO(String xorO)
    {
        XorO = xorO;
    }

}

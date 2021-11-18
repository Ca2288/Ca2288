
 class Die {
    private final static int LOWEST_DIE_VALUE = 0;
    private final static int HIGHEST_DIE_VALUE = 6;

    private String die;

     public  Die()
    {
        String[] dieFaces = {"+-------+\r\n|        |\r\n|   o   |\r\n|       |\r\n+-------+", 
                             "+-------+\r\n| o     |\r\n|       |\r\n|     o |\r\n+-------+",
                             "+-------+\r\n| o     |\r\n|   o   |\r\n|     o |\r\n+-------+",
                             "+-------+\r\n| o   o |\r\n|       |\r\n| o   o |\r\n+-------+",
                             "+-------+\r\n| o   o |\r\n|   o   |\r\n| o   o |\r\n+-------+",
                             "+-------+\r\n| o   o |\r\n| o   o |\r\n| o   o |\r\n+-------+"};

        die = dieFaces[((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE)];        
    }

    public String getDie()
    {
        return die;
    }
}

public class FiveDice
{
    public static void main(String[] args)
    {
        Die die1 = new Die();
        System.out.println(die1.getDie());
    }
}


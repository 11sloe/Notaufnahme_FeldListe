public class Warteliste
{
    private Patient[] liste;
    private int maxAnzahl = 5;
    private int anzahl = 0;

    public Warteliste()
    {
        liste = new Patient[maxAnzahl];
    }


    public void einfuegen(Patient pat)
    {
        if (anzahl < maxAnzahl)
        {
            liste[anzahl] = pat;
            anzahl++;
        }
    }

    public Patient aufrufen()
    {
        if (anzahl > 0)
        {
            Patient pat = liste[0];
            for (int i = 0; i < anzahl-1; i++)
            {
                liste[i] = liste[i+1];
            }
            liste[anzahl-1] = null;
            anzahl--;
            return pat;
        }
        else 
        {
            return null;
        }
    }


    public boolean istVoll()
    {
        if (maxAnzahl == anzahl)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean istLeer()
    {
        if (anzahl == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void ausgeben()
     {
         System.out.println("Alle Patienten in der Warteliste");
         for (int i = 0; i < anzahl; i++)
         {
             System.out.println(liste[i].getName());
         }
         
     }
     

}

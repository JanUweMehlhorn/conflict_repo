public class Konflikt_Loesungs_Klasse
{
    private int anzahlKonflikte;
    private boolean Loesbarkeit;
    private int anzahlAenderungen;
    private int geloesteKonflikte;
    private int alterKonflikt;
    public Konflikt_Loesungs_Klasse()
    {
        anzahlKonflikte = 10;
        Loesbarkeit = true;
        anzahlAenderungen = 10;
        geloesteKonflikte = 10;
    }
    public Konflikt_Loesungs_Klasse(int neuAnzahlKonflikte)
    {
        anzahlKonflikte = neuAnzahlKonflikte;
        Loesbarkeit = true;
        anzahlAenderungen = 10;
        geloesteKonflikte = 10;
        alterKonflikt = 2000;
    }
}
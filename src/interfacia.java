import javax.swing.*;

public class interfacia {

    private JPanel panel1;
    private JTextField comune;
    private JTextField descrizione;
    private JTextField tipologia;
    private JTextField viapiazza;
    private JTextField indirizzo;
    private JTextField numerocivico;
    private JTextField provincia;
    private JTextField piano;
    private JTextField zona;
    private JTextField annocostruzione;
    private JTextField utilizzo;
    private JTextField superficie;
    private JTextField quotaproprieta;
    private JTextField accessori;
    private JTextField valoredimercato;
    private JTextField tassecomunali;
    private JTextField cap;
    private JTextField proprietario;
    private JButton salvaButton;
    private JLabel sdescrizione;
    private JLabel stipologia;
    private JLabel sviapiazza;
    private JLabel sindirizzo;
    private JLabel snumerocivico;
    private JLabel scomune;
    private JLabel sprovincia;
    private JLabel spiano;
    private JLabel szona;
    private JLabel sannocostruzione;
    private JLabel sutilizzo;
    private JLabel ssuperficie;
    private JLabel squotaproprieta;
    private JLabel saccessori;
    private JLabel svaloredimercato;
    private JLabel stassecomunali;
    private JLabel scap;
    private JLabel sproprietario;
    protected String setdescrizione;
    protected String settipologia;
    protected String setviapiazza;
    protected String setindirizzo;
    protected String setnumerocivico;
    protected String setcomune;
    protected String setprovincia;
    protected String setpiano;
    protected String setquotaproprieta;
    protected String setaccessori;
    protected String setvaloredimercato;
    protected String settassecomunali;
    protected String setcap;
    protected String setproprietario;
    protected String setzona;


    public interfacia()
    {salvaButton.addActionListener(actionEvent ->
    {
        setdescrizione=descrizione.getText();
        sdescrizione.setText(setdescrizione);
        descrizione.setText("");

        settipologia=tipologia.getText();
        stipologia.setText(settipologia);
        tipologia.setText("");
        setviapiazza=viapiazza.getText();
        sviapiazza.setText(setviapiazza);
        viapiazza.setText("");

        setindirizzo=indirizzo.getText();
        sindirizzo.setText(setindirizzo);
        indirizzo.setText("");

        setnumerocivico=numerocivico.getText();
        snumerocivico.setText(setnumerocivico);
        numerocivico.setText("");

        setcomune=comune.getText();
        scomune.setText(setcomune);
        comune.setText("");

        setprovincia=provincia.getText();
        sprovincia.setText(setprovincia);
        provincia.setText("");

        setpiano=piano.getText();
        spiano.setText(setpiano);
        piano.setText("");

        setpiano=piano.getText();
        spiano.setText(setpiano);
        piano.setText("");

        setprovincia=provincia.getText();
        sprovincia.setText(setprovincia);
        provincia.setText("");

        setpiano=piano.getText();
        spiano.setText(setpiano);
        piano.setText("");

        setquotaproprieta=quotaproprieta.getText();
        squotaproprieta.setText(setquotaproprieta);
        quotaproprieta.setText("");

        setaccessori=accessori.getText();
        saccessori.setText(setaccessori);
        accessori.setText("");

        setvaloredimercato=valoredimercato.getText();
        svaloredimercato.setText(setvaloredimercato);
        valoredimercato.setText("");

        settassecomunali=tassecomunali.getText();
        stassecomunali.setText(settassecomunali);
        tassecomunali.setText("");

        setcap=cap.getText();
        scap.setText(setcap);
        cap.setText("");

        setproprietario=proprietario.getText();
        sdescrizione.setText(setproprietario);
        proprietario.setText("");

        setzona=zona.getText();
        szona.setText(setzona);
        zona.setText("");

        setannocostruzione=annocostruzione.getText();
        sannocostruzione.setText(setannocostruzione);
        annocostruzione.setText("");

        setannocostruzione=annocostruzione.getText();
        sannocostruzione.setText(setannocostruzione);
        annocostruzione.setText("");
    });

}

public static void main(String[] args)
    {
        JFrame frame = new JFrame("Immobile");
        frame.setContentPane(new interfacia().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

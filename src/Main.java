import javax.swing.*;

public class Main extends JFrame {
    JLabel judul = new JLabel("Judul");
    JLabel tipe = new JLabel("Judul");
    JLabel status = new JLabel("Judul");
    JLabel episode = new JLabel("Judul");
    JLabel genre = new JLabel("Judul");
    JLabel rating  = new JLabel("Judul");
    JLabel search = new JLabel("Judul");
    JTextField judulTF = new JTextField();
    JTextField tipelTF = new JTextField();
    JTextField episodeTF = new JTextField();
    JTextField genreTF = new JTextField();
    JTextField ratingTF = new JTextField();
    JTextField searchTF = new JTextField();
    JButton btnRefresh = new JButton();
    JButton btnInsert = new JButton();
    JButton btnUpdate = new JButton();
    JButton btnDelete = new JButton();
    JButton btnExit = new JButton();
    public Main() {
        String [] columnName = new String[] {
                "#", "ID", "judul", "Tipe", "Episode", "Genre", "Status", "Rating"

        };
        Object[][] data = {
                {"1", "123", "naga bonar", "serial", "123", "Action", "End", "4"}
        };
        String[] statusString = new String[]{
          "Selesai", "Belum"
        };
        JComboBox statusList = new JComboBox(statusString);
        JTable table = new JTable(data, columnName);
        JScrollPane scrollPane = new JScrollPane(table);
        add(new JScrollPane(table));
        add(btnDelete);
        add(btnExit);
        add(btnInsert);
        add(btnRefresh);
        add(btnUpdate);
        add(judul);
        add(judulTF);
        add(status);
        add(tipe);
        add(tipelTF);
        add(episode);
        add(episodeTF);
        add(genre);
        add(rating);
        add(search);
        add(genreTF);
        add(ratingTF);
        add(searchTF);

        setTitle("Table Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);



    }


}

package sda.zadanie18_indeksy_gieldowe;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.stream.IntStream;

public class HistoryWindow extends JFrame {
    private String stockIndex;

    public HistoryWindow(String stockIndex) throws HeadlessException {
        this.stockIndex = stockIndex;
        setVisible(true);
        setTitle("Historia notowania indeksu giełdowego " + stockIndex);
        setSize(500, 250);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        createIndexHistoryTable();
    }

    private void createIndexHistoryTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Data");
        model.addColumn("Kurs");
        JTable indexHistoryTable = new JTable(model);
        indexHistoryTable.setEnabled(false);
        JScrollPane scrollPane = new JScrollPane(indexHistoryTable);
        scrollPane.setPreferredSize(new Dimension(400,183));
        add(scrollPane, BorderLayout.CENTER);
        LocalDate localDate = LocalDate.now();
        String indexValue;
        for (int i = 1; i <= 10; i++) {
            indexValue = getIndexValueForDate(localDate.toString().replace("-", ""));
            model.addRow(new Object[]{localDate.toString(), indexValue});
            localDate = localDate.minusDays(1);
        }
    }

    private String getIndexValueForDate(String date) {
        if (!stockIndex.isEmpty()) {
            StringBuilder indexURL = new StringBuilder();
            indexURL.append("https://stooq.pl/q/?s=^");
            indexURL.append(stockIndex.toLowerCase());
            indexURL.append("&d=");
            indexURL.append(date);
            try {
                Document doc = Jsoup.connect(indexURL.toString()).get();
                String textFromURL = doc.body().text();
                String[] textsFromURL = textFromURL.split(" ");
                int index = IntStream.range(0, textsFromURL.length - 1)
                        .filter(i -> textsFromURL[i].equals("Kurs")).findAny().getAsInt();
                return textsFromURL[index + 1].equals("Data") ? "N/A" : textsFromURL[index + 1];
            } catch (IOException e) {
                return "N/A";
            }
        }
        return "N/A";
    }
}
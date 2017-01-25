package sda.zadanie20_indeksy_gieldowe;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StockIndexesWindow extends JFrame {
    private JTextField stockIndexTextField;
    private JTextArea stockIndexValueTextArea;
    private JComboBox stockIndexNameComboBox;

    private StockIndexesWindow() throws HeadlessException {
        setVisible(true);
        setTitle("Notowania indeksów giełdowych. Źrodło: Stooq");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        stockIndexTextField = new JTextField();
        stockIndexTextField.setPreferredSize(new Dimension(200, 30));
        add(stockIndexTextField);

        JButton getButton = new JButton("Get");
        add(getButton);

        stockIndexValueTextArea = new JTextArea();
        stockIndexValueTextArea.setPreferredSize(new Dimension(200, 30));
        add(stockIndexValueTextArea);

        stockIndexNameComboBox = new JComboBox();
        stockIndexNameComboBox.setPreferredSize(new Dimension(200, 30));
        add(stockIndexNameComboBox);
        setStockIndexes();

        JButton getHistoryButton = new JButton("Get History");
        add(getHistoryButton);

        createStockIndexesTable();

        getHistoryButton.addActionListener(e ->
                new HistoryWindow(stockIndexNameComboBox.getSelectedItem().toString()));

        stockIndexNameComboBox.addActionListener(e -> {
            JComboBox cb = (JComboBox) e.getSource();
            String stockIndex = (String) cb.getSelectedItem();
            setStockIndexTextArea(stockIndex);
        });

        getButton.addActionListener(e -> {
            String stockIndex = stockIndexTextField.getText();
            setStockIndexTextArea(stockIndex);
        });
        invalidate();
        validate();
        repaint();
    }

    private void createStockIndexesTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Symbol");
        model.addColumn("Nazwa");
        model.addColumn("Kurs");
        JTable stockIndexesTable = new JTable(model);
        stockIndexesTable.setEnabled(false);
        JScrollPane scrollPane = new JScrollPane(stockIndexesTable);
        add(scrollPane, BorderLayout.CENTER);

        String indexURL = "http://stooq.pl/t/?i=510";
        StringBuilder stringBuilder = new StringBuilder();
        String[] strInColumn = new String[3];
        try {
            Document doc = Jsoup.connect(indexURL).get();
            String textFromURL = doc.body().text();
            String[] textsFromURL = textFromURL.split(" ");
            int counterSPX = 0;
            for (int i = 0; i < textsFromURL.length; i++) {
                if (textsFromURL[i].startsWith("^")) {
                    if (counterSPX < 2) {
                        counterSPX++;
                        continue;
                    }
                    strInColumn[0] = textsFromURL[i].substring(1);
                    if (isNumeric(textsFromURL[i + 2])) {
                        strInColumn[1] = textsFromURL[i + 1];
                        strInColumn[2] = textsFromURL[i + 2];
                    } else if (isNumeric(textsFromURL[i + 3])) {
                        stringBuilder.setLength(0);
                        stringBuilder.append(textsFromURL[i + 1]);
                        stringBuilder.append(" ");
                        stringBuilder.append(textsFromURL[i + 2]);
                        strInColumn[1] = stringBuilder.toString();
                        strInColumn[2] = textsFromURL[i + 3];
                    } else {
                        stringBuilder.setLength(0);
                        stringBuilder.append(textsFromURL[i + 1]);
                        stringBuilder.append(" ");
                        stringBuilder.append(textsFromURL[i + 2]);
                        stringBuilder.append(" ");
                        stringBuilder.append(textsFromURL[i + 3]);
                        strInColumn[1] = stringBuilder.toString();
                        strInColumn[2] = textsFromURL[i + 4];
                    }
                    model.addRow(new Object[]{strInColumn[0], strInColumn[1], strInColumn[2]});
                }
            }
        } catch (IOException e) {
            stockIndexValueTextArea.setText("Brak połączenie z internetem!");
        }
    }

    private void setStockIndexes() {
        String indexURL = "http://stooq.pl/t/?i=510";
        try {
            Document doc = Jsoup.connect(indexURL).get();
            String textFromURL = doc.body().text();
            String[] textsFromURL = textFromURL.split(" ");
            Set<String> stockIndexesSet = Arrays.stream(textsFromURL)
                    .filter(text -> text.startsWith("^")).collect(Collectors.toSet());
            stockIndexNameComboBox.removeAllItems();
            stockIndexesSet.forEach(index -> stockIndexNameComboBox.addItem(index.substring(1)));
        } catch (IOException e) {
            stockIndexValueTextArea.setText("Brak połączenie z internetem!");
        }
    }

    private void setStockIndexTextArea(String stockIndex) {
        if (!stockIndex.isEmpty()) {
            StringBuilder indexURL = new StringBuilder();
            indexURL.append("https://stooq.pl/q/?s=^");
            indexURL.append(stockIndex.toLowerCase());
            Document doc;
            try {
                doc = Jsoup.connect(indexURL.toString()).get();
                String textFromURL = doc.body().text();
                String[] textsFromURL = textFromURL.split(" ");
                OptionalInt index = IntStream.range(0, textsFromURL.length - 1)
                        .filter(i -> textsFromURL[i].equals("Kurs")).findAny();
                if (index.isPresent()) {
                    String stockIndexValue = textsFromURL[index.getAsInt() + 1];
                    stockIndexValueTextArea.setText(stockIndexValue);
                } else {
                    stockIndexValueTextArea.setText("Błędny symbol indeksu!");
                }
            } catch (IOException e) {
                stockIndexValueTextArea.setText("Brak połączenie z internetem!");
            }
        }
    }

    private static boolean isNumeric(String str) {
        return str.matches("[+-]?\\d*(\\.\\d+)?");
    }

    public static void main(String[] args) {
        new StockIndexesWindow();
    }
}


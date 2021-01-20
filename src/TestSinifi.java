
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import java.util.Random;

public class TestSinifi extends javax.swing.JFrame {

    private int userClickCountBT = 0;
    private int userClickCountFT = 0;
    private int kontrol = 0;

    /**
     * Creates new form NewJFrame
     */
    public TestSinifi() {
        initComponents();                    // başlangıçta hangi panellerin kullanıma açık olup olmadığını yazdırdık. Oyuncu bilgileri alınmadan diğer 
        oyuncu_bilgileri_panel.setVisible(true);      // paneller açılmayacaktır.
        sonuc_panel.setVisible(false);
        bt_panel.setVisible(false);
        ft_panel.setVisible(false);
        oyuncu_panel.setVisible(false);

    }
    String ad = " ";
    int oyuncuskoru = 0;
    int bilgisayarskoru = 0;
    int oyuncu = 0;
    int bilgisayar = 0;

    public static void main() {

    }
    ArrayList<Sporcu> futbolcu_oyuncular = new ArrayList<Sporcu>();
    ArrayList<BasketbolcuClass> basketbolcu_oyuncular = new ArrayList<BasketbolcuClass>();
    ArrayList<FutbolcuClass> futbolcu_oyuncular1 = new ArrayList<FutbolcuClass>();
    ArrayList<BasketbolcuClass> basketbolcu_oyuncular1 = new ArrayList<BasketbolcuClass>();
    ArrayList<JLabel> labelbt = new ArrayList<JLabel>();  // futbol ve basket oyunclularını koyduğumuz Jlabellerı birer arraylist ile tutuyoruz....
    ArrayList<JLabel> labelft = new ArrayList<JLabel>();
    ArrayList<BasketbolcuClass> basketbolcukartlari = new ArrayList<BasketbolcuClass>();
    ArrayList<FutbolcuClass> futbolcukartlari = new ArrayList<FutbolcuClass>();
    ArrayList<JLabel> oyuncu_kartlari = new ArrayList<JLabel>();

    Sporcu sporcu = new Sporcu();

    OyuncuClass oyuNcu = new OyuncuClass();
    OyuncuClass bilgiSayar = new OyuncuClass();

    FutbolcuClass lionelmessi = new FutbolcuClass("lionelMessi", "Barcelona");
    FutbolcuClass mesutozil = new FutbolcuClass("mesutOzil", "Arsenal");
    FutbolcuClass ronaldo = new FutbolcuClass("ronaldo", "juventus");
    FutbolcuClass ardaturan = new FutbolcuClass("ardaTuran", "galatasaray");
    FutbolcuClass frankribery = new FutbolcuClass("frankRibery", "fiorentina");
    FutbolcuClass neymar = new FutbolcuClass("neymar", "saintGerman");
    FutbolcuClass pauldogba = new FutbolcuClass("pauldogba", "manchesterUnited");
    FutbolcuClass ronaldinho = new FutbolcuClass("ronaldinho", "brezilyaMilliTakım");
    BasketbolcuClass alleniverson = new BasketbolcuClass("alleniverson", "3'sCompany");
    BasketbolcuClass billrussel = new BasketbolcuClass("billRussel", "bostonCeltics");
    BasketbolcuClass chrispaul = new BasketbolcuClass("chrissPaul", "PhoenixSuns");
    BasketbolcuClass kevindurant = new BasketbolcuClass("kevinDurant", "brooklynNets");
    BasketbolcuClass kobebryant = new BasketbolcuClass("kobeBryant", "l.A.Lakers'");
    BasketbolcuClass michaeljordan = new BasketbolcuClass("michaelJordan", "chicagoBulls");
    BasketbolcuClass stephancurry = new BasketbolcuClass("stephanCurry", "goldenStateWarriors");
    BasketbolcuClass timduncan = new BasketbolcuClass("timDuncan", "sanAntonioSpurs");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        oyuncu_bilgileri_panel = new javax.swing.JPanel();
        oyuncu_ismi_label = new javax.swing.JLabel();
        isim_girilen = new javax.swing.JTextField();
        basla_butonu = new javax.swing.JButton();
        sonuc_panel = new javax.swing.JPanel();
        oyuncu_skor = new javax.swing.JLabel();
        bilgisayar_skor = new javax.swing.JLabel();
        oyuncu_skor_sayı = new javax.swing.JLabel();
        bilgisayar_skor_sayı = new javax.swing.JLabel();
        bt_panel = new javax.swing.JPanel();
        BT1 = new javax.swing.JLabel();
        BT2 = new javax.swing.JLabel();
        BT3 = new javax.swing.JLabel();
        BT4 = new javax.swing.JLabel();
        BT5 = new javax.swing.JLabel();
        BT6 = new javax.swing.JLabel();
        BT7 = new javax.swing.JLabel();
        BT8 = new javax.swing.JLabel();
        ft_panel = new javax.swing.JPanel();
        FT1 = new javax.swing.JLabel();
        FT2 = new javax.swing.JLabel();
        FT3 = new javax.swing.JLabel();
        FT5 = new javax.swing.JLabel();
        FT6 = new javax.swing.JLabel();
        FT7 = new javax.swing.JLabel();
        FT8 = new javax.swing.JLabel();
        FT4 = new javax.swing.JLabel();
        oyuncu_panel = new javax.swing.JPanel();
        bt_kart1 = new javax.swing.JLabel();
        ft_kart1 = new javax.swing.JLabel();
        bt_kart2 = new javax.swing.JLabel();
        ft_kart2 = new javax.swing.JLabel();
        bt_kart3 = new javax.swing.JLabel();
        bt_kart4 = new javax.swing.JLabel();
        ft_kart4 = new javax.swing.JLabel();
        ft_kart3 = new javax.swing.JLabel();
        combo_label = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        oyuncu_bilgileri_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyuncu Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Lucida Grande", 3, 36))); // NOI18N

        oyuncu_ismi_label.setText("Oyuncu ismi: ");

        isim_girilen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isim_girilenActionPerformed(evt);
            }
        });

        basla_butonu.setText("BAŞLA");
        basla_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basla_butonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout oyuncu_bilgileri_panelLayout = new javax.swing.GroupLayout(oyuncu_bilgileri_panel);
        oyuncu_bilgileri_panel.setLayout(oyuncu_bilgileri_panelLayout);
        oyuncu_bilgileri_panelLayout.setHorizontalGroup(
            oyuncu_bilgileri_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oyuncu_bilgileri_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(oyuncu_ismi_label, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(isim_girilen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(basla_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        oyuncu_bilgileri_panelLayout.setVerticalGroup(
            oyuncu_bilgileri_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oyuncu_bilgileri_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(oyuncu_bilgileri_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oyuncu_ismi_label)
                    .addComponent(isim_girilen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(basla_butonu))
                .addGap(38, 38, 38))
        );

        sonuc_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SONUÇ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Lucida Grande", 3, 18))); // NOI18N

        oyuncu_skor.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        oyuncu_skor.setForeground(java.awt.Color.red);
        oyuncu_skor.setText("Oyuncu : ");

        bilgisayar_skor.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bilgisayar_skor.setForeground(java.awt.Color.red);
        bilgisayar_skor.setText("Bilgisayar: ");

        oyuncu_skor_sayı.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        oyuncu_skor_sayı.setForeground(new java.awt.Color(0, 0, 102));
        oyuncu_skor_sayı.setText("0");

        bilgisayar_skor_sayı.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        bilgisayar_skor_sayı.setForeground(new java.awt.Color(0, 0, 102));
        bilgisayar_skor_sayı.setText("0");

        javax.swing.GroupLayout sonuc_panelLayout = new javax.swing.GroupLayout(sonuc_panel);
        sonuc_panel.setLayout(sonuc_panelLayout);
        sonuc_panelLayout.setHorizontalGroup(
            sonuc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sonuc_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sonuc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sonuc_panelLayout.createSequentialGroup()
                        .addComponent(bilgisayar_skor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bilgisayar_skor_sayı, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(sonuc_panelLayout.createSequentialGroup()
                        .addComponent(oyuncu_skor)
                        .addGap(18, 18, 18)
                        .addComponent(oyuncu_skor_sayı, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        sonuc_panelLayout.setVerticalGroup(
            sonuc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sonuc_panelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(sonuc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oyuncu_skor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oyuncu_skor_sayı, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sonuc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bilgisayar_skor)
                    .addComponent(bilgisayar_skor_sayı, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basketbol Takımı ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Lucida Grande", 3, 18), new java.awt.Color(102, 0, 0))); // NOI18N

        BT1.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        BT1.setText("BT1");
        BT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT1MouseClicked(evt);
            }
        });

        BT2.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        BT2.setText("BT2");
        BT2.setName("button2"); // NOI18N
        BT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT2MouseClicked(evt);
            }
        });

        BT3.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        BT3.setText("BT3");
        BT3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT3MouseClicked(evt);
            }
        });

        BT4.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        BT4.setText("BT4");
        BT4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT4MouseClicked(evt);
            }
        });

        BT5.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        BT5.setText("BT5");
        BT5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT5MouseClicked(evt);
            }
        });

        BT6.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        BT6.setText("BT6");
        BT6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT6MouseClicked(evt);
            }
        });

        BT7.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        BT7.setText("BT7");
        BT7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT7MouseClicked(evt);
            }
        });

        BT8.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        BT8.setText("BT8");
        BT8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bt_panelLayout = new javax.swing.GroupLayout(bt_panel);
        bt_panel.setLayout(bt_panelLayout);
        bt_panelLayout.setHorizontalGroup(
            bt_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bt_panelLayout.createSequentialGroup()
                .addGroup(bt_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BT4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(BT2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bt_panelLayout.setVerticalGroup(
            bt_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BT1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BT2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BT3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BT4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BT5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BT6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BT7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BT8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        ft_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Futbol Takımı ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Lucida Grande", 3, 18), new java.awt.Color(102, 0, 0))); // NOI18N

        FT1.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        FT1.setText("FT1");
        FT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FT1MouseClicked(evt);
            }
        });

        FT2.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        FT2.setText("FT2");
        FT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FT2MouseClicked(evt);
            }
        });

        FT3.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        FT3.setText("FT3");
        FT3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FT3MouseClicked(evt);
            }
        });

        FT5.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        FT5.setText("FT5");
        FT5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FT5MouseClicked(evt);
            }
        });

        FT6.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        FT6.setText("FT6");
        FT6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FT6MouseClicked(evt);
            }
        });

        FT7.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        FT7.setText("FT7");
        FT7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FT7MouseClicked(evt);
            }
        });

        FT8.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        FT8.setText("FT8");
        FT8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FT8MouseClicked(evt);
            }
        });

        FT4.setFont(new java.awt.Font("Lucida Grande", 3, 8)); // NOI18N
        FT4.setText("FT4");
        FT4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FT4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ft_panelLayout = new javax.swing.GroupLayout(ft_panel);
        ft_panel.setLayout(ft_panelLayout);
        ft_panelLayout.setHorizontalGroup(
            ft_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ft_panelLayout.createSequentialGroup()
                .addGroup(ft_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FT8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FT7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FT6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FT5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FT4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FT3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FT2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ft_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(FT1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(336, 336, 336))
        );
        ft_panelLayout.setVerticalGroup(
            ft_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ft_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FT1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FT2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FT3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FT4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FT5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FT6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FT7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FT8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        oyuncu_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OYUNCU KARTLARI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Lucida Grande", 3, 24))); // NOI18N

        bt_kart1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basketbol Kart 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));
        bt_kart1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_kart1MouseClicked(evt);
            }
        });

        ft_kart1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Futbol Kart 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));
        ft_kart1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ft_kart1MouseClicked(evt);
            }
        });

        bt_kart2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BasketbolKart 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));
        bt_kart2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_kart2MouseClicked(evt);
            }
        });

        ft_kart2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Futbol Kart 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));
        ft_kart2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ft_kart2MouseClicked(evt);
            }
        });

        bt_kart3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basketbol Kart 3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));
        bt_kart3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_kart3MouseClicked(evt);
            }
        });

        bt_kart4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basketbol Kart 4", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));
        bt_kart4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_kart4MouseClicked(evt);
            }
        });

        ft_kart4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Futbol Kart 4", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));
        ft_kart4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ft_kart4MouseClicked(evt);
            }
        });

        ft_kart3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Futbol Kart 3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));
        ft_kart3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ft_kart3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout oyuncu_panelLayout = new javax.swing.GroupLayout(oyuncu_panel);
        oyuncu_panel.setLayout(oyuncu_panelLayout);
        oyuncu_panelLayout.setHorizontalGroup(
            oyuncu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oyuncu_panelLayout.createSequentialGroup()
                .addGroup(oyuncu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_kart3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_kart2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_kart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_kart4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ft_kart1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addComponent(ft_kart2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ft_kart3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ft_kart4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        oyuncu_panelLayout.setVerticalGroup(
            oyuncu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oyuncu_panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(bt_kart1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_kart2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_kart3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_kart4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ft_kart1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ft_kart2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ft_kart3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ft_kart4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        combo_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ft_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(oyuncu_bilgileri_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sonuc_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(oyuncu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oyuncu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oyuncu_bilgileri_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sonuc_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(combo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ft_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isim_girilenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isim_girilenActionPerformed

    }//GEN-LAST:event_isim_girilenActionPerformed

    public void mouseClicked() {

    }

    private void getBasketbolPlayer(JLabel label) {
        if (basketbolcu_oyuncular1.size() == 0) {
            return;
        }
        if (userClickCountBT == 4) {
            return;
        }
        Random random = new Random();
        int a = random.nextInt(basketbolcu_oyuncular1.size());
        BasketbolcuClass yeni = basketbolcu_oyuncular1.get(a);
        basketbolcukartlari.add(yeni);
        basketbolcu_oyuncular1.remove(a);
        label.setText(yeni.sporcuPuaniGoster(yeni.ikilik, yeni.ucluk, yeni.serbestAtis) + yeni.getSporcuIsim() + yeni.getSporcuTakim());

        userClickCountBT++;
    }

    private void compareBasketbolPlayers(int i) {
        Random random = new Random();
        int sayi = random.nextInt(3);
        System.out.println("sayi: " + sayi);
        switch (sayi) {
            case 0:
                if (basketbolcukartlari.get(i).ikilik < basketbolcu_oyuncular1.get(i).ikilik) {
                    oyuncu++;
                    labelbt.get(0).setForeground(Color.red);
                    labelbt.get(0).setText(basketbolcu_oyuncular1.get(i).sporcuPuaniGoster(basketbolcu_oyuncular1.get(i).ikilik, basketbolcu_oyuncular1.get(i).ucluk, basketbolcu_oyuncular1.get(i).serbestAtis));
                    labelbt.remove(0);
                    String s = String.valueOf(oyuncu);
                    oyuncu_skor_sayı.setText(s);
                    combo_label.setText("İKİLİK PUANLAR KARŞILAŞTIRILDI");
                } else {
                    bilgisayar++;
                    labelbt.get(0).setForeground(Color.red);
                    labelbt.get(0).setText(basketbolcu_oyuncular1.get(i).sporcuPuaniGoster(basketbolcu_oyuncular1.get(i).ikilik, basketbolcu_oyuncular1.get(i).ucluk, basketbolcu_oyuncular1.get(i).serbestAtis));
                    labelbt.remove(0);
                    String s = String.valueOf(bilgisayar);
                    bilgisayar_skor_sayı.setText(s);
                    combo_label.setText("İKİLİK PUANLAR KARŞILAŞTIRILDI");
                }
                break;
            case 1:
                if (basketbolcukartlari.get(i).ucluk < basketbolcu_oyuncular1.get(i).ucluk) {
                    oyuncu++;
                    labelbt.get(0).setForeground(Color.red);
                    labelbt.get(0).setText(basketbolcu_oyuncular1.get(i).sporcuPuaniGoster(basketbolcu_oyuncular1.get(i).ikilik, basketbolcu_oyuncular1.get(i).ucluk, basketbolcu_oyuncular1.get(i).serbestAtis));
                    labelbt.remove(0);
                    String s = String.valueOf(oyuncu);
                    oyuncu_skor_sayı.setText(s);
                    combo_label.setText("ÜÇLÜK PUANLAR KARŞILAŞTIRILDI");
                } else {
                    bilgisayar++;
                    labelbt.get(0).setForeground(Color.red);
                    labelbt.get(0).setText(basketbolcu_oyuncular1.get(i).sporcuPuaniGoster(basketbolcu_oyuncular1.get(i).ikilik, basketbolcu_oyuncular1.get(i).ucluk, basketbolcu_oyuncular1.get(i).serbestAtis));
                    labelbt.remove(0);
                    String s = String.valueOf(bilgisayar);
                    bilgisayar_skor_sayı.setText(s);
                    combo_label.setText("ÜÇLÜK PUANLAR KARŞILAŞTIRILDI");
                }
                break;
            case 2:
                if (basketbolcukartlari.get(i).serbestAtis < basketbolcu_oyuncular1.get(i).serbestAtis) {
                    oyuncu++;
                    labelbt.get(0).setForeground(Color.red);
                    labelbt.get(0).setText(basketbolcu_oyuncular1.get(i).sporcuPuaniGoster(basketbolcu_oyuncular1.get(i).ikilik, basketbolcu_oyuncular1.get(i).ucluk, basketbolcu_oyuncular1.get(i).serbestAtis));
                    labelbt.remove(0);
                    String s = String.valueOf(oyuncu);
                    oyuncu_skor_sayı.setText(s);
                    combo_label.setText("SERBEST ATIŞ PUANLAR KARŞILAŞTIRILDI");
                } else {
                    bilgisayar++;
                    labelbt.get(0).setForeground(Color.red);
                    labelbt.get(0).setText(basketbolcu_oyuncular1.get(i).sporcuPuaniGoster(basketbolcu_oyuncular1.get(i).ikilik, basketbolcu_oyuncular1.get(i).ucluk, basketbolcu_oyuncular1.get(i).serbestAtis));
                    labelbt.remove(0);
                    String s = String.valueOf(bilgisayar);
                    bilgisayar_skor_sayı.setText(s);
                    combo_label.setText("SERBEST ATIŞ PUANLAR KARŞILAŞTIRILDI");
                }
                break;
        }

    }

    private void getFutbolcuPlayer(JLabel label) {
        if (futbolcu_oyuncular1.size() == 0) {
            return;
        }
        if (userClickCountFT == 4) {
            return;
        }
        Random random = new Random();
        int a = random.nextInt(futbolcu_oyuncular1.size());
        FutbolcuClass yeni = (FutbolcuClass) futbolcu_oyuncular1.get(a);
        futbolcukartlari.add(yeni);
        futbolcu_oyuncular1.remove(a);
        label.setText(yeni.sporcuPuaniGoster(yeni.penalti, yeni.serbestAtis, yeni.kaleciKarsiKarsiya) + yeni.getSporcuIsim() + yeni.getSporcuTakim());

        userClickCountFT++;
    }

    private void compareFutbolcuPlayers(int i) {
        Random random = new Random();
        int sayi = random.nextInt(3);
        System.out.println("sayi: " + sayi);
        switch (sayi) {

            case 0:
                if (futbolcukartlari.get(i).penalti < futbolcu_oyuncular1.get(i).penalti) {
                    oyuncu++;
                    labelft.get(0).setForeground(Color.red);
                    labelft.get(0).setText(futbolcu_oyuncular1.get(i).sporcuPuaniGoster(futbolcu_oyuncular1.get(i).penalti, futbolcu_oyuncular1.get(i).serbestAtis, futbolcu_oyuncular1.get(i).kaleciKarsiKarsiya));
                    labelft.remove(0);
                    String s = String.valueOf(oyuncu);
                    oyuncu_skor_sayı.setText(s);
                    combo_label.setText("PENALTI PUANLAR KARŞILAŞTIRILDI");
                } else {
                    bilgisayar++;
                    labelft.get(0).setForeground(Color.red);
                    labelft.get(0).setText(futbolcu_oyuncular1.get(i).sporcuPuaniGoster(futbolcu_oyuncular1.get(i).penalti, futbolcu_oyuncular1.get(i).serbestAtis, futbolcu_oyuncular1.get(i).kaleciKarsiKarsiya));
                    labelft.remove(0);
                    String s = String.valueOf(bilgisayar);
                    bilgisayar_skor_sayı.setText(s);
                    combo_label.setText("PENALTI PUANLAR KARŞILAŞTIRILDI");
                }
                break;
            case 1:
                if (futbolcukartlari.get(i).serbestAtis < futbolcu_oyuncular1.get(i).serbestAtis) {
                    oyuncu++;
                    labelft.get(0).setForeground(Color.red);
                    labelft.get(0).setText(futbolcu_oyuncular1.get(i).sporcuPuaniGoster(futbolcu_oyuncular1.get(i).penalti, futbolcu_oyuncular1.get(i).serbestAtis, futbolcu_oyuncular1.get(i).kaleciKarsiKarsiya));
                    labelft.remove(0);
                    String s = String.valueOf(oyuncu);
                    oyuncu_skor_sayı.setText(s);
                    combo_label.setText("SERBEST ATIŞ PUANLAR KARŞILAŞTIRILDI");
                } else {
                    bilgisayar++;
                    labelft.get(0).setForeground(Color.red);
                    labelft.get(0).setText(futbolcu_oyuncular1.get(i).sporcuPuaniGoster(futbolcu_oyuncular1.get(i).penalti, futbolcu_oyuncular1.get(i).serbestAtis, futbolcu_oyuncular1.get(i).kaleciKarsiKarsiya));
                    labelft.remove(0);
                    String s = String.valueOf(bilgisayar);
                    bilgisayar_skor_sayı.setText(s);
                    combo_label.setText("SERBEST ATIŞ PUANLAR KARŞILAŞTIRILDI");
                }
                break;
            case 2:
                if (futbolcukartlari.get(i).kaleciKarsiKarsiya < futbolcu_oyuncular1.get(i).kaleciKarsiKarsiya) {
                    oyuncu++;
                    labelft.get(0).setForeground(Color.red);
                    labelft.get(0).setText(futbolcu_oyuncular1.get(i).sporcuPuaniGoster(futbolcu_oyuncular1.get(i).penalti, futbolcu_oyuncular1.get(i).serbestAtis, futbolcu_oyuncular1.get(i).kaleciKarsiKarsiya));
                    labelft.remove(0);
                    String s = String.valueOf(oyuncu);
                    oyuncu_skor_sayı.setText(s);
                    combo_label.setText("Kaleci k.k. PUANLAR KARŞILAŞTIRILDI");
                } else {
                    bilgisayar++;
                    labelft.get(0).setForeground(Color.red);
                    labelft.get(0).setText(futbolcu_oyuncular1.get(i).sporcuPuaniGoster(futbolcu_oyuncular1.get(i).penalti, futbolcu_oyuncular1.get(i).serbestAtis, futbolcu_oyuncular1.get(i).kaleciKarsiKarsiya));
                    labelft.remove(0);
                    String s = String.valueOf(bilgisayar);
                    bilgisayar_skor_sayı.setText(s);
                    combo_label.setText("Kaleci k.k. PUANLAR KARŞILAŞTIRILDI");
                }
                break;
        }
    }


    private void basla_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basla_butonuActionPerformed
        ad = isim_girilen.getText();
        isim_girilen.setEnabled(false);
        oyuncu_bilgileri_panel.setEnabled(false);
        bt_panel.setVisible(true);
        ft_panel.setVisible(true);
        bt_panel.setEnabled(true);
        ft_panel.setEnabled(true);
        sonuc_panel.setVisible(true);
        sonuc_panel.setEnabled(true);
        oyuncu_panel.setVisible(true);
        BT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/bt.png")));
        BT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/bt.png")));
        BT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/bt.png")));
        BT4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/bt.png")));
        BT5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/bt.png")));
        BT6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/bt.png")));
        BT7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/bt.png")));
        BT8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/bt.png")));
        FT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ft.jpg")));
        FT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ft.jpg")));
        FT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ft.jpg")));
        FT4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ft.jpg")));
        FT5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ft.jpg")));
        FT6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ft.jpg")));
        FT7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ft.jpg")));
        FT8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ft.jpg")));

        labelft.add(0, FT1);
        labelft.add(1, FT2);
        labelft.add(2, FT3);
        labelft.add(3, FT4);
        labelft.add(4, FT5);
        labelft.add(5, FT6);
        labelft.add(6, FT7);
        labelft.add(7, FT8);

        labelbt.add(0, BT1);
        labelbt.add(1, BT2);
        labelbt.add(2, BT3);
        labelbt.add(3, BT4);
        labelbt.add(4, BT5);
        labelbt.add(5, BT6);
        labelbt.add(6, BT7);
        labelbt.add(7, BT8);

        futbolcu_oyuncular.add(lionelmessi);     // oluşturulan basketbolcu ve futbolcu nesneleri ArrayList 
        futbolcu_oyuncular.add(neymar);          // yardımı ile iki ayrı dizi de tutulur....
        futbolcu_oyuncular.add(ardaturan);
        futbolcu_oyuncular.add(frankribery);
        futbolcu_oyuncular.add(mesutozil);
        futbolcu_oyuncular.add(pauldogba);
        futbolcu_oyuncular.add(ronaldinho);
        futbolcu_oyuncular.add(ronaldo);

        basketbolcu_oyuncular.add(alleniverson);
        basketbolcu_oyuncular.add(billrussel);
        basketbolcu_oyuncular.add(chrispaul);
        basketbolcu_oyuncular.add(michaeljordan);
        basketbolcu_oyuncular.add(stephancurry);
        basketbolcu_oyuncular.add(timduncan);
        basketbolcu_oyuncular.add(kobebryant);
        basketbolcu_oyuncular.add(kevindurant);

        futbolcu_oyuncular1.add(lionelmessi);     // oluşturulan basketbolcu ve futbolcu nesneleri ArrayList 
        futbolcu_oyuncular1.add(neymar);          // yardımı ile iki ayrı dizi de tutulur....
        futbolcu_oyuncular1.add(ardaturan);
        futbolcu_oyuncular1.add(frankribery);
        futbolcu_oyuncular1.add(mesutozil);
        futbolcu_oyuncular1.add(pauldogba);
        futbolcu_oyuncular1.add(ronaldinho);
        futbolcu_oyuncular1.add(ronaldo);

        basketbolcu_oyuncular1.add(alleniverson);
        basketbolcu_oyuncular1.add(billrussel);
        basketbolcu_oyuncular1.add(chrispaul);
        basketbolcu_oyuncular1.add(michaeljordan);
        basketbolcu_oyuncular1.add(stephancurry);
        basketbolcu_oyuncular1.add(timduncan);
        basketbolcu_oyuncular1.add(kobebryant);
        basketbolcu_oyuncular1.add(kevindurant);

        // futbolcu oyuncularının penaltı,serbest atış ve kaleci karşı karşıya parametre değerleri atanır....
        lionelmessi.setPenalti(90);
        lionelmessi.setSerbestAtis(85);
        lionelmessi.setKaleciKarsiKarsiya(95);
        neymar.setPenalti(85);
        neymar.setSerbestAtis(90);
        neymar.setKaleciKarsiKarsiya(75);
        ardaturan.setPenalti(83);
        ardaturan.setSerbestAtis(92);
        ardaturan.setKaleciKarsiKarsiya(77);
        frankribery.setPenalti(73);
        frankribery.setSerbestAtis(79);
        frankribery.setKaleciKarsiKarsiya(88);
        mesutozil.setPenalti(70);
        mesutozil.setSerbestAtis(65);
        mesutozil.setKaleciKarsiKarsiya(90);
        pauldogba.setPenalti(82);
        pauldogba.setSerbestAtis(78);
        pauldogba.setKaleciKarsiKarsiya(81);
        ronaldinho.setPenalti(87);
        ronaldinho.setSerbestAtis(83);
        ronaldinho.setKaleciKarsiKarsiya(89);
        ronaldo.setPenalti(95);
        ronaldo.setSerbestAtis(80);
        ronaldo.setKaleciKarsiKarsiya(70);
        // basketbolcu oyunlarının 2'lik ,3'lük ve serbest atış parametre değerleri atanır....
        alleniverson.setIkilik(93);
        alleniverson.setUcluk(94);
        alleniverson.setSerbestAtis(92);
        billrussel.setIkilik(81);
        billrussel.setUcluk(88);
        billrussel.setSerbestAtis(74);
        chrispaul.setIkilik(84);
        chrispaul.setUcluk(85);
        chrispaul.setSerbestAtis(86);
        michaeljordan.setIkilik(90);
        michaeljordan.setUcluk(91);
        michaeljordan.setSerbestAtis(95);
        stephancurry.setIkilik(92);
        stephancurry.setSerbestAtis(85);
        stephancurry.setUcluk(75);
        timduncan.setIkilik(73);
        timduncan.setUcluk(78);
        timduncan.setSerbestAtis(81);
        kobebryant.setIkilik(88);
        kobebryant.setUcluk(89);
        kobebryant.setSerbestAtis(91);
        kevindurant.setIkilik(87);
        kevindurant.setUcluk(92);
        kevindurant.setSerbestAtis(89);

        bt_panel.addMouseListener(new MouseListener() {
            @Override

            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() <= 4) {
                    kontrol++;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        });

        ft_panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() <= 4) {
                    kontrol++;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });

        if (kontrol == 2) {
            oyuncu_kartlari.add(bt_kart1);
            oyuncu_kartlari.add(bt_kart2);
            oyuncu_kartlari.add(bt_kart3);
            oyuncu_kartlari.add(bt_kart4);
            oyuncu_kartlari.add(ft_kart1);
            oyuncu_kartlari.add(ft_kart2);
            oyuncu_kartlari.add(ft_kart3);
            oyuncu_kartlari.add(ft_kart4);
        }


    }//GEN-LAST:event_basla_butonuActionPerformed

    private void FT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FT1MouseClicked
        if (evt.getClickCount() == 1) {
            getFutbolcuPlayer(FT1);
            labelft.remove(FT1);

        }
    }//GEN-LAST:event_FT1MouseClicked

    private void FT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FT2MouseClicked
        if (evt.getClickCount() == 1) {
            getFutbolcuPlayer(FT2);
            labelft.remove(FT2);
        }
    }//GEN-LAST:event_FT2MouseClicked

    private void FT3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FT3MouseClicked
        if (evt.getClickCount() == 1) {
            getFutbolcuPlayer(FT3);
            labelft.remove(FT3);
        }
    }//GEN-LAST:event_FT3MouseClicked

    private void FT4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FT4MouseClicked
        if (evt.getClickCount() == 1) {
            getFutbolcuPlayer(FT4);
            labelft.remove(FT4);
        }
    }//GEN-LAST:event_FT4MouseClicked

    private void FT5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FT5MouseClicked
        if (evt.getClickCount() == 1) {
            getFutbolcuPlayer(FT5);
            labelft.remove(FT5);
        }
    }//GEN-LAST:event_FT5MouseClicked

    private void FT6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FT6MouseClicked
        if (evt.getClickCount() == 1) {
            getFutbolcuPlayer(FT6);
            labelft.remove(FT6);
        }
    }//GEN-LAST:event_FT6MouseClicked

    private void FT7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FT7MouseClicked
        if (evt.getClickCount() == 1) {
            getFutbolcuPlayer(FT7);
            labelft.remove(FT7);
        }
    }//GEN-LAST:event_FT7MouseClicked

    private void FT8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FT8MouseClicked
        if (evt.getClickCount() == 1) {
            getFutbolcuPlayer(FT8);
            labelft.remove(FT8);
        }
    }//GEN-LAST:event_FT8MouseClicked

    private void BT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT1MouseClicked
        if (evt.getClickCount() == 1) {
            getBasketbolPlayer(BT1);
            labelbt.remove(BT1);
        }
    }//GEN-LAST:event_BT1MouseClicked

    private void BT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT2MouseClicked
        if (evt.getClickCount() == 1) {
            getBasketbolPlayer(BT2);
            labelbt.remove(BT2);
        }
    }//GEN-LAST:event_BT2MouseClicked

    private void BT3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT3MouseClicked
        if (evt.getClickCount() == 1) {
            getBasketbolPlayer(BT3);
            labelbt.remove(BT3);
        }
    }//GEN-LAST:event_BT3MouseClicked

    private void BT4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT4MouseClicked
        if (evt.getClickCount() == 1) {
            getBasketbolPlayer(BT4);
            labelbt.remove(BT4);
        }
    }//GEN-LAST:event_BT4MouseClicked

    private void BT5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT5MouseClicked
        if (evt.getClickCount() == 1) {
            getBasketbolPlayer(BT5);
            labelbt.remove(BT5);
        }
    }//GEN-LAST:event_BT5MouseClicked

    private void BT6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT6MouseClicked
        if (evt.getClickCount() == 1) {
            getBasketbolPlayer(BT6);
            labelbt.remove(BT6);
        }
    }//GEN-LAST:event_BT6MouseClicked

    private void BT7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT7MouseClicked
        if (evt.getClickCount() == 1) {
            getBasketbolPlayer(BT7);
            labelbt.remove(BT7);
        }
    }//GEN-LAST:event_BT7MouseClicked

    private void BT8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT8MouseClicked
        if (evt.getClickCount() == 1) {
            getBasketbolPlayer(BT8);
            labelbt.remove(BT8);
        }
    }//GEN-LAST:event_BT8MouseClicked

    private void bt_kart1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_kart1MouseClicked
        if (evt.getClickCount() == 1) {
            bt_kart1.setText(basketbolcukartlari.get(0).sporcuPuaniGoster(basketbolcukartlari.get(0).ikilik, basketbolcukartlari.get(0).ucluk, basketbolcukartlari.get(0).serbestAtis));
        } else if (evt.getClickCount() == 2) {
            compareBasketbolPlayers(0);

            bt_kart1.setVisible(false);
        }

    }//GEN-LAST:event_bt_kart1MouseClicked

    private void bt_kart2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_kart2MouseClicked
        if (evt.getClickCount() == 1) {
            bt_kart2.setText(basketbolcukartlari.get(1).sporcuPuaniGoster(basketbolcukartlari.get(1).ikilik, basketbolcukartlari.get(1).ucluk, basketbolcukartlari.get(1).serbestAtis));
        } else if (evt.getClickCount() == 2) {
            compareBasketbolPlayers(1);
            bt_kart2.setVisible(false);
        }
    }//GEN-LAST:event_bt_kart2MouseClicked

    private void bt_kart3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_kart3MouseClicked
        if (evt.getClickCount() == 1) {
            bt_kart3.setText(basketbolcukartlari.get(2).sporcuPuaniGoster(basketbolcukartlari.get(2).ikilik, basketbolcukartlari.get(2).ucluk, basketbolcukartlari.get(2).serbestAtis));
        } else if (evt.getClickCount() == 2) {
            compareBasketbolPlayers(2);
            bt_kart3.setVisible(false);
        }
    }//GEN-LAST:event_bt_kart3MouseClicked

    private void bt_kart4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_kart4MouseClicked
        if (evt.getClickCount() == 1) {
            bt_kart4.setText(basketbolcukartlari.get(3).sporcuPuaniGoster(basketbolcukartlari.get(3).ikilik, basketbolcukartlari.get(3).ucluk, basketbolcukartlari.get(3).serbestAtis));
        } else if (evt.getClickCount() == 2) {
            compareBasketbolPlayers(3);
            bt_kart4.setVisible(false);
        }
    }//GEN-LAST:event_bt_kart4MouseClicked

    private void ft_kart1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ft_kart1MouseClicked
        if (evt.getClickCount() == 1) {
            ft_kart1.setText(futbolcukartlari.get(0).sporcuPuaniGoster(futbolcukartlari.get(0).penalti, futbolcukartlari.get(0).serbestAtis, futbolcukartlari.get(0).kaleciKarsiKarsiya));
        } else if (evt.getClickCount() == 2) {
            compareFutbolcuPlayers(0);
            ft_kart1.setVisible(false);
        }
    }//GEN-LAST:event_ft_kart1MouseClicked

    private void ft_kart2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ft_kart2MouseClicked
        if (evt.getClickCount() == 1) {
            ft_kart2.setText(futbolcukartlari.get(1).sporcuPuaniGoster(futbolcukartlari.get(1).penalti, futbolcukartlari.get(1).serbestAtis, futbolcukartlari.get(1).kaleciKarsiKarsiya));
        } else if (evt.getClickCount() == 2) {
            compareFutbolcuPlayers(1);
            ft_kart2.setVisible(false);
        }
    }//GEN-LAST:event_ft_kart2MouseClicked

    private void ft_kart3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ft_kart3MouseClicked
        if (evt.getClickCount() == 1) {
            ft_kart3.setText(futbolcukartlari.get(2).sporcuPuaniGoster(futbolcukartlari.get(2).penalti, futbolcukartlari.get(2).serbestAtis, futbolcukartlari.get(2).kaleciKarsiKarsiya));
        } else if (evt.getClickCount() == 2) {
            compareFutbolcuPlayers(2);
            ft_kart3.setVisible(false);
        }
    }//GEN-LAST:event_ft_kart3MouseClicked

    private void ft_kart4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ft_kart4MouseClicked
        if (evt.getClickCount() == 1) {
            ft_kart4.setText(futbolcukartlari.get(3).sporcuPuaniGoster(futbolcukartlari.get(3).penalti, futbolcukartlari.get(3).serbestAtis, futbolcukartlari.get(3).kaleciKarsiKarsiya));
        } else if (evt.getClickCount() == 2) {
            compareFutbolcuPlayers(3);
            ft_kart4.setVisible(false);
        }
    }//GEN-LAST:event_ft_kart4MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestSinifi().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BT1;
    private javax.swing.JLabel BT2;
    private javax.swing.JLabel BT3;
    private javax.swing.JLabel BT4;
    private javax.swing.JLabel BT5;
    private javax.swing.JLabel BT6;
    private javax.swing.JLabel BT7;
    private javax.swing.JLabel BT8;
    private javax.swing.JLabel FT1;
    private javax.swing.JLabel FT2;
    private javax.swing.JLabel FT3;
    private javax.swing.JLabel FT4;
    private javax.swing.JLabel FT5;
    private javax.swing.JLabel FT6;
    private javax.swing.JLabel FT7;
    private javax.swing.JLabel FT8;
    private javax.swing.JButton basla_butonu;
    private javax.swing.JLabel bilgisayar_skor;
    private javax.swing.JLabel bilgisayar_skor_sayı;
    private javax.swing.JLabel bt_kart1;
    private javax.swing.JLabel bt_kart2;
    private javax.swing.JLabel bt_kart3;
    private javax.swing.JLabel bt_kart4;
    private javax.swing.JPanel bt_panel;
    private javax.swing.JLabel combo_label;
    private javax.swing.JLabel ft_kart1;
    private javax.swing.JLabel ft_kart2;
    private javax.swing.JLabel ft_kart3;
    private javax.swing.JLabel ft_kart4;
    private javax.swing.JPanel ft_panel;
    private javax.swing.JTextField isim_girilen;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JPanel oyuncu_bilgileri_panel;
    private javax.swing.JLabel oyuncu_ismi_label;
    private javax.swing.JPanel oyuncu_panel;
    private javax.swing.JLabel oyuncu_skor;
    private javax.swing.JLabel oyuncu_skor_sayı;
    private javax.swing.JPanel sonuc_panel;
    // End of variables declaration//GEN-END:variables
}

package Display;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.AbstractListModel;

import Dashboard.EventMenu;
import Dashboard.MainForm;
import Dashboard.Menu;
import Dashboard.MenuItem;
import Dashboard.SubMenuPanel;
import Display.Components.FrameDragListener;
import Display.Form.Form;
import Display.Form.socialNetwork.socialNetwork;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display implements Infor {

    private JFrame frame;
    private JLabel lbLogo;
    private JCheckBoxMenuItem chDarkMode;

    private FrameDragListener frameDrag;

    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu jMenu3;

    private JMenuBar jMenuBar;
    private JMenuItem windowOption;

    // private JButton[] codeBtn;

    // #region

    private Menu menu;
    private MenuItem mainMenuItem1;
    private MenuItem mainMenuItem2;
    private MenuItem mainMenuItem3;
    private MenuItem mainMenuItem4;
    private MenuItem mainMenuItem5;

    private SubMenuPanel subMenu;
    private MainForm mainForm;

    // #endregion

    private int width;
    private int height;
    private String title;

    /*
     * private int buttonWidth = 75;
     * private int buttonHeight = 75;
     * private int margin = 3;
     * private int startX = 25;
     * private int startY = 25;
     * private int lengshowButton = 6;
     */

    String[] buttonNames = { "Button 1", "Button 2", "Button 3", "Button 4", "Button 5", "Button 6" };

    public Display(JFrame frame, int width, int height, String title) {
        this.frame = frame;
        this.width = width;
        this.title = title;
    }

    /**
     * @author super coder
     *         contructor display using create the method
     *         {@link {#create(), #init()}}
     */
    public Display() {
        create();
        init();
        initComponents();

        menu.addEventMenuSelected(new EventMenu() {
            @Override
            public void mainMenuSelected(MainForm mainForm, int index, MenuItem menuItem) {
                // TODO Auto-generated method stub

            }

            @Override
            public void subMenuSelected(MainForm mainForm, int index, int subMenuIndex, Component menuItem) {
                // mainForm.displayForm(new Form1("Form " + index + "-" + subMenuIndex));
                try {
                    handleMenuSelection(index, subMenuIndex);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        });
        menu.setSelectedIndex(0);
        resize(1200, 620);
        centerWindow();

    }

    private void handleMenuSelection(int index, int subMenuIndex) {
        switch (index) {
            case 0:
                handleIndex0(subMenuIndex);
                break;
            case 1:
                handleIndex1(subMenuIndex);
                break;
            case 2:
                handleIndex2(subMenuIndex);
                break;
            case 3:
                handleIndex3(subMenuIndex);
                break;
            case 4:
                handleIndex4(subMenuIndex);
                break;
            default:
                JOptionPane.showMessageDialog(frame, "Loi khong xac dunh", "ERROR: 0x12e04", 1);
        }
    }

    private void handleIndex0(int subMenuIndex) {
        switch (subMenuIndex) {
            case 0:
                mainForm.displayForm(new socialNetwork());
                break;

            default:
                break;
        }
    }

    private void handleIndex1(int subMenuIndex) {
        switch (subMenuIndex) {
            case 0:
                mainForm.displayForm(new Form());
                break;

            default:
                break;
        }
    }

    private void handleIndex2(int subMenuIndex) {
        switch (subMenuIndex) {
            case 0:
                mainForm.displayForm(new Form());
                break;

            default:
                break;
        }
    }

    private void handleIndex3(int subMenuIndex) {
        switch (subMenuIndex) {
            case 0:
                mainForm.displayForm(new Form());
                break;

            default:
                break;
        }
    }

    private void handleIndex4(int subMenuIndex) {
        switch (subMenuIndex) {
            case 0:
                mainForm.displayForm(new Form());
                break;
            case 1:
                mainForm.displayForm(new Form());
                break;
            case 2:
                System.exit(0);
                break;

            default:
                break;
        }
    }

    @SuppressWarnings("deprecation")
    public void show() {
        try {
            frame.setVisible(true);
            if (frame.isVisible()) {
                frame.show();
            } else {
                JOptionPane.showMessageDialog(frame, "Loi khong xac dinh ", "Error: 0x100", 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void resize(int width, int height) {
        frame.setSize(width, height);
    }

    @Override
    public void create() {
        frame = new JFrame();

        frameDrag = new FrameDragListener(frame);

        subMenu = new SubMenuPanel();
        menu = new Menu();
        lbLogo = new javax.swing.JLabel();
        mainMenuItem1 = new MenuItem();
        mainMenuItem3 = new MenuItem();
        mainMenuItem2 = new MenuItem();
        mainMenuItem4 = new MenuItem();
        mainMenuItem5 = new MenuItem();
        mainForm = new MainForm();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new JMenu();
        jMenu2 = new JMenu();
        jMenu3 = new JMenu();
        chDarkMode = new JCheckBoxMenuItem();
        windowOption = new JMenuItem();
    }

    @Override
    public void centerWindow() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }

    @Override
    public void init() {
        title = "Name";
        frame.setTitle(title);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // codeBtn = new JButton[6];

        // for (int i = 0; i < lengshowButton; i++) {
        // codeBtn[i] = new JButton();
        // // codeBtn[i].setText(buttonNames[i]);
        // codeBtn[i].setToolTipText(buttonNames[i]);

        // codeBtn[i].setSize(buttonWidth, buttonHeight);
        // int x = startX + (i % 3) * (buttonWidth + margin);
        // int y = startY + (i / 3) * (buttonHeight + margin);
        // codeBtn[i].setLocation(x, y);
        // frame.add(codeBtn[i]);
        // }
        frame.getContentPane().setBackground(Color.decode("0x123456"));

        frame.addMouseListener(frameDrag);
        frame.addMouseMotionListener(frameDrag);

        frame.setUndecorated(true);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void initComponents() {

        // frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        subMenu.setBorder(BorderFactory.createEmptyBorder(80, 1, 1, 1));

        menu.setMainForm(mainForm);
        menu.setSubMenuPanel(subMenu);

        lbLogo.setHorizontalAlignment(SwingConstants.CENTER);

        lbLogo.setIcon(new ImageIcon(getClass().getResource("/Assets/icon/logo.png"))); // NOI18N
        lbLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbLogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu.add(lbLogo);

        mainMenuItem1.setBackground(new Color(255, 45, 185));
        mainMenuItem1.setForeground(new Color(75, 0, 243));
        mainMenuItem1.setIcon(new ImageIcon(getClass().getResource("/Assets/icon/menu1.png"))); // NOI18N
        mainMenuItem1.setMenuIcon(new AbstractListModel() {
            String[] strings = { "/home/naotomori/Documents/Java/Application/Assets/icon/s1_1.png",
                    "/Assets/icon/s1_2.png", "/Assets/icon/s1_3.png", "/Assets/icon/s1_4.png", "/Assets/icon/s1_5.png",
                    "/Assets/icon/s1_6.png", "/Assets/icon/s1_7.png" };

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        mainMenuItem1.setMenuModel(new AbstractListModel() {
            String[] strings = { "social Network", "Buttons", "Cards", "Tabs", "Accordions", "Modals",
                    "Lists & Media Object" };

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        menu.add(mainMenuItem1);

        mainMenuItem3.setBackground(new Color(0, 217, 64));
        mainMenuItem3.setForeground(new Color(74, 74, 74));
        mainMenuItem3.setIcon(new ImageIcon(getClass().getResource("/Assets/icon/menu2.png"))); // NOI18N
        mainMenuItem3.setMenuIcon(new AbstractListModel() {
            String[] strings = { "/Assets/icon/s2_1.png", "/Assets/icon/s2_2.png", "/Assets/icon/s2_3.png",
                    "/Assets/icon/s2_4.png", "/Assets/icon/s2_5.png" };

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        mainMenuItem3.setMenuModel(new AbstractListModel() {
            String[] strings = { "Grid", "Progress Bars", "Notifications & Alerts", "Pagination", "Carousel" };

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        menu.add(mainMenuItem3);

        mainMenuItem2.setBackground(new Color(255, 0, 0));
        mainMenuItem2.setForeground(new Color(241, 255, 0));
        mainMenuItem2.setIcon(new ImageIcon(getClass().getResource("/Assets/icon/menu3.png"))); // NOI18N
        mainMenuItem2.setMenuIcon(new AbstractListModel() {
            String[] strings = { "/Assets/icon/s3_1.png", "/Assets/icon/s3_2.png", "/Assets/icon/s3_3.png" };

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        mainMenuItem2.setMenuModel(new AbstractListModel() {
            String[] strings = { "Charts", "Morris", "Flot" };

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        menu.add(mainMenuItem2);

        mainMenuItem4.setBackground(new Color(8, 191, 196));
        mainMenuItem4.setForeground(new Color(3, 66, 178));
        mainMenuItem4.setIcon(new ImageIcon(getClass().getResource("/Assets/icon/menu4.png"))); // NOI18N
        mainMenuItem4.setMenuIcon(new AbstractListModel() {
            String[] strings = { "/Assets/icon/s4_1.png", "/Assets/icon/s4_2.png", "/Assets/icon/s4_3.png" };

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        mainMenuItem4.setMenuModel(new AbstractListModel() {
            String[] strings = { "Maps", "Google Maps", "Vector Maps" };

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        menu.add(mainMenuItem4);

        mainMenuItem5.setBackground(new Color(0, 225, 100));
        mainMenuItem5.setForeground(new Color(178, 17, 225));
        mainMenuItem5.setIcon(new ImageIcon(getClass().getResource("/Assets/icon/menu5.png"))); // NOI18N
        mainMenuItem5.setMenuModel(new AbstractListModel() {
            String[] strings = { "Login" };

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });

        menu.add(mainMenuItem5);

        jMenu1.setText("File");
        jMenuBar.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar.add(jMenu2);

        jMenu3.setText("Options");

        chDarkMode.setText("Dark Mode");
        chDarkMode.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chDarkModeActionPerformed(evt);
            }
        });

        windowOption.setText("window");
        windowOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                option ops = new option();
                ops.shows();
            }
        });

        jMenu3.add(chDarkMode);
        jMenu3.add(windowOption);

        jMenuBar.add(jMenu3);

        frame.setJMenuBar(jMenuBar);

        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(subMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                                .addContainerGap()));

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(menu, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                                        .addComponent(subMenu, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));

        frame.pack();
        frame.setLocationRelativeTo(null);

    }

    private void chDarkModeActionPerformed(ActionEvent evt) {
        if (chDarkMode.isSelected()) {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatDarculaLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        } else {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatIntelliJLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        }
    }

}

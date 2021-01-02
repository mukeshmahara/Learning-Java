/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.problems;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

/**
 *
 * @author Dell
 */

public class JavaProblems {
//     main():application entry point
    public static JFrame window = new JFrame("Game");
    public static boolean isFull = false;
    public static RiverCross river = new RiverCross();
    public static String goatPos = "south";
    public static String boatPos = "south";
    public static String cabbagePos = "south";
    public static String wolfPos = "south";

    public static JButton makeButton(String name, int xPos, int yPos, int width, int height) {
        JButton btn = new JButton(name);
        btn.setBounds(xPos, yPos, width, height);
        window.add(btn);
        return btn;
    }

    public static JLabel makeLabel(String name, int xPos, int yPos, int width, int height) {
        JLabel btn = new JLabel(name);
        btn.setBounds(xPos, yPos, width, height);
        // btn.setIcon(new ImageIcon("./images/cabbage.png"));
        window.add(btn);
        return btn;
    }

    public static void makeInterface() {

        JLabel greenBG = new JLabel();
        greenBG.setBounds(300, 0, 1000, 700); // paramenter pattern-> (x-Cord, y-Cord, Width, Height)
        greenBG.setOpaque(true);
        greenBG.setBackground(Color.GREEN);

        JButton reset_btn = makeButton("Reset", 1050, 30, 100, 30);
        JButton clear_btn = makeButton("Clear All", 1050, 70, 100, 30);
        JButton cabbage_btn = makeButton("Cabbage", 550, 575, 75, 75);
        JButton goat_btn = makeButton("Goat", 750, 575, 75, 75);
        JButton wolf_btn = makeButton("Wolf", 950, 575, 75, 75);
        JButton row_btn = makeButton("Row", 1050, 375, 75, 50);

        JLabel cabbage = makeLabel("Cabbage", 550, 520, 75, 75);
        // cabbage.setIcon(new ImageIcon("./images/cabbage.png"));
        JLabel goat = makeLabel("Goat", 750, 520, 75, 75);
        JLabel wolf = makeLabel("Wolf", 950, 520, 75, 75);
        // JLabel boat = makeLabel("Boat", 740, 425, 100, 100); // 150
        JButton boat_btn = makeButton("Boat", 740, 425, 100, 100); // 150
        // goat.setIcon(new ImageIcon("./goat.png"));

        goat_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                // String action = event.getActionCommand();
                // System.out.print(action);
                if (isFull == false) {
                    if (goatPos == "south") {
                        if (river.getItemStatus(2) == 0 && boatPos == "south") {
                            isFull = true;
                            goatPos = "southBoat";
                            goat.setLocation(775, 460);
                        } else {
                            JOptionPane.showMessageDialog(window, "No goat on north");
                        }
                    }
                    if (goatPos == "north") {
                        if (river.getItemStatus(2) == 1 && boatPos == "north") {
                            goatPos = "northBoat";
                            isFull = true;
                            goat.setLocation(775, 245);
                        } else {
                            JOptionPane.showMessageDialog(window, "No goat on south");
                        }
                    }
                } else if (goatPos == "southBoat") {
                    goatPos = "south";
                    isFull = false;
                    goat.setLocation(750, 520);
                } else if (goatPos == "northBoat") {
                    goatPos = "north";
                    isFull = false;
                    goat.setLocation(750, 175);
                } else {
                    JOptionPane.showMessageDialog(window, "Boat is Full");
                }
            }
        });
        wolf_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if (isFull == false) {
                    if (wolfPos == "south") {
                        if (river.getItemStatus(3) == 0 && boatPos == "south") {
                            isFull = true;
                            wolfPos = "southBoat";
                            wolf.setLocation(775, 460);
                        } else {
                            JOptionPane.showMessageDialog(window, "No wolf on north");
                        }
                    }
                    if (wolfPos == "north") {
                        if (river.getItemStatus(3) == 1 && boatPos == "north") {
                            wolfPos = "northBoat";
                            isFull = true;
                            wolf.setLocation(775, 245);
                        } else {
                            JOptionPane.showMessageDialog(window, "No wolf on south");
                        }
                    }
                } else if (wolfPos == "southBoat") {
                    wolfPos = "south";
                    isFull = false;
                    wolf.setLocation(950, 520);
                } else if (wolfPos == "northBoat") {
                    wolfPos = "north";
                    isFull = false;
                    wolf.setLocation(950, 175);
                } else {
                    JOptionPane.showMessageDialog(window, "Boat is Full");
                }
            }
        });
        cabbage_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if (isFull == false) {
                    if (cabbagePos == "south") {
                        if (river.getItemStatus(1) == 0 && boatPos == "south") {
                            isFull = true;
                            cabbagePos = "southBoat";
                            cabbage.setLocation(775, 460);
                        } else {
                            JOptionPane.showMessageDialog(window, "No cabbage on north");
                        }
                    }
                    if (cabbagePos == "north") {
                        if (river.getItemStatus(1) == 1 && boatPos == "north") {
                            cabbagePos = "northBoat";
                            isFull = true;
                            cabbage.setLocation(775, 245);
                        } else {
                            JOptionPane.showMessageDialog(window, "No cabbage on south");
                        }
                    }
                } else if (cabbagePos == "southBoat") {
                    cabbagePos = "south";
                    isFull = false;
                    cabbage.setLocation(550, 520);
                } else if (cabbagePos == "northBoat") {
                    cabbagePos = "north";
                    isFull = false;
                    cabbage.setLocation(550, 175);
                } else {
                    JOptionPane.showMessageDialog(window, "Boat is Full");
                }
            }
        });
        row_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                isFull = false;
                if (goatPos == "southBoat") {
                    boat_btn.setLocation(740, 250);
                    goat.setLocation(750, 175);
                    goatPos = "north";
                    boatPos = "north";
                    river.row(2);
                } else if (goatPos == "northBoat") {
                    boat_btn.setLocation(740, 425);
                    goat.setLocation(750, 520);
                    goatPos = "south";
                    boatPos = "south";
                    river.row(2);
                } else if (wolfPos == "southBoat") {
                    boat_btn.setLocation(740, 250);
                    wolf.setLocation(950, 175);
                    wolfPos = "north";
                    boatPos = "north";
                    river.row(3);
                } else if (wolfPos == "northBoat") {
                    boat_btn.setLocation(740, 425);
                    wolf.setLocation(950, 520);
                    wolfPos = "south";
                    boatPos = "south";
                    river.row(3);
                } else if (cabbagePos == "southBoat") {
                    boat_btn.setLocation(740, 250);
                    cabbage.setLocation(550, 175);
                    cabbagePos = "north";
                    boatPos = "north";
                    river.row(1);
                } else if (cabbagePos == "northBoat") {
                    boat_btn.setLocation(740, 425);
                    cabbage.setLocation(550, 520);
                    cabbagePos = "south";
                    boatPos = "south";
                    river.row(1);
                } else if (boatPos == "south") {
                    boatPos = "north";
                    boat_btn.setLocation(740, 250);
                    river.row(0);
                } else if (boatPos == "north") {
                    boatPos = "south";
                    boat_btn.setLocation(740, 425);
                    river.row(0);
                }

                String condition = river.checkCondition();
                if (condition != "Nothing") {
                    JOptionPane.showMessageDialog(window, condition);
                }
            }
        });
        reset_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                cabbage.setLocation(550, 520);
                goat.setLocation(750, 520);
                wolf.setLocation(950, 520);
                boat_btn.setLocation(740, 425);
                cabbagePos = "south";
                wolfPos = "south";
                goatPos = "south";
                boatPos = "south";
                isFull = false;
                river.reset();
            }
        });
        clear_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                cabbage.setLocation(550, 520);
                goat.setLocation(750, 520);
                wolf.setLocation(950, 520);
                boat_btn.setLocation(740, 425);
                cabbagePos = "south";
                wolfPos = "south";
                goatPos = "south";
                boatPos = "south";
                isFull = false;
                river.reset();
            }
        });
    }

    public static void main(String[] args) {
        // Coordinate start from TopLeft corner of Screen as (0,0)
        window.setSize(1200, 700); // dimention of window or JFrame (width * height)
        window.setLocation(50, 10); // display window in the given coordinate of Screen
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        makeInterface();
    }
}

class RiverCross {
    public String[] itemsName = { "boat", "cabbage", "goat", "wolf" }; // boat, cabbage, goat, wolf, farmer
    public int[] bank = { 0, 0, 0, 0 };

    public int getItemStatus(int item) {
        return bank[item];
    }

    public void row(int item) {
        if (this.bank[0] == 0) { // if boat is in South and trying to travel to North
            this.bank[item] = 1;
            this.bank[0] = 1;
        } else {
            this.bank[item] = 0;
            this.bank[0] = 0;
        }
    }

    public void reset() {
        this.bank[0] = 0;
        this.bank[1] = 0;
        this.bank[2] = 0;
        this.bank[3] = 0;
    }

    public String checkCondition() {
        int boat = this.bank[0];
        int cabbage = this.bank[1];
        int goat = this.bank[2];
        int wolf = this.bank[3];
        // for cabbage and goat
        if (cabbage == goat && boat == wolf && boat != goat) {
            // System.out.println("The goat ate the cabbage.");
            return "The goat ate the cabbage.";
        }
        // for wolf and goat
        if (wolf == goat && boat == cabbage && boat != goat) {
            // System.out.println("The wolf ate the goat.");
            return "The wolf ate the goat.";
        }
        if (boat * goat * cabbage * wolf == 1) {
            // System.out.println("*** You Won ***");
            return "You Won";
        }
        return "Nothing";
    }
}

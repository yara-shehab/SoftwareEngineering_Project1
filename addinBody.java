
package system_of_the_gym;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class addinBody extends JFrame{
    public static ArrayList<addinBody> listofinbodys = new ArrayList<addinBody>() ;
    String [] hour = {"1","2","3","4","5","6","7","8","9","10","11","12"};
    String [] am_pm = {"am","pm"};
    String [] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    String [] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String [] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    private  String ID;
    private  String Height;
    private  String age;
    private  String gender;
    private  String testdate;
    private  String time;
    private  String bodyfat;
    private  String weight;
    private  String BMI;
    private  String PBF; 
    String [] str = {"Male","Female"};
    public addinBody ()
    {
    this.setLayout(new BorderLayout());
            this.setBounds(200, 200, 600,300);
            this.setMinimumSize(new Dimension(600,300));
            this.setTitle("Add InBody");
            JPanel pnlright = new JPanel();
            JPanel pnlleft = new JPanel();
            JPanel pnlbottom = new JPanel();
            
            
            JLabel lbID = new JLabel("ID");
            JLabel lbHeight = new JLabel("Height");
            JLabel lbAge = new JLabel("Age");
            JLabel lbGender = new JLabel("Gender");
            JLabel lbTestDate = new JLabel("Test Date");
            JLabel lbTime = new JLabel("Time");
            JLabel lbBodyFatMass = new JLabel("Body Fat Mass");
            JLabel lbWeight = new JLabel("Weight");
            JLabel lbBMI = new JLabel("BMI");
            JLabel lbPBF = new JLabel("PBF");
            JButton btnsave = new JButton("save");
           

            
            
            
            Container con = this.getContentPane();
            pnlleft.setLayout(new GridLayout(10,1));
            pnlbottom.add(btnsave);
            con.add(pnlbottom,BorderLayout.SOUTH);
            
            
            
            pnlleft.add(lbID);
            
            pnlleft.add(lbHeight);
            pnlleft.add(lbAge);
            pnlleft.add(lbGender);
            pnlleft.add(lbTestDate);
            pnlleft.add(lbTime);
            pnlleft.add(lbBodyFatMass);
            pnlleft.add(lbWeight);
            pnlleft.add(lbBMI);
            pnlleft.add(lbPBF);


            
            con.add(pnlleft,BorderLayout.WEST);
            
            JTextField txtID = new JTextField();
            JTextField txtHeight = new JTextField();
            txtHeight.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            JTextField txtAge = new JTextField("",20);
            txtAge.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            JComboBox combGender = new JComboBox(str);
            JPanel pnltestdate = new JPanel();
            pnltestdate.setLayout(new GridLayout(1,3));
            JComboBox comdayreg = new JComboBox(day);
            JComboBox commonthreg = new JComboBox(month);
            JTextField txtyearreg = new JTextField();
            txtyearreg.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            pnltestdate.add(comdayreg);
            pnltestdate.add(commonthreg);
            pnltestdate.add(txtyearreg);
            JPanel pnlTime = new JPanel();
            JComboBox comhour = new JComboBox(hour);
            JComboBox comam_pm = new JComboBox(am_pm);
            JComboBox comweek = new JComboBox(week);
            pnlTime.setLayout(new GridLayout(1,3));
            pnlTime.add(comhour);
            pnlTime.add(comam_pm);
            pnlTime.add(comweek);
            JTextField txtBodyFatMass = new JTextField("",20);
            txtBodyFatMass.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            JTextField txtWeight = new JTextField("",20);
            txtWeight.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            JTextField txtBMI = new JTextField("",20);
            txtBMI.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            JTextField txtPBF = new JTextField("",20);
            txtPBF.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            
            pnlright.setLayout(new GridLayout(10, 1));
            pnlright.add(txtID);
            pnlright.add(txtHeight);
            pnlright.add(txtAge);
            pnlright.add(combGender);
            pnlright.add(pnltestdate);
            pnlright.add(pnlTime);
            pnlright.add(txtBodyFatMass);
            pnlright.add(txtWeight);
            pnlright.add(txtBMI);
            pnlright.add(txtPBF);

            
            con.add(pnlright,BorderLayout.EAST);
            btnsave.addActionListener( new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                     addinBody r = new addinBody();
                     
                     int x=0;
                     for(int i=0;i<Reg.listofmembers.size();i++)
                     {
                         if(Reg.listofmembers.get(i).getID1(i).equals(txtID.getText()))
                         {
                             txtID.setText("Repeated ID! Try Again");
                             txtAge.setText("");
                             txtBMI.setText("");
                             txtBodyFatMass.setText("");
                             txtHeight.setText(""); 
                             txtPBF.setText("");
                             txtWeight.setText("");
                             txtyearreg.setText("");
                           
                             x++;
                         }
                     }
                     if(x==0)
                     {
                     r.setID(txtID.getText());
                     r.setheight(txtHeight.getText());
                     r.setage(txtAge.getText());
                     r.setgender(combGender.getSelectedItem().toString());
                     r.settestdate(comdayreg.getSelectedItem().toString()+"/"+commonthreg.getSelectedItem().toString()+"/"+txtyearreg.getText());
                     r.settime(comhour.getSelectedItem().toString()+":"+comam_pm.getSelectedItem().toString()+":"+comweek.getSelectedItem().toString());
                     r.setbodyfat(txtBodyFatMass.getText());
                     r.setweight(txtWeight.getText());
                     r.setBMI(txtBMI.getText());
                     r.setPBF(txtPBF.getText());
                     listofinbodys.add(r);
                     txtID.setText("");
                     txtHeight.setText("");
                     txtAge.setText("");
                     txtyearreg.setText("");
                     txtBodyFatMass.setText(""); 
                     txtWeight.setText("");
                     txtBMI.setText("");
                     txtPBF.setText("");
                     }
                }
            });
           
            this.repaint();
    }
    public void setID(String i)
    {
        this.ID=i;
    }
     public void setheight(String i)
    {
        this.Height=i;
    }
    public void setage(String i)
    {
        this.age=i;
    }
    public void setgender(String i)
    {
        this.gender=i;
    }
    public void settestdate(String i)
    {
        this.testdate=i;
    }
        public void settime(String i)
    {
        this.time=i;
    }
        public void setbodyfat(String i)
    {
        this.bodyfat=i;
    }
        public void setweight(String i)
    {
        this.weight=i;
    }
        public void setBMI(String i)
    {
        this.BMI=i;
    }
        public void setPBF(String i)
    {
        this.PBF=i;
    }
        public String getID1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).ID;
        }
        return s;
    }
        public String getheight1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).Height;
        }
        return s;
    }public String getage1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).age;
        }
        return s;
    }public String getgender1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).gender;
        }
        return s;
    }
    public String gettestdate1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).testdate;
        }
        return s;
    }public String gettime1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).time;
        }
        return s;
    }public String getbodyfat1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).bodyfat;
        }
        return s;
    }public String getweight1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).weight;
        }
        return s;
    }public String getBMI1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).BMI;
        }
        return s;
    }
    public String getPBF1(int y)
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            if(y==i)
            
            s=s+listofinbodys.get(i).PBF;
        }
        return s;
    }
    public  String getID()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).ID+ "\n";
        }
        return s;
    }
    public  String getheight()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).Height+ "\n";
        }
        return s;
    }
    public  String getage()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).age+ "\n";
        }
        return s;
    }public  String getgender()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).gender+ "\n";
        }
        return s;
    }
    public  String gettestdate()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).testdate+ "\n";
        }
        return s;
    }
    public  String gettime()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).time+ "\n";
        }
        return s;
    }
    public  String getbodyfat()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).bodyfat+ "\n";
        }
        return s;
    }
    public  String getweight()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).weight+ "\n";
        }
        return s;
    }
    public  String getBMI()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).BMI+ "\n";
        }
        return s;
    }public  String getPBF()
    {
        String s = "";
        for(int i=0;i<listofinbodys.size();i++)
        {
            
            s=s+listofinbodys.get(i).PBF+ "\n";
        }
        return s;
    }
    }
    
    


package system_of_the_gym;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent.*; 
import java.awt.event.*;
public class Reg extends JFrame {
    public static ArrayList<Reg> listofmembers = new ArrayList<Reg>() ; 
    private  String name;
    private  String ID;
    private  String adress;
    private  String birthdate;
    private  String height;
    private  String weight;
    private  String regdate;
    private  String numofmonth;
    private  String inbody;
    public Reg()
    {
            String [] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
            String [] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
           
        this.setLayout(new BorderLayout());
        this.setBounds(200, 200, 600,300);
        this.setMinimumSize(new Dimension(600,300));
        this.setTitle("Add Member");
            JPanel pnlright = new JPanel();
            JPanel pnlleft = new JPanel();
            JPanel pnlbottom = new JPanel();

            JLabel ID = new JLabel("ID");
            JLabel name = new JLabel("Name");
            JLabel adress = new JLabel("Adress");
            JLabel birth = new JLabel("Birthdate");
            JLabel height = new JLabel("Height");
            JLabel weight = new JLabel("Weight");
            JLabel regdate = new JLabel("Registration Date ");
            JLabel numofmonth = new JLabel("Number of months for your registration");
            JLabel inbody_ok = new JLabel("InBody");
            JCheckBox inbody = new JCheckBox();
            JButton btnsave = new JButton("Save");
            
            Container con = this.getContentPane();
            pnlleft.setLayout(new GridLayout(9,1));
            
            pnlbottom.add(btnsave);
            con.add(pnlbottom,BorderLayout.SOUTH);

            pnlleft.add(ID);
            pnlleft.add(name);
            
            pnlleft.add(adress);
            pnlleft.add(birth);
            pnlleft.add(height);
            pnlleft.add(weight);
            pnlleft.add(regdate);
            pnlleft.add(numofmonth);
            pnlleft.add(inbody_ok);
            con.add(pnlleft,BorderLayout.WEST);
            
            JTextField txtID = new JTextField();
            JTextField txtname = new JTextField();
            JTextField txtadress = new JTextField();
            JPanel pnldate = new JPanel();
            JPanel pnlregdate = new JPanel();
            JTextField txtheight = new JTextField("",20);
            txtheight.addKeyListener(new KeyAdapter() 
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
            JTextField txtweight = new JTextField("",20);
            txtweight.addKeyListener(new KeyAdapter() 
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
            pnlregdate.setLayout(new GridLayout(1,3));
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
            
            pnlregdate.add(comdayreg);
            pnlregdate.add(commonthreg);
            pnlregdate.add(txtyearreg);
            
            JTextField txtnumofmonth = new JTextField("",20);
            txtnumofmonth.addKeyListener(new KeyAdapter() 
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
                    
            pnldate.setLayout(new GridLayout(1,3));
            JComboBox comday = new JComboBox(day);
            JComboBox commonth = new JComboBox(month);
            JTextField txtyear = new JTextField();
            txtyear.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
public void keyReleased(KeyEvent e){} 
public void keyPressed(KeyEvent e){} 
});
   
            pnldate.add(comday);
            pnldate.add(commonth);
            pnldate.add(txtyear);

            pnlright.setLayout(new GridLayout(9, 1));
            pnlright.add(txtID);
            pnlright.add(txtname);
            pnlright.add(txtadress);
            pnlright.add(pnldate);
            pnlright.add(txtheight);
            pnlright.add(txtweight);
            pnlright.add(pnlregdate);
            pnlright.add(txtnumofmonth);
            pnlright.add(inbody);
            
            con.add(pnlright,BorderLayout.EAST);

            btnsave.addActionListener( new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                     Reg r = new Reg();
                     int x=0;
                     for(int i=0;i<Reg.listofmembers.size();i++)
                     {
                         if(Reg.listofmembers.get(i).getID1(i).equals(txtID.getText()))
                         {
                             txtID.setText("Repeated ID! Try Again");
                             txtname.setText("");
                             txtadress.setText("");
                             txtheight.setText("");
                             txtweight.setText(""); 
                             txtnumofmonth.setText("");
                             x++;
                         }
                     }
                     if(x==0)
                     {
                    r.setID(txtID.getText());
                     r.setname(txtname.getText());
                     r.setadress(txtadress.getText());
                     r.setbirthdate(comday.getSelectedItem().toString()+ "/" + commonth.getSelectedItem().toString()+ "/" + txtyear.getText());
                     r.setheight(txtheight.getText());
                    
                     r.setweight(txtweight.getText());
                     r.setregdate(comdayreg.getSelectedItem().toString()+ "/" + commonthreg.getSelectedItem().toString()+ "/" + txtyearreg.getText());
                     r.setnumofmonth(txtnumofmonth.getText());
                     r.setinbody(inbody.isSelected()+"");
                     listofmembers.add(r);
                     txtID.setText("");
                     txtname.setText("");
                     txtadress.setText("");
                     txtheight.setText("");
                     txtweight.setText(""); 
                     txtyear.setText("");
                     txtyearreg.setText("");
                     txtnumofmonth.setText("");
                     }
                    
                }
            });
           
            this.repaint();
    }
    public void setname(String s)
    {
       this.name=s;
    }public void setID(String i)
    {
        this.ID=i;
    }
    public void setadress(String i)
    {
        this.adress=i;
    }public void setbirthdate(String i)
    {
        this.birthdate=i;
    }public void setheight(String i)
    {
        this.height=i;
    }public void setweight(String i)
    {
        this.weight=i;
    }
    public void setregdate(String i)
    {
        this.regdate=i;
    }public void setnumofmonth(String i)
    {
        this.numofmonth=i;
    }
    public void setinbody(String i)
    {
        this.inbody=i;
    }
   
    
      public String getID1(int y)
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            if(y==i)
            s=s+listofmembers.get(i).ID;
        }
        return s;
    }
       public String getname1(int y)
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            if(y==i)
            
            s=s+listofmembers.get(i).name;
        }
        return s;
    }
       public String getadress1(int y)
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            if(y==i)
            
            s=s+listofmembers.get(i).adress;
        }
        return s;
    }
       public String getbirthdate1(int y)
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            if(y==i)
            
            s=s+listofmembers.get(i).birthdate;
        }
        return s;
    }
       public String getheight1(int y)
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            if(y==i)
            
            s=s+listofmembers.get(i).height;
        }
        return s;
    }public String getweight1(int y)
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            if(y==i)
            
            s=s+listofmembers.get(i).weight;
        }
        return s;
    }public String getregdate1(int y)
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            if(y==i)
            
            s=s+listofmembers.get(i).regdate;
        }
        return s;
    }public String getnumofmonth1(int y)
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            if(y==i)
            
            s=s+listofmembers.get(i).numofmonth;
        }
        return s;
    }
    public String getinbody1(int y)
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            if(y==i)
            
            s=s+listofmembers.get(i).inbody;
        }
        return s;
    }
    public String getname()
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            
            s=s+listofmembers.get(i).name+ "\n";
        }
        return s;
    }
    public  String getID()
    {
       String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            
            s=s+listofmembers.get(i).ID+ "\n";
        }
        return s;
    }
     public  String getadress()
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            
            s=s+listofmembers.get(i).adress+ "\n";
        }
        return s;
    }
     public  String getbirthdate()
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            
            s=s+listofmembers.get(i).birthdate+ "\n";
        }
        return s;
    }
     public  String getheight()
    {
       String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            
            s=s+listofmembers.get(i).height+ "\n";
        }
        return s;
    }
     public  String getweight()
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            
            s=s+listofmembers.get(i).weight+ "\n";
        }
        return s;
    }
    public String getregdate()
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            
            s=s+listofmembers.get(i).regdate+ "\n";
        }
        return s;
    }
    public  String getnumofmonth()
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            
            s=s+listofmembers.get(i).numofmonth+ "\n";
        }
        return s;
    }
    public  String getinbody()
    {
        String s = "";
        for(int i=0;i<listofmembers.size();i++)
        {
            
            s=s+listofmembers.get(i).inbody+ "\n";
        }
        return s;
    }
}

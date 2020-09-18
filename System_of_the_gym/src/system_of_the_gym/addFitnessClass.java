package system_of_the_gym;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class  addFitnessClass extends JFrame {
    public static ArrayList<addFitnessClass> listoffitnessclass = new ArrayList<addFitnessClass>() ; 

    private String ID;
    private String name;
    private String time;
    private String nameofthetrainer;

    public addFitnessClass()
    {
        String [] hour = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        String [] am_pm = {"am","pm"};
        String [] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        this.setLayout(new BorderLayout());
        this.setBounds(200, 200, 500,400);
        this.setMinimumSize(new Dimension(500,400));
        this.setTitle("Add Fitness Class");
        Container c = this.getContentPane();
        JPanel pnlright = new JPanel();
        JPanel pnlleft = new JPanel();
        JPanel pnlbottom = new JPanel();
        
            
            
            JLabel lbID = new JLabel("ID");
            JLabel lbName = new JLabel("Name");
            JLabel lbTime = new JLabel("Time Of The Class");
            JLabel lbNameOfTheTrainer = new JLabel("Name Of The Trainer");
            JButton btnSave = new JButton("save");
            pnlbottom.add(btnSave);
            c.add(pnlbottom,BorderLayout.SOUTH);
           
            
            
            pnlleft.setLayout(new GridLayout(4,1));
      
            pnlleft.add(lbID);
            pnlleft.add(lbName);
            pnlleft.add(lbTime);
            pnlleft.add(lbNameOfTheTrainer);
            
            JTextField txtID = new JTextField();
            JTextField txtName = new JTextField();
            JPanel pnlTime = new JPanel();
            JComboBox comhour = new JComboBox(hour);
            JComboBox comam_pm = new JComboBox(am_pm);
            JComboBox comweek = new JComboBox(week);
            pnlTime.setLayout(new GridLayout(1,3));
            pnlTime.add(comhour);
            pnlTime.add(comam_pm);
            pnlTime.add(comweek);
            JTextField txtNameOfTheTrainer = new JTextField();
            
            pnlright.setLayout(new GridLayout(4, 1));
            pnlright.add(txtID);
            pnlright.add(txtName);
            pnlright.add(pnlTime);
            pnlright.add(txtNameOfTheTrainer);
          
            c.add(pnlleft,BorderLayout.WEST);
            c.add(pnlbottom,BorderLayout.SOUTH);
            c.add(pnlright,BorderLayout.EAST);

            
            btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int x=0;
                addFitnessClass r  = new addFitnessClass();
                     for(int i=0;i<addFitnessClass.listoffitnessclass.size();i++)
                     {
                         if(addFitnessClass.listoffitnessclass.get(i).getID1(i).equals(txtID.getText()))
                         {
                             txtID.setText("Repeated ID! Try Again");
                             txtName.setText("");
                             txtNameOfTheTrainer.setText("");
                             x++;
                         }
                     }
                     if(x==0)
                     {
                     
                     r.setID(txtID.getText());
                     r.setname(txtName.getText());           
                     r.settime(comhour.getSelectedItem().toString()+ ":" + comam_pm.getSelectedItem().toString()+ ":" + comweek.getSelectedItem().toString());
                     r.setnameofthetrainer(txtNameOfTheTrainer.getText());
                     listoffitnessclass.add(r);
                     txtID.setText("");
                     txtName.setText(""); 
                     txtNameOfTheTrainer.setText("");
                     }
                    
                }
            });
           
            this.repaint();
    
    }
   public void setID(String i)
   {
       this.ID=i;
   }
    public void setname(String i)
   {
       this.name=i;
   }
    public void settime(String i)
   {
       this.time=i;
   }
    public void setnameofthetrainer(String i)
   {
       this.nameofthetrainer=i;
   }
    public String getID1(int y)
    {
        String s = "";
        for(int i=0;i<listoffitnessclass.size();i++)
        {
            if(y==i)
            
            s=s+listoffitnessclass.get(i).ID;
        }
        return s;
    }
    public String getname1(int y)
    {
        String s = "";
        for(int i=0;i<listoffitnessclass.size();i++)
        {
            if(y==i)
            
            s=s+listoffitnessclass.get(i).name;
        }
        return s;
    }
    public String gettime1(int y)
    {
        String s = "";
        for(int i=0;i<listoffitnessclass.size();i++)
        {
            if(y==i)
            
            s=s+listoffitnessclass.get(i).time;
        }
        return s;
    }
    public String getnameofthetrainer1(int y)
    {
        String s = "";
        for(int i=0;i<listoffitnessclass.size();i++)
        {
            if(y==i)
            
            s=s+listoffitnessclass.get(i).nameofthetrainer;
        }
        return s;
    }
    public  String getname()
    {
       String s = "";
        for(int i=0;i<listoffitnessclass.size();i++)
        {
            
            s=s+listoffitnessclass.get(i).name+ "\n";
        }
        return s;
    }
    public String getID()
    {
    String s = "";
        for(int i=0;i<listoffitnessclass.size();i++)
        {
            
            s=s+listoffitnessclass.get(i).ID+ "\n";
        }
        return s;
    }
    public String gettime()
    {
     String s = "";
        for(int i=0;i<listoffitnessclass.size();i++)
        {
            
            s=s+listoffitnessclass.get(i).time+ "\n";
        }
        return s;
    }
    public String getnameofthetrainer()
    {
   String s = "";
        for(int i=0;i<listoffitnessclass.size();i++)
        {
            
            s=s+listoffitnessclass.get(i).nameofthetrainer+ "\n";
        }
        return s;
    }
    
    
}

    



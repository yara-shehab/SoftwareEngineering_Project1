
package system_of_the_gym;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ListOfFitnessClasses extends JFrame{
    public ListOfFitnessClasses()
    {
        JPanel total = new JPanel();
        Container c = this.getContentPane();
        this.setLayout(new BorderLayout());
        this.setBounds(200, 200, 750, 600);
        this.setMinimumSize(new Dimension(750,600));
        this.setTitle("List Of Fitness Classes");
        JTextArea areaid = new JTextArea();
        JTextArea areaname = new JTextArea();
        JTextArea areaTime = new JTextArea();
        JTextArea areaNameOfTheTrainer = new JTextArea();
        
        areaid.setEnabled(false);
        areaname.setEnabled(false);
        areaTime.setEnabled(false);
        areaNameOfTheTrainer.setEnabled(false);
        
        areaid.setBorder(BorderFactory.createTitledBorder("ID :"));
        areaname.setBorder(BorderFactory.createTitledBorder("Name :"));
        areaTime.setBorder(BorderFactory.createTitledBorder("Time :"));
        areaNameOfTheTrainer.setBorder(BorderFactory.createTitledBorder("Name Of The Trainer :"));
        for(int i=0;i<addFitnessClass.listoffitnessclass.size();i++)
        {
        areaid.setText(addFitnessClass.listoffitnessclass.get(i).getID());
        }
        for(int i=0;i<addFitnessClass.listoffitnessclass.size();i++)
        {
        areaname.setText(addFitnessClass.listoffitnessclass.get(i).getname());
        }
        for(int i=0;i<addFitnessClass.listoffitnessclass.size();i++)
        {
        areaTime.setText(addFitnessClass.listoffitnessclass.get(i).gettime());
        }
        for(int i=0;i<addFitnessClass.listoffitnessclass.size();i++)
        {
        areaNameOfTheTrainer.setText(addFitnessClass.listoffitnessclass.get(i).getnameofthetrainer());
        }
        total.setLayout(new GridLayout(1,4));
        total.add(areaid);
        total.add(areaname);
        total.add(areaTime);
        total.add(areaNameOfTheTrainer);
       
        c.add(total);

    
    }
}

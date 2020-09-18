
package system_of_the_gym;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ListOfInbody extends JFrame{
    public ListOfInbody()
    {
        JPanel total = new JPanel();
        this.setLayout(new BorderLayout());
        this.setBounds(200, 200, 750, 600);
        this.setMinimumSize(new Dimension(750,600));
        Container c = this.getContentPane();
        
        this.setTitle("List Of Inbody");
        JTextArea areaid = new JTextArea();
        JTextArea areaheight = new JTextArea();
        JTextArea areaage = new JTextArea();
        JTextArea areagender = new JTextArea();
        JTextArea areatestdate = new JTextArea();
        JTextArea areatime = new JTextArea();
        JTextArea areabodyfat = new JTextArea();
        JTextArea areaweight = new JTextArea();
        JTextArea areaBMI = new JTextArea();
        JTextArea areaPBF = new JTextArea();


        areaid.setEnabled(false);
        areaheight.setEnabled(false);
        areaage.setEnabled(false);
        areagender.setEnabled(false);
        areatestdate.setEnabled(false);
        areatime.setEnabled(false);
        areabodyfat.setEnabled(false);
        areaweight.setEnabled(false);
        areaBMI.setEnabled(false);
        areaPBF.setEnabled(false);

        for(int i=0;i<addinBody.listofinbodys.size();i++)
        {
        areaid.setText(addinBody.listofinbodys.get(i).getID());
        }
        for(int i=0;i<addinBody.listofinbodys.size();i++)
        {
        areaheight.setText(addinBody.listofinbodys.get(i).getheight());
        }
        for(int i=0;i<addinBody.listofinbodys.size();i++)
        {
        areaage.setText(addinBody.listofinbodys.get(i).getage());
        }
        for(int i=0;i<addinBody.listofinbodys.size();i++)
        {
        areagender.setText(addinBody.listofinbodys.get(i).getgender());
        }
        for(int i=0;i<addinBody.listofinbodys.size();i++)
        {
        areatestdate.setText(addinBody.listofinbodys.get(i).gettestdate());
        }
        for(int i=0;i<addinBody.listofinbodys.size();i++)
        {
        areatime.setText(addinBody.listofinbodys.get(i).gettime());
        }
        for(int i=0;i<addinBody.listofinbodys.size();i++)
        {
        areabodyfat.setText(addinBody.listofinbodys.get(i).getbodyfat());
        }
        for(int i=0;i<addinBody.listofinbodys.size();i++)
        {
        areaweight.setText(addinBody.listofinbodys.get(i).getweight());
        }
        for(int i=0;i<addinBody.listofinbodys.size();i++)
        {
        areaBMI.setText(addinBody.listofinbodys.get(i).getBMI());
        }
        for(int i=0;i<addinBody.listofinbodys.size();i++)
        {
        areaPBF.setText(addinBody.listofinbodys.get(i).getPBF());
        }
        
        areaid.setBorder(BorderFactory.createTitledBorder("ID :"));
        areaheight.setBorder(BorderFactory.createTitledBorder("Height :"));
        areaage.setBorder(BorderFactory.createTitledBorder("Age :"));
        areagender.setBorder(BorderFactory.createTitledBorder("Gender :"));
        areatestdate.setBorder(BorderFactory.createTitledBorder("Test Date :"));
        areatime.setBorder(BorderFactory.createTitledBorder("Time :"));
        areabodyfat.setBorder(BorderFactory.createTitledBorder("Body Fat :"));
        areaweight.setBorder(BorderFactory.createTitledBorder("Weight :"));
        areaBMI.setBorder(BorderFactory.createTitledBorder("BMI :"));
        areaPBF.setBorder(BorderFactory.createTitledBorder("PBF :"));
        
        total.setLayout(new GridLayout(1,10));
        total.add(areaid);
        total.add(areaheight);
        total.add(areaage);
        total.add(areagender);
        total.add(areatestdate);
        total.add(areatime);
        total.add(areabodyfat);
        total.add(areaweight);
        total.add(areaBMI);
        total.add(areaPBF);


        c.add(total);

    }
}


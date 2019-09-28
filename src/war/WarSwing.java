package war;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class WarSwing implements ActionListener{
	
	public static void main(String args[]){





	//WarSwing() {
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(600, 500));
		
		Label title = new Label("The War - WIN or LOSE");
		title.setBounds(173, 20, 184, 18);
		frame.add(title);

		
		Label soldiersImage = new Label("Soldiers Image");
		soldiersImage.setBounds(421, 129, 97, 26);
		frame.add(soldiersImage);
		
		Label terroristsImage = new Label("Terrorists Image");
		terroristsImage.setBounds(422, 316, 107, 18);
		frame.add(terroristsImage);
		
		Label soldiersTitle = new Label("The Energies of Soldiers");
		soldiersTitle.setBounds(139, 60, 158, 26);
		frame.add(soldiersTitle);
		
		Label terroristsTitle = new Label("The Strength of Terrorists");
		terroristsTitle.setBounds(139, 224, 190, 18);
		frame.add(terroristsTitle);
		
		Label soldier1 = new Label("Soldier 1 :");
		soldier1.setBounds(74, 92, 68, 18);
		frame.add(soldier1);
		
		Label soldier2 = new Label("Soldier 2 :");
		soldier2.setBounds(74, 113, 68, 18);
		frame.add(soldier2);
		
		Label soldier3 = new Label("Soldier 3 :");
		soldier3.setBounds(74, 137, 68, 18);
		frame.add(soldier3);
		
		Label soldier4 = new Label("Soldier 4 :");
		soldier4.setBounds(74, 161, 68, 18);
		frame.add(soldier4);
		
		Label soldier5 = new Label("Soldier 5 :");
		soldier5.setBounds(74, 185, 68, 18);
		frame.add(soldier5);
		
		TextField soldier1Energyfield = new TextField();
		soldier1Energyfield.setBounds(173, 89, 134, 18);
		frame.add(soldier1Energyfield);
		
		TextField soldier2Energyfield = new TextField();
		soldier2Energyfield.setBounds(173, 113, 134, 18);
		frame.add(soldier2Energyfield);
		
		TextField soldier3Energyfield = new TextField();
		soldier3Energyfield.setBounds(173, 137, 134, 18);
		frame.add(soldier3Energyfield);
		
		TextField soldier4Energyfield = new TextField();
		soldier4Energyfield.setBounds(173, 161, 134, 18);
		frame.add(soldier4Energyfield);
		
		TextField soldier5Energyfield = new TextField();
		soldier5Energyfield.setBounds(173, 185, 134, 18);
		frame.add(soldier5Energyfield);
		
		Label terrorist1 = new Label("Terrorist 1 :");
		terrorist1.setBounds(74, 255, 79, 18);
		frame.add(terrorist1);
		
		Label terrorist2 = new Label("Terrorist 2 :");
		terrorist2.setBounds(74, 279, 79, 18);
		frame.add(terrorist2);
		
		Label terrorist3 = new Label("Terrorist 3 :");
		terrorist3.setBounds(74, 303, 79, 18);
		frame.add(terrorist3);
		
		Label terrorist4 = new Label("Terrorist 4 :");
		terrorist4.setBounds(74, 330, 79, 18);
		frame.add(terrorist4);
		
		Label terrorist5 = new Label("Terrorist 5 :");
		terrorist5.setBounds(74, 354, 79, 18);
		frame.add(terrorist5);
		
		TextField terrorist1Strengthfield = new TextField();
		terrorist1Strengthfield.setBounds(173, 255, 134, 18);
		frame.add(terrorist1Strengthfield);
		
		TextField terrorist2Strengthfield = new TextField();
		terrorist2Strengthfield.setBounds(173, 279, 134, 18);
		frame.add(terrorist2Strengthfield);
		
		TextField terrorist3Strengthfield = new TextField();
		terrorist3Strengthfield.setBounds(173, 304, 134, 18);
		frame.add(terrorist3Strengthfield);
		
		TextField terrorist4Strengthfield = new TextField();
		terrorist4Strengthfield.setBounds(173, 330, 134, 18);
		frame.add(terrorist4Strengthfield);
		
		TextField terrorist5Strengthfield = new TextField();
		terrorist5Strengthfield.setBounds(173, 354, 134, 18);
		frame.add(terrorist5Strengthfield);
		
		Button startWar = new Button("Start War");
		startWar.setBounds(192, 396, 93, 34);
		frame.add(startWar);
		
		Label output = new Label("...",Label.CENTER);
		output.setBounds(176, 458, 153, 34);
		frame.add(output);
		
		Label Lbl =new Label("");
		Lbl.setBounds(0,300,100,40);
		frame.add(Lbl);
		
		frame.setVisible(true);
		
		startWar.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	
		    	int[] terroristStrength = new int[5];
		    	int[] soldierEnergy = new int[5];
		    	
		    	terroristStrength[0] =  Integer.parseInt(terrorist1Strengthfield.getText());
		    	terroristStrength[1] =  Integer.parseInt(terrorist2Strengthfield.getText());
		    	terroristStrength[2] =  Integer.parseInt(terrorist3Strengthfield.getText());
		    	terroristStrength[3] =  Integer.parseInt(terrorist4Strengthfield.getText());
		    	terroristStrength[4] =  Integer.parseInt(terrorist5Strengthfield.getText());
		    	
		    	soldierEnergy[0] =  Integer.parseInt(soldier1Energyfield.getText());
		    	soldierEnergy[1] =  Integer.parseInt(soldier2Energyfield.getText());
		    	soldierEnergy[2] =  Integer.parseInt(soldier3Energyfield.getText());
		    	soldierEnergy[3] =  Integer.parseInt(soldier4Energyfield.getText());
		    	soldierEnergy[4] =  Integer.parseInt(soldier5Energyfield.getText());
		    	
		    	WarCli cli = new WarCli(soldierEnergy,terroristStrength);
		    	
		    	output.setText(cli.result);
	    }  
	    });
	}
	//}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
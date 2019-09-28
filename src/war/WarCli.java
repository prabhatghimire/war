package war;

public class WarCli {
	
	protected String result = "";

	WarCli(int[] soldierEnergy, int[] terroristStrength){
		for(int soldier=1; soldier<soldierEnergy.length; soldier++){
			for(int terrorist=1; terrorist<terroristStrength.length; terrorist++){
				if(soldierEnergy[soldier] < terroristStrength[terrorist]) {
					result = "LOSE";
				}
				else {
					result = "WIN";
				}
	         }
       }
	}

}

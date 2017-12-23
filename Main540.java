import java.util.*;
import java.io.*;

public class Main540 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		
		int[] teamOfElement = new int[1000000];
		int[] teamInds = new int[2000001]; //positions in teams ArrayList
		String[] split;
		ArrayList<Team> teams = new ArrayList<Team>();
		
		for(int z = 1; true; z++) {
			final int numTeams = Integer.parseInt(br.readLine());
			if(numTeams == 0)
				break;
			
			pw.println("Scenario #" + z);
			teams.clear();
			
			for(int i = 0; i < numTeams; i++) {
				teamInds[i] = -1;
				
				split = br.readLine().split(" ");
				for(int j = 1; j < split.length; j++)
					teamOfElement[Integer.parseInt(split[j])] = i;
			}
			
			int nthTeam = 0;
			int nthElement = 0; //nth element in the team
			
			while(true) {
				split = br.readLine().split(" ");
				if(split[0].equals("STOP"))
					break;
				
				if(split[0].equals("ENQUEUE")) {
					int x = Integer.parseInt(split[1]);
					int team = teamOfElement[x];
					
					if(teamInds[team] == -1) {
						teamInds[team] = teams.size();
						
						Team newTeam = new Team(team);
						newTeam.add(x);
						teams.add(newTeam);
					}
					else
						teams.get(teamInds[team]).add(x);
				}
				else {
					pw.println(teams.get(nthTeam).get(nthElement++));
					
					if(nthElement >= teams.get(nthTeam).size()) {
						teamInds[teams.get(nthTeam).ind] = -1;
						nthTeam++;
						nthElement = 0;
					}
				}
			}
			pw.println();
		}
		
		pw.close();
	}
	
	public static class Team {
		int ind; //kind of their id
		ArrayList<Integer> members;
		
		public Team(int ind) {
			this.ind = ind;
			members = new ArrayList<Integer>();
		}
		
		public void add(int n) {
			members.add(n);
		}
		
		public void clear() {
			members.clear();
		}
		
		public int size() {
			return members.size();
		}
		
		public int get(int x) {
			return members.get(x);
		}
	}
}
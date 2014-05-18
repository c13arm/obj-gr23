package routingAlgoritm;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Queue;


public class Node {

		private ArrayList<Node> neighbors;
		
		private Position position;
		private Queue<Message> sendQueue;
		private boolean requestSent;
		private int timeWaited;
		private Request sendedRequest;
		private Message recievedMessage;
		private boolean hasRecievedMessage;
		
		
		public Node(Position p){
			
			neighbors = new ArrayList<Node>();			
			
			position=p;
			sendQueue= = new Queue<Message>();			
			requestSent=false;
			timeWaited=0;
			sendedRequest=null;
			recievedMessage=null;			
			hasRecievedMessage=false;
			
			
			
		}
		private void printAnswer(Answer a){
			System.out.println(a.getEvent.toString() + "\n");
			
		}
		public void createRequest(int id){
			Request r=new Request(id);
			if (eventExistInTable){				
				r.setSenddirection(from table);				
				queueMessage(r);
				
			}
			else {				
				
				boolean queued=false;
				while (!queued){
					int random = (int )(Math.random() * 8 + 1);
					if (neighbors.get(random)!=null){
						r.setSenddirection(random);
						queueMessage(r);
						queued=true;
					}					
				}				
			}
		}
		public void checkRequest(){
			if (requestSent && timeWaited==maxWaitingTime){
				queueMessage(sendedRequest);
				requestSent=false;		
				
			}
			if (requestSent){
				timeWaited++;
			}
			
		}
		private void findNeighbors(){
			
			Position p=position.getPosToNorth;
			neighbors.add(null);
			if (p.getX>=0 && p.getY>=0 && p.getX <=50 && p.getY<=50){
				neighbors.add(p.getNodeInPos);
			}
			else {
				neighbors.add(null);
			}
			Position p=position.getPosToNorthEast;
			if (p.getX>=0 && p.getY>=0 && p.getX <=50 && p.getY<=50){
				neighbors.add(p.getNodeInPos);
			}
			else {
				neighbors.add(null);
			}
			Position p=position.getPosToEast;
			if (p.getX>=0 && p.getY>=0 && p.getX <=50 && p.getY<=50){
				neighbors.add(p.getNodeInPos);
			}
			else {
				neighbors.add(null);
			}
			Position p=position.getPosToSouthEast;
			if (p.getX>=0 && p.getY>=0 && p.getX <=50 && p.getY<=50){
				neighbors.add(p.getNodeInPos);
			}
			else {
				neighbors.add(null);
			}
			Position p=position.getPosToSouth;
			if (p.getX>=0 && p.getY>=0 && p.getX <=50 && p.getY<=50){
				neighbors.add(p.getNodeInPos);
			}
			else {
				neighbors.add(null);
			}
			Position p=position.getPosToSouthWest;
			if (p.getX>=0 && p.getY>=0 && p.getX <=50 && p.getY<=50){
				neighbors.add(p.getNodeInPos);
			}
			else {
				neighbors.add(null);
			}
			Position p=position.getPosToWest;
			if (p.getX>=0 && p.getY>=0 && p.getX <=50 && p.getY<=50){
				neighbors.add(p.getNodeInPos);
			}
			else {
				neighbors.add(null);
			}
			Position p=position.getPosToNothWest;
			if (p.getX>=0 && p.getY>=0 && p.getX <=50 && p.getY<=50){
				neighbors.add(p.getNodeInPos);
			}
			else {
				neighbors.add(null);
			}
			
			
			
		}
		public void createEvent(){
			Event e=new Event(getTime(),getCurrentId(),position);
			lägg till eventet i tabellen
		}
		public void updateEvent(Event e){
			om inte id finns lägg till händelsen, om den finns jämför längden
			gör detta på bägge hållen
			
		}
		public tabel getEvents(){
			
		}
		private boolean eventExistsInTable(){
			if (id exists in table){
				return true;
			}
			else {
				return false;
			}
		}	
		public void createAgent(){
			Agent a=new Agent();
			a.setvisitedposition(position);
			boolean sended=false;
			while (!sended){
				int random = (int )(Math.random() * 8 + 1);
				if (neighbors.get(random)!=null){
					a.setSenddirection(random);
					queueMessage(a);
					sended=true;
				}
			}
						
		}
		public void queueMessage(Message m){			
			sendQueue.add(m);
		}
		public void recieveMessage(Message m){
			
			if (m.getType()==1){
				m.update();
			}
			else if (m.getType()==2){
				m.update();
			}
			else {
				m.update();
			}
			doneSomethingThisTime=T
		}
		public void setReceivedMessage(Message m){
			recievedMessage=m;
		}
		public boolean hasReceivedMessage(){
			if (recievedMessage==null){
				return 0;
			}
			return 1;
		}
		public void sendMessage(){
			if(!neighbors.get(sendQueue.peek().getSendDirection).hasRecievedMessage()){
				neighbors.get(sendQueue.peek().getSendDirection).setRecievedMessage(sendQueue.remove());
			}
			else {
				Queue newSendQueue=new Queue<>
			}
			
		}
		
		
		
}


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.lang.reflect.Array;
public class Function7 {
	int count = 0; // to loop through number of packets
	/**************Queue Count variables*******************/
	int queue11=0;
	int queue12=0;
	int queue13=0;
	int queue21=0;
	int queue22=0;
	int queue23=0;
	int queue31=0;
	int queue32=0;
	int queue33=0;
	/************ End **********/
	
	/************Calculations Variables************/
	int Qincount11=0;
	int Qoutcount11=0;
	int Qincount12=0;
	int Qoutcount12=0;
	int Qincount13=0;
	int Qoutcount13=0;
	int Qincount21=0;
	int Qoutcount21=0;
	int Qincount22=0;
	int Qoutcount22=0;
	int Qincount23=0;
	int Qoutcount23=0;
	int Qincount31=0;
	int Qoutcount31=0;
	int Qincount32=0;
	int Qoutcount32=0;
	int Qincount33=0;
	int Qoutcount33=0;
	
	ArrayList<Integer> AQcount11 = new ArrayList<Integer>();
	ArrayList<Integer> AQcount12 = new ArrayList<Integer>();
	ArrayList<Integer> AQcount13 = new ArrayList<Integer>();
	ArrayList<Integer> AQcount21 = new ArrayList<Integer>();
	ArrayList<Integer> AQcount22 = new ArrayList<Integer>();
	ArrayList<Integer> AQcount23 = new ArrayList<Integer>();
	ArrayList<Integer> AQcount31 = new ArrayList<Integer>();
	ArrayList<Integer> AQcount32 = new ArrayList<Integer>();
	ArrayList<Integer> AQcount33 = new ArrayList<Integer>();
	long pcketintime11=0;
	long pcketouttime11=0;
	ArrayList<Long> Pintime11 = new ArrayList<Long>();
	ArrayList<Long> Pouttime11 = new ArrayList<Long>();
	ArrayList<Long> Prestime11 = new ArrayList<Long>();
	long pcketintime12=0;
	long pcketouttime12=0;
	ArrayList<Long> Pintime12 = new ArrayList<Long>();
	ArrayList<Long> Pouttime12 = new ArrayList<Long>();
	ArrayList<Long> Prestime12 = new ArrayList<Long>();
	long pcketintime13=0;
	long pcketouttime13=0;
	ArrayList<Long> Pintime13 = new ArrayList<Long>();
	ArrayList<Long> Pouttime13 = new ArrayList<Long>();
	ArrayList<Long> Prestime13 = new ArrayList<Long>();
	long pcketintime21=0;
	long pcketouttime21=0;
	ArrayList<Long> Pintime21 = new ArrayList<Long>();
	ArrayList<Long> Pouttime21 = new ArrayList<Long>();
	ArrayList<Long> Prestime21 = new ArrayList<Long>();
	long pcketintime22=0;
	long pcketouttime22=0;
	ArrayList<Long> Pintime22 = new ArrayList<Long>();
	ArrayList<Long> Pouttime22 = new ArrayList<Long>();
	ArrayList<Long> Prestime22 = new ArrayList<Long>();
	long pcketintime23=0;
	long pcketouttime23=0;
	ArrayList<Long> Pintime23 = new ArrayList<Long>();
	ArrayList<Long> Pouttime23 = new ArrayList<Long>();
	ArrayList<Long> Prestime23 = new ArrayList<Long>();
	long pcketintime31=0;
	long pcketouttime31=0;
	ArrayList<Long> Pintime31 = new ArrayList<Long>();
	ArrayList<Long> Pouttime31 = new ArrayList<Long>();
	ArrayList<Long> Prestime31 = new ArrayList<Long>();
	long pcketintime32=0;
	long pcketouttime32=0;
	ArrayList<Long> Pintime32 = new ArrayList<Long>();
	ArrayList<Long> Pouttime32 = new ArrayList<Long>();
	ArrayList<Long> Prestime32 = new ArrayList<Long>();
	long pcketintime33=0;
	long pcketouttime33=0;
	ArrayList<Long> Pintime33 = new ArrayList<Long>();
	ArrayList<Long> Pouttime33 = new ArrayList<Long>();
	ArrayList<Long> Prestime33 = new ArrayList<Long>();
	
	/************ End ************/	
	int Qpackets = 0;
	int Q2packets = 0;
	int out1 = 0;
	int out2 = 0;
	int out3 = 0;
	int flag = 0;
	int Entered = 0;
	int exit = 0;
	int run = 1;
	int opcount = 0;
	int opcount2 = 0;
	int opcount3 = 0;
	int packetentered = 0;
	int packetleft = 0;
	int packetentered2 = 0;
	int packetleft2 = 0;
	int done = 1;
	int item = 0;
	int item1 = 0;
	int item2 = 0;
	int item3 = 0;
	int Qs11=0;
	int Qs12=0;
	int Qs13=0;
	int Qs21=0;
	int Qs22=0;
	int Qs23=0;
	int Qs31=0;
	int Qs32=0;
	int Qs33=0;
	
	int outcount11=0;
	int outcount12=0;
	int outcount13=0;
	int outcount21=0;
	int outcount22=0;
	int outcount23=0;
	int outcount31=0;
	int outcount32=0;
	int outcount33=0;
	ArrayList<String> list1 = new ArrayList<String>();
	ArrayList<String> list2 = new ArrayList<String>();
	ArrayList<String> list3 = new ArrayList<String>();
	ArrayList<String> compare = new ArrayList<String>();
	String[] line1 = new String[100];
	StringBuilder str = null;
	StringBuilder Removespace = null;
	int countpacket = 0;
	final long startTime = System.currentTimeMillis();

	public void callfunctions() throws IOException {
		
		try {
			/// if (done==1){
			//Convertroutingtable();
			//System.out.println("Done");
			str = convertToHex();
			
			String Packet = null;
			String Ipaddress = null;
			//String Packet = "4A0001F4002D00000106994499E88579D80F222200000000000000000000000000000000000000007552012C000000000000000000000000000000006F686F686A787272726E78696C64777971796D6674676873636667616D7670776370686E6472756970696874706878627779697475786F78637264626466636A79626E686477656D63706E776E78787674796A7463796E6E64706676666B64656B63656B6D617368676B6778687478746C7069767462636D6A6272736C6E6F717073746E73646C68706F6D717076677273686C6D75687379657463786B7271787063676A777471716F796774687063727673736F7671786C6570657562636D62796261676762746E6F616973637374696E667175627776616670737964667363786F77616F6E646174706F756C6D656273686269756E63626B73626571676565716779776B76696D71666C78776D736568766B6374797568706166796E65656461776E66686D6777686D786B77707775756A757575776F69726C7474637466686672707765766F68717369726568736F6A79796A62676A76726A69627376626270717775757571636F656B74726B69706D6C78747673696172776B726B676C7976676B71667861736D6372767161697275646E6B7577637262696F686479756A697767746877626E6C6F7468666C7877776B6E7869706C63";
			//String Ipaddress = "D80F4040";
			//classifier(Packet, Ipaddress);
			//String Decimaladdress = null;
			// String srcIpaddress=null;
			
			// int fetchcounter=0;
			
				// Fetch packets
				// int fetchcounter=0;
				boolean b = true;
					/************** Send packet from here ***************/
				/*************** Delete packet to get next packet ***************/
				while (b) {
					if (!(list1.isEmpty())) {
						//System.out.println("Packet from link 1 : " + item1);
						for (int q = 0; q < 1; q++) {
							Packet = list1.get(item);
							Ipaddress = getdesaddress(Packet);
							classifier(Packet, Ipaddress);
							list1.remove(item);
							item1++;
							Simulation.lblInputLink_1.setText(Integer.toString(item1));
							
						}
						Simulation.lblInputLink_1.setText(Integer.toString(item1));
					}
					
					if (!(list2.isEmpty())) {
						//System.out.println("Packet from link 2 : " + item2);
						for (int q = 0; q < 2; q++) {
							Packet = list2.get(item);
							Ipaddress = getdesaddress(Packet);
							classifier(Packet, Ipaddress);
							list2.remove(item);
							item2++;
							Simulation.lblInputLink_2.setText(Integer.toString(item2));
							// fetchcounter++;
							// System.out.println("Packet from link 2 :
							// "+item2);
						}
						// item2=0;
					}
					if (!(list3.isEmpty())) {
						//System.out.println("Packet from link 3 : " + item3);
						for (int q = 0; q < 4; q++) {
							Packet = list3.get(item);
							Ipaddress = getdesaddress(Packet);
							classifier(Packet, Ipaddress);
							list3.remove(item);
							item3++;
							Simulation.lblInputLink_3.setText(Integer.toString(item3));
							// fetchcounter++;
							// System.out.println("Packet from link 3 :
							// "+item3);
						}
						// item3=0;
					}
					if(list1.isEmpty() && list2.isEmpty() && list3.isEmpty())
					{
						b=false;
						continue;
					}
				}
				//if(Q33.isEmpty())
			//	{
					/*System.out.println("Pintime: "+Pintime11.size()+" : "+Pintime11);
					System.out.println("Pouttime: "+Pouttime11.size()+" : "+Pouttime11);
					System.out.println("Acount: "+AQcount11.size()+" : "+AQcount11);
					System.out.println("Prestime: "+Prestime11.size()+" : "+Prestime11);
					calculations();*/
				//}
			/// No Of Packets In a file
			// System.out.println("Number of packets handled per Input Port 1 :
			/// "+count);

			/*System.out.println("Link 1 : "+opcount);
			System.out.println("Link 2 : "+opcount2);
			System.out.println("Link 3 : "+opcount3);
			//System.out.println("Total 1 : "+AQcount11.get(0));
			System.out.println(Prestime22.size()+" : In Packet : "+Prestime22);
			System.out.println("Size in 11 : "+Pintime22.size());
			System.out.println("Size  out 11: "+Pouttime22.size());
			
			System.out.println("Out Packet : "+AQcount11);*/
		/*	System.out.println("Size  : "+AQcount11.size());
			System.out.println(Q11.size()+" : Q1 : "+Q12.size());
			System.out.println(Q21.size()+" : Q2 : "+Q22.size());
			System.out.println(Q31.size()+" : Q3 : "+Q32.size());
			System.out.println("Queue 2 : "+queue2.size());*/
			
			
			  if(out1==1) 
			  { 
				  String file1= "C:\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks7\\Outputlink1.txt";
				  hextobinary(file1,1); 
			  }
			  if(out2==1) 
			  { 
				  String file2= "C:\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks7\\Outputlink2.txt";
				  hextobinary(file2,2); 
			  }
			  if(out3==1) 
			  { 
		  		  String file3= "C:\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks7\\Outputlink3.txt";
		  		  hextobinary(file3,3); 
			  }
			 
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		}
public static void deletetable() {
	
	File file = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\Links\\RoutingFinal.txt");
	File file1 = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks\\Outputlink1.txt");
	File file2 = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks\\Outputlink2.txt");
	File file3 = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks\\Outputlink3.txt");
	File file4 = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\Binary\\BinaryOutput1");
	File file5 = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\Binary\\BinaryOutput2");
	File file6 = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\Binary\\BinaryOutput3");
	
	if(file.delete() && file1.delete() && file2.delete() && file3.delete() && file4.delete() && file5.delete()&&file6.delete()){
		System.out.println(file.getName() + " is deleted!");
	}else{
		System.out.println("Delete operation is failed.");
	}
		
	}
static String ftable;

	private void Convertroutingtable() throws IOException {

		//String Routing1 = "\\Users\\Pratik\\workspace\\NetworkSimulation\\src\\Links\\Ph2ForwardingTable";
		//System.out.println(ftable);
		InputStream is = new FileInputStream(ftable);
		// InputStream is = new FileInputStream(file);

		int bytesCounter = 0;
		int value = 0;
		StringBuilder sbResult = new StringBuilder();
		StringBuilder sbHex = new StringBuilder();
		StringBuilder sbText = new StringBuilder();
		

		while ((value = is.read()) != -1) {
			// convert to hex value with "X" formatter
			sbHex.append(String.format("%02X", value));

			// if 16 bytes are read, reset the counter,
			// clear the StringBuilder for formatting purpose only.
			if (bytesCounter == 21) {
				sbResult.append(sbHex);
				// sbResult.append(System.getProperty("line.separator"));
				sbResult.append("\n");
				sbHex.setLength(0);
				sbText.setLength(0);
				bytesCounter = 0;
			} else {
				bytesCounter++;
			}
		}

		// if still got content

		 //System.out.println(sbResult);
		 //System.out.println(" ");
		// sbResult=removespace(sbResult);
		File log10 = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\Links\\RoutingFinal7.txt");
		 //System.out.println("done 1");
		PrintWriter routetext = new PrintWriter(new FileWriter(log10, true));
		if (log10.exists() == false) {
			System.out.println("We had to make a new file.");
			log10.createNewFile();
		}
		// routetext.append("");
		routetext.append(sbResult);
		routetext.close();
		//System.out.println("hi : "+routetext);
		is.close();
		return;
	}

public static void opendialog() {
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new java.io.File(".//src//Links"));
		int result = fileChooser.showOpenDialog(fileChooser);
		if (result == JFileChooser.APPROVE_OPTION) {
		    File selectedFile = fileChooser.getSelectedFile();
		    ftable=selectedFile.getAbsolutePath();
		    //System.out.println(Path+ "Selected file: " + selectedFile.getAbsolutePath());
		}
		else
		{
			JOptionPane.showMessageDialog(null, "File Not Selected");
		}
	}
	private void Convertroutingtable1() throws IOException {

		String Routing1 = "\\Users\\Pratik\\workspace\\NetworkssSimulation\\src\\Links\\Ph3ForwardingTable";
		InputStream is = new FileInputStream(Routing1);
		// InputStream is = new FileInputStream(file);

		int bytesCounter = 0;
		int value = 0;
		StringBuilder sbHex = new StringBuilder();
		StringBuilder sbText = new StringBuilder();
		StringBuilder sbResult = new StringBuilder();

		while ((value = is.read()) != -1) {
			// convert to hex value with "X" formatter
			sbHex.append(String.format("%02X", value));

			// if 16 bytes are read, reset the counter,
			// clear the StringBuilder for formatting purpose only.
			if (bytesCounter == 499) {
				sbResult.append(sbHex);
				// sbResult.append(System.getProperty("line.separator"));
				sbResult.append("\n");
				sbHex.setLength(0);
				sbText.setLength(0);
				bytesCounter = 0;
			} else {
				bytesCounter++;
			}
		}

		// if still got content

		// System.out.println(sbResult);
		// sbResult=removespace(sbResult);
		File log2 = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\Links\\RoutingFinal.txt");
		PrintWriter routetext = new PrintWriter(new FileWriter(log2, true));
		if (log2.exists() == false) {
			System.out.println("We had to make a new file.");
			log2.createNewFile();
		}
		// routetext.append("");
		routetext.append(sbResult);
		routetext.close();

		is.close();
		return;
	}
	static String Link1;
	static String Link2;
	static String Link3;
	public static void openfile1() {
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new java.io.File(".//src//Links"));
		int result = fileChooser.showOpenDialog(fileChooser);
		if (result == JFileChooser.APPROVE_OPTION) {
		    File selectedFile = fileChooser.getSelectedFile();
		    Link1=selectedFile.getAbsolutePath();
		  	}
		else
		{
			JOptionPane.showMessageDialog(null, "File Not Selected");
		}
	}
	public static void openfile2() {
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new java.io.File(".//src//Links"));
		int result = fileChooser.showOpenDialog(fileChooser);
		if (result == JFileChooser.APPROVE_OPTION) {
		    File selectedFile = fileChooser.getSelectedFile();
		    Link2=selectedFile.getAbsolutePath();
		  	}
		else
		{
			JOptionPane.showMessageDialog(null, "File Not Selected");
		}
	}
	public static void openfile3() {
	
	JFileChooser fileChooser = new JFileChooser();
	fileChooser.setCurrentDirectory(new java.io.File(".//src//Links"));
	int result = fileChooser.showOpenDialog(fileChooser);
	if (result == JFileChooser.APPROVE_OPTION) {
	    File selectedFile = fileChooser.getSelectedFile();
	    Link3=selectedFile.getAbsolutePath();
	  	}
	else
	{
		JOptionPane.showMessageDialog(null, "File Not Selected");
	}
}
	public StringBuilder convertToHex() throws IOException {
		int incount = 0;
		String Link1 = "\\Users\\Pratik\\workspace\\NetworkSimulation\\src\\Binary4\\Binary1";
		String Link2 = "\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\Binary3\\Binary1";
		String Link3 = "\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\Binary6\\Binary1";
		InputStream is1 = new FileInputStream(Link1);
		InputStream is2 = new FileInputStream(Link2);
		InputStream is3 = new FileInputStream(Link3);
		// final long startTime = System.currentTimeMillis();
		int bytesCounter = 0;
		int value = 0;
		int loopcount = 0;
		StringBuilder sbHex = new StringBuilder();
		// StringBuilder sbText = new StringBuilder();
		StringBuilder sbResult = new StringBuilder();
		// System.out.println(startTime);
		while ((value = is1.read()) != -1 || (value = is2.read()) != -1 || (value = is3.read()) != -1) {
			// convert to hex value with "X" formatter
			sbHex.append(String.format("%02X", value));

			// Entered++;
			// if 16 bytes are read, reset the counter,
			// clear the StringBuilder for formatting purpose only.
		}
		// System.out.println("Hi First");
		for (int i = 0; i < 2300000; i++) {
			if (bytesCounter == 499) {
				// System.out.println("Hi");
				if (incount < 1500) {
					// System.out.println("Hi4");
					String data = sbHex.substring(0, 1000);
					// System.out.println("DATA : "+data);
					list1.add(data);
					sbHex = sbHex.delete(0, 1000);
					incount++;
				} else if (incount < 3000) {
					String data = sbHex.substring(0, 1000);
					list2.add(data);
					sbHex = sbHex.delete(0, 1000);
					incount++;
				} else if (incount < 4500) {
					String data = sbHex.substring(0, 1000);
					list3.add(data);
					sbHex = sbHex.delete(0, 1000);
					incount++;
				}
				bytesCounter = 0;
			} else {
				bytesCounter++;
				// System.out.println("Hi12 : " +bytesCounter);
			}
			// System.out.println(loopcount+" : HiLast if : "+incount);

		}
		is1.close();
		is2.close();
		is3.close();
		return sbHex;
	}

	public String getdesaddress(String daddress) {
		String address = null;

		address = daddress.substring(32, 40);
		return address;

	}

	public String getsrcaddress(String srcaddress) {
		String address = null;

		address = srcaddress.substring(24, 32);
		return address;

	}

	public String fetchpackets(StringBuilder result) {
		String packet = null;
		packet = result.substring(0, 1000);
		// System.out.println(packet.length());
		Entered++;
		// System.out.println("Total No of items Aaya : " +Entered);

		return packet;
	}

	public StringBuilder removespace(StringBuilder string1) {
		for (int i = 0; i < string1.length(); ++i) {
			if (Character.isWhitespace(string1.charAt(i))) {
				string1.deleteCharAt(i);
				i--;
			}
		}
		return string1;
	}

	public String getdecaddr(String ipaddress) {

		String ip = "";

		for (int i = 0; i < ipaddress.length(); i = i + 2) {
			ip = ip + Integer.valueOf(ipaddress.substring(i, i + 2), 16) + ".";
		}
		ip = ip.substring(0, ip.length() - 1);
		// System.out.println("Ip = " + ip);
		return ip;
	}// end getdecaddr

	public void classifier(String packet, String ipaddress) throws IOException {
		
		Entered++;
		String Ret = maskitems(ipaddress);
		String portno=Ret.substring(0, 2);
		String portQ=Ret.substring(2,4);
		//System.out.println("Total No of items Aaya : " + Entered);
		//System.out.println("Port No konsa aaya : "+portno+" : "+portQ);

		// System.out.println("Returning to Classifier Port no hai : "+portno);
		Forwardmodule(packet, portno, portQ);
		////System.out.println("The end Next Packet below ");
		return;
	}// end classifier

	private String maskitems(String ipaddress) {
		String outputport = null;
		String outputqueue = null;
		int long1;
		int longest;
		// String outputqueue = null;
		String Route = "\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\Links\\RoutingFinal7.txt";
		StringBuilder sb = new StringBuilder();
		try {
			/****** Reading forwarding table in array ********/
			BufferedReader br = new BufferedReader(new FileReader(Route));
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				sb.append(sCurrentLine);
			}
			// Get destination address from routing table
			//System.out.println(" Hello ---> : "+sb);
			int length=0;
			length = sb.length() / 44;
			//System.out.println(" Hello : ");
			//System.out.println(" Hello : "+length);
			for (int i = 0; i < length; i++) {
				// System.out.println("IN");
				line1[i] = sb.substring(0, 44);
				// System.out.println("Entry into array no "+i+" : "+line1[i]);
				sb = sb.delete(0, 44);
			}
			/****** Reading forwarding table in array Close ********/
	/******* Comparing forwarding table and masking address to get Outputport   nm ********/
			
			//String breakip = ipaddress.substring(0, 4);
			//System.out.println("New ip : " + breakip);
			ArrayList<String> compare = new ArrayList<String>();
			int countloop=0;
			String comp="00";
			String comp1="00";
			int i=0;
			boolean in=true;
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int j = 0; j < length - 1; j++) {
				int loopcount=0;
				//int countloop=0;
				
				String desmask = line1[j].substring(16, 24);
				String fdesaddr = line1[j].substring(8, 16);
				String FDest=null;
				String And = changenmask(ipaddress,desmask);
				//System.out.println(ipaddress+" : Anding : "+desmask+" = "+And+" Comparing With "+fdesaddr);
				if(And.substring(0,4).equals(fdesaddr.substring(0, 4)))
				{	loopcount++;
				
					if(And.substring(4,6).trim().equals(fdesaddr.substring(4, 6).trim()))
					{	
						
						//arr.add(j);
						if(!(And.substring(4,6).equals("00")))
							loopcount++;
						if(And.substring(6,8).equals(fdesaddr.substring(6, 8)))
						{	
							arr.add(j);
							if(!(And.substring(6,8).equals("00")))
								loopcount++;
						}
					}
					//System.out.println(comp+" C:C "+comp1);
					//D4122000 20 Comparing With D4122000 20 Port 03 TableQ 02 : 03 : 02
					//D4122C00 2C Comparing With D4122C00 2C Port 03 TableQ 03 : 03 : 02
					//
					//int b=Integer.parseInt(comp1,16);
					//System.out.println(a+" a:b "+b);
					if(loopcount>countloop ){
					countloop=loopcount;
					
					outputport = line1[j].substring(32, 34);
					outputqueue = line1[j].substring(34, 36);
					}
					
				
				}
			//	System.out.println(And.substring(4,6)+" : "+fdesaddr.substring(4, 6)+"= Port = "+line1[j].substring(32, 34)+" : "+outputport+" : "+outputqueue);
				//System.out.println(arr.size()+" : "+And+" "+And.substring(4,6)+" Comparing With "+fdesaddr+" "+fdesaddr.substring(4, 6)+" Port "+line1[j].substring(32, 34)+" TableQ "+line1[j].substring(34, 36)+" : "+outputport+" : "+outputqueue);
				
			}
			if(arr.size()==2){
			int a=Integer.parseInt(line1[arr.get(0)].substring(12, 14),16);
			int b=Integer.parseInt(line1[arr.get(1)].substring(12, 14),16);
			if(a>b)
			{
				outputport = line1[arr.get(0)].substring(32, 34);
				outputqueue = line1[arr.get(0)].substring(34, 36);
			}
			else
			{
				outputport = line1[arr.get(1)].substring(32, 34);
				outputqueue = line1[arr.get(1)].substring(34, 36);
			}}
			if (outputport == null) {
				// System.out.println(" Ayya na in else ");
				outputport = line1[length - 1].substring(32, 34);
				outputqueue = line1[length - 1].substring(34, 36);
				//System.out.println(outputport+ " : "+outputqueue);
			}
			br.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		String Ret=outputport.concat(outputqueue);
		return Ret;
	}

	@SuppressWarnings("null")
	private String changenmask(String fDest, String fMask) {
		String Str = "";
		String And=" ";
		for(int i=0;i<7;i=i+2){
		String Octet1=fDest.substring(i,i+2);
		 int j = Integer.parseInt(Octet1, 16);
		 String bin1 = Integer.toBinaryString(j);
		 int bin11=Integer.parseInt(bin1);
		 String Octet2=fMask.substring(i,i+2);
		int j2 = Integer.parseInt(Octet2, 16);
		String bin2 = Integer.toBinaryString(j2);
		int bin12=Integer.parseInt(bin2);
		int bin = j & j2;
		String bin5 = Integer.toHexString(bin);
				/*************Appending zero*************/		
		if(bin5.length()== 1)
			bin5="0".concat(bin5);
			//String bin4=Integer.toString(bin3);
		Str=Str.concat(bin5);
		//System.out.println(Octet1+" : "+bin1+" : "+Octet2+" : "+bin2);
		//System.out.println(bin11+"*"+bin12+" = "+bin+ "--->  "+bin5+" : "+bin5.length());
		
		}
		//System.out.println("Combined : "+Str.toUpperCase());
		return Str.toUpperCase();
	}

	
	Queue<String> queue = new LinkedList<String>();
	private void Forwardmodule(String packet, String dest, String portQ) throws IOException {
		// boolean flag = false; //busy
		// System.out.println("Returned to Forwardmodule");
		String Packet = packet;
		String Destination = dest;
		String Qno=portQ;
		Qpackets++;
		packetentered = packetentered + 1;
		//System.out.println("Packet Entered First Queue : " + packetentered);
		//int q = queue.size();
		/*if (q > 10) {
			Packet = queue.remove();
			Destination = queue.remove();
			// Port = queue.remove();
			Qpackets--;
			q = q - 2;*/
			////System.out.println("Packet Left First Queue : " + packetleft);
			Schnqueue(Packet, Destination,Qno);
			// System.out.println("Packet balance"+(packetentered-packetleft));
			/*if (packetentered - packetleft != 0 && packetentered==40) {
				do {
					// System.out.println("Back from schnqueue");
					Packet = queue.remove();
					Destination = queue.remove();
					// Port = queue.remove();
					flag = 0;
					packetleft = packetleft + 1;
					System.out.println("Packet Left from First Queue ka buffer: " + packetleft);
					Schnqueue(Packet, Destination);
				} while (!queue.isEmpty());// return;
			}
		} else
			return;

*/	}

	/*
	 * private void switchingfabric(String packet, String destination, String
	 * port) throws IOException {
	 * 
	 * //System.out.println("Comes to Switching Fabric");
	 * System.out.println(destination+" : "+port);
	 * Schnqueue(packet,destination,port);
	 * 
	 * }
	 */
	//Queue<String> queue = new LinkedList<String>();
	Queue<String> queue2 = new LinkedList<String>();
	Queue<String> queue3 = new LinkedList<String>();

	private void Schnqueue(String packet, String destination, String qno) throws IOException {

		// System.out.println("Comes to Scheduling and queueing");
		// System.out.println("In scheduling and queueing model : "+port);
		String Packet = packet;
		String Destination = destination;
		/*if(Destination.equals("01"))
			{
			queue.add(Packet);
			queue.add(Destination);
			}
		else if(Destination.equals("02"))
			{
			queue2.add(Packet);
			queue2.add(Destination);
			}
		else if(Destination.equals("03"))
			{
			queue3.add(Packet);
			queue3.add(Destination);
			}*/
		//Sendermodule(Packet, Destination,qno);
		/*************************************************/	
		queue2.add(Packet);
		queue2.add(Destination);
		queue2.add(qno);
		// queue2.add(Port);
		Q2packets++;
		int q = queue2.size();
		String peek = queue2.peek();
		// System.out.println("Queue Size 2 : "+q);
		packetentered2 = packetentered2 + 1;
		//System.out.println("Packet entered Second Queue : "+packetentered2);
		// System.out.println("Count 2 : "+count);
		// int lastpacketcount=15;
		//if (q > 10) {
			// System.out.println("Queue Size Next : "+q);
			Packet = queue2.remove();
			Destination = queue2.remove();
			String no=queue2.remove();
			// Port = queue2.remove();
			Q2packets--;
			// System.out.println("Q2Packet : "+Q2packets);
			q = q - 3;
			// System.out.println("Queue Size 2 : "+q);
			// System.out.println("Queue Size Next Next : "+q);
			packetleft2 = packetleft2 + 1;
		 ////System.out.println("Packet Left Second Queue : "+packetleft2);
		// System.out.println("Destination : "+Destination);
			// System.out.println("Destination port : "+Port);
			// lastpacketcount--;
			Sendermodule(Packet, Destination,no);
			while (!queue2.isEmpty() && packetentered==2413) {
				// System.out.println("Back from 2");
				Packet = queue2.remove();
				Destination = queue2.remove();
				 no=queue2.remove();
				// Port = queue2.remove();
				packetleft2 = packetleft2 + 1;
			 ////System.out.println("Packet Left Second queue ka buffer : "+packetleft2);
				Sendermodule(Packet, Destination,no);
			}
		//}
		/*******************************************************************/
	}
	Queue<String> Q11 = new LinkedList<String>();
	Queue<String> Q12 = new LinkedList<String>();
	Queue<String> Q13 = new LinkedList<String>();
	Queue<String> Q21 = new LinkedList<String>();
	Queue<String> Q22 = new LinkedList<String>();
	Queue<String> Q23 = new LinkedList<String>();
	Queue<String> Q31 = new LinkedList<String>();
	Queue<String> Q32 = new LinkedList<String>();
	Queue<String> Q33 = new LinkedList<String>();
	boolean QFlag1=true;
	boolean QFlag2=true;
	boolean QFlag3=true;
	boolean OutFlag1=true;
	boolean OutFlag11=true;
	boolean OutFlag2=true;
	boolean OutFlag22=true;
	boolean OutFlag3=true;
	boolean OutFlag33=true;
	
	private void Sendermodule(String packet, String destination, String qno) throws IOException {

		// System.out.println("In sender module"+destination+" : "+port );
		String a = "01";
		String b = "02";
		String c = "03";
		if (destination.equals(a)) {
			long packetentertime11=System.currentTimeMillis();
			//pcketintime11.add(packetentertime11);
			
			//System.out.println("Packet Entered in link 1");
			
			File log = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks6\\Outputlink1.txt");
			try {
				if (log.exists() == false) {
					// System.out.println("We had to make a new file 1.");
					log.createNewFile();
				}
				PrintWriter out = new PrintWriter(new FileWriter(log, true));
				// out.append("Destination Ip : "+destination+" Port Number :
				// "+port);
				// out.println("");
				/*********** Two queues ************/
				boolean over=true;
				while(over)
				{
					if(qno.equals("01") && Qs11<Function.Queuein11)
					{
						Q11.add(packet);
						Qincount11++;
						pcketintime11= System.currentTimeMillis();
						Pintime11.add(pcketintime11);
						//System.out.println("Enter time : "+pcketintime11);
						//AQincount11.add(Qcount11);
						/*long packetqueuetime11=System.currentTimeMillis();
						packetqueueintime11.add(packetqueuetime11);*/
						Qs11++;
						queue11++;
						Simulation.lblQ_1.setText(Integer.toString(queue11));
						
				//		System.out.println("Q11: "+Q11.size());
						over=false;
						
					}
					else
						{
						Qs11=0;
						//QFlag1=false;
						} 
					if(qno.equals("02") && Qs12<Function.Queuein12)
					{	
						Q12.add(packet);
						/*long packetqueuetime12=System.currentTimeMillis();
						packetqueueintime12.add(packetqueuetime12);*/
						Qincount12++;
						pcketintime12= System.currentTimeMillis();
						Pintime12.add(pcketintime12);
						Qs12++;
						queue12++;
						Simulation.lblQ_2.setText(Integer.toString(queue12));
						//out.append(packet + "\n");
					//	System.out.println("Q12: "+Q12.size());
						over=false;
					}
					else
					{
						Qs12=0;
						//QFlag1=true;
					}
					if(qno.equals("03") && Qs13<Function.Queuein13)
					{
						Q13.add(packet);
						Qincount13++;
						pcketintime13= System.currentTimeMillis();
						Pintime13.add(pcketintime13);
						//System.out.println("Enter time : "+pcketintime11);
						//AQincount11.add(Qcount11);
						/*long packetqueuetime11=System.currentTimeMillis();
						packetqueueintime11.add(packetqueuetime11);*/
						Qs13++;
						queue13++;
						Simulation.lblQ_11.setText(Integer.toString(queue13));
						
				//		System.out.println("Q11: "+Q11.size());
						over=false;
						
					}
					else
						{
						Qs13=0;
						//QFlag3=false;
						} 
				}
				
				/*********** Two queues end ************/
				if(Q11.size()== Function.Queueout11)
				{
					while(OutFlag1 && OutFlag11 && outcount11<Integer.parseInt(Simulation.text_18.getText()))
					{	
						pcketouttime11= System.currentTimeMillis();
						Pouttime11.add(pcketouttime11);
						String packet1= Q11.remove();
						Qoutcount11++;
						Prestime11.add(Pouttime11.get(outcount11)-Pintime11.get(outcount11));
						exit++;
						out.append(packet1 + "\n");
						outcount11++;
						if(outcount11==Function.Queueout11)
						{
							OutFlag1=true;
							OutFlag11=false;
						}
					}
				}
				if(Q12.size()==Function.Queueout12)
				{
					while(OutFlag1 && !OutFlag11 && outcount12<Integer.parseInt(Simulation.text_19.getText()))
					{
						pcketouttime12= System.currentTimeMillis();
						Pouttime12.add(pcketouttime12);
						String packet1= Q12.remove();
						Qoutcount12++;
						/*long packetouttime= System.currentTimeMillis();
						pcketouttime12.add(packetouttime);*/
						//System.out.println("Total No of items Nikla : " + exit);
						Prestime12.add(Pouttime12.get(outcount12)-Pintime12.get(outcount12));
						exit++;
						out.append(packet1 + "\n");
						outcount12++;
						if(outcount12==Function.Queueout12)
						{
							OutFlag1=false;
							OutFlag11=false;
						}
					}
					
				}
				if(Q13.size()==Function.Queueout13)
				{
					while(!OutFlag1 && !OutFlag11 && outcount13<Integer.parseInt(Simulation.text_20.getText()))
					{
						pcketouttime13= System.currentTimeMillis();
						Pouttime13.add(pcketouttime13);
						String packet1= Q13.remove();
						Qoutcount13++;
						/*long packetouttime= System.currentTimeMillis();
						pcketouttime12.add(packetouttime);*/
						//System.out.println("Total No of items Nikla : " + exit);
						Prestime13.add(Pouttime13.get(outcount13)-Pintime13.get(outcount13));
						System.out.println("Size : "+Prestime13.size());
						exit++;
						out.append(packet1 + "\n");
						outcount13++;
						if(outcount13==Function.Queueout13)
						{
							OutFlag1=true;
							OutFlag11=true;
						}
					}
					
				}
				//out.append(packet + "\n");
				// System.out.println("Packet 1 Printed");
				opcount = opcount + 1;
				Simulation.lblNewLabel.setText(Integer.toString(opcount));
				
				out1 = 1;
				////System.out.println("Total No of items Nikla : " + exit);
				// System.out.println("Number of packets handled per Output Port
				// 1 : "+opcount);
				final long endTime = System.currentTimeMillis();
				
				AQcount11.add((Qincount11-Qoutcount11));
				AQcount12.add((Qincount12-Qoutcount12));
				AQcount13.add((Qincount13-Qoutcount13));
				//System.out.println("Residence 1 : "+(Qincount11-Qoutcount11));
				out.close();
			} catch (IOException e) {
				System.out.println("COULD NOT LOG!!");
			}
		} else if (destination.equals(b) || destination.equals(null)) {
			
			////System.out.println("Packet Entered in link 2");
			File log2 = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks6\\Outputlink2.txt");
			try {
				if (log2.exists() == false) {
					// System.out.println("We had to make a new file 2.");
					log2.createNewFile();
				}
				PrintWriter out = new PrintWriter(new FileWriter(log2, true));
				// out.append("Destination Ip : "+destination+" Port Number :
				// "+port);
				// out.println("");
				/*********** Two queues ************/
				boolean over=true;
				while(over)
				{
					if(qno.equals("01") && Qs21<Function.Queuein21)
					{	
						Q21.add(packet);
						Qincount21++;
						pcketintime21= System.currentTimeMillis();
						Pintime21.add(pcketintime21);
						//System.out.println("IN : "+Q21.size());
						Qs21++;
						queue21++;
						Simulation.lblQ_34.setText(Integer.toString(queue21));
						//out.append(packet + "\n");
						////System.out.println("Q21 : "+Q21.size());
						over=false;
					}
					else{
						Qs21=0;
						//QFlag2=false;
						}
					if(qno.equals("02") && Qs22<Function.Queuein22)
					{
						Q22.add(packet);
						Qincount22++;
						pcketintime22= System.currentTimeMillis();
						Pintime22.add(pcketintime22);
						//System.out.println("IN 2 : "+Q22.size());
						Qs22++;
						queue22++;
						Simulation.lblQ_4.setText(Integer.toString(queue22));
						over=false;
						////System.out.println("Q22 : "+Q22.size());
					}
					else{
						Qs22=0;
						//QFlag2=true;
						}
					if(qno.equals("03") && Qs23<Function.Queuein23)
					{	
						Q23.add(packet);
						Qincount23++;
						pcketintime23= System.currentTimeMillis();
						Pintime23.add(pcketintime23);
						//System.out.println("IN : "+Q21.size());
						Qs23++;
						queue23++;
						Simulation.lblQ_12.setText(Integer.toString(queue23));
						//out.append(packet + "\n");
						////System.out.println("Q21 : "+Q21.size());
						over=false;
					}
					else{
						Qs23=0;
						//QFlag2=false;
						}
					}
				/*********** Two queues end ************/
				if(Q21.size() == Function.Queueout21)
				{
					while(OutFlag2 && OutFlag22 && outcount21<Integer.parseInt(Simulation.text_21.getText()))
					{
						pcketouttime21= System.currentTimeMillis();
						Pouttime21.add(pcketouttime21);
						String packet2= Q21.remove();
						Qoutcount21++;
						
						//System.out.println("OUT : "+Q21.size());
						//System.out.println("Total No of items Nikla : " + exit);
						exit++;
						Prestime21.add(Pouttime21.get(outcount21)-Pintime21.get(outcount21));
						out.append(packet2 + "\n");
						outcount21++;
						
						if(outcount21==Function.Queueout21)
						{
							OutFlag2=true;
							OutFlag22=false;
						}
					}
				}
				if(Q22.size()== Function.Queueout22)
				{
					while(OutFlag2 && !OutFlag22 && outcount22<Integer.parseInt(Simulation.text_22.getText()))
					{	
						pcketouttime22= System.currentTimeMillis();
						Pouttime22.add(pcketouttime22);
						String packet2= Q22.remove();
						Qoutcount22++;

						//System.out.println("OUT 2: "+Q22.size());
						//System.out.println("Total No of items Nikla : " + exit);
						exit++;
						Prestime22.add(Pouttime22.get(outcount22)-Pintime22.get(outcount22));
						out.append(packet2 + "\n");
						outcount22++;
						
						if(outcount22==Function.Queueout22)
						{
							OutFlag2=false;
							OutFlag22=false;
						}
					}
				}
				if(Q23.size() == Function.Queueout23)
				{
					while(!OutFlag2 && !OutFlag22 && outcount23<Integer.parseInt(Simulation.text_23.getText()))
					{
						pcketouttime23= System.currentTimeMillis();
						Pouttime23.add(pcketouttime23);
						String packet3= Q23.remove();
						Qoutcount23++;
						
						//System.out.println("OUT : "+Q21.size());
						//System.out.println("Total No of items Nikla : " + exit);
						exit++;
						Prestime23.add(Pouttime23.get(outcount23)-Pintime23.get(outcount23));
						out.append(packet3 + "\n");
						outcount23++;
						
						if(outcount23==Function.Queueout23)
						{
							OutFlag2=true;
							OutFlag22=true;
						}
					}
				}
				// out.println("");
				// out.println("");
				opcount2 = opcount2 + 1;
				Simulation.lblNewLabel_1.setText(Integer.toString(opcount2));
				//exit++;
				out2 = 1;
				final long endTime = System.currentTimeMillis();
				AQcount21.add((Qincount21-Qoutcount21));
				AQcount22.add((Qincount22-Qoutcount22));
				AQcount23.add((Qincount23-Qoutcount23));
				out.close();
			} catch (IOException e) {
				System.out.println("COULD NOT LOG!!");
			}
		} else if (destination.equals(c)) {
			//System.out.println("Packet Entered in link 3");
			File log3 = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks6\\Outputlink3.txt");
			try {
				if (log3.exists() == false) {
					// System.out.println("We had to make a new file.");
					log3.createNewFile();
				}
				PrintWriter out = new PrintWriter(new FileWriter(log3, true));
				// out.append("Destination Ip : "+destination+" Port Number :
				// "+port);
				//out.println("");
				/*********** Two queues ************/
				boolean over=true;
				while(over)
				{
					if(qno.equals("01") && Qs31<Function.Queuein31)
					{	
						Q31.add(packet);
						pcketintime31= System.currentTimeMillis();
						Pintime31.add(pcketintime31);
						Qincount31++;
						Qs31++;
						queue31++;
						Simulation.lblQ_5.setText(Integer.toString(queue31));
						over=false;
						//System.out.println("Q31 : "+Q31.size());
					}
					else{
						Qs31=0;
						//QFlag3=false;
						}
					
					if(qno.equals("02") && Qs32 <Function. Queuein32)
					{	
						Q32.add(packet);
						pcketintime32= System.currentTimeMillis();
						Pintime32.add(pcketintime32);
						Qincount32++;
						Qs32++;
						queue32++;
						Simulation.lblQ_6.setText(Integer.toString(queue32));
						over=false;
						//out.append(packet);
						//System.out.println("Q32 : "+Q32.size());
						//QFlag3=true;
					}
					else{
						Qs32=0;
						//QFlag3=true;
						}
					if(qno.equals("03") && Qs33<Function.Queuein33)
					{	
						Q33.add(packet);
						pcketintime33= System.currentTimeMillis();
						Pintime33.add(pcketintime33);
						Qincount33++;
						Qs33++;
						queue33++;
						Simulation.lblQ_13.setText(Integer.toString(queue33));
						over=false;
						//System.out.println("Q31 : "+Q31.size());
					}
					else{
						Qs33=0;
						//QFlag3=false;
						}
				}
				/*********** Two queues end ************/
				if(Q31.size()== Function.Queueout31)
				{
					while(OutFlag3 && OutFlag33 && outcount31<Integer.parseInt(Simulation.text_24.getText()))
					{
						pcketouttime31= System.currentTimeMillis();
						Pouttime31.add(pcketouttime31);
						String packet3= Q31.remove();
						Qoutcount31++;
						Prestime31.add(Pouttime31.get(outcount31)-Pintime31.get(outcount31));
						//System.out.println("Total No of items Nikla : " + exit);
						exit++;
						out.append(packet3 + "\n");
						outcount31++;
						if(outcount31==Function.Queueout31)
						{
							OutFlag3=true;
							OutFlag33=false;
						}
					}
				}
				if(Q32.size()== Function.Queueout32)
				{
					while(OutFlag3 && !OutFlag33 && outcount32<Integer.parseInt(Simulation.text_25.getText()))
					{
						pcketouttime32= System.currentTimeMillis();
						Pouttime32.add(pcketouttime32);
						String packet3= Q32.remove();
						Qoutcount32++;
						//	System.out.println("Total No of items Nikla : " + exit);
						exit++;
						Prestime32.add(Pouttime32.get(outcount32)-Pintime32.get(outcount32));
						
						out.append(packet3 + "\n");
						outcount32++;
						if(outcount32==Function.Queueout32)
						{
							OutFlag3=false;
							OutFlag33=false;
						}
					}
				}
				if(Q33.size()== Function.Queueout33)
				{
					while(!OutFlag3 && !OutFlag33 && outcount33<Integer.parseInt(Simulation.text_26.getText()))
					{
						pcketouttime33= System.currentTimeMillis();
						Pouttime33.add(pcketouttime33);
						String packet3= Q33.remove();
						Qoutcount33++;
						Prestime33.add(Pouttime33.get(outcount33)-Pintime33.get(outcount33));
						//System.out.println("Total No of items Nikla : " + exit);
						exit++;
						out.append(packet3 + "\n");
						outcount33++;
						if(outcount33==Function.Queueout33)
						{
							OutFlag3=true;
							OutFlag33=true;
						}
					}
				}
				out3 = 1;
				opcount3 = opcount3 + 1;
				Simulation.lblNewLabel_2.setText(Integer.toString(opcount3));
				//exit++;
				////System.out.println("Total No of items Nikla : " + exit);
				// System.out.println("Number of packets handled per Output Port
				// 3 : "+opcount3);
				final long endTime = System.currentTimeMillis();
				
				AQcount31.add((Qincount31-Qoutcount31));
				AQcount32.add((Qincount32-Qoutcount32));
				AQcount33.add((Qincount33-Qoutcount33));
				out.close();
			} catch (IOException e) {
				System.out.println("COULD NOT LOG!!");
			}
		} /*else {
			//System.out.println("Packet Entered in link 2");
		File log2 = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks\\Outputlink2.txt");
			try {
				if (log2.exists() == false) {
					// System.out.println("We had to make a new file.");
					log2.createNewFile();
				}
				PrintWriter out = new PrintWriter(new FileWriter(log2, true));
				// out.append("Destination Ip : "+destination+" Port Number :
				// "+port);
				// out.println("");
				*//*********** Two queues ************//*
				boolean over=true;
				while(over)
				{
					if(qno.equals("01") && Qs21<Queuein21)
					{	
						Q21.add(packet);
						Qincount21++;
						pcketintime21= System.currentTimeMillis();
						Pintime21.add(pcketintime21);
						//System.out.println("IN  : "+Q21.size());
						Qs21++;
						queue21++;
						Simulation.lblQ_34.setText(Integer.toString(queue21));
						over=false;
						//out.append(packet + "\n");
						//System.out.println("Q21 : "+Q21.size());
						
					}
					
					else{
						Qs21=0;
						QFlag2=false;
						} 
					if(qno.equals("02") && Qs22<Queuein22)
					{
						Q22.add(packet);
						//System.out.println("IN 2 : "+Q22.size());
						Qincount22++;
						pcketintime22= System.currentTimeMillis();
						Pintime22.add(pcketintime22);
						Qs22++;
						queue22++;
						Simulation.lblQ_4.setText(Integer.toString(queue22));
						over=false;
						//out.append(packet + "\n");
						//System.out.println("Q22 : "+Q22.size());
						
					}
						else
						{
							Qs22=0;
							QFlag2=true;
						}
					if(qno.equals("03") && Qs23<Queuein23)
					{	
						Q23.add(packet);
						Qincount23++;
						pcketintime23= System.currentTimeMillis();
						Pintime23.add(pcketintime23);
						//System.out.println("IN : "+Q21.size());
						Qs23++;
						queue23++;
						Simulation.lblQ_12.setText(Integer.toString(queue23));
						//out.append(packet + "\n");
						////System.out.println("Q21 : "+Q21.size());
						over=false;
					}
					else{
						Qs23=0;
						//QFlag2=false;
						}
				}
				*//*********** Two queues end ************//*
				if(Q21.size() == Queueout21)
				{
					while(OutFlag2 && OutFlag22 && outcount21<Integer.parseInt(Simulation.text_21.getText()))
					{
						pcketouttime21= System.currentTimeMillis();
						Pouttime21.add(pcketouttime21);
						String packet1= Q21.remove();
						Qoutcount21++;
						//System.out.println("OUT : "+Q21.size());
						//System.out.println("Total No of items Nikla : " + exit);
						exit++;
						Prestime21.add(Pouttime21.get(outcount21)-Pintime21.get(outcount21));
						out.append(packet1 + "\n");
						outcount21++;
						
						if(outcount21==Queueout21)
						{
							OutFlag2=true;
							OutFlag22=false;
						}
					}
				}
				if(Q22.size()== Queueout22)
				{
					while(OutFlag2 && !OutFlag22 && outcount22<Integer.parseInt(Simulation.text_22.getText()))
					{	
						pcketouttime22= System.currentTimeMillis();
						Pouttime22.add(pcketouttime22);
						String packet1= Q22.remove();
						Qoutcount22++;
						//System.out.println("OUT 2 : "+Q22.size());
					//	System.out.println("Total No of items Nikla : " + exit);
						exit++;
						Prestime22.add(Pouttime22.get(outcount22)-Pintime22.get(outcount22));
						out.append(packet1 + "\n");
						outcount22++;
						
						if(outcount22==Queueout22)
						{
							OutFlag2=false;
							OutFlag22=false;
						}
					}
				}
				if(Q23.size() == Queueout23)
				{
					while(!OutFlag2 && !OutFlag22 && outcount23<Integer.parseInt(Simulation.text_23.getText()))
					{
						pcketouttime23= System.currentTimeMillis();
						Pouttime23.add(pcketouttime23);
						String packet3= Q23.remove();
						Qoutcount23++;
						
						//System.out.println("OUT : "+Q21.size());
						//System.out.println("Total No of items Nikla : " + exit);
						exit++;
						Prestime23.add(Pouttime23.get(outcount23)-Pintime23.get(outcount23));
						out.append(packet3 + "\n");
						outcount23++;
						
						if(outcount23==Queueout23)
						{
							OutFlag2=true;
							OutFlag22=true;
						}
					}
				}
				// out.println("");
				// out.println("");
				opcount2 = opcount2 + 1;
				Simulation.lblNewLabel_1.setText(Integer.toString(opcount2));
				//exit++;
				out2 = 1;
				
				final long endTime = System.currentTimeMillis();
				AQcount21.add((Qincount21-Qoutcount21));
				AQcount22.add((Qincount22-Qoutcount22));
				AQcount23.add((Qincount22-Qoutcount23));
				out.close();
			} catch (IOException e) {
				System.out.println("COULD NOT LOG!!");
			}
		}*/
	while(queue2.isEmpty() && packetentered2==2413 &&
			(		!Q11.isEmpty()||!Q12.isEmpty()||!Q13.isEmpty()||
					!Q21.isEmpty()||!Q22.isEmpty()||!Q23.isEmpty()||
					!Q31.isEmpty()||!Q32.isEmpty()||!Q33.isEmpty())
			)
	{
		System.out.println("Hi");
		while(!Q11.isEmpty())
		{
			File log = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks6\\Outputlink1.txt");
			try {
				if (log.exists() == false) {
					// System.out.println("We had to make a new file 1.");
					log.createNewFile();
				}
				PrintWriter out = new PrintWriter(new FileWriter(log, true));
				
				pcketouttime11= System.currentTimeMillis();
				Pouttime11.add(pcketouttime11);
				String Packet1 = Q11.remove();
				Qoutcount11++;
				//AQoutcount11.add(Qcount11);
				/*long packetouttime= System.currentTimeMillis();
				pcketouttime11.add(packetouttime);*/
				//System.out.println("Total No of items Nikla : " + exit);
				//outcount11++;
				exit++;
				out.append(Packet1 + "\n");
				//System.out.println("Residence 2 : "+(Qincount11-Qoutcount11));
				Prestime11.add(Pouttime11.get(outcount11)-Pintime11.get(outcount11));
				AQcount11.add((Qincount11-Qoutcount11));
				out.close();
			} catch (IOException e) {
				System.out.println("COULD NOT LOG!!");
			}
		}
		while(!Q12.isEmpty())
		{
			File log = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks6\\Outputlink1.txt");
			try {
				if (log.exists() == false) {
					// System.out.println("We had to make a new file 1.");
					log.createNewFile();
				}
				PrintWriter out = new PrintWriter(new FileWriter(log, true));
				pcketouttime12= System.currentTimeMillis();
				Pouttime12.add(pcketouttime12);
				String Packet1 = Q12.remove();
				Qoutcount12++;
				exit++;
				out.append(Packet1 + "\n");
				AQcount12.add((Qincount12-Qoutcount12));
				Prestime12.add(Pouttime12.get(outcount12)-Pintime12.get(outcount12));
				out.close();
			} catch (IOException e) {
				System.out.println("COULD NOT LOG!!");
			}
		}
		while(!Q13.isEmpty())
		{
			File log = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks6\\Outputlink1.txt");
			try {
				if (log.exists() == false) {
					// System.out.println("We had to make a new file 1.");
					log.createNewFile();
				}
				PrintWriter out = new PrintWriter(new FileWriter(log, true));
				pcketouttime13= System.currentTimeMillis();
				Pouttime13.add(pcketouttime13);
				String Packet1 = Q13.remove();
				Qoutcount13++;
				exit++;
				out.append(Packet1 + "\n");
				AQcount13.add((Qincount13-Qoutcount13));
				Prestime13.add(Pouttime13.get(outcount13)-Pintime13.get(outcount13));
				out.close();
			} catch (IOException e) {
				System.out.println("COULD NOT LOG!!");
			}
		}
		while(!Q21.isEmpty())
		{
			File log = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks6\\Outputlink2.txt");
			try {
				if (log.exists() == false) {
					// System.out.println("We had to make a new file 1.");
					log.createNewFile();
				}
				PrintWriter out = new PrintWriter(new FileWriter(log, true));
				pcketouttime21= System.currentTimeMillis();
				Pouttime21.add(pcketouttime21);
				String Packet1 = Q21.remove();
				Qoutcount21++;
			//	System.out.println("Total No of items Nikla : " + exit);
				exit++;
				Prestime21.add(Pouttime21.get(outcount21)-Pintime21.get(outcount21));
				out.append(Packet1 + "\n");
				AQcount21.add((Qincount21-Qoutcount21));
				
				out.close();
			} catch (IOException e) {
				System.out.println("COULD NOT LOG!!");
			}
		}
		while(!Q22.isEmpty())
		{
			File log = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks6\\Outputlink2.txt");
			try {
				if (log.exists() == false) {
					// System.out.println("We had to make a new file 1.");
					log.createNewFile();
				}
				PrintWriter out = new PrintWriter(new FileWriter(log, true));
				pcketouttime22= System.currentTimeMillis();
				Pouttime22.add(pcketouttime22);
				String Packet1 = Q22.remove();
				Qoutcount22++;
				//System.out.println("Total No of items Nikla : " + exit);
				exit++;
				Prestime22.add(Pouttime22.get(outcount22)-Pintime22.get(outcount22));
				out.append(Packet1 + "\n");
				AQcount22.add((Qincount22-Qoutcount22));
				
				out.close();
			} catch (IOException e) {
				System.out.println("COULD NOT LOG!!");
			}
		}
		while(!Q23.isEmpty())
		{
			File log = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks6\\Outputlink2.txt");
			try {
				if (log.exists() == false) {
					// System.out.println("We had to make a new file 1.");
					log.createNewFile();
				}
				PrintWriter out = new PrintWriter(new FileWriter(log, true));
				pcketouttime23= System.currentTimeMillis();
				Pouttime23.add(pcketouttime23);
				String Packet1 = Q23.remove();
				Qoutcount23++;
				//System.out.println("Total No of items Nikla : " + exit);
				exit++;
				Prestime23.add(Pouttime23.get(outcount23)-Pintime23.get(outcount23));
				out.append(Packet1 + "\n");
				AQcount23.add((Qincount23-Qoutcount23));
				
				out.close();
			} catch (IOException e) {
				System.out.println("COULD NOT LOG!!");
			}
		}
		while(!Q31.isEmpty())
		{
			File log = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks6\\Outputlink3.txt");
			try {
				if (log.exists() == false) {
					// System.out.println("We had to make a new file 1.");
					log.createNewFile();
				}
				PrintWriter out = new PrintWriter(new FileWriter(log, true));
				pcketouttime31= System.currentTimeMillis();
				Pouttime31.add(pcketouttime31);
				String Packet3 = Q31.remove();
				Qoutcount31++;
				//System.out.println("Total No of items Nikla : " + exit);
				exit++;
				out.append(Packet3 + "\n");
				AQcount31.add((Qincount31-Qoutcount31));
				Prestime31.add(Pouttime31.get(outcount31)-Pintime31.get(outcount31));
				out.close();
			} catch (IOException e) {
				System.out.println("COULD NOT LOG!!");
			}
		}
		while(!Q32.isEmpty())
		{
			File log = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks6\\Outputlink3.txt");
			try {
				if (log.exists() == false) {
					// System.out.println("We had to make a new file 1.");
					log.createNewFile();
				}
				PrintWriter out = new PrintWriter(new FileWriter(log, true));
				pcketouttime32= System.currentTimeMillis();
				Pouttime32.add(pcketouttime32);
				String Packet3 = Q32.remove();
				Qoutcount32++;
				//System.out.println("Total No of items Nikla : " + exit);
				exit++;
				/*if(Q32.isEmpty())
				{	
					calculations();
				}*/
				out.append(Packet3 + "\n");
				AQcount32.add((Qincount32-Qoutcount32));
				Prestime32.add(Pouttime32.get(outcount32)-Pintime32.get(outcount32));
				out.close();
				
			} catch (IOException e) {
				System.out.println("COULD NOT LOG!!");
			}
		}
		while(!Q33.isEmpty())
		{
			File log = new File("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\OutputLinks6\\Outputlink3.txt");
			try {
				if (log.exists() == false) {
					// System.out.println("We had to make a new file 1.");
					log.createNewFile();
				}
				PrintWriter out = new PrintWriter(new FileWriter(log, true));
				pcketouttime33= System.currentTimeMillis();
				Pouttime33.add(pcketouttime33);
				String Packet3 = Q33.remove();
				Qoutcount33++;
				//System.out.println("Total No of items Nikla : " + exit);
				exit++;
				
				out.append(Packet3 + "\n");
				AQcount33.add((Qincount33-Qoutcount33));
				Prestime33.add(Pouttime33.get(outcount33)-Pintime33.get(outcount33));
				out.close();
				
			} catch (IOException e) {
				System.out.println("COULD NOT LOG!!");
			}
		}
		
	}
	
}
	public void calculations() {
		
		/***********Calculations************/
		//System.out.println("1st : "+AQcount11.size());
		//System.out.println("2nd : "+Prestime11.size());
		
		//calculate mean and done and find max add both plus 1:D
		/***********Q11 mean************/
		if((AQcount11.size()+ 1)%2==0)
		{	
			int Mean11=AQcount11.get((AQcount11.size()/2));
			//System.out.println("Even : " +Mean11);
			Simulation.lblMean.setText(Integer.toString((Mean11/2)));
		}else
		{	
			int Mean11=AQcount11.get((AQcount11.size()/2)+1);
			//System.out.println("Odd" +Mean11);
			Simulation.lblMean.setText(Integer.toString(Mean11/2));
		}
		Collections.sort(AQcount11); 
		int a = AQcount11.get(AQcount11.size() - 1) + 1;
		Simulation.lblMax.setText(Integer.toString(a/2));
		/************************************************************/
		long Mean11 =0;
		for(int i=0;i<Prestime11.size();i++){
		Mean11 = Mean11 + Prestime11.get(i);
		}
		Simulation.lblmeantime11.setText(String.valueOf(Mean11*517/Prestime11.size()));
		
		Collections.sort(Prestime11); 
		long a11 = Prestime11.get(Prestime11.size() - 1);
		Simulation.lblmaxtime11.setText(String.valueOf(a11*717));
		/***********Q11 mean************/
		/***********Q12 mean************/
		if((AQcount12.size()+ 1)%2==0)
		{	
			int Mean12=AQcount12.get((AQcount12.size()/2));
			//System.out.println("Even : " +Mean11);
			Simulation.lblMean12.setText(Integer.toString(Mean12/2));
		}else
		{	
			int Mean12=AQcount12.get((AQcount12.size()/2)+1);
			//System.out.println("Odd" +Mean11);
			Simulation.lblMean12.setText(Integer.toString(Mean12/22));
		}
		Collections.sort(AQcount12); 
		int a12 = AQcount12.get(AQcount12.size() - 1) + 1;
		Simulation.lblMax12.setText(Integer.toString(a12/2));
		/***********************************************/
		long Mean12 =0;
		for(int i=0;i<Prestime12.size();i++){
		Mean12 = Mean12 + Prestime12.get(i);
		}
		Simulation.lblmeantime12.setText(String.valueOf(Mean12/Prestime12.size()));
		
		Collections.sort(Prestime12); 
		long T12 = Prestime12.get(Prestime12.size() - 1);
		Simulation.lblmaxtime12.setText(String.valueOf(T12));
		/***********Q12 mean************/
		/***********Q13 mean************/
		if((AQcount13.size()+ 1)%2==0)
		{	
			int Mean13=AQcount13.get((AQcount13.size()/2));
			//System.out.println("Even : " +Mean11);
			Simulation.lblMean13.setText(Integer.toString(Mean13/2));
		}else
		{	
			int Mean13=AQcount13.get((AQcount13.size()/2)+1);
			//System.out.println("Odd" +Mean11);
			Simulation.lblMean13.setText(Integer.toString(Mean13/2));
		}
		Collections.sort(AQcount13); 
		int a13 = AQcount13.get(AQcount13.size() - 1) + 1;
		Simulation.lblMax13.setText(Integer.toString(a13/2));
		/***********************************************/
		long Mean13 =0;
		for(int i=0;i<Prestime13.size();i++){
		Mean13 = Mean13 + Prestime13.get(i);
		}
		Simulation.lblmeantime13.setText(String.valueOf(Mean13/Prestime13.size()*10));
		
		Collections.sort(Prestime13); 
		long T13 = Prestime13.get(Prestime13.size() - 1);
		Simulation.lblmaxtime13.setText(String.valueOf(T13*2/10));
		/***********Q13 mean************/
		
		/***********Q21 mean************/
		if((AQcount21.size()+ 1)%2==0)
		{	
			int Mean21=AQcount21.get((AQcount21.size()/2));
			//System.out.println("Even : " +Mean11);
			Simulation.lblMean21.setText(Integer.toString(Mean21/2));
		}else
		{	
			int Mean21=AQcount21.get((AQcount21.size()/2)+1);
			//System.out.println("Odd" +Mean11);
			Simulation.lblMean21.setText(Integer.toString(Mean21/2));
		}
		Collections.sort(AQcount21); 
		int a21 = AQcount21.get(AQcount21.size() - 1) + 1;
		Simulation.lblMax21.setText(Integer.toString(a21/2));
		/*******************************************/	
		long Mean21 =0;
		for(int i=0;i<Prestime21.size();i++){
		Mean21 = Mean21 + Prestime21.get(i);
		}
		Simulation.lblmeantime21.setText(String.valueOf(Mean21/Prestime21.size()));
		Collections.sort(Prestime21); 
		long T21 = Prestime21.get(Prestime21.size() - 1);
		Simulation.lblmaxtime21.setText(String.valueOf(T21));
		/***********Q21 mean************/
		
		/***********Q22 mean************/
		if((AQcount22.size()+ 1)%2==0)
		{	
			int Mean22=AQcount22.get((AQcount22.size()/2));
			//System.out.println("Even : " +Mean11);
			Simulation.lblMean22.setText(Integer.toString(Mean22/2));
		}else
		{	
			int Mean22=AQcount22.get((AQcount22.size()/2)+1);
			//System.out.println("Odd" +Mean11);
			Simulation.lblMean22.setText(Integer.toString(Mean22/2));
		}
		Collections.sort(AQcount22); 
		int a22 = AQcount22.get(AQcount22.size() - 1) + 1;
		Simulation.lblMax22.setText(Integer.toString(a22/2));
		/*******************************************/	
		long Mean22 =0;
		for(int i=0;i<Prestime22.size();i++){
		Mean22 = Mean22 + Prestime22.get(i);
		}
		Simulation.lblmeantime22.setText(String.valueOf(Mean22/Prestime22.size()*10));
		
		Collections.sort(Prestime22); 
		long T22 = Prestime22.get(Prestime22.size() - 1);
		Simulation.lblmaxtime22.setText(String.valueOf(T22));
		/***********Q22 mean************/
		
		/***********Q23 mean************/
		if((AQcount23.size()+ 1)%2==0)
		{	
			int Mean23=AQcount23.get((AQcount23.size()/2));
			//System.out.println("Even : " +Mean11);
			Simulation.lblMean23.setText(Integer.toString((Mean23/2)));
		}else
		{	
			int Mean23=AQcount23.get((AQcount23.size()/2)+1);
			//System.out.println("Odd" +Mean11);
			Simulation.lblMean23.setText(Integer.toString(Mean23/2));
		}
		Collections.sort(AQcount23); 
		int a23 = AQcount23.get(AQcount23.size() - 1) + 1;
		Simulation.lblMax23.setText(Integer.toString(a23/2));
		/*******************************************/	
		long Mean23 =0;
		for(int i=0;i<Prestime23.size();i++){
		Mean23 = Mean23 + Prestime23.get(i);
		}
		Simulation.lblmeantime23.setText(String.valueOf(Mean23/Prestime23.size()));
		
		Collections.sort(Prestime23); 
		long T23 = Prestime23.get(Prestime23.size() - 1);
		Simulation.lblmaxtime23.setText(String.valueOf(T23));
		/***********Q23 mean************/
		/***********Q31 mean************/
		if((AQcount31.size()+ 1)%2==0)
		{	
			int Mean31=AQcount31.get((AQcount31.size()/2));
			//System.out.println("Even : " +Mean11);
			Simulation.lblMean31.setText(Integer.toString(Mean31/2));
		}else
		{	
			int Mean31=AQcount31.get((AQcount31.size()/2)+1);
			//System.out.println("Odd" +Mean11);
			Simulation.lblMean31.setText(Integer.toString(Mean31/2));
		}
		Collections.sort(AQcount31); 
		int a31 = AQcount31.get(AQcount31.size() - 1) + 1;
		Simulation.lblMax31.setText(Integer.toString(a31/2));
		/*******************************************/	
		long Mean31 =0;
		for(int i=0;i<Prestime31.size();i++){
		Mean31 = Mean31 + Prestime31.get(i);
		}
		Simulation.lblmeantime31.setText(String.valueOf(Mean31/Prestime31.size()));
		
		Collections.sort(Prestime31);
		long T31 = Prestime31.get(Prestime31.size() - 1);
		Simulation.lblmaxtime31.setText(String.valueOf(T31));
		/***********Q31 mean************/
		/***********Q32 mean************/
		if((AQcount32.size()+ 1)%2==0)
		{
			int Mean32=AQcount32.get((AQcount32.size()/2));
			//System.out.println("Even : " +Mean11);
			Simulation.lblMean32.setText(Integer.toString(Mean32/2));
		}else
		{	
			int Mean32=AQcount32.get((AQcount32.size()/2)+1);
			//System.out.println("Odd" +Mean11);
			Simulation.lblMean32.setText(Integer.toString(Mean32/2));
		}
		Collections.sort(AQcount32); 
		int a32 = AQcount32.get(AQcount32.size() - 1) + 1;
		Simulation.lblMax32.setText(Integer.toString(a32/22));
		/*******************************************/
		long Mean32 =0;
		for(int i=0;i<Prestime32.size();i++){
		Mean32 = Mean32 + Prestime32.get(i);
		}
		Simulation.lblmeantime32.setText(String.valueOf((Mean32/Prestime32.size())/100));
		
		Collections.sort(Prestime32); 
		long T32 = Prestime32.get(Prestime32.size() - 1);
		Simulation.lblmaxtime32.setText(String.valueOf(T32));
		/***********Q32 mean************/
		/***********Q33 mean************/
		if((AQcount33.size()+ 1)%2==0)
		{	
			int Mean33=AQcount33.get((AQcount33.size()/2));
			//System.out.println("Even : " +Mean11);
			Simulation.lblMean33.setText(Integer.toString(Mean33/2));
		}else
		{	
			int Mean33=AQcount33.get((AQcount33.size()/2)+1);
			//System.out.println("Odd" +Mean11);
			Simulation.lblMean33.setText(Integer.toString(Mean33/2));
		}
		Collections.sort(AQcount33); 
		int a33 = AQcount33.get(AQcount33.size() - 1) + 1;
		Simulation.lblMax33.setText(Integer.toString(a33/2));
		/*******************************************/	
		long Mean33 =0;
		for(int i=0;i<Prestime33.size();i++){
		Mean33 = Mean33 + Prestime33.get(i);
		}
		Simulation.lblmeantime33.setText(String.valueOf((Mean33/Prestime33.size())/100));
		
		Collections.sort(Prestime33);
		long T33 = Prestime33.get(Prestime33.size() - 1);
		Simulation.lblmaxtime33.setText(String.valueOf(T33));
		/***********Q33 mean************/
		
	}


	int packcount[]=new int[4];
	private void setoutpackets(int i,int opcount) {
		packcount[i]=opcount;
		//return packcount[i];
	}
	public int getoutpackets1() {
		return opcount;
	}
	public int getoutpackets2() {
		return opcount2;
	}
	public int getoutpackets3() {
		return opcount3;
	}
	public int getinpackets1() {
		return item1;
	}
	public int getinpackets2() {
		return item2;
	}
	public int getinpackets3() {
		return item3;
	}
	public void hextobinary(String file, int a) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file)); // to read
																		// a
																		// single
																		// line
																		// from
																		// the
																		// file
		int read;
		String src = new String(); // to store the string obtained from buffered
									// reader

		if (a == 1) {
			PrintWriter writer = new PrintWriter("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\Binary6\\BinaryOutput1");
			src = br.readLine();
			while (src != null) {
				src = src.replace(" ", ""); // Trim out the spaces
				for (int i = 0; i < src.length(); i += 2) {
					read = Integer.parseInt(src.substring(i, i + 2), 16); // convert
																			// the
																			// String
																			// to
																			// hex
																			// integer
					writer.print((char) read); // convert hex to char and write
												// into file
				}
				src = br.readLine();
			}
			writer.flush();
		} else if (a == 2) {
			PrintWriter writer = new PrintWriter("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\Binary6\\BinaryOutput2");
			src = br.readLine();
			while (src != null) {
				src = src.replace(" ", ""); // Trim out the spaces
				for (int i = 0; i < src.length(); i += 2) {
					read = Integer.parseInt(src.substring(i, i + 2), 16); // convert
																			// the
																			// String
																			// to
																			// hex
																			// integer
					writer.print((char) read); // convert hex to char and write
												// into file
				}
				src = br.readLine();
			}
			writer.flush();
		} else if (a == 3) {
			PrintWriter writer = new PrintWriter("\\Users\\Pratik\\workspace\\NetworksSimulation\\src\\Binary6\\BinaryOutput3");
			src = br.readLine();
			while (src != null) {
				src = src.replace(" ", ""); // Trim out the spaces
				for (int i = 0; i < src.length(); i += 2) {
					read = Integer.parseInt(src.substring(i, i + 2), 16); // convert
																			// the
																			// String
																			// to
																			// hex
																			// integer
					writer.print((char) read); // convert hex to char and write
												// into file
				}
				src = br.readLine();
			}
			writer.flush();
		}
		// read an input line from the file

	}

/*	public void setvalue(int qin11, int qin12, int qin13, int qin21, int qin22, int qin23, int qin31, int qin32, int qin33, int qout11, int qout12, int qout13, int qout21, int qout22, int qout23, int qout31, int qout32, int qout33) {
		Queuein11=qin11;	Queuein21=qin21;	Queuein31=qin31;
		Queuein12=qin12;	Queuein22=qin22;	Queuein32=qin32;
		Queuein13=qin13;	Queuein23=qin23;	Queuein33=qin33;
		Queueout11=qout11;	Queueout21=qout21;	Queueout31=qout31;
		Queueout12=qout12;	Queueout22=qout22;	Queueout32=qout32;
		Queueout12=qout13;	Queueout22=qout23;	Queueout32=qout33;

		
	}*/

	
}// end function

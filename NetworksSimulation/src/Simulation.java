import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.DateTime;
//MD1
public class Simulation {

	/**
	 * Launch the application.
	 * @param args
	 */
	
	static Label lblNewLabel;
	static Label lblNewLabel_1;
	static Label lblNewLabel_2;
	private static Label lblNoOfPackets;
	static Label lblInputLink_3;
	private static Label lblNoOfPackets_1;
	private static Label lblNewLabel_3;
	static Label lblInputLink_1;
	static Label lblInputLink;
	static Label lblInputLink_2;
	private static Label lblLink;
	private static Label lblLink_1;
	private static Label lblLink_2;
	private static Label lblInputRate;
	private static Label lblOutputRate;
	private static Label lblQ_3;
	private static Text text;
	private static Text text_1;
	private static Text text_6;
	private static Text text_7;
	private static Text text_2;
	private static Text text_3;
	private static Text text_4;
	private static Text text_5;
	private static Text text_8;
	private static Text text_9;
	private static Text text_10;
	private static Text text_11;
	static Label lblQueues;
	static Label lblQ_1;
	static Label lblQ_2;
	static Label lblQ_34;
	static Label lblQ_4;
	static Label lblQ_5;
	static Label lblQ_6;
	private static Label lblMeanAndMax;
	static Label lblMean;
	static Label lblMax;
	 static Label lblMean12;
	 static Label lblMax12;
	 static Label lblMean21;
	 static Label lblMax21;
	 static Label lblMean22;
	 static Label lblMax22;
	 static Label lblMean31;
	 static Label lblMax31;
	 static Label lblMean32;
	 static Label lblMax32;
	 private static Label lblNewLabel_4;
	 private static Label lblQ;
	 private static Label lblQ_7;
	 private static Label lblQ_8;
	 private static Label lblQ_9;
	 private static Label lblQ_10;
	 private static Label lblMeanTimeAnd;
	 static Label lblmeantime11;
	 static Label lblmaxtime11;
	  static Label lblmeantime12;
	  static Label lblmeantime21;
	  static Label lblmeantime22;
	  static Label lblmeantime31;
	  static Label lblmeantime32;
	  static Label lblmaxtime12;
	  static Label lblmaxtime21;
	  static Label lblmaxtime22;
	  static Label lblmaxtime31;
	  static Label lblmaxtime32;
	  private static Label lblTime;
	  private static Button btnNewButton;
	  private static Button btnNewButton_1;
	  private static Button btnFile;
	  private static Button btnForwarding;
	  private static Text text_12;
	  private static Text text_13;
	  private static Text text_14;
	  private static Text text_15;
	  private static Text text_16;
	  private static Text text_17;
	  static Label lblQ_11;
	   static Label lblQ_12;
	   static Label lblQ_13;
	  private static Label lblQ_14;
	  private static Label lblQ_15;
	  private static Label lblQ_16;
	   static Label lblMean13;
	   static Label lblMean23;
	   static Label lblMean33;
	   static Label lblMax13;
	   static Label lblMax23;
	   static Label lblMax33;
	   static Label lblmeantime13;
	   static Label lblmeantime23;
	   static Label lblmeantime33;
	   static Label lblmaxtime13;
	   static Label lblmaxtime23;
	   static Label lblmaxtime33;
	    static Text text_18;
	    static Text text_19;
	    static Text text_20;
	    static Text text_21;
	    static Text text_22;
	    static Text text_23;
	    static Text text_24;
	    static Text text_25;
	    static Text text_26;
	   private static Label lblEnterWeightsBelow;
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(1000, 752);
		shell.setText("Network Simulator - Phase 3 MD1");
		shell.setLayout(new GridLayout(7, false));
		new Label(shell, SWT.NONE);
		
		lblTime = new Label(shell, SWT.NONE);
		lblTime.setText("Time");
		new Label(shell, SWT.NONE);
		
		lblNoOfPackets_1 = new Label(shell, SWT.NONE);
		GridData gd_lblNoOfPackets_1 = new GridData(SWT.CENTER, SWT.CENTER, false, false, 3, 1);
		gd_lblNoOfPackets_1.widthHint = 200;
		lblNoOfPackets_1.setLayoutData(gd_lblNoOfPackets_1);
		lblNoOfPackets_1.setText("No Of Packets Handled");
		
		lblQueues = new Label(shell, SWT.NONE);
		lblQueues.setText("Queues");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		lblInputLink = new Label(shell, SWT.NONE);
		lblInputLink.setText("Input Link");
		new Label(shell, SWT.NONE);
		
		lblNoOfPackets = new Label(shell, SWT.NONE);
		lblNoOfPackets.setText("Output Link");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		Button button = new Button(shell, SWT.NONE);
		GridData gd_button = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_button.heightHint = 23;
		button.setLayoutData(gd_button);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Function f1 = new Function();
				boolean h = true;
				//System.out.println(Function.ftable);
				if(!(Function.ftable==null)|| h){
					if(!(Function.Link1==null)||h){
						if(!(Function.Link2==null)|| !(btnNewButton_1.isEnabled())){
							if(!(Function.Link3==null)|| !(btnFile.isEnabled())){
						
				try {
					try
					{	Function.deletetable();
					    int Qin11 = Integer.parseInt(text.getText());
					    int Qin12 = Integer.parseInt(text_1.getText());
					    int Qin13 = Integer.parseInt(text_12.getText());
					    int Qin21 = Integer.parseInt(text_2.getText());
					    int Qin22 = Integer.parseInt(text_3.getText());
					    int Qin23 = Integer.parseInt(text_13.getText());
					    int Qin31 = Integer.parseInt(text_4.getText());
					    int Qin32 = Integer.parseInt(text_5.getText());
					    int Qin33 = Integer.parseInt(text_14.getText());
					    
					    int a = Integer.parseInt(text_6.getText())/4000;
					    int Qout11 = a;
					    int b = Integer.parseInt(text_7.getText())/4000;
					    int Qout12 = b;
					    int Qout13 = Integer.parseInt(text_15.getText())/4000;
					    int c = Integer.parseInt(text_8.getText())/4000;
					    int Qout21 = c;
					    int d = Integer.parseInt(text_10.getText())/4000;
					    int Qout22 = d;
					    int Qout23 = Integer.parseInt(text_16.getText())/4000;
					    int f = Integer.parseInt(text_9.getText())/4000;
					    int Qout31 = f;
					    int Qout32 = Integer.parseInt(text_11.getText())/4000;
					    int Qout33 = Integer.parseInt(text_17.getText())/4000;
					    
					    f1.setvalue(Qin11,Qin12,Qin13,Qin21,Qin22,Qin23,Qin31,Qin32,Qin33,Qout11,Qout12,Qout13,Qout21,Qout22,Qout23,Qout31,Qout32,Qout33);
					    //System.out.println(actualValue);
					}
					catch (NumberFormatException e1)
					{
					    System.out.println("Not a number");
					}
					//lblTime.setText(String.valueOf(System.currentTimeMillis()));
					f1.callfunctions();
					//f1.calculations();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
					}
				}
			else
			{
				JOptionPane.showMessageDialog(null, "Please Select Link 3 ");
			}			
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please Select Link 2 ");
				}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Please Select Link 1 ");
					}
			}else
			{
				JOptionPane.showMessageDialog(null, "Please Select Forwarding Table ");
			}
					
		}
	});
		button.setText("Start");
		Function f1 = new Function();
		
		btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setEnabled(false);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Function.openfile1();
			}
		});
		btnNewButton.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		btnNewButton.setText("File 1");
		
		lblInputLink_1 = new Label(shell, SWT.NONE);
		lblInputLink_1.setText("Input Link 1");
			new Label(shell, SWT.NONE);
		
			lblNewLabel = new Label(shell, SWT.NONE);
			lblNewLabel.setText("Output Link 1");
		
		lblQ_1 = new Label(shell, SWT.NONE);
		lblQ_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblQ_1.setText("Q11");
		lblQ_1.setSize(30, 10);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		lblQ_2 = new Label(shell, SWT.NONE);
		lblQ_2.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblQ_2.setText("Q12");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		lblQ_11 = new Label(shell, SWT.NONE);
		lblQ_11.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblQ_11.setText("Q13");
		new Label(shell, SWT.NONE);
		
		btnForwarding = new Button(shell, SWT.NONE);
		btnForwarding.setEnabled(false);
		btnForwarding.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Function.opendialog();
			}
		});
		btnForwarding.setText("Forwarding Table");
		
		btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Function.openfile2();
			}
		});
		btnNewButton_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		btnNewButton_1.setText("File 2");
		
		lblInputLink_2 = new Label(shell, SWT.NONE);
		lblInputLink_2.setText("Input Link 2");
		new Label(shell, SWT.NONE);
		
		lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setText("Output Link 2");
		
		lblQ_34 = new Label(shell, SWT.NONE);
		lblQ_34.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblQ_34.setText("Q21");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		lblQ_4 = new Label(shell, SWT.NONE);
		lblQ_4.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblQ_4.setText("Q22");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		lblQ_12 = new Label(shell, SWT.NONE);
		lblQ_12.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblQ_12.setText("Q23");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		btnFile = new Button(shell, SWT.NONE);
		btnFile.setEnabled(false);
		btnFile.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Function.openfile3();
			}
		});
		btnFile.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		btnFile.setText("File 3");
		
		lblInputLink_3 = new Label(shell, SWT.NONE);
		lblInputLink_3.setText("Input link 3");
		new Label(shell, SWT.NONE);
		
		lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setText("Output Link 2");
		
		lblQ_5 = new Label(shell, SWT.NONE);
		lblQ_5.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblQ_5.setText("Q31");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		lblQ_6 = new Label(shell, SWT.NONE);
		lblQ_6.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblQ_6.setText("Q32");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		lblQ_13 = new Label(shell, SWT.NONE);
		lblQ_13.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblQ_13.setText("Q33");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		lblLink = new Label(shell, SWT.NONE);
		GridData gd_lblLink = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblLink.widthHint = 64;
		lblLink.setLayoutData(gd_lblLink);
		lblLink.setText("Link1");
		
		lblLink_1 = new Label(shell, SWT.NONE);
		GridData gd_lblLink_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblLink_1.widthHint = 78;
		lblLink_1.setLayoutData(gd_lblLink_1);
		lblLink_1.setText("Link2");
		
		lblLink_2 = new Label(shell, SWT.NONE);
		lblLink_2.setText("Link3");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		lblInputRate = new Label(shell, SWT.NONE);
		lblInputRate.setText("Input Rate");
		new Label(shell, SWT.NONE);
		
		text = new Text(shell, SWT.BORDER);
		text.setText("5");
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setText("7");
		GridData gd_text_2 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text_2.widthHint = 69;
		text_2.setLayoutData(gd_text_2);
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setText("6");
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setText("5");
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setText("7");
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setText("6");
		text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_12 = new Text(shell, SWT.BORDER);
		text_12.setText("5");
		text_12.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		text_13 = new Text(shell, SWT.BORDER);
		text_13.setText("7");
		text_13.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		text_14 = new Text(shell, SWT.BORDER);
		text_14.setText("6");
		text_14.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		lblOutputRate = new Label(shell, SWT.NONE);
		lblOutputRate.setText("Output Rate");
		new Label(shell, SWT.NONE);
		
		text_6 = new Text(shell, SWT.BORDER);
		text_6.setText("124000");
		text_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		text_8 = new Text(shell, SWT.BORDER);
		text_8.setText("172000");
		text_8.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		text_9 = new Text(shell, SWT.BORDER);
		text_9.setText("196000");
		text_9.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_7 = new Text(shell, SWT.BORDER);
		text_7.setText("124000");
		text_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		text_10 = new Text(shell, SWT.BORDER);
		text_10.setText("172000");
		text_10.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		text_11 = new Text(shell, SWT.BORDER);
		text_11.setText("196000");
		text_11.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		text_15 = new Text(shell, SWT.BORDER);
		text_15.setText("124000");
		text_15.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		text_16 = new Text(shell, SWT.BORDER);
		text_16.setText("172000");
		text_16.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		text_17 = new Text(shell, SWT.BORDER);
		text_17.setText("196000");
		text_17.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		lblEnterWeightsBelow = new Label(shell, SWT.NONE);
		lblEnterWeightsBelow.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblEnterWeightsBelow.setText("Enter Weights Below");
		new Label(shell, SWT.NONE);
		
		lblMeanAndMax = new Label(shell, SWT.NONE);
		GridData gd_lblMeanAndMax = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
		gd_lblMeanAndMax.heightHint = 20;
		lblMeanAndMax.setLayoutData(gd_lblMeanAndMax);
		lblMeanAndMax.setText("Mean r And Max R Mean");
		new Label(shell, SWT.NONE);
		
		lblMeanTimeAnd = new Label(shell, SWT.NONE);
		lblMeanTimeAnd.setText("Mean Time And Max Time");
		new Label(shell, SWT.NONE);
		
		text_18 = new Text(shell, SWT.BORDER);
		text_18.setText("1");
		GridData gd_text_18 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text_18.widthHint = 59;
		
		//text_27.setSize(10, 10);
		text_18.setLayoutData(gd_text_18);
		
		lblNewLabel_4 = new Label(shell, SWT.NONE);
		GridData gd_lblNewLabel_4 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblNewLabel_4.widthHint = 40;
		lblNewLabel_4.setLayoutData(gd_lblNewLabel_4);
		lblNewLabel_4.setText("Q11");
		
		lblMean = new Label(shell, SWT.NONE);
		lblMean.setText("Mean 11");
		
		lblMax = new Label(shell, SWT.NONE);
		lblMax.setText("Max 11");
		new Label(shell, SWT.NONE);
		
		lblmeantime11 = new Label(shell, SWT.NONE);
		lblmeantime11.setText("Mean 11");
		
		lblmaxtime11 = new Label(shell, SWT.NONE);
		lblmaxtime11.setText("Max 11");
		
		text_19 = new Text(shell, SWT.BORDER);
		text_19.setText("2");
		text_19.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		lblQ = new Label(shell, SWT.NONE);
		lblQ.setText("Q12");
		
		lblMean12 = new Label(shell, SWT.NONE);
		lblMean12.setText("Mean 12");
		
		lblMax12 = new Label(shell, SWT.NONE);
		lblMax12.setText("Max 12");
		new Label(shell, SWT.NONE);
		
		lblmeantime12 = new Label(shell, SWT.NONE);
		lblmeantime12.setText("Mean 12");
		
		lblmaxtime12 = new Label(shell, SWT.NONE);
		lblmaxtime12.setText("Max 12");
		
		text_20 = new Text(shell, SWT.BORDER);
		text_20.setText("3");
		text_20.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		lblQ_14 = new Label(shell, SWT.NONE);
		lblQ_14.setText("Q13");
		
		lblMean13 = new Label(shell, SWT.NONE);
		lblMean13.setText("Mean 13");
		
		lblMax13 = new Label(shell, SWT.NONE);
		lblMax13.setText("Max 13");
		new Label(shell, SWT.NONE);
		
		lblmeantime13 = new Label(shell, SWT.NONE);
		lblmeantime13.setText("Mean 13");
		
		lblmaxtime13 = new Label(shell, SWT.NONE);
		lblmaxtime13.setText("Max 13");
		
		text_21 = new Text(shell, SWT.BORDER);
		text_21.setText("1");
		text_21.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		lblQ_7 = new Label(shell, SWT.NONE);
		lblQ_7.setText("Q21");
		
		lblMean21 = new Label(shell, SWT.NONE);
		lblMean21.setText("Mean 21");
		
		lblMax21 = new Label(shell, SWT.NONE);
		lblMax21.setText("Max 21");
		new Label(shell, SWT.NONE);
		
		lblmeantime21 = new Label(shell, SWT.NONE);
		lblmeantime21.setText("Mean 21");
		
		lblmaxtime21 = new Label(shell, SWT.NONE);
		lblmaxtime21.setText("Max 21");
		
		text_22 = new Text(shell, SWT.BORDER);
		text_22.setText("2");
		text_22.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		lblQ_8 = new Label(shell, SWT.NONE);
		lblQ_8.setText("Q22");
		
		lblMean22 = new Label(shell, SWT.NONE);
		lblMean22.setText("Mean 22");
		
		lblMax22 = new Label(shell, SWT.NONE);
		lblMax22.setText("Max 22");
		new Label(shell, SWT.NONE);
		
		lblmeantime22 = new Label(shell, SWT.NONE);
		lblmeantime22.setText("Mean 22");
		
		lblmaxtime22 = new Label(shell, SWT.NONE);
		lblmaxtime22.setText("Max 22");
		
		text_23 = new Text(shell, SWT.BORDER);
		text_23.setText("3");
		text_23.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		lblQ_15 = new Label(shell, SWT.NONE);
		lblQ_15.setText("Q23");
		
		lblMean23 = new Label(shell, SWT.NONE);
		lblMean23.setText("Mean 23");
		
		lblMax23 = new Label(shell, SWT.NONE);
		lblMax23.setText("Max 23");
		new Label(shell, SWT.NONE);
		
		lblmeantime23 = new Label(shell, SWT.NONE);
		lblmeantime23.setText("Mean 23");
		
		lblmaxtime23 = new Label(shell, SWT.NONE);
		lblmaxtime23.setText("Max 23");
		
		text_24 = new Text(shell, SWT.BORDER);
		text_24.setText("1");
		text_24.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		lblQ_9 = new Label(shell, SWT.NONE);
		lblQ_9.setText("Q31");
		
		lblMean31 = new Label(shell, SWT.NONE);
		lblMean31.setText("Mean 31");
		
		lblMax31 = new Label(shell, SWT.NONE);
		lblMax31.setText("Max 31");
		new Label(shell, SWT.NONE);
		
		lblmeantime31 = new Label(shell, SWT.NONE);
		lblmeantime31.setText("Mean 31");
		
		lblmaxtime31 = new Label(shell, SWT.NONE);
		lblmaxtime31.setText("Max 31");
		
		text_25 = new Text(shell, SWT.BORDER);
		text_25.setText("2");
		text_25.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		lblQ_10 = new Label(shell, SWT.NONE);
		lblQ_10.setText("Q32");
		
		lblMean32 = new Label(shell, SWT.NONE);
		lblMean32.setText("Mean 32");
		
		lblMax32 = new Label(shell, SWT.NONE);
		lblMax32.setText("Max 32");
		new Label(shell, SWT.NONE);
		
		lblmeantime32 = new Label(shell, SWT.NONE);
		lblmeantime32.setText("Mean 32");
		
		lblmaxtime32 = new Label(shell, SWT.NONE);
		lblmaxtime32.setText("Max 32");
		
		text_26 = new Text(shell, SWT.BORDER);
		text_26.setText("5");
		text_26.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		lblQ_16 = new Label(shell, SWT.NONE);
		lblQ_16.setText("Q33");
		
		lblMean33 = new Label(shell, SWT.NONE);
		lblMean33.setText("Mean 33");
		
		lblMax33 = new Label(shell, SWT.NONE);
		lblMax33.setText("Max 33");
		new Label(shell, SWT.NONE);
		
		lblmeantime33 = new Label(shell, SWT.NONE);
		lblmeantime33.setText("Mean 33");
		
		lblmaxtime33 = new Label(shell, SWT.NONE);
		lblmaxtime33.setText("Max 33");
		
		
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}

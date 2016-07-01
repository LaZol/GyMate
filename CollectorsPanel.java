package Gui;

import java.util.LinkedList;

import javax.swing.JPanel;

import launcher.IStarter;


public class CollectorsPanel 
{
private LinkedList<JPanel> l_panels;
	
	public CollectorsPanel(IStarter _rifStarter)
	{
		this.l_panels = new LinkedList<JPanel>();
		
		
		//TODO aggiungi i panneli della gui alla lista
		//this.l_panels.add(new pannelloAccesso(_rifStarter));
		//this.l_panels.add(new pannelloComposizione(_rifStarter));
		
	}
	
	public LinkedList<JPanel> getPanels()
	{
		return this.l_panels;
	}
}

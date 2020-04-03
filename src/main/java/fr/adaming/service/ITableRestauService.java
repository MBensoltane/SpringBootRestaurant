package fr.adaming.service;

import java.util.List;

import fr.adaming.model.TableRestau;

public interface ITableRestauService {
	
	public List<TableRestau> getTablesRestau ();
	public TableRestau createTable (TableRestau t);
	public void deleteTable (long idT);
	public TableRestau updateTable (TableRestau t);
	public TableRestau findTable (long idT);

}

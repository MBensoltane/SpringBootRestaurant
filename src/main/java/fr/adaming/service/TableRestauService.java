package fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.TableRestau;
import fr.adaming.repository.ITableRestauRepository;
@Service
public class TableRestauService  implements ITableRestauService{
@Autowired
ITableRestauRepository tableRestauRepository;
	@Override
	public List<TableRestau> getTablesRestau() {
		// TODO Auto-generated method stub
		return tableRestauRepository.findAll() ;
	}

	@Override
	public TableRestau createTable(TableRestau t) {
		// TODO Auto-generated method stub
		return tableRestauRepository.save(t);
	}

	@Override
	public TableRestau findTable(long idT) {
		// TODO Auto-generated method stub
		Optional<TableRestau> oTableRestau = tableRestauRepository.findById(idT);
		TableRestau tableRestau = new TableRestau();
		if(oTableRestau.isPresent()) {
			tableRestau = oTableRestau.get();
		}
		return tableRestau;
	}

	@Override
	public void deleteTable(long idT) {
		// TODO Auto-generated method stub
		tableRestauRepository.deleteById(idT);
		
	}

	@Override
	public TableRestau updateTable(TableRestau t) {
		// TODO Auto-generated method stub
		return tableRestauRepository.save(t);
	}


}

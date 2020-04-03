package fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.TableRestau;
import fr.adaming.service.ITableRestauService;
@RestController
@RequestMapping("/table")
@CrossOrigin("http://localhost:4200")
public class TableRestauController {
	@Autowired
	ITableRestauService tableService;

	@GetMapping("/gettables")
	public List<TableRestau> getAlltables(){
		return tableService.getTablesRestau();
	}
	@PostMapping("/addTable")
	public TableRestau addTables (@RequestBody TableRestau t) {
		return tableService.createTable(t);
	}
	@DeleteMapping("/deleteTable/{idT}")
	public void removeCommande (@PathVariable long idT) {
		tableService.deleteTable(idT);
	}
	@GetMapping("/findTable/{idT}")
	public TableRestau findTable (@PathVariable long idT) {
		return tableService.findTable(idT);
	}
	@PutMapping("/updateTable/{idT}")
	public TableRestau updateTable (@PathVariable long idT ,@RequestBody TableRestau table) {
		TableRestau tableAModifier = tableService.findTable(idT);
		tableAModifier.setNbreP(table.getNbreP());
		tableAModifier.setNbreT(table.getNbreT());
		tableAModifier.setReservation(table.getReservation());
		
		return tableService.updateTable(tableAModifier);
			
	}
}

package model.logic;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import api.IMovingViolationsManager;
import model.data_structures.ListaEncadenada;
import model.vo.VOMovingViolations;


public class MovingViolationsManager implements IMovingViolationsManager {

	public ListaEncadenada<String[]> helpMe;
	public void loadMovingViolations(String movingViolationsFile){
		helpMe= new ListaEncadenada<>();
		// TODO Auto-generated method stub
	try{
		FileReader archivoNormal = new FileReader(movingViolationsFile);
		CSVReader archivoActualizado = new CSVReaderBuilder(archivoNormal).withSkipLines(1).build();
		List<String[]> infoMoVio = archivoActualizado.readAll();
		for(int i=0;i<infoMoVio.size();i++){
			String[] info=infoMoVio.get(i);
			helpMe.insertarCabeza(info);
		}
		archivoNormal.close();
		archivoActualizado.close();
	}
	catch(Exception e){
		e.getMessage();
	}
		
	}

		
	@Override
	public ListaEncadenada <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListaEncadenada <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {
		// TODO Auto-generated method stub
		return null;
	}	


}

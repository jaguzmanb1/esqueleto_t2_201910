package controller;

import api.IMovingViolationsManager;
import model.data_structures.ListaEncadenada;
import model.logic.MovingViolationsManager;
import model.vo.VOMovingViolations;


public class Controller {

	/**
	 * Reference to the services manager
	 */
	@SuppressWarnings("unused")
	private static IMovingViolationsManager  manager = new MovingViolationsManager();
	
	public static void loadMovingViolations() {
		
	}
	
	public static ListaEncadenada <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {
		return null;
	}
	
	public static ListaEncadenada<VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {
		return null;
	}
}

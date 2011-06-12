package pl.edu.agh.ftj.datamining.server;

import java.util.List;

import pl.edu.agh.ftj.datamining.weka.algorithm.WekaAnswer;

/**
 * Interfejs do komunikacji z web serwisami Weki.
 * @author Tomasz Pyszka
 */
public interface WekaCommunication {

    /**
     *
     * @return zwraca tablice (XML) z nazwami dostepnych algorytmow
     */
    public List<String> getAlgorithms();
	
	/**
     * Metoda odpowiedzialna za uruchomienie algorytmu Weki.
         * @param algorithmType
         * @param id 
         * @param table
         * @param options
         * @return Zwraca dane z algorytmu {@link WekaAnswer}.
     */
	public WekaAnswer runAlgorithm(Integer algorithmType, /*String location,*/ String id, String table, String options);
}

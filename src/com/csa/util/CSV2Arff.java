import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
 
import java.io.File;
 
public class CSV2Arff {
  /**
   * takes 2 arguments:
   * - CSV input file
   * - ARFF output file
   */
   
   String csvFile,arffFile;
   
  public  void CSV2Arff(String csvFile, String arffFile) {
    
	this.csvFile= csvFile;
	this.arffFile= arffFile;
 
  
  }
  
  public void convert() throws Exception{
  
	  // load CSV
    CSVLoader loader = new CSVLoader();
    loader.setSource(new File(this.csvFile));
    Instances data = loader.getDataSet();
 
    // save ARFF
    ArffSaver saver = new ArffSaver();
    saver.setInstances(data);
    saver.setFile(new File(this.arffFile));
    saver.setDestination(new File(this.arffFile));
    saver.writeBatch();
  
  
  }
}

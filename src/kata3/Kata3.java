
package kata3;

/**
 *
 * @author said
 */
public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histograma display...", histogram);
        histogramDisplay.execute();
    }
    
}

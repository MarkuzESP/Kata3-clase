package kata3;
/**
 * @author: Marcos del Cristo Díaz Gil
 * Ingeniería del Software 2, Universidad de Las Palmas de Gran Canaria
*/

public class Kata3 {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        
        histogram.increment("terra.es");
        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
        
    }
}

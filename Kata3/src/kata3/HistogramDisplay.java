package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay() {
        super("Histograma");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet= new DefaultCategoryDataset();
        dataSet.addValue(10, "", "ulpgc.es");
        dataSet.addValue(2, "", "gmail.com");
        dataSet.addValue(4, "", "geocities.org");
        dataSet.addValue(5, "", "icloud.com");
        dataSet.addValue(9, "", "ull.es");
        dataSet.addValue(10, "", "yahoo.es");
        return dataSet;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma", "Dominios",
                "Correos por dominio", dataSet, PlotOrientation.VERTICAL, 
                false, false, rootPaneCheckingEnabled);
        return chart;
    }
}

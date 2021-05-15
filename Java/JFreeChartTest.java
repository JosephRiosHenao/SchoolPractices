package Practices.Java;

import javax.swing.JFrame;
//import javax.swing.JPanel;
import javax.swing.JOptionPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


public class JFreeChartTest {
    public static void main(String[] args) {
        int TotalDeEstudiantes = Integer.parseInt(JOptionPane.showInputDialog(null,"Total de estudiantes"));
        double Ana = (TotalDeEstudiantes*0.25);
        double Luz = (TotalDeEstudiantes*0.10);
        double Ruth = (TotalDeEstudiantes*0.05);
        double Vero = (TotalDeEstudiantes*0.60);
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Ana",Ana);
        dataset.setValue("Luz",Luz);
        dataset.setValue("Ruth",Ruth);
        dataset.setValue("Vero",Vero);
        
        JFreeChart chart = ChartFactory.createPieChart(// char t
                "Votacion de representante",// title                                                                     
                dataset, // data
                true, // include legend
                true, false);
        
        ChartPanel panel= new ChartPanel(chart);
        
        //Creamos la ventana
        JFrame ventana = new JFrame("Grafica");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ventana.add(panel);
    }
}

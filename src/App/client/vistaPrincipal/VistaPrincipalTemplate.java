package client.vistaPrincipal;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class VistaPrincipalTemplate extends JFrame{

    private JPanel pSuperior, pCentral, pLateral;

    private VistaPrincipalComponent vistaPrincipalComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    public VistaPrincipalTemplate(VistaPrincipalComponent vistaPrincipalComponent){
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();

        crearJPanels();
        //super("Vista principal");
        this.setTitle("Vista principal");
        this.setSize(1294, 730);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setUndecorated(true); Se quitan los barra superior con todas sus herramientas
        //this.getContentPane().setBackground(Color.BLUE); 
        this.setLayout(null);
        this.setVisible(true);
    }

    private void crearJPanels(){
        pSuperior = sObjGraficos.construirJPanel(0, 0, 1055, 80, sRecursos.getColorBtnIngresar(), null, null);
        this.add(pSuperior);
        pCentral = sObjGraficos.construirJPanel(0, 80, 1055, 638, sRecursos.getColorAzulFondo(), null, null);
        this.add(pCentral);
        pLateral = sObjGraficos.construirJPanel(1055, 0, 223, 730, sRecursos.getColorAzulFondoLateral(), null, null);
        this.add(pLateral);
    }
}
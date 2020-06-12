package client.vistaPrincipal;

public class VistaPrincipalComponent {

    private VistaPrincipalTemplate vistaPrincipalTemplate;
    
    public VistaPrincipalComponent(){
        vistaPrincipalTemplate = new VistaPrincipalTemplate(this);
    }

    public VistaPrincipalTemplate getVistaPrincipalTemplate(){
        return vistaPrincipalTemplate;
    }
}
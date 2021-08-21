
package templateexemplo;


/*Esse codigo esta uma bangunca..*/

public abstract class ExportFiles {


    public ExportFiles(String texto) {
        createFile();
        export(texto);
        save();
    }
    
    protected abstract void createFile();
    protected abstract void export(String txt);
    protected abstract void save();
    
}

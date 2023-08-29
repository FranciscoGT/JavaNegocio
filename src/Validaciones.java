public class Validaciones {
    public boolean validarPrecio(int precio) {
        if(precio>0) {
            return true;
        }

        return false;
    }

    public boolean validarCodigo(int codigo) {
        if(codigo > 999 && codigo <= 9999) {
            return true;
        }

        return false;
    }
}

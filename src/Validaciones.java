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

    public boolean validarCategoria (String categoria) {
        if (categoria.equalsIgnoreCase("Fruta") || categoria.equalsIgnoreCase("Verdura"))  {
            return true;
        }
        return false;
    }

    public boolean validarTelefono(int telefono) {
        String fono = "" + telefono;
    }
}

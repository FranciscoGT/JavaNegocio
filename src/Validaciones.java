public class Validaciones {
    public boolean validarPrecio(int precio) {
        if (precio > 0) {
            return true;
        }

        return false;
    }

    public boolean validarCodigo(int codigo) {
        if (codigo > 999 && codigo <= 9999) {
            return true;
        }

        return false;
    }

    public boolean validarCategoria(String categoria) {
        if (categoria.equalsIgnoreCase("Fruta") || categoria.equalsIgnoreCase("Verdura")) {
            return true;
        }
        return false;
    }

    public boolean validarTelefono(int telefono) {
        if (telefono > 9999999 && telefono <= 99999999) {
            return true;
        }
        return false;
    }

    public boolean validarCorreo(String correo) {
        if (correo.length() >= 6) {
            return true;
        }
        return false;
    }
}

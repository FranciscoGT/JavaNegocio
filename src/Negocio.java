import java.util.Date;
import java.util.Scanner;

public class Negocio {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int opcion = 0;

        Validaciones val = new Validaciones();
        Solicitud sol = null;

        System.out.println("Fecha de hoy");

        Date fecha = new Date();

        //Solicito informacion del usuario
        //Pido rut
        System.out.println("Ingrese su rut sin verificador");
        int run = lector.nextInt();
        //Pido DV
        System.out.println("Ingrese digito verificador");
        char dv = lector.next().charAt(0);
        //Pido Nombre
        System.out.println("Ingrese su nombre");
        String nombre = lector.nextLine();
        nombre = lector.nextLine();
        //Pido mail
        System.out.println("Ingrese su correo");
        String mail = lector.nextLine();

        // Valido Mail
        if (val.validarCorreo(mail)) {
            System.out.println("Ingrese su direccion");
            String direccion = lector.nextLine();
            System.out.println("Ingrese su telefono");
            int telefono = lector.nextInt();

            // Valido Telefono
            if (val.validarTelefono(telefono)) {
                Cliente cliente = new Cliente(run, telefono, nombre, mail, direccion, dv);
                sol = new Solicitud(1, fecha, cliente);

            } else {
                System.out.println("El telefono debe tener largo 8");
            }
        } else {
            System.out.println("Debe tener minimo 6 caracteres");
        }

        if (sol != null) {
            do {
                System.out.println("Menu Principal");
                System.out.println("1.- Agregar Producto");
                System.out.println("2.- Ver detalle del pedido");
                System.out.println("3.- Aplicar descuento");
                System.out.println("4.- Obtener ID del pedido");
                System.out.println("5.- Salir");
                opcion = lector.nextInt();

                switch (opcion) {
                    case 1:
                        Producto nuevo = new Producto();

                        System.out.println("Codigo Producto: ");
                        int codigo = lector.nextInt();

                        // Valido Codigo
                        if (val.validarCodigo(codigo)) {
                            nuevo.setCodigo(codigo);
                            System.out.println("Ingrese nombre producto");
                            String descripcion = lector.nextLine();
                            descripcion = lector.nextLine();
                            nuevo.setDescripcion(descripcion);
                            System.out.println("Ingrese subCategoria");
                            String sub = lector.nextLine();

                            // Valido Cateogria
                            if (val.validarCategoria(sub)) {
                                nuevo.setSubCategoria(sub);
                                System.out.println("Ingrese precio del producto");
                                int precio = lector.nextInt();

                                // Valido Precio
                                if (val.validarPrecio(precio)) {
                                    nuevo.setPrecio(precio);
                                    System.out.println("Ingrese cantidad del producto");
                                    int cantidad = lector.nextInt();
                                    nuevo.setCantidad(cantidad);
                                    System.out.println("Ingrese medida del producto");
                                    String medida = lector.nextLine();
                                    medida = lector.nextLine();
                                    nuevo.setMedida(medida);
                                    sol.agregarProducto(nuevo);
                                } else {
                                    System.out.println("Precio debe ser mayor a 0 ");
                                }
                            } else {
                                System.out.println("SubCategoria debe ser Fruta o Verdura");
                            }
                        } else {
                            System.out.println("Codigo debe tener largo 4");
                        }
                        break;
                    case 2:
                        String detalle = sol.verDetalle();
                        System.out.println(detalle);
                        break;
                    case 3:
                        System.out.println("Ingrese descuento");
                        double descuento = lector.nextDouble();
                        sol.aplicarDescuento(descuento);
                        break;
                    case 4:
                        int ID = sol.obtenerID();
                        System.out.println("El ID del pedido es: " + ID);
                        break;
                    case 5:
                        System.out.println("Gracias por su preferencia");
                        break;
                    default:
                        System.out.println("Opcion fuera de rango");
                        break;
                }

            } while (opcion != 5);
        } else {
            System.out.println("Debe ingresar sus datos correctamente");
        }
    }
}

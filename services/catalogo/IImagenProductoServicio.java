import java.util.List;

public interface IImagenProductoServicio {

    Imagen_Producto crear (Imagen_Producto imagen_producto);
    Imagen_Producto buscarPorId(Long id);
    List<Imagen_Producto> listarTodos();
    Imagen_Producto actualizar(Long id, Imagen_Producto imagen_producto);
    boolean eliminar(Long id);
    List<Imagen_Producto> listarPorIdProducto(Long idProducto);

}

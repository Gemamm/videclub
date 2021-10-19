
package com.ceep.videclub.datos;

import com.ceep.videoclub.dominio.Pelicula;
import com.ceep.videoclub.excepciones.*;
import java.util.*;

public interface IAccesoDatos {

    public boolean existe(String nombreArchivo) throws AccesoDatosExcepciones;

    public List<Pelicula> listar(String nombreArchivo) throws EXLectura;

    public void escribir(boolean anexar) throws ExEscritura;

    public String crear(String nombreArchivo) throws AccesoDatosExcepciones;

    public String buscar(String nombreArchivo) throws EXLectura;
}
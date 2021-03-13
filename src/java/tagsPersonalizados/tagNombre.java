/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagsPersonalizados;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;


public class tagNombre extends SimpleTagSupport{
    
    public String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        //Obtener la fecha actual
        LocalDate fecha = LocalDate.now(); 
        out.println(nombre + "<br><br>" + fecha);
    }
 
}
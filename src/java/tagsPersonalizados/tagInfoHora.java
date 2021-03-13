/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagsPersonalizados;

import java.io.IOException;
import java.io.StringWriter;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class tagInfoHora extends SimpleTagSupport {

    StringWriter sw = new StringWriter();

    @Override
    public void doTag() throws JspException, IOException {
        getJspBody().invoke(sw);
        //Obtener la hora actual contando hasta los segundos
        LocalTime hora = LocalTime.now().truncatedTo(ChronoUnit.SECONDS);
        String periodo = hora.getHour()>12 ? "PM" : "AM";
        getJspContext().getOut().println(sw + "<br><br>" + hora+ " " + periodo);
    }
    
}



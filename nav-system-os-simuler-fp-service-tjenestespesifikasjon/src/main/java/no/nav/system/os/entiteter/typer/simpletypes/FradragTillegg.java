
package no.nav.system.os.entiteter.typer.simpletypes;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Typen beskriver formatet og begrensningene til fradragTillegg.
 * 
 * <p>Java class for fradragTillegg</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="fradragTillegg">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="F"/>
 *     <enumeration value="T"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "fradragTillegg", namespace = "http://nav.no/system/os/entiteter/typer/simpleTypes")
@XmlEnum
public enum FradragTillegg {

    F,
    T;

    public String value() {
        return name();
    }

    public static FradragTillegg fromValue(String v) {
        return valueOf(v);
    }

}

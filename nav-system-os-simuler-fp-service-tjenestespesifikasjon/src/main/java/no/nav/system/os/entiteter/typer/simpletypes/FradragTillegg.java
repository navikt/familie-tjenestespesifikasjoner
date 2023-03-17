
package no.nav.system.os.entiteter.typer.simpletypes;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fradragTillegg.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="fradragTillegg"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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


package no.nav.system.os.entiteter.typer.simpletypes;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kodeStatusLinje.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="kodeStatusLinje"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPPH"/&gt;
 *     &lt;enumeration value="HVIL"/&gt;
 *     &lt;enumeration value="SPER"/&gt;
 *     &lt;enumeration value="REAK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "kodeStatusLinje", namespace = "http://nav.no/system/os/entiteter/typer/simpleTypes")
@XmlEnum
public enum KodeStatusLinje {

    OPPH,
    HVIL,
    SPER,
    REAK;

    public String value() {
        return name();
    }

    public static KodeStatusLinje fromValue(String v) {
        return valueOf(v);
    }

}

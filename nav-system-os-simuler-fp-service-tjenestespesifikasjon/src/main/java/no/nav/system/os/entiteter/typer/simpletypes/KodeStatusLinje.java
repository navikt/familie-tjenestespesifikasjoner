
package no.nav.system.os.entiteter.typer.simpletypes;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Typen beskriver formatet og begrensningene til kodeStatusLinje.
 * 
 * <p>Java class for kodeStatusLinje</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="kodeStatusLinje">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPPH"/>
 *     <enumeration value="HVIL"/>
 *     <enumeration value="SPER"/>
 *     <enumeration value="REAK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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

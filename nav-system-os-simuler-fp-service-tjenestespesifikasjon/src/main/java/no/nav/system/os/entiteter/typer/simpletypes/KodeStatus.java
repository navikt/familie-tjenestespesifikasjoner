
package no.nav.system.os.entiteter.typer.simpletypes;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kodeStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="kodeStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NY"/&gt;
 *     &lt;enumeration value="LOPE"/&gt;
 *     &lt;enumeration value="HVIL"/&gt;
 *     &lt;enumeration value="SPER"/&gt;
 *     &lt;enumeration value="IKAT"/&gt;
 *     &lt;enumeration value="ATTE"/&gt;
 *     &lt;enumeration value="ANNU"/&gt;
 *     &lt;enumeration value="OPPH"/&gt;
 *     &lt;enumeration value="FBER"/&gt;
 *     &lt;enumeration value="REAK"/&gt;
 *     &lt;enumeration value="KORR"/&gt;
 *     &lt;enumeration value="FEIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "kodeStatus", namespace = "http://nav.no/system/os/entiteter/typer/simpleTypes")
@XmlEnum
public enum KodeStatus {

    NY,
    LOPE,
    HVIL,
    SPER,
    IKAT,
    ATTE,
    ANNU,
    OPPH,
    FBER,
    REAK,
    KORR,
    FEIL;

    public String value() {
        return name();
    }

    public static KodeStatus fromValue(String v) {
        return valueOf(v);
    }

}

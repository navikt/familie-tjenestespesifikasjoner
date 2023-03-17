
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetaljType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DetaljType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VARS"/&gt;
 *     &lt;enumeration value="AVVI"/&gt;
 *     &lt;enumeration value="MANG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DetaljType")
@XmlEnum
public enum DetaljType {


    /**
     * Godkjent med varsel
     * 
     */
    VARS,

    /**
     * Avvist
     * 
     */
    AVVI,

    /**
     * Manglende kvittering
     * 
     */
    MANG;

    public String value() {
        return name();
    }

    public static DetaljType fromValue(String v) {
        return valueOf(v);
    }

}

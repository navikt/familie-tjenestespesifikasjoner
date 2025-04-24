
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DetaljType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DetaljType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VARS"/>
 *     <enumeration value="AVVI"/>
 *     <enumeration value="MANG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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

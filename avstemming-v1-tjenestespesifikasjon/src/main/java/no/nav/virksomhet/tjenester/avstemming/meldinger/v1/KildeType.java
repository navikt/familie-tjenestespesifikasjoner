
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KildeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="KildeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVLEV"/&gt;
 *     &lt;enumeration value="MOTT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KildeType")
@XmlEnum
public enum KildeType {


    /**
     * Avleverende komponent
     * 
     */
    AVLEV,

    /**
     * Mottakende komponent
     * 
     */
    MOTT;

    public String value() {
        return name();
    }

    public static KildeType fromValue(String v) {
        return valueOf(v);
    }

}

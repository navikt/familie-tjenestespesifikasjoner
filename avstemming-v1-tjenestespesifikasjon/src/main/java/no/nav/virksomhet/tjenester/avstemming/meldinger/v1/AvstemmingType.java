
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvstemmingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AvstemmingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GRSN"/&gt;
 *     &lt;enumeration value="KONS"/&gt;
 *     &lt;enumeration value="PERI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AvstemmingType")
@XmlEnum
public enum AvstemmingType {


    /**
     * Grensesnittavstemming
     * 
     */
    GRSN,

    /**
     * Konsistensavstemming
     * 
     */
    KONS,

    /**
     * Periodeavstemming
     * 
     */
    PERI;

    public String value() {
        return name();
    }

    public static AvstemmingType fromValue(String v) {
        return valueOf(v);
    }

}

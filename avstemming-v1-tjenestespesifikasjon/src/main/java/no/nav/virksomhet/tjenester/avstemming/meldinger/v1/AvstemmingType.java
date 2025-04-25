
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AvstemmingType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AvstemmingType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GRSN"/>
 *     <enumeration value="KONS"/>
 *     <enumeration value="PERI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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

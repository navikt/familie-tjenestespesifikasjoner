//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 03:51:50 PM CET 
//


package no.trygdeetaten.skjema.oppdrag;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TkodeStatusLinje.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TkodeStatusLinje"&gt;
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
@XmlType(name = "TkodeStatusLinje")
@XmlEnum
public enum TkodeStatusLinje {

    OPPH,
    HVIL,
    SPER,
    REAK;

    public String value() {
        return name();
    }

    public static TkodeStatusLinje fromValue(String v) {
        return valueOf(v);
    }

}


package no.nav.system.os.entiteter.typer.simpletypes;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kodeArbeidsgiver.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="kodeArbeidsgiver"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "kodeArbeidsgiver", namespace = "http://nav.no/system/os/entiteter/typer/simpleTypes")
@XmlEnum
public enum KodeArbeidsgiver {

    A,
    S,
    P;

    public String value() {
        return name();
    }

    public static KodeArbeidsgiver fromValue(String v) {
        return valueOf(v);
    }

}


package no.nav.system.os.tjenester.simulerfpservice.feil;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Feil under behandling i baksystemet
 * 
 * <p>Java class for feilUnderBehandling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="feilUnderBehandling"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://nav.no/system/os/tjenester/simulerFpService/feil}StelvioFault"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feilUnderBehandling")
public class FeilUnderBehandling
    extends StelvioFault
{


}

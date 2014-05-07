/**
 * Implement Geb and SpockSampleGe
 */
import geb.spock.GebReportingSpec

import spock.lang.*

/**
 * Annotation Stepwise let the Geb to test all cases in the sequence 
 * as they were written.
 */
@Stepwise
class SampleGebSpec extends GebReportingSpec {
    
    def "go to google"() {
        when:
        go("http://localhost:13111/wiperdog/echo")
        
        then:
        title == "Wiperdog Echo Servlet"
    }
}

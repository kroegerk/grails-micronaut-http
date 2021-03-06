package example.grails
import groovy.transform.CompileStatic

@CompileStatic
class ItunesSearchService {

    List<Album> searchWithApi(String searchTerm) {
        [new Album(artistName: "Nirav Assar", collectionName: "Blues", collectionViewUrl: "http://nirav.org")]
    }
}

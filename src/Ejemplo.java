import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo {
	
//	public static void insertarJugadores(MongoCollection<Document> collection) {
//        
//		// Jugador 1
//        List<String> equiposMessi = new ArrayList<>();
//        equiposMessi.add("Barcelona");
//        equiposMessi.add("PSG");
//        equiposMessi.add("Inter Miami");
//
//        List<String> posicionesMessi = new ArrayList<>();
//        posicionesMessi.add("Delantero");
//        posicionesMessi.add("Extremo Derecho");
//
//        Document jugador1 = new Document("nombre", "Lionel Messi")
//                .append("nacionalidad", "Argentina")
//                .append("edad", 36)
//                .append("equipos", equiposMessi)
//                .append("posiciones", posicionesMessi);
//
//        // Jugador 2
//        List<String> equiposMbappe = new ArrayList<>();
//        equiposMbappe.add("Monaco");
//        equiposMbappe.add("PSG");
//
//        List<String> posicionesMbappe = new ArrayList<>();
//        posicionesMbappe.add("Delantero");
//        posicionesMbappe.add("Extremo Izquierdo");
//
//        Document jugador2 = new Document("nombre", "Kylian Mbapp�")
//                .append("nacionalidad", "Francia")
//                .append("edad", 25)
//                .append("equipos", equiposMbappe)
//                .append("posiciones", posicionesMbappe);
//
//
//        // Creamos una lista donde a�adimos a todos los jugadores
//        List<Document> jugadores = new ArrayList<>();
//        jugadores.add(jugador1);
//        jugadores.add(jugador2);
//        
//        // Insertamos los jugadores dentro de la coleccion de jugadores
//        collection.insertMany(jugadores);
//    }
//
	
	
	public static void main(String[] args) {
        // Direccion de la BBDD en MongoDB
        String direccion_mongo = "mongodb+srv://kelsioner:3zOSa7Jnw0iJUPY7@proyectointermodular.0czvebk.mongodb.net/?retryWrites=true&w=majority&appName=ProyectoIntermodular";

        try  {       	
        	MongoClient mongoClient = MongoClients.create(direccion_mongo);
            
            MongoDatabase database = mongoClient.getDatabase("Proyecto_3enRaya");
            MongoCollection<Document> collectionJugadores = database.getCollection("jugador");
            
//            insertarJugadores(collectionJugadores);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

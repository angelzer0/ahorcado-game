package org.example.constants;

import java.util.List;
import java.util.Map;

public class ConstantesTablero {

    public static final List<String> ANIMALES = List.of("Elefante", "Tigre", "Jirafa", "León", "Hipopótamo");
    public static final Map<String, List<String>> PISTAS_ANIMALES = Map.of(
            "Elefante", List.of("Es el animal terrestre más grande.", "Tiene trompa.", "Es herbívoro.", "Se encuentra en África y Asia.", "Vive en manadas.", "Su memoria es excelente."),
            "Tigre", List.of("Es un gran felino.", "Tiene rayas en su piel.", "Es un cazador solitario.", "Se encuentra en Asia.", "Es un nadador excelente.", "Es una especie en peligro de extinción."),
            "Jirafa", List.of("Es el animal más alto del mundo.", "Tiene un cuello largo.", "Se alimenta de hojas de árboles.", "Habita en África.", "Su patrón de manchas es único.", "Es social y vive en grupos."),
            "León", List.of("Es conocido como el rey de la selva.", "Vive en manadas.", "Los machos tienen melena.", "Es un cazador.", "Se encuentra en África.", "Es un símbolo de valentía."),
            "Hipopótamo", List.of("Pasa la mayor parte del tiempo en el agua.", "Es muy grande y pesado.", "Es herbívoro.", "Se encuentra en ríos y lagos de África.", "Puede ser muy agresivo.", "Sus colmillos son grandes y fuertes.")
    );

    public static final List<String> FRUTAS = List.of("Manzana", "Naranja", "Plátano", "Pera", "Melocotón");
    public static final Map<String, List<String>> PISTAS_FRUTAS = Map.of(
            "Manzana", List.of("Es roja, verde o amarilla.", "Es una fruta crujiente.", "Se utiliza para hacer sidra.", "Es rica en fibra.", "Se dice que es buena para la salud del corazón.", "Puede ser dulce o ácida."),
            "Naranja", List.of("Es cítrica.", "Es rica en vitamina C.", "Se utiliza para hacer jugo.", "Su piel es de color naranja.", "Es una fruta jugosa.", "Proviene de climas cálidos."),
            "Plátano", List.of("Es de color amarillo.", "Es rico en potasio.", "Se puede comer crudo o cocido.", "Es muy popular como snack.", "Crece en racimos.", "Es una fruta tropical."),
            "Pera", List.of("Tiene forma de lágrima.", "Es dulce y jugosa.", "Se puede comer cruda o cocida.", "Hay muchas variedades.", "Se cultiva en climas templados.", "Es rica en fibra."),
            "Melocotón", List.of("Es de color amarillo anaranjado.", "Tiene una piel suave.", "Es jugoso y dulce.", "Se utiliza en postres.", "Es una fruta de verano.", "Proviene de China.")
    );

    public static final List<String> PAISES = List.of("Argentina", "Brasil", "Canadá", "España", "Japón");
    public static final Map<String, List<String>> PISTAS_PAISES = Map.of(
            "Argentina", List.of("Es famosa por el tango.", "Su capital es Buenos Aires.", "Tiene la Patagonia.", "Es el segundo país más grande de América del Sur.", "El asado es un plato típico.", "Juega en la Copa del Mundo de fútbol."),
            "Brasil", List.of("Es el país más grande de América del Sur.", "Su capital es Brasilia.", "Es famoso por el Carnaval.", "El fútbol es muy popular.", "El Amazonas se encuentra aquí.", "Hablan portugués."),
            "Canadá", List.of("Es el segundo país más grande del mundo.", "Su capital es Ottawa.", "Es conocido por sus paisajes naturales.", "Se habla inglés y francés.", "Es famoso por el jarabe de arce.", "Tiene muchas ciudades multiculturales."),
            "España", List.of("Es famosa por su comida y fiestas.", "Su capital es Madrid.", "El flamenco es un baile típico.", "Tiene una rica historia.", "Es parte de Europa.", "El fútbol es muy popular."),
            "Japón", List.of("Es una isla en Asia.", "Su capital es Tokio.", "Es conocido por su tecnología.", "La cultura del sushi es famosa.", "Tienen una rica tradición en artes marciales.", "El monte Fuji es un símbolo.")
    );

    public static final List<String> COLORES = List.of("Rojo", "Azul", "Verde", "Amarillo", "Naranja");
    public static final Map<String, List<String>> PISTAS_COLORES = Map.of(
            "Rojo", List.of("Es el color de la sangre.", "Simboliza pasión y amor.", "Es un color primario.", "Se usa en señales de alto.", "Las manzanas pueden ser de este color.", "En algunas culturas, representa la suerte."),
            "Azul", List.of("Es el color del cielo.", "Simboliza la calma.", "Es un color primario.", "Se usa en muchas banderas.", "El océano también es de este color.", "A menudo se asocia con la tristeza."),
            "Verde", List.of("Es el color de la naturaleza.", "Simboliza la esperanza.", "Es un color secundario.", "Las plantas y los árboles son de este color.", "Se asocia con la salud.", "Se usa en semáforos para indicar avanzar."),
            "Amarillo", List.of("Es el color del sol.", "Simboliza la alegría.", "Es un color primario.", "Las bananas son de este color.", "Se usa en señales de advertencia.", "En algunas culturas, representa la riqueza."),
            "Naranja", List.of("Es una mezcla de rojo y amarillo.", "Simboliza la energía.", "Es el color de la fruta que lleva su nombre.", "Se asocia con el otoño.", "Puede ser muy brillante.", "En algunos contextos, representa la felicidad.")
    );
}

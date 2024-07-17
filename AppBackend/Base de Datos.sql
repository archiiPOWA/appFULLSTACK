

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

----------------------------------------------------------


DROP TABLE IF EXISTS `peliculas`;
CREATE TABLE IF NOT EXISTS `peliculas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `genero` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `duracion` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `imagen` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `anime`
--

INSERT INTO peliculas (titulo, genero, duracion, imagen) VALUES
('Fight Club', 'Un oficinista insomne y un vendedor de jabón forman un club de lucha clandestino que se convierte en algo mucho más.', '139 min', 'https://m.media-amazon.com/images/I/81D+KJkO6-L._AC_SL1500_.jpg'),
('Forrest Gump', 'La presidencia de Kennedy y Johnson, los eventos de Vietnam, Watergate y otros eventos históricos se desarrollan desde la perspectiva de un hombre de Alabama con un coeficiente intelectual bajo.', '142 min', 'https://m.media-amazon.com/images/I/61xA8flfRNL._AC_SY679_.jpg'),
('The Godfather', 'El patriarca envejecido de una dinastía criminal organiza la transferencia de su imperio clandestino a su hijo reticente.', '175 min', 'https://m.media-amazon.com/images/I/51o5dnjk07L.jpg'),
('The Lord of the Rings: The Fellowship of the Ring', 'Un hobbit de la Comarca y ocho compañeros se embarcan en un viaje para destruir el poderoso anillo y salvar la Tierra Media de el Señor Oscuro Sauron.', '178 min', 'https://m.media-amazon.com/images/I/51Qvs9i5a%2BL._AC_.jpg');



package dev.rampmaster.utils;

public class ValidadorRut {

    /**
     * Valida un RUN/RUT chileno.
     *
     * @param rut RUN en cualquier formato (ej: "12.345.678-5", "12345678-5", "123456785")
     * @return true si el RUN es válido, false en caso contrario.
     */
    public static boolean validar(String rut) {
        if (rut == null || rut.trim().isEmpty()) {
            return false;
        }

        // Limpiar el RUT de puntos, guiones y espacios, convirtiendo a mayúsculas
        String rutLimpio = rut.replace(".", "")
                .replace("-", "")
                .trim()
                .toUpperCase();

        // Debe tener al menos 2 caracteres (mínimo 1 dígito + DV) y no exceder 9
        if (rutLimpio.length() < 2 || rutLimpio.length() > 9) {
            return false;
        }

        // Separar cuerpo (número) y dígito verificador
        String cuerpo = rutLimpio.substring(0, rutLimpio.length() - 1);
        char dvIngresado = rutLimpio.charAt(rutLimpio.length() - 1);

        // Validar que el cuerpo contenga solo números
        if (!cuerpo.matches("\\d+")) {
            return false;
        }

        // Calcular dígito verificador mediante el algoritmo del Módulo 11
        char dvEsperado = calcularDV(Integer.parseInt(cuerpo));

        return dvIngresado == dvEsperado;
    }

    /**
     * Calcula el Dígito Verificador usando el algoritmo Módulo 11.
     */
    private static char calcularDV(int rut) {
        int m = 0;
        int s = 1;

        for (; rut != 0; rut /= 10) {
            s = (s + rut % 10 * (9 - m++ % 6)) % 11;
        }

        if (s != 0) {
            return (char) (s + 47); // Convierte 1-9 a '1'-'9', 10 a 'K'
        } else {
            return 'K';
        }
    }
}

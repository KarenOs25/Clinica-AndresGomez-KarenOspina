package com.clinica.model;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private String numeroOrden; // Máximo 6 dígitos [cite: 128]
    private String cedulaPaciente; // [cite: 129]
    private String cedulaMedico; // [cite: 130]
    private String fechaCreacion; // [cite: 131]
    
    // Usamos una lista general de ítems para controlar el contador global por orden
    private List<ItemOrden> items = new ArrayList<>();

    public Orden(String numeroOrden, String cedulaPaciente, String cedulaMedico, String fecha) {
        this.numeroOrden = numeroOrden;
        this.cedulaPaciente = cedulaPaciente;
        this.cedulaMedico = cedulaMedico;
        this.fechaCreacion = fecha;
    }

    // Método para agregar cualquier ítem validando las reglas de negocio
    public void agregarItem(ItemOrden nuevoItem) {
        // Regla: Si hay ayuda diagnóstica, no puede haber más tipos de ítems 
        for (ItemOrden item : items) {
            if (item.esAyudaDiagnostica() || nuevoItem.esAyudaDiagnostica()) {
                if (items.size() > 0 && !item.esMismoTipo(nuevoItem)) {
                    System.out.println("ERROR: No se puede mezclar ayuda diagnóstica con otros tipos.");
                    return;
                }
            }
        }

        // Asignación automática del número de ítem 
        int siguienteNumeroItem = items.size() + 1;
        nuevoItem.setNumeroItem(siguienteNumeroItem);
        items.add(nuevoItem);
    }
}
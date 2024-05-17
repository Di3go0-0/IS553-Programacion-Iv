package com.practica.springboot.empleos.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.practica.springboot.empleos.Model.Vacante;

import org.springframework.ui.Model;

@Controller
public class HomeController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/")
    public String mostrarHome(Model model) {
        model.addAttribute("mensaje", "Bienvenidos empleos APP");

        String nombre = "Auxiliar de Contabilidad";
        Date fechaPublicacion = new Date();
        double salario = 5000.00;
        boolean vigente = true;

        model.addAttribute("fecha", fechaPublicacion);
        model.addAttribute("nombre", nombre);
        model.addAttribute("salario", salario);
        model.addAttribute("vigente", vigente);

        return "home";
    }

    @GetMapping("/detalle")
    public String mostrarDetalle(Model model) {
        Vacante vacante = new Vacante();

        vacante.setNombre("Ing. Sistemas");
        vacante.setFechaPublicacion(new Date());
        vacante.setSalario(10000.00);
        vacante.setDescripcion("Se solicita Ing. Sistemas para trabajar en importante empresa");

        model.addAttribute("vacante", vacante);

        return "detalle";
    }

    private List<Vacante> getVacante() {
        List<Vacante> lista = new ArrayList<>();
        try {
            Vacante vacante = new Vacante();
            vacante.setNombre("Profesor Matematicas");
            vacante.setFechaPublicacion(new Date());
            vacante.setSalario(8000.00);
            vacante.setDescripcion("Se solicita profesor de matematicas para impartir clases en secundaria");
            lista.add(vacante);

            vacante = new Vacante();
            vacante.setNombre("Contador");
            vacante.setFechaPublicacion(new Date());
            vacante.setSalario(12000.00);
            vacante.setDescripcion("Se solicita contador para trabajar en empresa importante");
            lista.add(vacante);

            vacante = new Vacante();
            vacante.setNombre("Ingeniero Civil");
            vacante.setFechaPublicacion(new Date());
            vacante.setSalario(15000.00);
            vacante.setDescripcion("Se solicita Ing. Civil para trabajar en constructora importante");
            lista.add(vacante);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al cargar vacantes");
        }

        return lista;
    }
}

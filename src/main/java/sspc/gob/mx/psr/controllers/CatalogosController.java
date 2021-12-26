package sspc.gob.mx.psr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sspc.gob.mx.psr.model.catalog.EstadoCivil;
import sspc.gob.mx.psr.services.*;

@RequestMapping("/catalogo")
@RestController
public class CatalogosController {

    @Autowired
    EstadoService estadoservicio;

    @Autowired
    EstadoCivilService estadoCivilService;

    @Autowired
    EscolaridadService escolaridadService;

    @Autowired
    EtniaService etniaService;

    @Autowired
    OcupacionService ocupacionService;

    @GetMapping(path = "/escolaridad", produces = "application/json")
    ResponseEntity escolaridad() {
        return new ResponseEntity<>( escolaridadService.lista(), HttpStatus.OK);
    }

    @GetMapping(path = "/estado", produces = "application/json")
    ResponseEntity estados() {
        return new ResponseEntity<>( estadoservicio.lista(), HttpStatus.OK);
    }

    @GetMapping(path = "/estadoCivil", produces = "application/json")
    ResponseEntity estadoCivil() {
        return new ResponseEntity<>( estadoCivilService.lista(), HttpStatus.OK);
    }

    @GetMapping(path = "/etnia", produces = "application/json")
    ResponseEntity etnias() {
        return new ResponseEntity<>( etniaService.lista(), HttpStatus.OK);
    }

    @GetMapping(path = "/ocupacion", produces = "application/json")
    ResponseEntity ocupaciones() {
        return new ResponseEntity<>( ocupacionService.lista(), HttpStatus.OK);
    }

}

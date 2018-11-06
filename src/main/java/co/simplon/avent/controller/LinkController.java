/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.simplon.avent.controller;

import co.simplon.avent.model.Link;
import co.simplon.avent.repository.LinkRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vanessa
 */
@RestController
@RequestMapping("/api/link")
public class LinkController {
    
    //permet d'injecter LinkRepository dans mon contrôleur
    @Autowired
    //je créé une instance de LinkRepository
    private LinkRepository linkRepository;
    
    @GetMapping
    public List<Link> getDailyLinks() {
        //permet de récupérer la date du jour
        LocalDate date = LocalDate.now();
        //la méthode retourne une liste de type Link
        //contenant tous les liens du repository
        //correspondant à la date du jour
        return linkRepository.findByDate(date);
    }
    
}



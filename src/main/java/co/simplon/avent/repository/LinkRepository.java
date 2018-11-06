/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.simplon.avent.repository;

import co.simplon.avent.model.Link;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author vanessa
 */
public interface LinkRepository extends JpaRepository<Link, Long>{
    
    List<Link> findByDate(LocalDate date);
    
}

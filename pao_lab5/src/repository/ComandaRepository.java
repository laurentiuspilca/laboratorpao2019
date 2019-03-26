/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import exceptions.CommandNotFoundException;
import java.util.ArrayList;
import java.util.List;
import model.Comanda;

/**
 *
 * @author Student
 */
public class ComandaRepository implements IComandaRepository {
    private final List<Comanda> comenzi = new ArrayList<>();

    @Override
    public void adaugaComanda(Comanda c) {
        comenzi.add(c);
    }

    @Override
    public Comanda cautaComandaDupaNume(String nume) {
        return comenzi
                .stream()
                .filter(c -> c.getNume().equals(nume))
                .findFirst()
//              .map(c -> c)
                .orElseThrow(CommandNotFoundException::new);
        
        // ....
        
//        Optional<Comanda> o = 
//                comenzi
//                .stream()
//                .filter(c -> c.getNume().equals(nume))
//                .findFirst();
//        
//        if( o.isPresent()) {
//            return o.get();
//        } else {
//            throw new CommandNotFoundException();
//        }
    }

    @Override
    public List<Comanda> obtineToateComenzile() {
        return comenzi;
    }
    
}

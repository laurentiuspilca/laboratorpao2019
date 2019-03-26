/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.List;
import model.Comanda;

/**
 *
 * @author Student
 */
public interface IComandaRepository {
    public void adaugaComanda(Comanda c);
    public Comanda cautaComandaDupaNume(String nume);
    public List<Comanda> obtineToateComenzile();
}

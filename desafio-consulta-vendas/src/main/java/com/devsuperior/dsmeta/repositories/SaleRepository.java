package com.devsuperior.dsmeta.repositories;

import com.devsuperior.dsmeta.dto.SaleSummaryDTO;
import com.devsuperior.dsmeta.entities.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    @Query("SELECT obj "
            + "FROM Sale obj "
            + "WHERE  obj.date BETWEEN :minDate AND :maxDate "
            + "AND UPPER (obj.seller.name)  LIKE UPPER(CONCAT('%', :name, '%')) "
    )
    Page<Sale> seachByName(LocalDate minDate, LocalDate maxDate, String name, Pageable pageable);


    @Query("SELECT obj "
            + "FROM Sale obj "
            + "JOIN FETCH obj.seller WHERE obj IN :sales "
    )
    List<Sale> searchByJuncao(List<Sale> sales);


    @Query("SELECT new com.devsuperior.dsmeta.dto.SaleSummaryDTO(obj.seller.name, SUM(obj.amount))"
            + "FROM Sale obj "
            + "WHERE obj.date BETWEEN :minDate AND :maxDate "
            + "GROUP BY obj.seller.name "
    )
    List<SaleSummaryDTO> seachSummaryByDate(LocalDate minDate, LocalDate maxDate);


}




              /* SELECT name, date, amount
                 FROM tb_sales
                 INNER JOIN tb_seller ON tb_seller.id = tb_sales.seller_id
                 WHERE UPPER (name) LIKE '%:name%'
                 LIMIT 12*

              /*SELECT tb_sales.id, tb_sales.date, SUM(tb_sales.amount) AS total, tb_seller.name
                FROM tb_sales
                INNER JOIN tb_seller ON tb_seller.id = tb_sales.seller_id
                WHERE date > '2022-05-01' AND date < '2022-05-31'
                AND date = date
                GROUP BY tb_sales.id, name
                ORDER BY total DESC */





package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Park getPark(long parkId) {
        Park park = new Park();
        final String sql =
                "SELECT park_id, park_name, date_established, area, has_camping" +
                        " FROM park" +
                        " WHERE park_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, parkId);
        if (results.next()) {
            park = mapRowToPark(results);
        }
        return park;

    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
        List<Park> parks = new ArrayList<>();
        String sql =
                "SELECT park_id, park_name, date_established, area, has_camping" +
                        " FROM park" +
                        " Join park_state ON park_state.park_id = park.park_id" +
                        " WHERE state_abbreviation = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, stateAbbreviation);
        while (results.next()) {
            Park park = mapRowToPark(results);
            parks.add(park);
        }
        return parks;

    }


    @Override
    public Park createPark(Park park) {
        String sql = "INSERT INTO park (park_name = ?, date_established = ?, area = ?, has_camping)" +
                "VALUES (?, ?, ?, ?) RETURNING park_id;";
        Long newId = jdbcTemplate.queryForObject(sql,
                long.class,
                park.getParkName(),
                park.getDateEstablished(),
                park.getArea(),
                park.getParkId());
        Park newPark = getPark(newId);
        return newPark;

    }


    @Override
    public void updatePark(Park park) {
        String sql = "UPDATE park" +
                "SET park_name = ?, date_established = ?, area = ?, has_camping " +
                "WHERE park_id = ?;";
        jdbcTemplate.update(sql,
                park.getParkName(),
                park.getDateEstablished(),
                park.getArea(),
                park.getParkId());

    }

    @Override
    public void deletePark(long parkId) {
        final String removeFromParkState =
                "DELETE FROM park_state WHERE park_id ?; ";
        final String removeFromPark =
                "DELETE FROM park WHERE park_id ?; ";

        jdbcTemplate.update(removeFromParkState, parkId);
        jdbcTemplate.update(removeFromPark, parkId);

    }

    @Override
    public void addParkToState(long parkId, String stateAbbreviation) {
        final String sql = "INSERT INTO park_state (park_id, state_abbreviation)" +
                "VALUES (?, ?);";
        jdbcTemplate.update(sql, parkId, stateAbbreviation);

    }

    @Override
    public void removeParkFromState(long parkId, String stateAbbreviation) {
        final String removeFromParkState =
                "DELETE FROM park WHERE park_id ? AND state_abbreviation = ?;";

        jdbcTemplate.update(removeFromParkState, parkId, stateAbbreviation);

    }

    private Park mapRowToPark(SqlRowSet rowSet) {
        Park park = new Park();

        park.setParkId(rowSet.getLong("park_id"));
        park.setParkName(rowSet.getString("park_name"));

        if (rowSet.getDate("date_established") != null) {
            park.setDateEstablished(rowSet.getDate("date_established").toLocalDate());
        }
        park.setArea(rowSet.getInt("area"));
        park.setHasCamping(rowSet.getBoolean("has_camping"));
        return new Park();
    }
}

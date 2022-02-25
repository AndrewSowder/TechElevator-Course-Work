package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1L, 1L, 1L, 
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2L, 1L, 1L,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3L, 2L, 1L,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4L, 2L, 2L,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao sut;


    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet expectedTimesheet = sut.getTimesheet(TIMESHEET_1.getTimesheetId());
        assertTimesheetsMatch(TIMESHEET_1, expectedTimesheet);

        expectedTimesheet = sut.getTimesheet(2L);
        assertTimesheetsMatch(TIMESHEET_2,expectedTimesheet);



    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet expected = sut.getTimesheet(99L);

        Assert.assertNull(expected);

    }


    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> timeSheets = sut.getTimesheetsByEmployeeId(1L);
        Assert.assertEquals(2, timeSheets.size());
        assertTimesheetsMatch(TIMESHEET_1, timeSheets.get(0));
        assertTimesheetsMatch(TIMESHEET_2, timeSheets.get(1));

    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> timeSheets = sut.getTimesheetsByProjectId(1L);
        Assert.assertEquals(3, timeSheets.size());
        assertTimesheetsMatch(TIMESHEET_1, timeSheets.get(0));
        assertTimesheetsMatch(TIMESHEET_2, timeSheets.get(1));
        assertTimesheetsMatch(TIMESHEET_3, timeSheets.get(2));


    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
       Timesheet expectedTimesheet = new Timesheet(4L, 2L, 1L,
                LocalDate.parse("2021-02-01"), 3.0, true, "Timesheet 9");

       Timesheet actual = sut.createTimesheet(expectedTimesheet);

       expectedTimesheet.setTimesheetId(actual.getTimesheetId());

       assertTimesheetsMatch(expectedTimesheet,actual);

    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet expectedTimesheet = new Timesheet(4L, 2L, 1L,
                LocalDate.parse("2021-02-01"), 3.0, true, "Timesheet 9");

        Timesheet createdTimesheet = sut.createTimesheet(expectedTimesheet);

        long newId = createdTimesheet.getTimesheetId();

        Timesheet retrievedTimesheet = sut.getTimesheet(newId);
git 
        assertTimesheetsMatch(expectedTimesheet,retrievedTimesheet);

    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet updatedTimesheet = sut.getTimesheet(1L);

        updatedTimesheet.setEmployeeId(2L);
        updatedTimesheet.setProjectId(1L);
        updatedTimesheet.setDateWorked(LocalDate.now());
        updatedTimesheet.setHoursWorked(6.0);
        updatedTimesheet.setBillable(true);
        updatedTimesheet.setDescription("Updated Timesheet");

        sut.updateTimesheet(updatedTimesheet);

        Timesheet retrievedTimesheet = sut.getTimesheet(1L);
        assertTimesheetsMatch(updatedTimesheet, retrievedTimesheet);

    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        sut.deleteTimesheet(1L);

        Timesheet retrievedTimesheet = sut.getTimesheet(1L);

        Assert.assertNull(retrievedTimesheet);
    }

    @Test
    public void getBillableHours_returns_correct_total() {
       double billableHours = sut.getBillableHours(1L,1L);

       double nonbillableHours = sut.getBillableHours(2L,2L);

       Assert.assertEquals(2.5,billableHours, 0.1);

       Assert.assertEquals(0, nonbillableHours, 0.1);
    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}

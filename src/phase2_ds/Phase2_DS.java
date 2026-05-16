package phase2_ds;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Maymonah PC
 */
import java.util.ArrayList;
import java.util.Objects;

public class Phase2_DS {//this is the main class
    @FunctionalInterface
    interface TestCase { void run() throws Throwable; }

    private static int total = 0;
    private static int passed = 0;
    private static final ArrayList<String> failedTests = new ArrayList<>();
    
    public static void main(String[] args) {
        run("AdvisingSystemPhase2Test.constructorShouldStartWithNoAdvisors", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.constructorShouldStartWithNoAdvisors();
        });
        run("AdvisingSystemPhase2Test.constructorShouldStartWithNoStudents", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.constructorShouldStartWithNoStudents();
        });
        run("AdvisingSystemPhase2Test.constructorShouldStartWithNoLocations", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.constructorShouldStartWithNoLocations();
        });
        run("AdvisingSystemPhase2Test.constructorShouldStartWithNoMeetings", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.constructorShouldStartWithNoMeetings();
        });
        run("AdvisingSystemPhase2Test.constructorShouldStartWithNoWorkshops", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.constructorShouldStartWithNoWorkshops();
        });
        run("AdvisingSystemPhase2Test.constructorShouldStartWithNoEvents", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.constructorShouldStartWithNoEvents();
        });
        run("AdvisingSystemPhase2Test.searchAdvisorOnEmptySystemShouldReturnNull", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.searchAdvisorOnEmptySystemShouldReturnNull();
        });
        run("AdvisingSystemPhase2Test.searchStudentOnEmptySystemShouldReturnNull", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.searchStudentOnEmptySystemShouldReturnNull();
        });
        run("AdvisingSystemPhase2Test.searchLocationOnEmptySystemShouldReturnNull", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.searchLocationOnEmptySystemShouldReturnNull();
        });
        run("AdvisingSystemPhase2Test.cancelMeetingOnEmptySystemShouldReturnFalse", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelMeetingOnEmptySystemShouldReturnFalse();
        });
        run("AdvisingSystemPhase2Test.cancelWorkshopOnEmptySystemShouldReturnFalse", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelWorkshopOnEmptySystemShouldReturnFalse();
        });
        run("AdvisingSystemPhase2Test.addAdvisorShouldReturnTrueForNewAdvisor", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorShouldReturnTrueForNewAdvisor();
        });
        run("AdvisingSystemPhase2Test.addAdvisorShouldMakeAdvisorSearchable", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorShouldMakeAdvisorSearchable();
        });
        run("AdvisingSystemPhase2Test.addAdvisorShouldIncreaseAdvisorSetSize", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorShouldIncreaseAdvisorSetSize();
        });
        run("AdvisingSystemPhase2Test.addAdvisorShouldRejectDuplicateId", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorShouldRejectDuplicateId();
        });
        run("AdvisingSystemPhase2Test.addAdvisorShouldKeepOriginalAdvisorOnDuplicate", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorShouldKeepOriginalAdvisorOnDuplicate();
        });
        run("AdvisingSystemPhase2Test.addAdvisorShouldReturnFalseForNull", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorShouldReturnFalseForNull();
        });
        run("AdvisingSystemPhase2Test.addAdvisorShouldAllowMultipleDistinctAdvisors", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorShouldAllowMultipleDistinctAdvisors();
        });
        run("AdvisingSystemPhase2Test.addStudentShouldReturnTrueForNewStudent", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentShouldReturnTrueForNewStudent();
        });
        run("AdvisingSystemPhase2Test.addStudentShouldMakeStudentSearchable", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentShouldMakeStudentSearchable();
        });
        run("AdvisingSystemPhase2Test.addStudentShouldIncreaseStudentSetSize", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentShouldIncreaseStudentSetSize();
        });
        run("AdvisingSystemPhase2Test.addStudentShouldRejectDuplicateId", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentShouldRejectDuplicateId();
        });
        run("AdvisingSystemPhase2Test.addStudentShouldKeepOriginalStudentOnDuplicate", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentShouldKeepOriginalStudentOnDuplicate();
        });
        run("AdvisingSystemPhase2Test.addStudentShouldReturnFalseForNull", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentShouldReturnFalseForNull();
        });
        run("AdvisingSystemPhase2Test.addStudentShouldAllowMultipleDistinctStudents", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentShouldAllowMultipleDistinctStudents();
        });
        run("AdvisingSystemPhase2Test.addLocationShouldReturnTrueForNewLocation", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addLocationShouldReturnTrueForNewLocation();
        });
        run("AdvisingSystemPhase2Test.addLocationShouldMakeLocationSearchable", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addLocationShouldMakeLocationSearchable();
        });
        run("AdvisingSystemPhase2Test.addLocationShouldIncreaseLocationSetSize", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addLocationShouldIncreaseLocationSetSize();
        });
        run("AdvisingSystemPhase2Test.addLocationShouldRejectDuplicateId", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addLocationShouldRejectDuplicateId();
        });
        run("AdvisingSystemPhase2Test.addLocationShouldKeepOriginalLocationOnDuplicate", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addLocationShouldKeepOriginalLocationOnDuplicate();
        });
        run("AdvisingSystemPhase2Test.addLocationShouldReturnFalseForNull", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addLocationShouldReturnFalseForNull();
        });
        run("AdvisingSystemPhase2Test.addLocationShouldAllowMultipleDistinctLocations", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addLocationShouldAllowMultipleDistinctLocations();
        });
        run("AdvisingSystemPhase2Test.scheduleMeetingShouldReturnPositiveIdOnSuccess", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleMeetingShouldReturnPositiveIdOnSuccess();
        });
        run("AdvisingSystemPhase2Test.scheduleMeetingShouldStoreMeetingInMeetingSet", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleMeetingShouldStoreMeetingInMeetingSet();
        });
        run("AdvisingSystemPhase2Test.scheduleMeetingShouldStoreMeetingInEventSet", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleMeetingShouldStoreMeetingInEventSet();
        });
        run("AdvisingSystemPhase2Test.scheduleMeetingShouldStoreAdvisorAndStudentIds", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleMeetingShouldStoreAdvisorAndStudentIds();
        });
        run("AdvisingSystemPhase2Test.scheduleMeetingShouldUseAdvisorOfficeAsLocation", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleMeetingShouldUseAdvisorOfficeAsLocation();
        });
        run("AdvisingSystemPhase2Test.scheduleMeetingShouldAddEventToAdvisorSchedule", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleMeetingShouldAddEventToAdvisorSchedule();
        });
        run("AdvisingSystemPhase2Test.scheduleMeetingShouldAddEventToStudentSchedule", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleMeetingShouldAddEventToStudentSchedule();
        });
        run("AdvisingSystemPhase2Test.scheduleMeetingShouldAllowNonConflictingMeetings", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleMeetingShouldAllowNonConflictingMeetings();
        });
        run("AdvisingSystemPhase2Test.scheduleMeetingShouldGenerateIncreasingIds", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleMeetingShouldGenerateIncreasingIds();
        });
        run("AdvisingSystemPhase2Test.scheduleMeetingShouldThrowWhenAdvisorMissing", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleMeetingShouldThrowWhenAdvisorMissing();
        });
        run("AdvisingSystemPhase2Test.scheduleMeetingShouldThrowWhenStudentMissing", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleMeetingShouldThrowWhenStudentMissing();
        });
        run("AdvisingSystemPhase2Test.scheduleMeetingShouldThrowOnAdvisorConflict", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleMeetingShouldThrowOnAdvisorConflict();
        });
        run("AdvisingSystemPhase2Test.scheduleMeetingShouldThrowOnStudentConflict", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleMeetingShouldThrowOnStudentConflict();
        });
        run("AdvisingSystemPhase2Test.scheduleMeetingShouldAllowBackToBackMeetings", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleMeetingShouldAllowBackToBackMeetings();
        });
        run("AdvisingSystemPhase2Test.cancelMeetingShouldReturnTrueForExistingMeeting", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelMeetingShouldReturnTrueForExistingMeeting();
        });
        run("AdvisingSystemPhase2Test.cancelMeetingShouldRemoveMeetingFromMeetingSet", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelMeetingShouldRemoveMeetingFromMeetingSet();
        });
        run("AdvisingSystemPhase2Test.cancelMeetingShouldRemoveMeetingFromEventSet", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelMeetingShouldRemoveMeetingFromEventSet();
        });
        run("AdvisingSystemPhase2Test.cancelMeetingShouldRemoveMeetingFromAdvisorSchedule", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelMeetingShouldRemoveMeetingFromAdvisorSchedule();
        });
        run("AdvisingSystemPhase2Test.cancelMeetingShouldRemoveMeetingFromStudentSchedule", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelMeetingShouldRemoveMeetingFromStudentSchedule();
        });
        run("AdvisingSystemPhase2Test.cancelMeetingShouldReturnFalseWhenCalledTwice", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelMeetingShouldReturnFalseWhenCalledTwice();
        });
        run("AdvisingSystemPhase2Test.cancelMeetingShouldKeepOtherMeetings", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelMeetingShouldKeepOtherMeetings();
        });
        run("AdvisingSystemPhase2Test.cancelMeetingShouldFreeTimeSlotForLaterMeeting", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelMeetingShouldFreeTimeSlotForLaterMeeting();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldReturnPositiveIdOnSuccess", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldReturnPositiveIdOnSuccess();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldStoreWorkshopInWorkshopSet", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldStoreWorkshopInWorkshopSet();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldStoreWorkshopInEventSet", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldStoreWorkshopInEventSet();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldStoreTitle", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldStoreTitle();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldCopyAdvisorIds", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldCopyAdvisorIds();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldCopyStudentIds", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldCopyStudentIds();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldStoreUnionOfParticipants", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldStoreUnionOfParticipants();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldAddEventToAdvisorSchedules", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldAddEventToAdvisorSchedules();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldAddEventToStudentSchedules", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldAddEventToStudentSchedules();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldAddEventToLocationSchedule", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldAddEventToLocationSchedule();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldThrowWhenLocationMissing", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldThrowWhenLocationMissing();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldThrowWhenLocationNotReservable", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldThrowWhenLocationNotReservable();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldThrowWhenAdvisorMissing", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldThrowWhenAdvisorMissing();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldThrowWhenStudentMissing", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldThrowWhenStudentMissing();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldThrowOnAdvisorConflict", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldThrowOnAdvisorConflict();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldThrowOnStudentConflict", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldThrowOnStudentConflict();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldThrowOnLocationConflict", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldThrowOnLocationConflict();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldThrowWhenCapacityExceeded", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldThrowWhenCapacityExceeded();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldAllowParticipantCountEqualToCapacity", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldAllowParticipantCountEqualToCapacity();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldIgnoreDuplicateAdvisorIdsInArray", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldIgnoreDuplicateAdvisorIdsInArray();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldIgnoreDuplicateStudentIdsInArray", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldIgnoreDuplicateStudentIdsInArray();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldAllowUnlimitedCapacityLocation", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldAllowUnlimitedCapacityLocation();
        });
        run("AdvisingSystemPhase2Test.scheduleWorkshopShouldAllowNonOverlappingWorkshopsAtSameLocation", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.scheduleWorkshopShouldAllowNonOverlappingWorkshopsAtSameLocation();
        });
        run("AdvisingSystemPhase2Test.cancelWorkshopShouldReturnTrueForExistingWorkshop", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelWorkshopShouldReturnTrueForExistingWorkshop();
        });
        run("AdvisingSystemPhase2Test.cancelWorkshopShouldRemoveWorkshopFromWorkshopSet", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelWorkshopShouldRemoveWorkshopFromWorkshopSet();
        });
        run("AdvisingSystemPhase2Test.cancelWorkshopShouldRemoveWorkshopFromEventSet", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelWorkshopShouldRemoveWorkshopFromEventSet();
        });
        run("AdvisingSystemPhase2Test.cancelWorkshopShouldRemoveWorkshopFromAdvisorSchedules", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelWorkshopShouldRemoveWorkshopFromAdvisorSchedules();
        });
        run("AdvisingSystemPhase2Test.cancelWorkshopShouldRemoveWorkshopFromStudentSchedules", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelWorkshopShouldRemoveWorkshopFromStudentSchedules();
        });
        run("AdvisingSystemPhase2Test.cancelWorkshopShouldRemoveWorkshopFromLocationSchedule", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelWorkshopShouldRemoveWorkshopFromLocationSchedule();
        });
        run("AdvisingSystemPhase2Test.cancelWorkshopShouldReturnFalseWhenCalledTwice", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelWorkshopShouldReturnFalseWhenCalledTwice();
        });
        run("AdvisingSystemPhase2Test.cancelWorkshopShouldFreeSlotForRescheduling", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.cancelWorkshopShouldFreeSlotForRescheduling();
        });
        run("AdvisingSystemPhase2Test.addStudentToWorkshopShouldAddStudentId", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentToWorkshopShouldAddStudentId();
        });
        run("AdvisingSystemPhase2Test.addStudentToWorkshopShouldAddParticipantId", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentToWorkshopShouldAddParticipantId();
        });
        run("AdvisingSystemPhase2Test.addStudentToWorkshopShouldAddWorkshopToStudentSchedule", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentToWorkshopShouldAddWorkshopToStudentSchedule();
        });
        run("AdvisingSystemPhase2Test.addStudentToWorkshopShouldThrowWhenWorkshopMissing", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentToWorkshopShouldThrowWhenWorkshopMissing();
        });
        run("AdvisingSystemPhase2Test.addStudentToWorkshopShouldThrowWhenStudentMissing", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentToWorkshopShouldThrowWhenStudentMissing();
        });
        run("AdvisingSystemPhase2Test.addStudentToWorkshopShouldThrowOnStudentConflict", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentToWorkshopShouldThrowOnStudentConflict();
        });
        run("AdvisingSystemPhase2Test.addStudentToWorkshopShouldThrowWhenCapacityExceeded", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentToWorkshopShouldThrowWhenCapacityExceeded();
        });
        run("AdvisingSystemPhase2Test.addStudentToWorkshopShouldNotDuplicateExistingStudent", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addStudentToWorkshopShouldNotDuplicateExistingStudent();
        });
        run("AdvisingSystemPhase2Test.removeStudentFromWorkshopShouldRemoveStudentId", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeStudentFromWorkshopShouldRemoveStudentId();
        });
        run("AdvisingSystemPhase2Test.removeStudentFromWorkshopShouldRemoveParticipantId", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeStudentFromWorkshopShouldRemoveParticipantId();
        });
        run("AdvisingSystemPhase2Test.removeStudentFromWorkshopShouldRemoveWorkshopFromStudentSchedule", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeStudentFromWorkshopShouldRemoveWorkshopFromStudentSchedule();
        });
        run("AdvisingSystemPhase2Test.removeStudentFromWorkshopShouldThrowWhenWorkshopMissing", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeStudentFromWorkshopShouldThrowWhenWorkshopMissing();
        });
        run("AdvisingSystemPhase2Test.removeStudentFromWorkshopShouldThrowWhenStudentMissing", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeStudentFromWorkshopShouldThrowWhenStudentMissing();
        });
        run("AdvisingSystemPhase2Test.removeStudentFromWorkshopShouldThrowWhenStudentNotInWorkshop", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeStudentFromWorkshopShouldThrowWhenStudentNotInWorkshop();
        });
        run("AdvisingSystemPhase2Test.removeStudentFromWorkshopShouldDeleteWorkshopWhenLastParticipantRemoved", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeStudentFromWorkshopShouldDeleteWorkshopWhenLastParticipantRemoved();
        });
        run("AdvisingSystemPhase2Test.removeStudentFromWorkshopShouldKeepWorkshopWhenParticipantsRemain", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeStudentFromWorkshopShouldKeepWorkshopWhenParticipantsRemain();
        });
        run("AdvisingSystemPhase2Test.addAdvisorToWorkshopShouldAddAdvisorId", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorToWorkshopShouldAddAdvisorId();
        });
        run("AdvisingSystemPhase2Test.addAdvisorToWorkshopShouldAddParticipantId", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorToWorkshopShouldAddParticipantId();
        });
        run("AdvisingSystemPhase2Test.addAdvisorToWorkshopShouldAddWorkshopToAdvisorSchedule", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorToWorkshopShouldAddWorkshopToAdvisorSchedule();
        });
        run("AdvisingSystemPhase2Test.addAdvisorToWorkshopShouldThrowWhenWorkshopMissing", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorToWorkshopShouldThrowWhenWorkshopMissing();
        });
        run("AdvisingSystemPhase2Test.addAdvisorToWorkshopShouldThrowWhenAdvisorMissing", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorToWorkshopShouldThrowWhenAdvisorMissing();
        });
        run("AdvisingSystemPhase2Test.addAdvisorToWorkshopShouldThrowOnAdvisorConflict", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorToWorkshopShouldThrowOnAdvisorConflict();
        });
        run("AdvisingSystemPhase2Test.addAdvisorToWorkshopShouldThrowWhenCapacityExceeded", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorToWorkshopShouldThrowWhenCapacityExceeded();
        });
        run("AdvisingSystemPhase2Test.addAdvisorToWorkshopShouldNotDuplicateExistingAdvisor", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.addAdvisorToWorkshopShouldNotDuplicateExistingAdvisor();
        });
        run("AdvisingSystemPhase2Test.removeAdvisorFromWorkshopShouldRemoveAdvisorId", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeAdvisorFromWorkshopShouldRemoveAdvisorId();
        });
        run("AdvisingSystemPhase2Test.removeAdvisorFromWorkshopShouldRemoveParticipantId", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeAdvisorFromWorkshopShouldRemoveParticipantId();
        });
        run("AdvisingSystemPhase2Test.removeAdvisorFromWorkshopShouldRemoveWorkshopFromAdvisorSchedule", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeAdvisorFromWorkshopShouldRemoveWorkshopFromAdvisorSchedule();
        });
        run("AdvisingSystemPhase2Test.removeAdvisorFromWorkshopShouldThrowWhenWorkshopMissing", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeAdvisorFromWorkshopShouldThrowWhenWorkshopMissing();
        });
        run("AdvisingSystemPhase2Test.removeAdvisorFromWorkshopShouldThrowWhenAdvisorMissing", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeAdvisorFromWorkshopShouldThrowWhenAdvisorMissing();
        });
        run("AdvisingSystemPhase2Test.removeAdvisorFromWorkshopShouldThrowWhenAdvisorNotInWorkshop", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeAdvisorFromWorkshopShouldThrowWhenAdvisorNotInWorkshop();
        });
        run("AdvisingSystemPhase2Test.removeAdvisorFromWorkshopShouldDeleteWorkshopWhenLastParticipantRemoved", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeAdvisorFromWorkshopShouldDeleteWorkshopWhenLastParticipantRemoved();
        });
        run("AdvisingSystemPhase2Test.removeAdvisorFromWorkshopShouldKeepWorkshopWhenParticipantsRemain", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.removeAdvisorFromWorkshopShouldKeepWorkshopWhenParticipantsRemain();
        });
        run("AdvisingSystemPhase2Test.deleteStudentShouldReturnFalseWhenStudentMissing", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.deleteStudentShouldReturnFalseWhenStudentMissing();
        });
        run("AdvisingSystemPhase2Test.deleteStudentShouldReturnTrueWhenStudentExists", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.deleteStudentShouldReturnTrueWhenStudentExists();
        });
        run("AdvisingSystemPhase2Test.deleteStudentShouldRemoveStudentFromRegistry", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.deleteStudentShouldRemoveStudentFromRegistry();
        });
        run("AdvisingSystemPhase2Test.deleteStudentShouldCancelMeetingsOfThatStudent", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.deleteStudentShouldCancelMeetingsOfThatStudent();
        });
        run("AdvisingSystemPhase2Test.deleteStudentShouldRemoveDeletedStudentsMeetingFromAdvisorSchedule", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.deleteStudentShouldRemoveDeletedStudentsMeetingFromAdvisorSchedule();
        });
        run("AdvisingSystemPhase2Test.deleteStudentShouldRemoveStudentFromWorkshopStudentSet", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.deleteStudentShouldRemoveStudentFromWorkshopStudentSet();
        });
        run("AdvisingSystemPhase2Test.deleteStudentShouldKeepWorkshopWhenOtherParticipantsRemain", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.deleteStudentShouldKeepWorkshopWhenOtherParticipantsRemain();
        });
        run("AdvisingSystemPhase2Test.deleteStudentShouldDeleteWorkshopWhenItBecomesEmpty", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.deleteStudentShouldDeleteWorkshopWhenItBecomesEmpty();
        });
        run("AdvisingSystemPhase2Test.deleteStudentShouldClearLocationScheduleWhenWorkshopIsDeleted", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.deleteStudentShouldClearLocationScheduleWhenWorkshopIsDeleted();
        });
        run("AdvisingSystemPhase2Test.deleteStudentShouldNotAffectOtherStudents", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.deleteStudentShouldNotAffectOtherStudents();
        });
        run("AdvisingSystemPhase2Test.deleteStudentShouldUpdateMeetingAndWorkshopTogether", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.deleteStudentShouldUpdateMeetingAndWorkshopTogether();
        });
        run("AdvisingSystemPhase2Test.deleteStudentShouldNotDeleteUnrelatedMeetings", () -> {
            AdvisingSystemPhase2Test test = new AdvisingSystemPhase2Test();
            test.deleteStudentShouldNotDeleteUnrelatedMeetings();
        });
        run("AdvisorTest.getOffice", () -> {
            AdvisorTest test = new AdvisorTest();
            test.setUp();
            test.getOffice();
        });
        run("BSTMapTest.emptyOnNewMap", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.emptyOnNewMap();
        });
        run("BSTMapTest.sizeOnNewMap", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.sizeOnNewMap();
        });
        run("BSTMapTest.notEmptyAfterInsert", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.notEmptyAfterInsert();
        });
        run("BSTMapTest.sizeAfterSingleInsert", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.sizeAfterSingleInsert();
        });
        run("BSTMapTest.sizeAfterMultipleInserts", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.sizeAfterMultipleInserts();
        });
        run("BSTMapTest.clearEmptyMap", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.clearEmptyMap();
        });
        run("BSTMapTest.clearNonEmptyMap", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.clearNonEmptyMap();
        });
        run("BSTMapTest.insertAfterClear", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.insertAfterClear();
        });
        run("BSTMapTest.insertReturnsTrueForNewKey", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.insertReturnsTrueForNewKey();
        });
        run("BSTMapTest.insertReturnsFalseForDuplicateKey", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.insertReturnsFalseForDuplicateKey();
        });
        run("BSTMapTest.insertDuplicateDoesNotChangeValue", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.insertDuplicateDoesNotChangeValue();
        });
        run("BSTMapTest.insertDuplicateDoesNotChangeSize", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.insertDuplicateDoesNotChangeSize();
        });
        run("BSTMapTest.insertLeftAndRightChildren", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.insertLeftAndRightChildren();
        });
        run("BSTMapTest.getReturnsNullForMissingKey", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.getReturnsNullForMissingKey();
        });
        run("BSTMapTest.getReturnsNullOnEmptyMap", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.getReturnsNullOnEmptyMap();
        });
        run("BSTMapTest.getReturnsCorrectValue", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.getReturnsCorrectValue();
        });
        run("BSTMapTest.getDistinguishesMultipleKeys", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.getDistinguishesMultipleKeys();
        });
        run("BSTMapTest.getOnRootKey", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.getOnRootKey();
        });
        run("BSTMapTest.updateReturnsFalseForMissingKey", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.updateReturnsFalseForMissingKey();
        });
        run("BSTMapTest.updateReturnsTrueForExistingKey", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.updateReturnsTrueForExistingKey();
        });
        run("BSTMapTest.updateChangesValue", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.updateChangesValue();
        });
        run("BSTMapTest.updateDoesNotChangeSize", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.updateDoesNotChangeSize();
        });
        run("BSTMapTest.updateOnlyAffectsTargetKey", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.updateOnlyAffectsTargetKey();
        });
        run("BSTMapTest.removeReturnsFalseForMissingKey", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.removeReturnsFalseForMissingKey();
        });
        run("BSTMapTest.removeReturnsFalseOnEmptyMap", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.removeReturnsFalseOnEmptyMap();
        });
        run("BSTMapTest.removeReturnsTrueForExistingKey", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.removeReturnsTrueForExistingKey();
        });
        run("BSTMapTest.removeDecreasesSize", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.removeDecreasesSize();
        });
        run("BSTMapTest.removeLeafNode", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.removeLeafNode();
        });
        run("BSTMapTest.removeNodeWithOneChild", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.removeNodeWithOneChild();
        });
        run("BSTMapTest.removeNodeWithTwoChildren", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.removeNodeWithTwoChildren();
        });
        run("BSTMapTest.removeRootSingleNode", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.removeRootSingleNode();
        });
        run("BSTMapTest.removeRootWithChildren", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.removeRootWithChildren();
        });
        run("BSTMapTest.removeSameKeyTwice", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.removeSameKeyTwice();
        });
        run("BSTMapTest.nbKeyCompOnEmptyMapReturnsZero", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.nbKeyCompOnEmptyMapReturnsZero();
        });
        run("BSTMapTest.nbKeyCompForRootIsOne", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.nbKeyCompForRootIsOne();
        });
        run("BSTMapTest.nbKeyCompForMissingKeyCountsVisitedNodes", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.nbKeyCompForMissingKeyCountsVisitedNodes();
        });
        run("BSTMapTest.nbKeyCompIncreasesWithDepth", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.nbKeyCompIncreasesWithDepth();
        });
        run("BSTMapTest.getKeysOnEmptyMap", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.getKeysOnEmptyMap();
        });
        run("BSTMapTest.getKeysSingleElement", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.getKeysSingleElement();
        });
        run("BSTMapTest.getKeysReturnsSortedOrder", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.getKeysReturnsSortedOrder();
        });
        run("BSTMapTest.getKeysAfterRemove", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.getKeysAfterRemove();
        });
        run("BSTMapTest.getKeysAfterClear", () -> {
            BSTMapTest test = new BSTMapTest();
            test.setUp();
            test.getKeysAfterClear();
        });
        run("BSTSetTest.size_emptySet_returnsZero", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.size_emptySet_returnsZero();
        });
        run("BSTSetTest.empty_emptySet_returnsTrue", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.empty_emptySet_returnsTrue();
        });
        run("BSTSetTest.empty_nonEmptySet_returnsFalse", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.empty_nonEmptySet_returnsFalse();
        });
        run("BSTSetTest.clear_emptySet_keepsItEmpty", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.clear_emptySet_keepsItEmpty();
        });
        run("BSTSetTest.clear_nonEmptySet_removesAllElements", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.clear_nonEmptySet_removesAllElements();
        });
        run("BSTSetTest.insert_singleKey_succeeds", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.insert_singleKey_succeeds();
        });
        run("BSTSetTest.insert_multipleDistinctKeys_allSucceed", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.insert_multipleDistinctKeys_allSucceed();
        });
        run("BSTSetTest.insert_duplicateKey_failsAndSizeUnchanged", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.insert_duplicateKey_failsAndSizeUnchanged();
        });
        run("BSTSetTest.contains_missingKeyInEmptySet_returnsFalse", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.contains_missingKeyInEmptySet_returnsFalse();
        });
        run("BSTSetTest.contains_missingKeyInNonEmptySet_returnsFalse", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.contains_missingKeyInNonEmptySet_returnsFalse();
        });
        run("BSTSetTest.contains_existingKeys_returnsTrue", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.contains_existingKeys_returnsTrue();
        });
        run("BSTSetTest.remove_fromEmptySet_returnsFalse", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.remove_fromEmptySet_returnsFalse();
        });
        run("BSTSetTest.remove_missingKey_returnsFalse", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.remove_missingKey_returnsFalse();
        });
        run("BSTSetTest.remove_leafNode_succeeds", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.remove_leafNode_succeeds();
        });
        run("BSTSetTest.remove_rootWhenSingleNode_succeeds", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.remove_rootWhenSingleNode_succeeds();
        });
        run("BSTSetTest.remove_nodeWithOneLeftChild_succeeds", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.remove_nodeWithOneLeftChild_succeeds();
        });
        run("BSTSetTest.remove_nodeWithOneRightChild_succeeds", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.remove_nodeWithOneRightChild_succeeds();
        });
        run("BSTSetTest.remove_nodeWithTwoChildren_succeeds", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.remove_nodeWithTwoChildren_succeeds();
        });
        run("BSTSetTest.remove_rootWithTwoChildren_succeeds", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.remove_rootWithTwoChildren_succeeds();
        });
        run("BSTSetTest.remove_allElementsOneByOne_resultsInEmptySet", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.remove_allElementsOneByOne_resultsInEmptySet();
        });
        run("BSTSetTest.getKeys_emptySet_returnsEmptyList", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.getKeys_emptySet_returnsEmptyList();
        });
        run("BSTSetTest.getKeys_returnsKeysInIncreasingOrder", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.getKeys_returnsKeysInIncreasingOrder();
        });
        run("BSTSetTest.getKeys_afterRemovals_remainsSorted", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.getKeys_afterRemovals_remainsSorted();
        });
        run("BSTSetTest.nbKeyComp_emptySet_isZeroOrMoreAndContainsFalse", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.nbKeyComp_emptySet_isZeroOrMoreAndContainsFalse();
        });
        run("BSTSetTest.nbKeyComp_existingKey_isPositive", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.nbKeyComp_existingKey_isPositive();
        });
        run("BSTSetTest.nbKeyComp_missingKey_isPositiveInNonEmptySet", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.nbKeyComp_missingKey_isPositiveInNonEmptySet();
        });
        run("BSTSetTest.nbKeyComp_rootShouldNeedNoMoreComparisonsThanDeepNode", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.nbKeyComp_rootShouldNeedNoMoreComparisonsThanDeepNode();
        });
        run("BSTSetTest.supportsStringsAsComparableKeys", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.supportsStringsAsComparableKeys();
        });
        run("BSTSetTest.supportsSubtypeComparableToSupertype", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.supportsSubtypeComparableToSupertype();
        });
        run("BSTSetTest.mixedOperations_preserveCorrectState", () -> {
            BSTSetTest test = new BSTSetTest();
            test.setUp();
            test.mixedOperations_preserveCorrectState();
        });
        run("DateTimeTest.getYear", () -> {
            DateTimeTest test = new DateTimeTest();
            test.setUp();
            test.getYear();
        });
        run("DateTimeTest.getMonth", () -> {
            DateTimeTest test = new DateTimeTest();
            test.setUp();
            test.getMonth();
        });
        run("DateTimeTest.getDay", () -> {
            DateTimeTest test = new DateTimeTest();
            test.setUp();
            test.getDay();
        });
        run("DateTimeTest.getHour", () -> {
            DateTimeTest test = new DateTimeTest();
            test.setUp();
            test.getHour();
        });
        run("DateTimeTest.getMinute", () -> {
            DateTimeTest test = new DateTimeTest();
            test.setUp();
            test.getMinute();
        });
        run("DateTimeTest.compareTo", () -> {
            DateTimeTest test = new DateTimeTest();
            test.setUp();
            test.compareTo();
        });
        run("DateTimeTest.format", () -> {
            DateTimeTest test = new DateTimeTest();
            test.setUp();
            test.format();
        });
        run("EventTest.getId", () -> {
            EventTest test = new EventTest();
            test.setUp();
            test.getId();
        });
        run("EventTest.getTimeSlot", () -> {
            EventTest test = new EventTest();
            test.setUp();
            test.getTimeSlot();
        });
        run("EventTest.getLocation", () -> {
            EventTest test = new EventTest();
            test.setUp();
            test.getLocation();
        });
        run("EventTest.getParticipantIds", () -> {
            EventTest test = new EventTest();
            test.setUp();
            test.getParticipantIds();
        });
        run("EventTest.compareTo", () -> {
            EventTest test = new EventTest();
            test.setUp();
            test.compareTo();
        });
        run("LinkedListTest.testFull", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testFull();
        });
        run("LinkedListTest.testEmpty", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testEmpty();
        });
        run("LinkedListTest.testLast", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testLast();
        });
        run("LinkedListTest.testFindFirst", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testFindFirst();
        });
        run("LinkedListTest.testFindNext", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testFindNext();
        });
        run("LinkedListTest.testInsert", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testInsert();
        });
        run("LinkedListTest.testRetrieve", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testRetrieve();
        });
        run("LinkedListTest.testUpdate", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testUpdate();
        });
        run("LinkedListTest.testRemove", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testRemove();
        });
        run("LinkedListTest.testLengthTwo", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testLengthTwo();
        });
        run("LinkedListTest.testLengthEmpty", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testLengthEmpty();
        });
        run("LinkedListTest.testInsertMultipleAndRetrieve", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testInsertMultipleAndRetrieve();
        });
        run("LinkedListTest.testFindFirstReturnsToHead", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testFindFirstReturnsToHead();
        });
        run("LinkedListTest.testFindNextAdvancesCurrent", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testFindNextAdvancesCurrent();
        });
        run("LinkedListTest.testRemoveMidList", () -> {
            LinkedListTest test = new LinkedListTest();
            test.setUp();
            test.testRemoveMidList();
        });
        run("LocationTest.getId", () -> {
            LocationTest test = new LocationTest();
            test.setUp();
            test.getId();
        });
        run("LocationTest.getName", () -> {
            LocationTest test = new LocationTest();
            test.setUp();
            test.getName();
        });
        run("LocationTest.isReservable", () -> {
            LocationTest test = new LocationTest();
            test.setUp();
            test.isReservable();
        });
        run("LocationTest.isOnline", () -> {
            LocationTest test = new LocationTest();
            test.setUp();
            test.isOnline();
        });
        run("LocationTest.getCapacity", () -> {
            LocationTest test = new LocationTest();
            test.setUp();
            test.getCapacity();
        });
        run("LocationTest.getSchedule", () -> {
            LocationTest test = new LocationTest();
            test.setUp();
            test.getSchedule();
        });
        run("LocationTest.compareTo", () -> {
            LocationTest test = new LocationTest();
            test.setUp();
            test.compareTo();
        });
        run("LocationTest.testOnlineLocation", () -> {
            LocationTest test = new LocationTest();
            test.setUp();
            test.testOnlineLocation();
        });
        run("LocationTest.testPrivateLocation", () -> {
            LocationTest test = new LocationTest();
            test.setUp();
            test.testPrivateLocation();
        });
        run("MeetingTest.constructorShouldInitializeAllFields", () -> {
            MeetingTest test = new MeetingTest();
            test.constructorShouldInitializeAllFields();
        });
        run("MeetingTest.participantIdsShouldContainAdvisorAndStudent", () -> {
            MeetingTest test = new MeetingTest();
            test.participantIdsShouldContainAdvisorAndStudent();
        });
        run("MeetingTest.compareToShouldUseEventId", () -> {
            MeetingTest test = new MeetingTest();
            test.compareToShouldUseEventId();
        });
        run("MeetingTest.participantIdsShouldNotDuplicateWhenAdvisorAndStudentAreSame", () -> {
            MeetingTest test = new MeetingTest();
            test.participantIdsShouldNotDuplicateWhenAdvisorAndStudentAreSame();
        });
        run("PersonTest.getId", () -> {
            PersonTest test = new PersonTest();
            test.setUp();
            test.getId();
        });
        run("PersonTest.getName", () -> {
            PersonTest test = new PersonTest();
            test.setUp();
            test.getName();
        });
        run("PersonTest.getEmail", () -> {
            PersonTest test = new PersonTest();
            test.setUp();
            test.getEmail();
        });
        run("PersonTest.getSchedule", () -> {
            PersonTest test = new PersonTest();
            test.setUp();
            test.getSchedule();
        });
        run("PersonTest.compareTo", () -> {
            PersonTest test = new PersonTest();
            test.setUp();
            test.compareTo();
        });
        run("ScheduleTest.emptyOnNew", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.emptyOnNew();
        });
        run("ScheduleTest.sizeZeroOnNew", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.sizeZeroOnNew();
        });
        run("ScheduleTest.containsFalseOnNew", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.containsFalseOnNew();
        });
        run("ScheduleTest.conflictsFalseOnNew", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.conflictsFalseOnNew();
        });
        run("ScheduleTest.getEventIdsEmptyOnNew", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.getEventIdsEmptyOnNew();
        });
        run("ScheduleTest.getEventsEmptyOnNew", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.getEventsEmptyOnNew();
        });
        run("ScheduleTest.returnsTrueForFreshEvent", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.returnsTrueForFreshEvent();
        });
        run("ScheduleTest.sizeBecomesOne", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.sizeBecomesOne();
        });
        run("ScheduleTest.emptyBecomesFalse", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.emptyBecomesFalse();
        });
        run("ScheduleTest.containsInsertedId", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.containsInsertedId();
        });
        run("ScheduleTest.twoNonOverlapping", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.twoNonOverlapping();
        });
        run("ScheduleTest.containsFalseForUnknownId", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.containsFalseForUnknownId();
        });
        run("ScheduleTest.sameIdSameSlot", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.sameIdSameSlot();
        });
        run("ScheduleTest.sameIdDifferentSlot", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.sameIdDifferentSlot();
        });
        run("ScheduleTest.duplicateIdSizeUnchanged", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.duplicateIdSizeUnchanged();
        });
        run("ScheduleTest.differentIdSameSlot", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.differentIdSameSlot();
        });
        run("ScheduleTest.exactSlotConflictSizeUnchanged", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.exactSlotConflictSizeUnchanged();
        });
        run("ScheduleTest.secondIdNotRegistered", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.secondIdNotRegistered();
        });
        run("ScheduleTest.startsInsideEndsAfter", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.startsInsideEndsAfter();
        });
        run("ScheduleTest.startsBeforeEndsInside", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.startsBeforeEndsInside();
        });
        run("ScheduleTest.completelyInside", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.completelyInside();
        });
        run("ScheduleTest.completelyWraps", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.completelyWraps();
        });
        run("ScheduleTest.sameStartExtendsOut", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.sameStartExtendsOut();
        });
        run("ScheduleTest.sameEndStartsEarlier", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.sameEndStartsEarlier();
        });
        run("ScheduleTest.oneMinuteOverlapAtStart", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.oneMinuteOverlapAtStart();
        });
        run("ScheduleTest.oneMinuteOverlapAtEnd", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.oneMinuteOverlapAtEnd();
        });
        run("ScheduleTest.overlapShapesSizeUnchanged", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.overlapShapesSizeUnchanged();
        });
        run("ScheduleTest.beforeAdjacentAccepted", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.beforeAdjacentAccepted();
        });
        run("ScheduleTest.afterAdjacentAccepted", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.afterAdjacentAccepted();
        });
        run("ScheduleTest.threeAdjacentSize", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.threeAdjacentSize();
        });
        run("ScheduleTest.returnsTrueForKnownId", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.returnsTrueForKnownId();
        });
        run("ScheduleTest.containsBecomesFalse", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.containsBecomesFalse();
        });
        run("ScheduleTest.sizeDecrements", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.sizeDecrements();
        });
        run("ScheduleTest.siblingUnaffected", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.siblingUnaffected();
        });
        run("ScheduleTest.emptyAfterLastRemoval", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.emptyAfterLastRemoval();
        });
        run("ScheduleTest.returnsFalseForUnknownId", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.returnsFalseForUnknownId();
        });
        run("ScheduleTest.removeUnknownSizeUnchanged", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.removeUnknownSizeUnchanged();
        });
        run("ScheduleTest.returnsFalseOnEmpty", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.returnsFalseOnEmpty();
        });
        run("ScheduleTest.returnsFalseOnSecondRemove", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.returnsFalseOnSecondRemove();
        });
        run("ScheduleTest.freedSlotNoLongerConflicts", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.freedSlotNoLongerConflicts();
        });
        run("ScheduleTest.canReAddSameSlot", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.canReAddSameSlot();
        });
        run("ScheduleTest.getEventIdsExcludesRemovedId", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.getEventIdsExcludesRemovedId();
        });
        run("ScheduleTest.getEventsExcludesFreedSlot", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.getEventsExcludesFreedSlot();
        });
        run("ScheduleTest.containsLifecycleFalseOnEmpty", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.containsLifecycleFalseOnEmpty();
        });
        run("ScheduleTest.trueAfterAdd", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.trueAfterAdd();
        });
        run("ScheduleTest.falseAfterRemove", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.falseAfterRemove();
        });
        run("ScheduleTest.handlesZeroId", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.handlesZeroId();
        });
        run("ScheduleTest.handlesNegativeId", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.handlesNegativeId();
        });
        run("ScheduleTest.handlesLargeId", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.handlesLargeId();
        });
        run("ScheduleTest.conflictsFalseOnEmptySchedule", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.conflictsFalseOnEmptySchedule();
        });
        run("ScheduleTest.exactSameSlot", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.exactSameSlot();
        });
        run("ScheduleTest.subSlot", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.subSlot();
        });
        run("ScheduleTest.overlapStart", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.overlapStart();
        });
        run("ScheduleTest.overlapEnd", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.overlapEnd();
        });
        run("ScheduleTest.enclosing", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.enclosing();
        });
        run("ScheduleTest.touchesBeforeNoConflict", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.touchesBeforeNoConflict();
        });
        run("ScheduleTest.touchesAfterNoConflict", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.touchesAfterNoConflict();
        });
        run("ScheduleTest.entirelyBefore", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.entirelyBefore();
        });
        run("ScheduleTest.entirelyAfter", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.entirelyAfter();
        });
        run("ScheduleTest.incrementsOnAdd", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.incrementsOnAdd();
        });
        run("ScheduleTest.emptyFalseAfterAdd", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.emptyFalseAfterAdd();
        });
        run("ScheduleTest.decrementsOnRemove", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.decrementsOnRemove();
        });
        run("ScheduleTest.emptyTrueWhenAllRemoved", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.emptyTrueWhenAllRemoved();
        });
        run("ScheduleTest.failedAddNoSizeChange", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.failedAddNoSizeChange();
        });
        run("ScheduleTest.failedRemoveNoSizeChange", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.failedRemoveNoSizeChange();
        });
        run("ScheduleTest.sizeZeroAfterClear", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.sizeZeroAfterClear();
        });
        run("ScheduleTest.emptyAfterClear", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.emptyAfterClear();
        });
        run("ScheduleTest.containsFalseAfterClear", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.containsFalseAfterClear();
        });
        run("ScheduleTest.conflictsFalseAfterClear", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.conflictsFalseAfterClear();
        });
        run("ScheduleTest.getEventIdsEmptyAfterClear", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.getEventIdsEmptyAfterClear();
        });
        run("ScheduleTest.getEventsEmptyAfterClear", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.getEventsEmptyAfterClear();
        });
        run("ScheduleTest.canAddAfterClear", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.canAddAfterClear();
        });
        run("ScheduleTest.sizeOneAfterReAdd", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.sizeOneAfterReAdd();
        });
        run("ScheduleTest.containsAllInsertedIds", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.containsAllInsertedIds();
        });
        run("ScheduleTest.doesNotContainUnknownIds", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.doesNotContainUnknownIds();
        });
        run("ScheduleTest.getEventIdsSizeMatches", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.getEventIdsSizeMatches();
        });
        run("ScheduleTest.keysInAscendingOrder", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.keysInAscendingOrder();
        });
        run("ScheduleTest.removedIdAbsent", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.removedIdAbsent();
        });
        run("ScheduleTest.getEventsSizeMatches", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.getEventsSizeMatches();
        });
        run("ScheduleTest.mapsSlotToCorrectId", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.mapsSlotToCorrectId();
        });
        run("ScheduleTest.nullForUnknownSlot", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.nullForUnknownSlot();
        });
        run("ScheduleTest.slotAbsentAfterRemoval", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.slotAbsentAfterRemoval();
        });
        run("ScheduleTest.bulkInsert", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.bulkInsert();
        });
        run("ScheduleTest.conflictsAfterBulkInsert", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.conflictsAfterBulkInsert();
        });
        run("ScheduleTest.gapsNoConflict", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.gapsNoConflict();
        });
        run("ScheduleTest.bulkRemoveEvens", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.bulkRemoveEvens();
        });
        run("ScheduleTest.oddsSurvive", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.oddsSurvive();
        });
        run("ScheduleTest.freedSlotAcceptsNewEvent", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.freedSlotAcceptsNewEvent();
        });
        run("ScheduleTest.surroundingEventsStillConflict", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.surroundingEventsStillConflict();
        });
        run("ScheduleTest.removedNotContained", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.removedNotContained();
        });
        run("ScheduleTest.newEventContained", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.newEventContained();
        });
        run("ScheduleTest.sizeConsistentThroughCycle", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.sizeConsistentThroughCycle();
        });
        run("ScheduleTest.sameIdSameSlotReAdded", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.sameIdSameSlotReAdded();
        });
        run("ScheduleTest.differentIdSameSlotAfterRemoval", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.differentIdSameSlotAfterRemoval();
        });
        run("ScheduleTest.originalIdNewSlot", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.originalIdNewSlot();
        });
        run("ScheduleTest.sizeAfterReInsert", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.sizeAfterReInsert();
        });
        run("ScheduleTest.overnightInserted", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.overnightInserted();
        });
        run("ScheduleTest.overnightConflictsSpanningMidnight", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.overnightConflictsSpanningMidnight();
        });
        run("ScheduleTest.adjacentAfterOvernightNoConflict", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.adjacentAfterOvernightNoConflict();
        });
        run("ScheduleTest.differentMonthNoConflict", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.differentMonthNoConflict();
        });
        run("ScheduleTest.eventsAcrossTwoMonthsBothInserted", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.eventsAcrossTwoMonthsBothInserted();
        });
        run("ScheduleTest.oneMinuteSlotInserted", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.oneMinuteSlotInserted();
        });
        run("ScheduleTest.sameOneMinuteSlotConflicts", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.sameOneMinuteSlotConflicts();
        });
        run("ScheduleTest.adjacentAfterNoConflict", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.adjacentAfterNoConflict();
        });
        run("ScheduleTest.adjacentBeforeNoConflict", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.adjacentBeforeNoConflict();
        });
        run("ScheduleTest.twoConsecutiveOneMinuteSlots", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.twoConsecutiveOneMinuteSlots();
        });
        run("ScheduleTest.spanningSlotConflicts", () -> {
            ScheduleTest test = new ScheduleTest();
            test.setUp();
            test.spanningSlotConflicts();
        });
        run("StudentTest.getMajor", () -> {
            StudentTest test = new StudentTest();
            test.setUp();
            test.getMajor();
        });
        run("TimeSlotTest.getStart", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.getStart();
        });
        run("TimeSlotTest.getEnd", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.getEnd();
        });
        run("TimeSlotTest.compareTo_sameInterval_returnsZero", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.compareTo_sameInterval_returnsZero();
        });
        run("TimeSlotTest.compareTo_nonOverlappingBefore_returnsMinusOne", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.compareTo_nonOverlappingBefore_returnsMinusOne();
        });
        run("TimeSlotTest.compareTo_touchingBoundary_returnsMinusOneAndPlusOne", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.compareTo_touchingBoundary_returnsMinusOneAndPlusOne();
        });
        run("TimeSlotTest.compareTo_partialOverlapAtEnd_returnsZero", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.compareTo_partialOverlapAtEnd_returnsZero();
        });
        run("TimeSlotTest.compareTo_partialOverlapAtStart_returnsZero", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.compareTo_partialOverlapAtStart_returnsZero();
        });
        run("TimeSlotTest.compareTo_oneContainsOther_returnsZero", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.compareTo_oneContainsOther_returnsZero();
        });
        run("TimeSlotTest.compareTo_sameStartDifferentEnd_returnsZero", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.compareTo_sameStartDifferentEnd_returnsZero();
        });
        run("TimeSlotTest.compareTo_sameEndDifferentStart_returnsZero", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.compareTo_sameEndDifferentStart_returnsZero();
        });
        run("TimeSlotTest.compareTo_differentDays_nonOverlapping", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.compareTo_differentDays_nonOverlapping();
        });
        run("TimeSlotTest.compareTo_differentMonths_nonOverlapping", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.compareTo_differentMonths_nonOverlapping();
        });
        run("TimeSlotTest.compareTo_differentYears_nonOverlapping", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.compareTo_differentYears_nonOverlapping();
        });
        run("TimeSlotTest.compareTo_zeroLengthAtBoundary_returnsMinusOneAndPlusOne", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.compareTo_zeroLengthAtBoundary_returnsMinusOneAndPlusOne();
        });
        run("TimeSlotTest.compareTo_zeroLengthInsideInterval_returnsZero", () -> {
            TimeSlotTest test = new TimeSlotTest();
            test.compareTo_zeroLengthInsideInterval_returnsZero();
        });
        run("WorkshopTest.constructorShouldInitializeAllFields", () -> {
            WorkshopTest test = new WorkshopTest();
            test.constructorShouldInitializeAllFields();
        });
        run("WorkshopTest.constructorShouldCopyAdvisorIds", () -> {
            WorkshopTest test = new WorkshopTest();
            test.constructorShouldCopyAdvisorIds();
        });
        run("WorkshopTest.constructorShouldCopyStudentIds", () -> {
            WorkshopTest test = new WorkshopTest();
            test.constructorShouldCopyStudentIds();
        });
        run("WorkshopTest.participantIdsShouldContainAllAdvisorsAndStudents", () -> {
            WorkshopTest test = new WorkshopTest();
            test.participantIdsShouldContainAllAdvisorsAndStudents();
        });
        run("WorkshopTest.participantIdsShouldRemoveDuplicatesAcrossAdvisorAndStudentSets", () -> {
            WorkshopTest test = new WorkshopTest();
            test.participantIdsShouldRemoveDuplicatesAcrossAdvisorAndStudentSets();
        });
        run("WorkshopTest.workshopShouldDeepCopyAdvisorSet", () -> {
            WorkshopTest test = new WorkshopTest();
            test.workshopShouldDeepCopyAdvisorSet();
        });
        run("WorkshopTest.workshopShouldDeepCopyStudentSet", () -> {
            WorkshopTest test = new WorkshopTest();
            test.workshopShouldDeepCopyStudentSet();
        });
        run("WorkshopTest.workshopShouldHandleEmptyAdvisorAndStudentSets", () -> {
            WorkshopTest test = new WorkshopTest();
            test.workshopShouldHandleEmptyAdvisorAndStudentSets();
        });
        run("WorkshopTest.compareToShouldUseEventId", () -> {
            WorkshopTest test = new WorkshopTest();
            test.compareToShouldUseEventId();
        });
        run("WorkshopTest.returnedAdvisorSetShouldBeTheWorkshopSetContent", () -> {
            WorkshopTest test = new WorkshopTest();
            test.returnedAdvisorSetShouldBeTheWorkshopSetContent();
        });
        run("WorkshopTest.returnedStudentSetShouldBeTheWorkshopSetContent", () -> {
            WorkshopTest test = new WorkshopTest();
            test.returnedStudentSetShouldBeTheWorkshopSetContent();
        });

        System.out.println("Passed: " + passed + "/" + total);
        if (!failedTests.isEmpty()) {
            System.out.println("Failed tests:");
            for (String failedTest : failedTests) {
                System.out.println("- " + failedTest);
            }
        }
    }

    private static void run(String name, TestCase testCase) {
        total++;
        try {
            testCase.run();
            passed++;
        } catch (Throwable t) {
            failedTests.add(name + " -- " + t.getClass().getSimpleName() + ": " + t.getMessage());
        }
    }
}

class PlainAssertions {
    @FunctionalInterface
    interface ThrowingRunnable {
        void run() throws Throwable;
    }

    static class AssertionFailedError extends AssertionError {
        AssertionFailedError(String message) {
            super(message);
        }
    }

    static void fail(String message) {
        throw new AssertionFailedError(message);
    }

    static void fail() {
        fail("Test failed");
    }

    static void assertTrue(boolean condition) {
        assertTrue(condition, null);
    }

    static void assertTrue(boolean condition, String message) {
        if (!condition) {
            fail(message != null ? message : "Expected condition to be true");
        }
    }

    static void assertFalse(boolean condition) {
        assertFalse(condition, null);
    }

    static void assertFalse(boolean condition, String message) {
        if (condition) {
            fail(message != null ? message : "Expected condition to be false");
        }
    }

    static void assertNull(Object actual) {
        assertNull(actual, null);
    }

    static void assertNull(Object actual, String message) {
        if (actual != null) {
            fail(message != null ? message : "Expected null, but was <" + actual + ">");
        }
    }

    static void assertNotNull(Object actual) {
        assertNotNull(actual, null);
    }

    static void assertNotNull(Object actual, String message) {
        if (actual == null) {
            fail(message != null ? message : "Expected a non-null value");
        }
    }

    static void assertSame(Object expected, Object actual) {
        assertSame(expected, actual, null);
    }

    static void assertSame(Object expected, Object actual, String message) {
        if (expected != actual) {
            fail(message != null ? message : "Expected same reference, but got different references");
        }
    }

    static void assertEquals(Object expected, Object actual) {
        assertEquals(expected, actual, null);
    }

    static void assertEquals(Object expected, Object actual, String message) {
        boolean equal;
        if (expected instanceof Number && actual instanceof Number) {
            equal = numericEquals((Number) expected, (Number) actual);
        } else {
            equal = Objects.equals(expected, actual);
        }
        if (!equal) {
            String base = "Expected <" + expected + ">, but was <" + actual + ">";
            fail(message != null ? message + ": " + base : base);
        }
    }

    private static boolean numericEquals(Number expected, Number actual) {
        if (expected instanceof Float || expected instanceof Double || actual instanceof Float || actual instanceof Double) {
            return Double.compare(expected.doubleValue(), actual.doubleValue()) == 0;
        }
        return expected.longValue() == actual.longValue();
    }

    static void assertNotEquals(Object unexpected, Object actual) {
        assertNotEquals(unexpected, actual, null);
    }

    static void assertNotEquals(Object unexpected, Object actual, String message) {
        boolean equal;
        if (unexpected instanceof Number && actual instanceof Number) {
            equal = numericEquals((Number) unexpected, (Number) actual);
        } else {
            equal = Objects.equals(unexpected, actual);
        }
        if (equal) {
            String base = "Did not expect <" + actual + ">";
            fail(message != null ? message + ": " + base : base);
        }
    }

    static <T extends Throwable> T assertThrows(Class<T> expectedType, ThrowingRunnable executable) {
        return assertThrows(expectedType, executable, null);
    }

    static <T extends Throwable> T assertThrows(Class<T> expectedType, ThrowingRunnable executable, String message) {
        try {
            executable.run();
        } catch (Throwable actual) {
            if (expectedType.isInstance(actual)) {
                return expectedType.cast(actual);
            }
            String base = "Expected exception <" + expectedType.getName() + ">, but got <" + actual.getClass().getName() + ">";
            fail(message != null ? message + ": " + base : base);
        }
        String base = "Expected exception <" + expectedType.getName() + ">, but no exception was thrown";
        fail(message != null ? message + ": " + base : base);
        return null;
    }

    static void assertAll(ThrowingRunnable... executables) {
        String firstMessage = null;
        int failureCount = 0;
        for (ThrowingRunnable executable : executables) {
            try {
                executable.run();
            } catch (Throwable t) {
                failureCount++;
                if (firstMessage == null) {
                    firstMessage = t.getMessage();
                }
            }
        }
        if (failureCount > 0) {
            fail("assertAll failed: " + failureCount + " failure(s). First failure: " + firstMessage);
        }
    }
}

class AdvisingSystemPhase2Test extends PlainAssertions {

    private ITimeSlot slot(int day, int startHour, int endHour) {
        return new TimeSlot(
                new DateTime(2026, 5, day, startHour, 0),
                new DateTime(2026, 5, day, endHour, 0));
    }

    private ILocation office(int id) {
        return new Location(id, "Office " + id, false, false, 1, null);
    }

    private ILocation sharedLocation(int id, int capacity) {
        return new Location(id, "Room " + id, true, false, capacity, new Schedule());
    }

    private ILocation privateLocation(int id) {
        return new Location(id, "Private " + id, false, false, 1, null);
    }

    private ILocation onlineLocation(int id) {
        return new Location(id, "Online " + id, true, true, -1, new Schedule());
    }

    private IAdvisor advisor(int id) {
        return advisor(id, 1000 + id);
    }

    private IAdvisor advisor(int id, int officeId) {
        return new Advisor(id, "Advisor " + id, "a" + id + "@ksu.edu.sa", new Schedule(), office(officeId));
    }

    private IStudent student(int id) {
        return student(id, "CS");
    }

    private IStudent student(int id, String major) {
        return new Student(id, "Student " + id, "s" + id + "@ksu.edu.sa", new Schedule(), major);
    }

    private IAdvisingSystemPhase2 preparedSystemWithAdvisorAndStudent() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addAdvisor(advisor(1));
        system.addStudent(student(1));
        return system;
    }

    private IAdvisingSystemPhase2 preparedSystemWithTwoAdvisorsTwoStudents() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addAdvisor(advisor(1));
        system.addAdvisor(advisor(2));
        system.addStudent(student(1));
        system.addStudent(student(2));
        return system;
    }

    private IAdvisingSystemPhase2 preparedSystemWithAdvisorAndTwoStudents() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addAdvisor(advisor(1));
        system.addStudent(student(1));
        system.addStudent(student(2));
        return system;
    }

    private IAdvisingSystemPhase2 preparedSystemWithTwoAdvisorsAndStudent() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addAdvisor(advisor(1));
        system.addAdvisor(advisor(2));
        system.addStudent(student(1));
        return system;
    }

    private IAdvisingSystemPhase2 preparedSystemForWorkshop() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addAdvisor(advisor(1));
        system.addAdvisor(advisor(2));
        system.addStudent(student(1));
        system.addStudent(student(2));
        system.addLocation(sharedLocation(100, 10));
        return system;
    }

    private IAdvisingSystemPhase2 preparedSystemForWorkshopWithoutLocation() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addAdvisor(advisor(1));
        system.addAdvisor(advisor(2));
        system.addStudent(student(1));
        system.addStudent(student(2));
        return system;
    }

    private IMeeting findMeeting(IAdvisingSystemPhase2 system, int id) {
        if (system.getMeetings().empty()) {
            return null;
        }
        List<IMeeting> l = system.getMeetings().getKeys();
        l.findFirst();
        while (true) {
            IMeeting e = l.retrieve();
            if (e.getId() == id) {
                return e;
            }
            if (!l.last()) {
                l.findNext();
            } else {
                break;
            }
        }
        return null;
    }

    private IWorkshop findWorkshop(IAdvisingSystemPhase2 system, int id) {
        if (system.getWorkshops().empty()) {
            return null;
        }
        List<IWorkshop> l = system.getWorkshops().getKeys();
        l.findFirst();
        while (true) {
            IWorkshop e = l.retrieve();
            if (e.getId() == id) {
                return e;
            }
            if (!l.last()) {
                l.findNext();
            } else {
                break;
            }
        }
        return null;
    }

    private IEvent findEvent(IAdvisingSystemPhase2 system, int id) {
        if (system.getEvents().empty()) {
            return null;
        }
        List<IEvent> l = system.getEvents().getKeys();
        l.findFirst();
        while (true) {
            IEvent e = l.retrieve();
            if (e.getId() == id) {
                return e;
            }
            if (!l.last()) {
                l.findNext();
            } else {
                break;
            }
        }
        return null;
    }

    void constructorShouldStartWithNoAdvisors() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.getAdvisors().empty());
        assertEquals(0, system.getAdvisors().size());
    }

    void constructorShouldStartWithNoStudents() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.getStudents().empty());
        assertEquals(0, system.getStudents().size());
    }

    void constructorShouldStartWithNoLocations() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.getLocations().empty());
        assertEquals(0, system.getLocations().size());
    }

    void constructorShouldStartWithNoMeetings() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.getMeetings().empty());
        assertEquals(0, system.getMeetings().size());
    }

    void constructorShouldStartWithNoWorkshops() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.getWorkshops().empty());
        assertEquals(0, system.getWorkshops().size());
    }

    void constructorShouldStartWithNoEvents() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.getEvents().empty());
        assertEquals(0, system.getEvents().size());
    }

    void searchAdvisorOnEmptySystemShouldReturnNull() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertNull(system.searchAdvisorById(1));
    }

    void searchStudentOnEmptySystemShouldReturnNull() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertNull(system.searchStudentById(1));
    }

    void searchLocationOnEmptySystemShouldReturnNull() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertNull(system.searchLocationById(1));
    }

    void cancelMeetingOnEmptySystemShouldReturnFalse() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertFalse(system.cancelMeeting(1));
    }

    void cancelWorkshopOnEmptySystemShouldReturnFalse() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertFalse(system.cancelWorkshop(1));
    }

    void addAdvisorShouldReturnTrueForNewAdvisor() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.addAdvisor(advisor(1)));
    }

    void addAdvisorShouldMakeAdvisorSearchable() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        IAdvisor advisor = advisor(1);
        system.addAdvisor(advisor);
        assertSame(advisor, system.searchAdvisorById(1));
    }

    void addAdvisorShouldIncreaseAdvisorSetSize() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addAdvisor(advisor(1));
        assertEquals(1, system.getAdvisors().size());
    }

    void addAdvisorShouldRejectDuplicateId() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.addAdvisor(advisor(1)));
        assertFalse(system.addAdvisor(advisor(1, 99)));
    }

    void addAdvisorShouldKeepOriginalAdvisorOnDuplicate() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        IAdvisor first = advisor(1);
        IAdvisor second = advisor(1, 99);
        system.addAdvisor(first);
        system.addAdvisor(second);
        assertSame(first, system.searchAdvisorById(1));
    }

    void addAdvisorShouldReturnFalseForNull() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertFalse(system.addAdvisor(null));
    }

    void addAdvisorShouldAllowMultipleDistinctAdvisors() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.addAdvisor(advisor(1)));
        assertTrue(system.addAdvisor(advisor(2)));
        assertEquals(2, system.getAdvisors().size());
    }

    void addStudentShouldReturnTrueForNewStudent() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.addStudent(student(1)));
    }

    void addStudentShouldMakeStudentSearchable() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        IStudent student = student(1);
        system.addStudent(student);
        assertSame(student, system.searchStudentById(1));
    }

    void addStudentShouldIncreaseStudentSetSize() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addStudent(student(1));
        assertEquals(1, system.getStudents().size());
    }

    void addStudentShouldRejectDuplicateId() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.addStudent(student(1)));
        assertFalse(system.addStudent(student(1, "EE")));
    }

    void addStudentShouldKeepOriginalStudentOnDuplicate() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        IStudent first = student(1);
        IStudent second = student(1, "EE");
        system.addStudent(first);
        system.addStudent(second);
        assertSame(first, system.searchStudentById(1));
    }

    void addStudentShouldReturnFalseForNull() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertFalse(system.addStudent(null));
    }

    void addStudentShouldAllowMultipleDistinctStudents() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.addStudent(student(1)));
        assertTrue(system.addStudent(student(2)));
        assertEquals(2, system.getStudents().size());
    }

    void addLocationShouldReturnTrueForNewLocation() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.addLocation(sharedLocation(10, 5)));
    }

    void addLocationShouldMakeLocationSearchable() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        ILocation room = sharedLocation(10, 5);
        system.addLocation(room);
        assertSame(room, system.searchLocationById(10));
    }

    void addLocationShouldIncreaseLocationSetSize() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addLocation(sharedLocation(10, 5));
        assertEquals(1, system.getLocations().size());
    }

    void addLocationShouldRejectDuplicateId() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.addLocation(sharedLocation(10, 5)));
        assertFalse(system.addLocation(sharedLocation(10, 9)));
    }

    void addLocationShouldKeepOriginalLocationOnDuplicate() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        ILocation first = sharedLocation(10, 5);
        ILocation second = sharedLocation(10, 9);
        system.addLocation(first);
        system.addLocation(second);
        assertSame(first, system.searchLocationById(10));
    }

    void addLocationShouldReturnFalseForNull() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertFalse(system.addLocation(null));
    }

    void addLocationShouldAllowMultipleDistinctLocations() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertTrue(system.addLocation(sharedLocation(10, 5)));
        assertTrue(system.addLocation(sharedLocation(11, 7)));
        assertEquals(2, system.getLocations().size());
    }

    void scheduleMeetingShouldReturnPositiveIdOnSuccess() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        assertTrue(id > 0);
    }

    void scheduleMeetingShouldStoreMeetingInMeetingSet() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        assertNotNull(findMeeting(system, id));
        assertEquals(1, system.getMeetings().size());
    }

    void scheduleMeetingShouldStoreMeetingInEventSet() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        assertNotNull(findEvent(system, id));
        assertEquals(1, system.getEvents().size());
    }

    void scheduleMeetingShouldStoreAdvisorAndStudentIds() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        IMeeting meeting = findMeeting(system, id);
        assertEquals(1, meeting.getAdvisorId());
        assertEquals(1, meeting.getStudentId());
    }

    void scheduleMeetingShouldUseAdvisorOfficeAsLocation() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        IAdvisor advisor = system.searchAdvisorById(1);
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        assertSame(advisor.getOffice(), findMeeting(system, id).getLocation());
    }

    void scheduleMeetingShouldAddEventToAdvisorSchedule() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        assertTrue(system.searchAdvisorById(1).getSchedule().contains(id));
    }

    void scheduleMeetingShouldAddEventToStudentSchedule() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        assertTrue(system.searchStudentById(1).getSchedule().contains(id));
    }

    void scheduleMeetingShouldAllowNonConflictingMeetings() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndTwoStudents();
        int first = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        int second = system.scheduleMeeting(slot(1, 10, 11), 1, 2);
        assertNotEquals(first, second);
        assertEquals(2, system.getMeetings().size());
    }

    void scheduleMeetingShouldGenerateIncreasingIds() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithTwoAdvisorsTwoStudents();
        int first = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        int second = system.scheduleMeeting(slot(1, 10, 11), 2, 2);
        assertTrue(second > first);
    }

    void scheduleMeetingShouldThrowWhenAdvisorMissing() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addStudent(student(1));
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.scheduleMeeting(slot(1, 9, 10), 9, 1));
        assertEquals(ScheduleFailureReason.ADVISOR_NOT_FOUND, ex.getReason());
    }

    void scheduleMeetingShouldThrowWhenStudentMissing() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addAdvisor(advisor(1));
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.scheduleMeeting(slot(1, 9, 10), 1, 9));
        assertEquals(ScheduleFailureReason.STUDENT_NOT_FOUND, ex.getReason());
    }

    void scheduleMeetingShouldThrowOnAdvisorConflict() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndTwoStudents();
        system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.scheduleMeeting(slot(1, 9, 10), 1, 2));
        assertEquals(ScheduleFailureReason.CONFLICT_ADVISOR, ex.getReason());
    }

    void scheduleMeetingShouldThrowOnStudentConflict() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithTwoAdvisorsAndStudent();
        system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.scheduleMeeting(slot(1, 9, 10), 2, 1));
        assertEquals(ScheduleFailureReason.CONFLICT_STUDENT, ex.getReason());
    }

    void scheduleMeetingShouldAllowBackToBackMeetings() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndTwoStudents();
        int first = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        int second = system.scheduleMeeting(slot(1, 10, 11), 1, 2);
        assertTrue(system.searchAdvisorById(1).getSchedule().contains(first));
        assertTrue(system.searchAdvisorById(1).getSchedule().contains(second));
    }

    void cancelMeetingShouldReturnTrueForExistingMeeting() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        assertTrue(system.cancelMeeting(id));
    }

    void cancelMeetingShouldRemoveMeetingFromMeetingSet() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        system.cancelMeeting(id);
        assertNull(findMeeting(system, id));
        assertEquals(0, system.getMeetings().size());
    }

    void cancelMeetingShouldRemoveMeetingFromEventSet() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        system.cancelMeeting(id);
        assertNull(findEvent(system, id));
        assertEquals(0, system.getEvents().size());
    }

    void cancelMeetingShouldRemoveMeetingFromAdvisorSchedule() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        system.cancelMeeting(id);
        assertFalse(system.searchAdvisorById(1).getSchedule().contains(id));
    }

    void cancelMeetingShouldRemoveMeetingFromStudentSchedule() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        system.cancelMeeting(id);
        assertFalse(system.searchStudentById(1).getSchedule().contains(id));
    }

    void cancelMeetingShouldReturnFalseWhenCalledTwice() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        assertTrue(system.cancelMeeting(id));
        assertFalse(system.cancelMeeting(id));
    }

    void cancelMeetingShouldKeepOtherMeetings() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithTwoAdvisorsTwoStudents();
        int first = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        int second = system.scheduleMeeting(slot(1, 10, 11), 2, 2);
        system.cancelMeeting(first);
        assertNull(findMeeting(system, first));
        assertNotNull(findMeeting(system, second));
    }

    void cancelMeetingShouldFreeTimeSlotForLaterMeeting() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int first = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        system.cancelMeeting(first);
        int second = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        assertNotEquals(first, second);
    }

    void scheduleWorkshopShouldReturnPositiveIdOnSuccess() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        assertTrue(id > 0);
    }

    void scheduleWorkshopShouldStoreWorkshopInWorkshopSet() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        assertNotNull(findWorkshop(system, id));
        assertEquals(1, system.getWorkshops().size());
    }

    void scheduleWorkshopShouldStoreWorkshopInEventSet() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        assertNotNull(findEvent(system, id));
        assertEquals(1, system.getEvents().size());
    }

    void scheduleWorkshopShouldStoreTitle() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("Deep Learning", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        assertEquals("Deep Learning", findWorkshop(system, id).getTitle());
    }

    void scheduleWorkshopShouldCopyAdvisorIds() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1, 2}, new int[]{1});
        IWorkshop workshop = findWorkshop(system, id);
        assertTrue(workshop.getAdvisorIds().contains(1));
        assertTrue(workshop.getAdvisorIds().contains(2));
        assertEquals(2, workshop.getAdvisorIds().size());
    }

    void scheduleWorkshopShouldCopyStudentIds() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        IWorkshop workshop = findWorkshop(system, id);
        assertTrue(workshop.getStudentIds().contains(1));
        assertTrue(workshop.getStudentIds().contains(2));
        assertEquals(2, workshop.getStudentIds().size());
    }

    void scheduleWorkshopShouldStoreUnionOfParticipants() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1, 2}, new int[]{1, 2});
        IWorkshop workshop = findWorkshop(system, id);
        assertEquals(2, workshop.getParticipantIds().size());
        assertTrue(workshop.getParticipantIds().contains(1));
        assertTrue(workshop.getParticipantIds().contains(2));
    }

    void scheduleWorkshopShouldAddEventToAdvisorSchedules() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1, 2}, new int[]{1});
        assertTrue(system.searchAdvisorById(1).getSchedule().contains(id));
        assertTrue(system.searchAdvisorById(2).getSchedule().contains(id));
    }

    void scheduleWorkshopShouldAddEventToStudentSchedules() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        assertTrue(system.searchStudentById(1).getSchedule().contains(id));
        assertTrue(system.searchStudentById(2).getSchedule().contains(id));
    }

    void scheduleWorkshopShouldAddEventToLocationSchedule() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        assertTrue(system.searchLocationById(100).getSchedule().contains(id));
    }

    void scheduleWorkshopShouldThrowWhenLocationMissing() {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshopWithoutLocation();
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1}));
        assertEquals(ScheduleFailureReason.LOCATION_NOT_FOUND, ex.getReason());
    }

    void scheduleWorkshopShouldThrowWhenLocationNotReservable() {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        system.addLocation(privateLocation(101));
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.scheduleWorkshop("W", slot(1, 9, 10), 101, new int[]{1}, new int[]{1}));
        assertEquals(ScheduleFailureReason.LOCATION_NOT_RESERVABLE, ex.getReason());
    }

    void scheduleWorkshopShouldThrowWhenAdvisorMissing() {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{9}, new int[]{1}));
        assertEquals(ScheduleFailureReason.ADVISOR_NOT_FOUND, ex.getReason());
    }

    void scheduleWorkshopShouldThrowWhenStudentMissing() {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{9}));
        assertEquals(ScheduleFailureReason.STUDENT_NOT_FOUND, ex.getReason());
    }

    void scheduleWorkshopShouldThrowOnAdvisorConflict() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{2}));
        assertEquals(ScheduleFailureReason.CONFLICT_ADVISOR, ex.getReason());
    }

    void scheduleWorkshopShouldThrowOnStudentConflict() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        system.scheduleMeeting(slot(1, 9, 10), 2, 1);
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1}));
        assertEquals(ScheduleFailureReason.CONFLICT_STUDENT, ex.getReason());
    }

    void scheduleWorkshopShouldThrowOnLocationConflict() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        system.scheduleWorkshop("A", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.scheduleWorkshop("B", slot(1, 9, 10), 100, new int[]{2}, new int[]{2}));
        assertEquals(ScheduleFailureReason.CONFLICT_LOCATION, ex.getReason());
    }

    void scheduleWorkshopShouldThrowWhenCapacityExceeded() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addAdvisor(advisor(1));
        system.addAdvisor(advisor(2));
        system.addStudent(student(1));
        system.addStudent(student(2));
        system.addLocation(sharedLocation(100, 3));
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1, 2}, new int[]{1, 2}));
        assertEquals(ScheduleFailureReason.CAPACITY_EXCEEDED, ex.getReason());
    }

    void scheduleWorkshopShouldAllowParticipantCountEqualToCapacity() throws SchedulingException {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addAdvisor(advisor(1));
        system.addAdvisor(advisor(2));
        system.addStudent(student(1));
        system.addLocation(sharedLocation(100, 3));
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1, 2}, new int[]{1});
        assertTrue(system.searchLocationById(100).getSchedule().contains(id));
    }

    void scheduleWorkshopShouldIgnoreDuplicateAdvisorIdsInArray() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1, 1, 2}, new int[]{1});
        assertEquals(2, findWorkshop(system, id).getAdvisorIds().size());
    }

    void scheduleWorkshopShouldIgnoreDuplicateStudentIdsInArray() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 1, 2});
        assertEquals(2, findWorkshop(system, id).getStudentIds().size());
    }

    void scheduleWorkshopShouldAllowUnlimitedCapacityLocation() throws SchedulingException {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        for (int i = 1; i <= 4; i++) {
            system.addAdvisor(advisor(i));
            system.addStudent(student(i));
        }
        system.addLocation(onlineLocation(100));
        int id = system.scheduleWorkshop("Online", slot(1, 9, 10), 100,
                new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
        assertNotNull(findWorkshop(system, id));
    }

    void scheduleWorkshopShouldAllowNonOverlappingWorkshopsAtSameLocation() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int first = system.scheduleWorkshop("A", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        int second = system.scheduleWorkshop("B", slot(1, 10, 11), 100, new int[]{2}, new int[]{2});
        assertTrue(system.searchLocationById(100).getSchedule().contains(first));
        assertTrue(system.searchLocationById(100).getSchedule().contains(second));
    }

    void cancelWorkshopShouldReturnTrueForExistingWorkshop() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        assertTrue(system.cancelWorkshop(id));
    }

    void cancelWorkshopShouldRemoveWorkshopFromWorkshopSet() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        system.cancelWorkshop(id);
        assertNull(findWorkshop(system, id));
        assertEquals(0, system.getWorkshops().size());
    }

    void cancelWorkshopShouldRemoveWorkshopFromEventSet() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        system.cancelWorkshop(id);
        assertNull(findEvent(system, id));
        assertEquals(0, system.getEvents().size());
    }

    void cancelWorkshopShouldRemoveWorkshopFromAdvisorSchedules() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1, 2}, new int[]{1});
        system.cancelWorkshop(id);
        assertFalse(system.searchAdvisorById(1).getSchedule().contains(id));
        assertFalse(system.searchAdvisorById(2).getSchedule().contains(id));
    }

    void cancelWorkshopShouldRemoveWorkshopFromStudentSchedules() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        system.cancelWorkshop(id);
        assertFalse(system.searchStudentById(1).getSchedule().contains(id));
        assertFalse(system.searchStudentById(2).getSchedule().contains(id));
    }

    void cancelWorkshopShouldRemoveWorkshopFromLocationSchedule() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        system.cancelWorkshop(id);
        assertFalse(system.searchLocationById(100).getSchedule().contains(id));
    }

    void cancelWorkshopShouldReturnFalseWhenCalledTwice() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        assertTrue(system.cancelWorkshop(id));
        assertFalse(system.cancelWorkshop(id));
    }

    void cancelWorkshopShouldFreeSlotForRescheduling() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int first = system.scheduleWorkshop("W1", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        system.cancelWorkshop(first);
        int second = system.scheduleWorkshop("W2", slot(1, 9, 10), 100, new int[]{2}, new int[]{2});
        assertNotEquals(first, second);
    }

    void addStudentToWorkshopShouldAddStudentId() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        system.addStudentToWorkshop(id, 2);
        assertTrue(findWorkshop(system, id).getStudentIds().contains(2));
    }

    void addStudentToWorkshopShouldAddParticipantId() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        system.addStudentToWorkshop(id, 2);
        assertTrue(findWorkshop(system, id).getParticipantIds().contains(2));
    }

    void addStudentToWorkshopShouldAddWorkshopToStudentSchedule() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        system.addStudentToWorkshop(id, 2);
        assertTrue(system.searchStudentById(2).getSchedule().contains(id));
    }

    void addStudentToWorkshopShouldThrowWhenWorkshopMissing() {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.addStudentToWorkshop(999, 1));
        assertEquals(ScheduleFailureReason.EVENT_NOT_FOUND, ex.getReason());
    }

    void addStudentToWorkshopShouldThrowWhenStudentMissing() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.addStudentToWorkshop(id, 999));
        assertEquals(ScheduleFailureReason.STUDENT_NOT_FOUND, ex.getReason());
    }

    void addStudentToWorkshopShouldThrowOnStudentConflict() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        system.scheduleMeeting(slot(1, 9, 10), 2, 2);
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.addStudentToWorkshop(id, 2));
        assertEquals(ScheduleFailureReason.CONFLICT_STUDENT, ex.getReason());
    }

    void addStudentToWorkshopShouldThrowWhenCapacityExceeded() throws SchedulingException {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addAdvisor(advisor(1));
        system.addStudent(student(2));
        system.addStudent(student(3));
        system.addLocation(sharedLocation(100, 2));
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{2});
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.addStudentToWorkshop(id, 3));
        assertEquals(ScheduleFailureReason.CAPACITY_EXCEEDED, ex.getReason());
    }

    void addStudentToWorkshopShouldNotDuplicateExistingStudent() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        int before = findWorkshop(system, id).getStudentIds().size();
        system.addStudentToWorkshop(id, 1);
        assertEquals(before, findWorkshop(system, id).getStudentIds().size());
    }

    void removeStudentFromWorkshopShouldRemoveStudentId() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        system.removeStudentFromWorkshop(id, 2);
        assertFalse(findWorkshop(system, id).getStudentIds().contains(2));
    }

    void removeStudentFromWorkshopShouldRemoveParticipantId() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        system.removeStudentFromWorkshop(id, 2);
        assertFalse(findWorkshop(system, id).getParticipantIds().contains(2));
    }

    void removeStudentFromWorkshopShouldRemoveWorkshopFromStudentSchedule() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        system.removeStudentFromWorkshop(id, 2);
        assertFalse(system.searchStudentById(2).getSchedule().contains(id));
    }

    void removeStudentFromWorkshopShouldThrowWhenWorkshopMissing() {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.removeStudentFromWorkshop(999, 1));
        assertEquals(ScheduleFailureReason.EVENT_NOT_FOUND, ex.getReason());
    }

    void removeStudentFromWorkshopShouldThrowWhenStudentMissing() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.removeStudentFromWorkshop(id, 999));
        assertEquals(ScheduleFailureReason.STUDENT_NOT_FOUND, ex.getReason());
    }

    void removeStudentFromWorkshopShouldThrowWhenStudentNotInWorkshop() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.removeStudentFromWorkshop(id, 2));
        assertEquals(ScheduleFailureReason.STUDENT_NOT_FOUND, ex.getReason());
    }

    void removeStudentFromWorkshopShouldDeleteWorkshopWhenLastParticipantRemoved() throws SchedulingException {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addStudent(student(1));
        system.addLocation(sharedLocation(100, 5));
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{}, new int[]{1});
        system.removeStudentFromWorkshop(id, 1);
        assertNull(findWorkshop(system, id));
        assertFalse(system.searchLocationById(100).getSchedule().contains(id));
    }

    void removeStudentFromWorkshopShouldKeepWorkshopWhenParticipantsRemain() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        system.removeStudentFromWorkshop(id, 2);
        assertNotNull(findWorkshop(system, id));
    }

    void addAdvisorToWorkshopShouldAddAdvisorId() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        system.addAdvisorToWorkshop(id, 2);
        assertTrue(findWorkshop(system, id).getAdvisorIds().contains(2));
    }

    void addAdvisorToWorkshopShouldAddParticipantId() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        system.addAdvisorToWorkshop(id, 2);
        assertTrue(findWorkshop(system, id).getParticipantIds().contains(2));
    }

    void addAdvisorToWorkshopShouldAddWorkshopToAdvisorSchedule() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        system.addAdvisorToWorkshop(id, 2);
        assertTrue(system.searchAdvisorById(2).getSchedule().contains(id));
    }

    void addAdvisorToWorkshopShouldThrowWhenWorkshopMissing() {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.addAdvisorToWorkshop(999, 1));
        assertEquals(ScheduleFailureReason.EVENT_NOT_FOUND, ex.getReason());
    }

    void addAdvisorToWorkshopShouldThrowWhenAdvisorMissing() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.addAdvisorToWorkshop(id, 999));
        assertEquals(ScheduleFailureReason.ADVISOR_NOT_FOUND, ex.getReason());
    }

    void addAdvisorToWorkshopShouldThrowOnAdvisorConflict() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        system.scheduleMeeting(slot(1, 9, 10), 2, 2);
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.addAdvisorToWorkshop(id, 2));
        assertEquals(ScheduleFailureReason.CONFLICT_ADVISOR, ex.getReason());
    }

    void addAdvisorToWorkshopShouldThrowWhenCapacityExceeded() throws SchedulingException {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addAdvisor(advisor(1));
        system.addAdvisor(advisor(2));
        system.addStudent(student(3));
        system.addLocation(sharedLocation(100, 2));
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{3});
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.addAdvisorToWorkshop(id, 2));
        assertEquals(ScheduleFailureReason.CAPACITY_EXCEEDED, ex.getReason());
    }

    void addAdvisorToWorkshopShouldNotDuplicateExistingAdvisor() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        int before = findWorkshop(system, id).getAdvisorIds().size();
        system.addAdvisorToWorkshop(id, 1);
        assertEquals(before, findWorkshop(system, id).getAdvisorIds().size());
    }

    void removeAdvisorFromWorkshopShouldRemoveAdvisorId() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1, 2}, new int[]{1});
        system.removeAdvisorFromWorkshop(id, 2);
        assertFalse(findWorkshop(system, id).getAdvisorIds().contains(2));
    }

    void removeAdvisorFromWorkshopShouldRemoveParticipantId() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1, 2}, new int[]{1});
        system.removeAdvisorFromWorkshop(id, 2);
        assertFalse(findWorkshop(system, id).getParticipantIds().contains(2));
    }

    void removeAdvisorFromWorkshopShouldRemoveWorkshopFromAdvisorSchedule() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1, 2}, new int[]{1});
        system.removeAdvisorFromWorkshop(id, 2);
        assertFalse(system.searchAdvisorById(2).getSchedule().contains(id));
    }

    void removeAdvisorFromWorkshopShouldThrowWhenWorkshopMissing() {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.removeAdvisorFromWorkshop(999, 1));
        assertEquals(ScheduleFailureReason.EVENT_NOT_FOUND, ex.getReason());
    }

    void removeAdvisorFromWorkshopShouldThrowWhenAdvisorMissing() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.removeAdvisorFromWorkshop(id, 999));
        assertEquals(ScheduleFailureReason.ADVISOR_NOT_FOUND, ex.getReason());
    }

    void removeAdvisorFromWorkshopShouldThrowWhenAdvisorNotInWorkshop() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1});
        SchedulingException ex = assertThrows(SchedulingException.class,
                () -> system.removeAdvisorFromWorkshop(id, 2));
        assertEquals(ScheduleFailureReason.ADVISOR_NOT_FOUND, ex.getReason());
    }

    void removeAdvisorFromWorkshopShouldDeleteWorkshopWhenLastParticipantRemoved() throws SchedulingException {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addAdvisor(advisor(1));
        system.addLocation(sharedLocation(100, 5));
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{});
        system.removeAdvisorFromWorkshop(id, 1);
        assertNull(findWorkshop(system, id));
        assertFalse(system.searchLocationById(100).getSchedule().contains(id));
    }

    void removeAdvisorFromWorkshopShouldKeepWorkshopWhenParticipantsRemain() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1, 2}, new int[]{1});
        system.removeAdvisorFromWorkshop(id, 2);
        assertNotNull(findWorkshop(system, id));
    }

    void deleteStudentShouldReturnFalseWhenStudentMissing() {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        assertFalse(system.deleteStudent(1));
    }

    void deleteStudentShouldReturnTrueWhenStudentExists() {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        assertTrue(system.deleteStudent(1));
    }

    void deleteStudentShouldRemoveStudentFromRegistry() {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        system.deleteStudent(1);
        assertNull(system.searchStudentById(1));
        assertEquals(0, system.getStudents().size());
    }

    void deleteStudentShouldCancelMeetingsOfThatStudent() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        system.deleteStudent(1);
        assertNull(findMeeting(system, id));
    }

    void deleteStudentShouldRemoveDeletedStudentsMeetingFromAdvisorSchedule() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemWithAdvisorAndStudent();
        int id = system.scheduleMeeting(slot(1, 9, 10), 1, 1);
        system.deleteStudent(1);
        assertFalse(system.searchAdvisorById(1).getSchedule().contains(id));
    }

    void deleteStudentShouldRemoveStudentFromWorkshopStudentSet() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        system.deleteStudent(2);
        assertFalse(findWorkshop(system, id).getStudentIds().contains(2));
    }

    void deleteStudentShouldKeepWorkshopWhenOtherParticipantsRemain() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        system.deleteStudent(2);
        assertNotNull(findWorkshop(system, id));
    }

    void deleteStudentShouldDeleteWorkshopWhenItBecomesEmpty() throws SchedulingException {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addStudent(student(1));
        system.addLocation(sharedLocation(100, 5));
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{}, new int[]{1});
        system.deleteStudent(1);
        assertNull(findWorkshop(system, id));
    }

    void deleteStudentShouldClearLocationScheduleWhenWorkshopIsDeleted() throws SchedulingException {
        IAdvisingSystemPhase2 system = new AdvisingSystemPhase2();
        system.addStudent(student(1));
        system.addLocation(sharedLocation(100, 5));
        int id = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{}, new int[]{1});
        system.deleteStudent(1);
        assertFalse(system.searchLocationById(100).getSchedule().contains(id));
    }

    void deleteStudentShouldNotAffectOtherStudents() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        system.deleteStudent(1);
        assertNotNull(system.searchStudentById(2));
    }

    void deleteStudentShouldUpdateMeetingAndWorkshopTogether() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        int meetingId = system.scheduleMeeting(slot(1, 11, 12), 2, 1);
        int workshopId = system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        system.deleteStudent(1);
        assertNull(findMeeting(system, meetingId));
        assertFalse(findWorkshop(system, workshopId).getStudentIds().contains(1));
    }

    void deleteStudentShouldNotDeleteUnrelatedMeetings() throws SchedulingException {
        IAdvisingSystemPhase2 system = preparedSystemForWorkshop();
        system.addAdvisor(advisor(3));
        system.addStudent(student(3));
        int unrelatedMeeting = system.scheduleMeeting(slot(1, 11, 12), 3, 3);
        system.scheduleWorkshop("W", slot(1, 9, 10), 100, new int[]{1}, new int[]{1, 2});
        system.deleteStudent(1);
        assertNotNull(findMeeting(system, unrelatedMeeting));
    }
}

class AdvisorTest extends PlainAssertions {

    private ISchedule schedule;
    private ILocation office;
    private Advisor advisor;

    void setUp() {
        schedule = new Schedule();
        office = new Location(1, "Office 21", false, false, 30, new Schedule());
        advisor = new Advisor(1, "Dr. Smith", "smith@example.com", schedule, office);
    }

    void getOffice() {
        assertSame(office, advisor.getOffice());
    }
}

class BSTMapTest extends PlainAssertions {

    private Map<Integer, String> map;

    void setUp() {
        map = new BSTMap<>();
    }

    // -------------------------------------------------------------------------
    // empty() and size()
    // -------------------------------------------------------------------------

    void emptyOnNewMap() {
        assertTrue(map.empty());
    }

    void sizeOnNewMap() {
        assertEquals(0, map.size());
    }

    void notEmptyAfterInsert() {
        map.insert(1, "a");
        assertFalse(map.empty());
    }

    void sizeAfterSingleInsert() {
        map.insert(1, "a");
        assertEquals(1, map.size());
    }

    void sizeAfterMultipleInserts() {
        map.insert(1, "a");
        map.insert(2, "b");
        map.insert(3, "c");
        assertEquals(3, map.size());
    }

    // -------------------------------------------------------------------------
    // clear()
    // -------------------------------------------------------------------------

    void clearEmptyMap() {
        map.clear();
        assertTrue(map.empty());
        assertEquals(0, map.size());
    }

    void clearNonEmptyMap() {
        map.insert(1, "a");
        map.insert(2, "b");
        map.clear();
        assertTrue(map.empty());
        assertEquals(0, map.size());
    }

    void insertAfterClear() {
        map.insert(1, "a");
        map.clear();
        assertTrue(map.insert(1, "b"));
        assertEquals("b", map.get(1));
    }

    // -------------------------------------------------------------------------
    // insert()
    // -------------------------------------------------------------------------

    void insertReturnsTrueForNewKey() {
        assertTrue(map.insert(10, "x"));
    }

    void insertReturnsFalseForDuplicateKey() {
        map.insert(10, "x");
        assertFalse(map.insert(10, "y"));
    }

    void insertDuplicateDoesNotChangeValue() {
        map.insert(10, "x");
        map.insert(10, "y");
        assertEquals("x", map.get(10));
    }

    void insertDuplicateDoesNotChangeSize() {
        map.insert(10, "x");
        map.insert(10, "y");
        assertEquals(1, map.size());
    }

    void insertLeftAndRightChildren() {
        map.insert(10, "root");
        map.insert(5, "left");
        map.insert(15, "right");
        assertEquals("left", map.get(5));
        assertEquals("right", map.get(15));
        assertEquals(3, map.size());
    }

    // -------------------------------------------------------------------------
    // get()
    // -------------------------------------------------------------------------

    void getReturnsNullForMissingKey() {
        assertNull(map.get(99));
    }

    void getReturnsNullOnEmptyMap() {
        assertNull(map.get(1));
    }

    void getReturnsCorrectValue() {
        map.insert(7, "seven");
        assertEquals("seven", map.get(7));
    }

    void getDistinguishesMultipleKeys() {
        map.insert(1, "one");
        map.insert(2, "two");
        map.insert(3, "three");
        assertEquals("one", map.get(1));
        assertEquals("two", map.get(2));
        assertEquals("three", map.get(3));
    }

    void getOnRootKey() {
        map.insert(50, "root");
        map.insert(25, "left");
        map.insert(75, "right");
        assertEquals("root", map.get(50));
    }

    // -------------------------------------------------------------------------
    // update()
    // -------------------------------------------------------------------------

    void updateReturnsFalseForMissingKey() {
        assertFalse(map.update(99, "x"));
    }

    void updateReturnsTrueForExistingKey() {
        map.insert(1, "old");
        assertTrue(map.update(1, "new"));
    }

    void updateChangesValue() {
        map.insert(1, "old");
        map.update(1, "new");
        assertEquals("new", map.get(1));
    }

    void updateDoesNotChangeSize() {
        map.insert(1, "old");
        map.update(1, "new");
        assertEquals(1, map.size());
    }

    void updateOnlyAffectsTargetKey() {
        map.insert(1, "one");
        map.insert(2, "two");
        map.update(1, "ONE");
        assertEquals("ONE", map.get(1));
        assertEquals("two", map.get(2));
    }

    // -------------------------------------------------------------------------
    // remove()
    // -------------------------------------------------------------------------

    void removeReturnsFalseForMissingKey() {
        assertFalse(map.remove(99));
    }

    void removeReturnsFalseOnEmptyMap() {
        assertFalse(map.remove(1));
    }

    void removeReturnsTrueForExistingKey() {
        map.insert(1, "a");
        assertTrue(map.remove(1));
    }

    void removeDecreasesSize() {
        map.insert(1, "a");
        map.insert(2, "b");
        map.remove(1);
        assertEquals(1, map.size());
    }

    void removeLeafNode() {
        map.insert(10, "root");
        map.insert(5, "leaf");
        map.remove(5);
        assertNull(map.get(5));
        assertEquals("root", map.get(10));
        assertEquals(1, map.size());
    }

    void removeNodeWithOneChild() {
        map.insert(10, "root");
        map.insert(5, "left");
        map.insert(3, "left-left");
        map.remove(5);
        assertNull(map.get(5));
        assertEquals("left-left", map.get(3));
        assertEquals(2, map.size());
    }

    void removeNodeWithTwoChildren() {
        map.insert(10, "root");
        map.insert(5, "left");
        map.insert(3, "left-left");
        map.insert(7, "left-right");
        map.remove(5);
        assertNull(map.get(5));
        assertEquals("left-left", map.get(3));
        assertEquals("left-right", map.get(7));
        assertEquals(3, map.size());
    }

    void removeRootSingleNode() {
        map.insert(10, "only");
        map.remove(10);
        assertTrue(map.empty());
        assertNull(map.get(10));
    }

    void removeRootWithChildren() {
        map.insert(10, "root");
        map.insert(5, "left");
        map.insert(15, "right");
        map.remove(10);
        assertNull(map.get(10));
        assertEquals("left", map.get(5));
        assertEquals("right", map.get(15));
        assertEquals(2, map.size());
    }

    void removeSameKeyTwice() {
        map.insert(1, "a");
        assertTrue(map.remove(1));
        assertFalse(map.remove(1));
    }

    // -------------------------------------------------------------------------
    // nbKeyComp()
    // -------------------------------------------------------------------------

    void nbKeyCompOnEmptyMapReturnsZero() {
        assertEquals(0, map.nbKeyComp(5));
    }

    void nbKeyCompForRootIsOne() {
        map.insert(10, "root");
        assertEquals(1, map.nbKeyComp(10));
    }

    void nbKeyCompForMissingKeyCountsVisitedNodes() {
        map.insert(10, "root");
        map.insert(5, "left");
        // searching for 3: visits root (10) then left child (5) → 2 comparisons
        assertEquals(2, map.nbKeyComp(3));
    }

    void nbKeyCompIncreasesWithDepth() {
        map.insert(10, "root");
        map.insert(5, "left");
        map.insert(3, "left-left");
        assertTrue(map.nbKeyComp(3) > map.nbKeyComp(5));
    }

    // -------------------------------------------------------------------------
    // getKeys()
    // -------------------------------------------------------------------------

    void getKeysOnEmptyMap() {
        List<Integer> keys = map.getKeys();
        assertTrue(keys.empty());
    }

    void getKeysSingleElement() {
        map.insert(5, "a");
        assertListEquals(map.getKeys(), 5);
    }

    void getKeysReturnsSortedOrder() {
        map.insert(30, "c");
        map.insert(10, "a");
        map.insert(20, "b");
        assertListEquals(map.getKeys(), 10, 20, 30);
    }

    void getKeysAfterRemove() {
        map.insert(10, "a");
        map.insert(20, "b");
        map.insert(30, "c");
        map.remove(20);
        assertListEquals(map.getKeys(), 10, 30);
    }

    void getKeysAfterClear() {
        map.insert(1, "a");
        map.insert(2, "b");
        map.clear();
        assertTrue(map.getKeys().empty());
    }

    // -------------------------------------------------------------------------
    // Helper
    // -------------------------------------------------------------------------

    @SafeVarargs
    private static <T> void assertListEquals(List<T> actual, T... expected) {
        if (expected.length == 0) {
            assertTrue(actual.empty(), "Expected empty list");
            return;
        }

        assertFalse(actual.empty(), "List is empty but expected " + expected.length + " elements");

        actual.findFirst();
        int i = 0;
        while (true) {
            assertEquals(expected[i], actual.retrieve(), "Mismatch at index " + i);
            if (actual.last()) break;
            actual.findNext();
            i++;
        }

        assertEquals(expected.length - 1, i, "List has fewer elements than expected");
    }
}

class BSTSetTest extends PlainAssertions {

    private BSTSet<Integer> set;

    void setUp() {
        set = new BSTSet<>();
    }

    void size_emptySet_returnsZero() {
        assertEquals(0, set.size());
    }

    void empty_emptySet_returnsTrue() {
        assertTrue(set.empty());
    }

    void empty_nonEmptySet_returnsFalse() {
        set.insert(10);
        assertFalse(set.empty());
    }

    void clear_emptySet_keepsItEmpty() {
        set.clear();

        assertTrue(set.empty());
        assertEquals(0, set.size());
    }

    void clear_nonEmptySet_removesAllElements() {
        set.insert(10);
        set.insert(5);
        set.insert(20);

        set.clear();

        assertTrue(set.empty());
        assertEquals(0, set.size());
        assertFalse(set.contains(10));
        assertFalse(set.contains(5));
        assertFalse(set.contains(20));
        assertListEquals(set.getKeys());
    }

    void insert_singleKey_succeeds() {
        assertTrue(set.insert(10));
        assertEquals(1, set.size());
        assertTrue(set.contains(10));
    }

    void insert_multipleDistinctKeys_allSucceed() {
        assertTrue(set.insert(10));
        assertTrue(set.insert(5));
        assertTrue(set.insert(20));
        assertTrue(set.insert(15));
        assertTrue(set.insert(25));

        assertEquals(5, set.size());
        assertTrue(set.contains(10));
        assertTrue(set.contains(5));
        assertTrue(set.contains(20));
        assertTrue(set.contains(15));
        assertTrue(set.contains(25));
    }

    void insert_duplicateKey_failsAndSizeUnchanged() {
        assertTrue(set.insert(10));
        assertFalse(set.insert(10));

        assertEquals(1, set.size());
        assertTrue(set.contains(10));
    }

    void contains_missingKeyInEmptySet_returnsFalse() {
        assertFalse(set.contains(10));
    }

    void contains_missingKeyInNonEmptySet_returnsFalse() {
        set.insert(10);
        set.insert(5);
        set.insert(20);

        assertFalse(set.contains(7));
        assertFalse(set.contains(17));
        assertFalse(set.contains(100));
    }

    void contains_existingKeys_returnsTrue() {
        set.insert(10);
        set.insert(5);
        set.insert(20);

        assertTrue(set.contains(10));
        assertTrue(set.contains(5));
        assertTrue(set.contains(20));
    }

    void remove_fromEmptySet_returnsFalse() {
        assertFalse(set.remove(10));
        assertEquals(0, set.size());
    }

    void remove_missingKey_returnsFalse() {
        set.insert(10);
        set.insert(5);
        set.insert(20);

        assertFalse(set.remove(7));
        assertEquals(3, set.size());
    }

    void remove_leafNode_succeeds() {
        set.insert(10);
        set.insert(5);
        set.insert(20);

        assertTrue(set.remove(5));
        assertEquals(2, set.size());
        assertFalse(set.contains(5));
        assertTrue(set.contains(10));
        assertTrue(set.contains(20));
        assertListEquals(set.getKeys(), 10, 20);
    }

    void remove_rootWhenSingleNode_succeeds() {
        set.insert(10);

        assertTrue(set.remove(10));
        assertTrue(set.empty());
        assertEquals(0, set.size());
        assertFalse(set.contains(10));
        assertListEquals(set.getKeys());
    }

    void remove_nodeWithOneLeftChild_succeeds() {
        set.insert(10);
        set.insert(5);
        set.insert(2);

        assertTrue(set.remove(5));
        assertEquals(2, set.size());
        assertFalse(set.contains(5));
        assertTrue(set.contains(10));
        assertTrue(set.contains(2));
        assertListEquals(set.getKeys(), 2, 10);
    }

    void remove_nodeWithOneRightChild_succeeds() {
        set.insert(10);
        set.insert(5);
        set.insert(7);

        assertTrue(set.remove(5));
        assertEquals(2, set.size());
        assertFalse(set.contains(5));
        assertTrue(set.contains(10));
        assertTrue(set.contains(7));
        assertListEquals(set.getKeys(), 7, 10);
    }

    void remove_nodeWithTwoChildren_succeeds() {
        set.insert(10);
        set.insert(5);
        set.insert(20);
        set.insert(15);
        set.insert(25);

        assertTrue(set.remove(20));
        assertEquals(4, set.size());
        assertFalse(set.contains(20));
        assertTrue(set.contains(10));
        assertTrue(set.contains(5));
        assertTrue(set.contains(15));
        assertTrue(set.contains(25));
        assertListEquals(set.getKeys(), 5, 10, 15, 25);
    }

    void remove_rootWithTwoChildren_succeeds() {
        set.insert(10);
        set.insert(5);
        set.insert(20);
        set.insert(2);
        set.insert(7);
        set.insert(15);
        set.insert(25);

        assertTrue(set.remove(10));
        assertEquals(6, set.size());
        assertFalse(set.contains(10));
        assertTrue(set.contains(5));
        assertTrue(set.contains(20));
        assertTrue(set.contains(2));
        assertTrue(set.contains(7));
        assertTrue(set.contains(15));
        assertTrue(set.contains(25));
        assertListEquals(set.getKeys(), 2, 5, 7, 15, 20, 25);
    }

    void remove_allElementsOneByOne_resultsInEmptySet() {
        int[] values = {10, 5, 20, 2, 7, 15, 25};
        for (int v : values) {
            assertTrue(set.insert(v));
        }

        for (int v : values) {
            assertTrue(set.remove(v));
        }

        assertTrue(set.empty());
        assertEquals(0, set.size());
        assertListEquals(set.getKeys());
    }

    void getKeys_emptySet_returnsEmptyList() {
        assertListEquals(set.getKeys());
    }

    void getKeys_returnsKeysInIncreasingOrder() {
        set.insert(10);
        set.insert(5);
        set.insert(20);
        set.insert(2);
        set.insert(7);
        set.insert(15);
        set.insert(25);

        assertListEquals(set.getKeys(), 2, 5, 7, 10, 15, 20, 25);
    }

    void getKeys_afterRemovals_remainsSorted() {
        set.insert(10);
        set.insert(5);
        set.insert(20);
        set.insert(2);
        set.insert(7);
        set.insert(15);
        set.insert(25);

        assertTrue(set.remove(10));
        assertTrue(set.remove(5));

        assertListEquals(set.getKeys(), 2, 7, 15, 20, 25);
    }

    void nbKeyComp_emptySet_isZeroOrMoreAndContainsFalse() {
        int comps = set.nbKeyComp(10);

        assertFalse(set.contains(10));
        assertTrue(comps >= 0);
    }

    void nbKeyComp_existingKey_isPositive() {
        set.insert(10);
        set.insert(5);
        set.insert(20);

        int comps = set.nbKeyComp(20);
        assertEquals(2, comps);
    }

    void nbKeyComp_missingKey_isPositiveInNonEmptySet() {
        set.insert(10);
        set.insert(5);
        set.insert(20);

        int comps = set.nbKeyComp(17);

        assertEquals(2, comps);
    }

    void nbKeyComp_rootShouldNeedNoMoreComparisonsThanDeepNode() {
        set.insert(10);
        set.insert(5);
        set.insert(20);
        set.insert(2);
        set.insert(7);

        int rootComps = set.nbKeyComp(10);
        int deepComps = set.nbKeyComp(2);

        assertEquals(1, rootComps);
        assertEquals(3, deepComps);
    }

    void supportsStringsAsComparableKeys() {
        BSTSet<String> strings = new BSTSet<>();

        assertTrue(strings.insert("m"));
        assertTrue(strings.insert("a"));
        assertTrue(strings.insert("z"));
        assertTrue(strings.insert("k"));
        assertFalse(strings.insert("a"));

        assertTrue(strings.contains("m"));
        assertTrue(strings.contains("a"));
        assertTrue(strings.contains("z"));
        assertFalse(strings.contains("x"));

        assertTrue(strings.remove("m"));
        assertFalse(strings.contains("m"));

        assertListEquals(strings.getKeys(), "a", "k", "z");
    }

    void supportsSubtypeComparableToSupertype() {
        BSTSet<Dog> dogs = new BSTSet<>();

        Dog d1 = new Dog(3);
        Dog d2 = new Dog(1);
        Dog d3 = new Dog(2);

        assertTrue(dogs.insert(d1));
        assertTrue(dogs.insert(d2));
        assertTrue(dogs.insert(d3));
        assertFalse(dogs.insert(new Dog(2)));

        assertTrue(dogs.contains(new Dog(1)));
        assertTrue(dogs.contains(new Dog(2)));
        assertTrue(dogs.contains(new Dog(3)));
        assertFalse(dogs.contains(new Dog(4)));

        assertEquals(3, dogs.size());
    }

    void mixedOperations_preserveCorrectState() {
        assertTrue(set.insert(10));
        assertTrue(set.insert(5));
        assertTrue(set.insert(15));
        assertFalse(set.insert(10));

        assertTrue(set.remove(5));
        assertFalse(set.remove(5));
        assertTrue(set.insert(7));
        assertTrue(set.contains(7));
        assertFalse(set.contains(5));

        assertEquals(3, set.size());
        assertListEquals(set.getKeys(), 7, 10, 15);
    }

    @SafeVarargs
    private static <T> void assertListEquals(List<T> actual, T... expected) {
        if (expected.length == 0) {
            assertTrue(actual.empty(), "Expected empty list");
            return;
        }

        assertFalse(actual.empty(), "List is empty but expected " + expected.length + " elements");

        actual.findFirst();
        int i = 0;
        while (true) {
            assertEquals(expected[i], actual.retrieve(), "Mismatch at index " + i);
            if (actual.last()) break;
            actual.findNext();
            i++;
        }

        assertEquals(expected.length - 1, i, "List has fewer elements than expected");
    }

    private static class Animal implements Comparable<Animal> {
        private  int id;

        Animal(int id) {
            this.id = id;
        }

        @Override
        public int compareTo(Animal other) {
            return Integer.compare(this.id, other.id);
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Animal other)) return false;
            return this.id == other.id;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(id);
        }
    }

    private static class Dog extends Animal {
        Dog(int id) {
            super(id);
        }
    }
}

class DateTimeTest extends PlainAssertions {

    private DateTime dt;

    void setUp() {
        dt = new DateTime(2024, 3, 15, 9, 5);
    }

    void getYear() {
        assertEquals(2024, dt.getYear());
    }

    void getMonth() {
        assertEquals(3, dt.getMonth());
    }

    void getDay() {
        assertEquals(15, dt.getDay());
    }

    void getHour() {
        assertEquals(9, dt.getHour());
    }

    void getMinute() {
        assertEquals(5, dt.getMinute());
    }

    void compareTo() {
        DateTime same = new DateTime(2024, 3, 15, 9, 5);
        DateTime earlier = new DateTime(2024, 3, 15, 9, 4);  // minute differs
        DateTime later = new DateTime(2024, 3, 15, 9, 6);  // minute differs

        DateTime diffDay = new DateTime(2024, 3, 14, 9, 5);  // day differs
        DateTime diffMonth = new DateTime(2024, 2, 15, 9, 5);  // month differs
        DateTime diffYear = new DateTime(2023, 3, 15, 9, 5);  // year differs
        DateTime diffHour = new DateTime(2024, 3, 15, 8, 5);  // hour differs

        assertEquals(0, dt.compareTo(same), "Same datetime should return 0");
        assertTrue(dt.compareTo(earlier) > 0, "Should be greater than earlier minute");
        assertTrue(dt.compareTo(later) < 0, "Should be less than later minute");
        assertTrue(dt.compareTo(diffDay) > 0, "Should be greater than earlier day");
        assertTrue(dt.compareTo(diffMonth) > 0, "Should be greater than earlier month");
        assertTrue(dt.compareTo(diffYear) > 0, "Should be greater than earlier year");
        assertTrue(dt.compareTo(diffHour) > 0, "Should be greater than earlier hour");
    }

    void format() {
        assertEquals("03/15/2024 09:05", dt.format());

        // Verify zero-padding with single-digit values
        DateTime padded = new DateTime(2024, 1, 5, 8, 3);
        assertEquals("01/05/2024 08:03", padded.format());
    }
}

class EventTest extends PlainAssertions {

    private ITimeSlot timeSlot;
    private ILocation location;
    private BSTSet<Integer> participantIds;
    private Event event;

    void setUp() {
        IDateTime start = new DateTime(2026, 4, 20, 10, 0);
        IDateTime end   = new DateTime(2026, 4, 20, 11, 0);
        timeSlot = new TimeSlot(start, end);

        ISchedule schedule = new Schedule(); // or null if not needed
        location = new Location(1, "Room A", true, false, 30, schedule);
        participantIds = new BSTSet<>();
        participantIds.insert(101);
        participantIds.insert(102);

        event = new Event(1, timeSlot, location, participantIds);
    }

    void getId() {
        assertEquals(1, event.getId());
    }

    void getTimeSlot() {
        assertSame(timeSlot, event.getTimeSlot());
    }

    void getLocation() {
        assertSame(location, event.getLocation());
    }

    void getParticipantIds() {
        Set<Integer> result = event.getParticipantIds();
        assertSame(participantIds, result);
        assertTrue(result.contains(101));
        assertTrue(result.contains(102));
        assertEquals(2, result.size());
    }

    void compareTo() {
        Event lower = new Event(0, timeSlot, location, new BSTSet<>());
        Event same = new Event(1, timeSlot, location, new BSTSet<>());
        Event higher = new Event(2, timeSlot, location, new BSTSet<>());

        assertTrue(event.compareTo(lower) > 0, "Should be greater than event with lower id");
        assertEquals(0, event.compareTo(same), "Should be equal to event with same id");
        assertTrue(event.compareTo(higher) < 0, "Should be less than event with higher id");
    }
}

class LinkedListTest extends PlainAssertions {

    private List<Integer> linkedList;

    void setUp() {
        linkedList = new LinkedList<>();
    }

    void testFull() {
        assertFalse(linkedList.full());
    }

    void testEmpty() {
        assertTrue(linkedList.empty());
    }

    void testLast() {
        linkedList.insert(5);
        assertTrue(linkedList.last());
    }

    void testFindFirst() {
        linkedList.findFirst();
        // no exception = findFirst is implemented
    }

    void testFindNext() {
        linkedList.insert(5);
        linkedList.insert(6);
        linkedList.findFirst();
        linkedList.findNext();
        // no exception = findNext is implemented
    }

    void testInsert() {
        linkedList.insert(1);
        assertFalse(linkedList.empty());
    }

    void testRetrieve() {
        linkedList.insert(1);
        assertEquals(1, linkedList.retrieve());
    }

    void testUpdate() {
        linkedList.insert(1);
        linkedList.update(2);
        assertEquals(2, linkedList.retrieve());
    }

    void testRemove() {
        linkedList.insert(1);
        linkedList.remove();
        assertTrue(linkedList.empty());
    }

    void testLengthTwo() {
        linkedList.insert(1);
        linkedList.insert(3);
        // walk the list manually since length() is not in the interface
        int count = 0;
        linkedList.findFirst();
        while (true) {
            count++;
            if (linkedList.last()) break;
            linkedList.findNext();
        }
        assertEquals(2, count);
    }

    void testLengthEmpty() {
        assertTrue(linkedList.empty());
    }

    // --- swap tests removed: swap() is not part of List<T> or LinkedList ---

    void testInsertMultipleAndRetrieve() {
        linkedList.insert(1);
        linkedList.insert(3);
        linkedList.insert(5);
        linkedList.insert(8);
        // current should be at last inserted node (8)
        assertEquals(8, linkedList.retrieve());
    }

    void testFindFirstReturnsToHead() {
        linkedList.insert(1);
        linkedList.insert(3);
        linkedList.findFirst();
        assertEquals(1, linkedList.retrieve());
    }

    void testFindNextAdvancesCurrent() {
        linkedList.insert(1);
        linkedList.insert(3);
        linkedList.findFirst();
        linkedList.findNext();
        assertEquals(3, linkedList.retrieve());
    }

    void testRemoveMidList() {
        List<String> list = new LinkedList<>();
        list.insert("A");
        list.insert("B");
        list.insert("C");
        list.findFirst();
        list.findNext(); // current = "B"
        list.remove();   // remove "B", current should advance to "C"
        assertEquals("C", list.retrieve());
    }
}

class LocationTest extends PlainAssertions {

    private Location location;
    private ISchedule schedule;

    void setUp() {
        schedule = new Schedule(); // assuming Schedule is implemented
        location = new Location(1, "Room A", true, false, 30, schedule);
    }

    void getId() {
        assertEquals(1, location.getId());
    }

    void getName() {
        assertEquals("Room A", location.getName());
    }

    void isReservable() {
        assertTrue(location.isReservable());
    }

    void isOnline() {
        assertFalse(location.isOnline());
    }

    void getCapacity() {
        assertEquals(30, location.getCapacity());
    }

    void getSchedule() {
        assertSame(schedule, location.getSchedule());
    }

    void compareTo() {
        Location lower = new Location(0, "B", false, false, 1, schedule);
        Location same = new Location(1, "C", false, false, 1, schedule);
        Location higher = new Location(2, "D", false, false, 1, schedule);

        assertTrue(location.compareTo(lower) > 0, "Should be greater than lower id");
        assertEquals(0, location.compareTo(same), "Should be equal for same id");
        assertTrue(location.compareTo(higher) < 0, "Should be less than higher id");
    }

    void testOnlineLocation() {
        Location online = new Location(2, "Zoom", false, true, 0, null);

        assertTrue(online.isOnline());
        assertFalse(online.isReservable());
    }

    void testPrivateLocation() {
        Location office = new Location(3, "Office", false, false, 1, null);

        assertFalse(office.isReservable());
        assertFalse(office.isOnline());
        assertEquals(1, office.getCapacity());
    }
}

class MeetingTest extends PlainAssertions {

    private ITimeSlot createTimeSlot() {
        IDateTime start = new DateTime(2026, 5, 10, 9, 0);
        IDateTime end = new DateTime(2026, 5, 10, 10, 0);
        return new TimeSlot(start, end);
    }

    private ILocation createLocation() {
        return new Location(30, "Office A", true, false, 4, new Schedule());
    }

    void constructorShouldInitializeAllFields() {
        ITimeSlot timeSlot = createTimeSlot();
        ILocation location = createLocation();

        Meeting meeting = new Meeting(100, timeSlot, location, 7, 12);

        assertEquals(100, meeting.getId());
        assertSame(timeSlot, meeting.getTimeSlot());
        assertSame(location, meeting.getLocation());
        assertEquals(7, meeting.getAdvisorId());
        assertEquals(12, meeting.getStudentId());
    }

    void participantIdsShouldContainAdvisorAndStudent() {
        Meeting meeting = new Meeting(101, createTimeSlot(), createLocation(), 7, 12);

        Set<Integer> participantIds = meeting.getParticipantIds();

        assertEquals(2, participantIds.size());
        assertTrue(participantIds.contains(7));
        assertTrue(participantIds.contains(12));
    }

    void compareToShouldUseEventId() {
        Meeting m1 = new Meeting(10, createTimeSlot(), createLocation(), 1, 2);
        Meeting m2 = new Meeting(20, createTimeSlot(), createLocation(), 1, 3);
        Meeting m3 = new Meeting(10, createTimeSlot(), createLocation(), 4, 5);

        assertTrue(m1.compareTo(m2) < 0);
        assertTrue(m2.compareTo(m1) > 0);
        assertEquals(0, m1.compareTo(m3));
    }

    void participantIdsShouldNotDuplicateWhenAdvisorAndStudentAreSame() {
        Meeting meeting = new Meeting(102, createTimeSlot(), createLocation(), 7, 7);

        Set<Integer> participantIds = meeting.getParticipantIds();

        assertEquals(1, participantIds.size());
        assertTrue(participantIds.contains(7));
    }
}

class PersonTest extends PlainAssertions {

    private ISchedule schedule;
    private Person person;

    void setUp() {
        schedule = new Schedule();
        person = new Person(1, "Alice", "alice@example.com", schedule);
    }

    void getId() {
        assertEquals(1, person.getId());
    }

    void getName() {
        assertEquals("Alice", person.getName());
    }

    void getEmail() {
        assertEquals("alice@example.com", person.getEmail());
    }

    void getSchedule() {
        assertSame(schedule, person.getSchedule());
    }

    void compareTo() {
        Person lower = new Person(0, "Bob", "bob@example.com", schedule);
        Person same = new Person(1, "Charlie", "charlie@example.com", schedule);
        Person higher = new Person(2, "Diana", "diana@example.com", schedule);

        assertTrue(person.compareTo(lower) > 0, "Should be greater than person with lower id");
        assertEquals(0, person.compareTo(same), "Should be equal to person with same id");
        assertTrue(person.compareTo(higher) < 0, "Should be less than person with higher id");
    }
}

class ScheduleTest extends PlainAssertions {

    private Schedule schedule;

    void setUp() {
        schedule = new Schedule();
    }

    private static IDateTime dt(int year, int month, int day, int hour, int minute) {
        return new DateTime(year, month, day, hour, minute);
    }

    private static ITimeSlot ts(IDateTime start, IDateTime end) {
        return new TimeSlot(start, end);
    }

    private static ITimeSlot slot(int startHour, int endHour) {
        return ts(dt(2026, 1, 1, startHour, 0),
                dt(2026, 1, 1, endHour, 0));
    }

    private static ITimeSlot slotM(int sh, int sm, int eh, int em) {
        return ts(dt(2026, 1, 1, sh, sm),
                dt(2026, 1, 1, eh, em));
    }

    void emptyOnNew() {
        assertTrue(schedule.empty());
    }

    void sizeZeroOnNew() {
        assertEquals(0, schedule.size());
    }

    void containsFalseOnNew() {
        assertFalse(schedule.contains(1));
    }

    void conflictsFalseOnNew() {
        assertFalse(schedule.conflicts(slot(9, 10)));
    }

    void getEventIdsEmptyOnNew() {
        assertTrue(schedule.getEventIds().empty());
    }

    void getEventsEmptyOnNew() {
        assertTrue(schedule.getEvents().empty());
    }

    void returnsTrueForFreshEvent() {
        assertTrue(schedule.add(1, slot(9, 10)));
    }

    void sizeBecomesOne() {
        schedule.add(1, slot(9, 10));
        assertEquals(1, schedule.size());
    }

    void emptyBecomesFalse() {
        schedule.add(1, slot(9, 10));
        assertFalse(schedule.empty());
    }

    void containsInsertedId() {
        schedule.add(1, slot(9, 10));
        assertTrue(schedule.contains(1));
    }

    void twoNonOverlapping() {
        assertTrue(schedule.add(1, slot(9, 10)));
        assertTrue(schedule.add(2, slot(11, 12)));
        assertEquals(2, schedule.size());
        assertTrue(schedule.contains(1));
        assertTrue(schedule.contains(2));
    }

    void containsFalseForUnknownId() {
        schedule.add(1, slot(9, 10));
        assertFalse(schedule.contains(99));
    }

    void sameIdSameSlot() {
        schedule.add(5, slot(8, 9));
        assertFalse(schedule.add(5, slot(8, 9)));
    }

    void sameIdDifferentSlot() {
        schedule.add(5, slot(8, 9));
        assertFalse(schedule.add(5, slot(14, 15)));
    }

    void duplicateIdSizeUnchanged() {
        schedule.add(5, slot(8, 9));
        schedule.add(5, slot(8, 9));
        schedule.add(5, slot(14, 15));
        assertEquals(1, schedule.size());
    }

    void differentIdSameSlot() {
        schedule.add(1, slot(10, 11));
        assertFalse(schedule.add(2, slot(10, 11)));
    }

    void exactSlotConflictSizeUnchanged() {
        schedule.add(1, slot(10, 11));
        schedule.add(2, slot(10, 11));
        assertEquals(1, schedule.size());
    }

    void secondIdNotRegistered() {
        schedule.add(1, slot(10, 11));
        schedule.add(2, slot(10, 11));
        assertFalse(schedule.contains(2));
    }

    void startsInsideEndsAfter() {
        schedule.add(1, slot(10, 12));
        assertFalse(schedule.add(2, slot(11, 13)));
    }

    void startsBeforeEndsInside() {
        schedule.add(1, slot(10, 12));
        assertFalse(schedule.add(3, slot(9, 11)));
    }

    void completelyInside() {
        schedule.add(1, slot(10, 12));
        assertFalse(schedule.add(4, slotM(10, 30, 11, 30)));
    }

    void completelyWraps() {
        schedule.add(1, slot(10, 12));
        assertFalse(schedule.add(5, slot(9, 13)));
    }

    void sameStartExtendsOut() {
        schedule.add(1, slot(10, 12));
        assertFalse(schedule.add(6, slot(10, 13)));
    }

    void sameEndStartsEarlier() {
        schedule.add(1, slot(10, 12));
        assertFalse(schedule.add(7, slot(9, 12)));
    }

    void oneMinuteOverlapAtStart() {
        schedule.add(1, slot(10, 12));
        assertFalse(schedule.add(8, slotM(9, 59, 10, 1)));
    }

    void oneMinuteOverlapAtEnd() {
        schedule.add(1, slot(10, 12));
        assertFalse(schedule.add(9, slotM(11, 59, 12, 1)));
    }

    void overlapShapesSizeUnchanged() {
        schedule.add(1, slot(10, 12));
        schedule.add(2, slot(11, 13));
        schedule.add(3, slot(9, 11));
        schedule.add(4, slotM(10, 30, 11, 30));
        schedule.add(5, slot(9, 13));
        schedule.add(6, slot(10, 13));
        schedule.add(7, slot(9, 12));
        assertEquals(1, schedule.size());
    }

    void beforeAdjacentAccepted() {
        schedule.add(1, slot(10, 12));
        assertTrue(schedule.add(2, slot(8, 10)));
    }

    void afterAdjacentAccepted() {
        schedule.add(1, slot(10, 12));
        assertTrue(schedule.add(3, slot(12, 14)));
    }

    void threeAdjacentSize() {
        schedule.add(1, slot(10, 12));
        schedule.add(2, slot(8, 10));
        schedule.add(3, slot(12, 14));
        assertEquals(3, schedule.size());
    }

    void returnsTrueForKnownId() {
        schedule.add(10, slot(9, 10));
        assertTrue(schedule.remove(10));
    }

    void containsBecomesFalse() {
        schedule.add(10, slot(9, 10));
        schedule.remove(10);
        assertFalse(schedule.contains(10));
    }

    void sizeDecrements() {
        schedule.add(10, slot(9, 10));
        schedule.add(20, slot(11, 12));
        schedule.remove(10);
        assertEquals(1, schedule.size());
    }

    void siblingUnaffected() {
        schedule.add(10, slot(9, 10));
        schedule.add(20, slot(11, 12));
        schedule.remove(10);
        assertTrue(schedule.contains(20));
    }

    void emptyAfterLastRemoval() {
        schedule.add(1, slot(9, 10));
        schedule.remove(1);
        assertTrue(schedule.empty());
        assertEquals(0, schedule.size());
    }

    void returnsFalseForUnknownId() {
        schedule.add(1, slot(9, 10));
        assertFalse(schedule.remove(99));
    }

    void removeUnknownSizeUnchanged() {
        schedule.add(1, slot(9, 10));
        schedule.remove(99);
        assertEquals(1, schedule.size());
    }

    void returnsFalseOnEmpty() {
        assertFalse(schedule.remove(5));
    }

    void returnsFalseOnSecondRemove() {
        schedule.add(1, slot(9, 10));
        schedule.remove(1);
        assertFalse(schedule.remove(1));
    }

    void freedSlotNoLongerConflicts() {
        ITimeSlot t = slot(9, 10);
        schedule.add(1, t);
        schedule.remove(1);
        assertFalse(schedule.conflicts(t));
    }

    void canReAddSameSlot() {
        ITimeSlot t = slot(9, 10);
        schedule.add(1, t);
        schedule.remove(1);
        assertTrue(schedule.add(1, t));
    }

    void getEventIdsExcludesRemovedId() {
        schedule.add(1, slot(9, 10));
        schedule.remove(1);
        assertFalse(schedule.getEventIds().contains(1));
    }

    void getEventsExcludesFreedSlot() {
        ITimeSlot t = slot(9, 10);
        schedule.add(1, t);
        schedule.remove(1);
        assertNull(schedule.getEvents().get(t));
    }

    void containsLifecycleFalseOnEmpty() {
        assertFalse(schedule.contains(0));
    }

    void trueAfterAdd() {
        schedule.add(0, slot(1, 2));
        assertTrue(schedule.contains(0));
    }

    void falseAfterRemove() {
        schedule.add(0, slot(1, 2));
        schedule.remove(0);
        assertFalse(schedule.contains(0));
    }

    void handlesZeroId() {
        schedule.add(0, slot(1, 2));
        assertTrue(schedule.contains(0));
    }

    void handlesNegativeId() {
        schedule.add(-1, slot(3, 4));
        assertTrue(schedule.contains(-1));
    }

    void handlesLargeId() {
        schedule.add(Integer.MAX_VALUE, slot(5, 6));
        assertTrue(schedule.contains(Integer.MAX_VALUE));
    }

    void conflictsFalseOnEmptySchedule() {
        assertFalse(new Schedule().conflicts(slot(9, 10)));
    }

    void exactSameSlot() {
        schedule.add(1, slot(9, 11));
        assertTrue(schedule.conflicts(slot(9, 11)));
    }

    void subSlot() {
        schedule.add(1, slot(9, 11));
        assertTrue(schedule.conflicts(slotM(9, 15, 10, 45)));
    }

    void overlapStart() {
        schedule.add(1, slot(9, 11));
        assertTrue(schedule.conflicts(slot(8, 10)));
    }

    void overlapEnd() {
        schedule.add(1, slot(9, 11));
        assertTrue(schedule.conflicts(slot(10, 12)));
    }

    void enclosing() {
        schedule.add(1, slot(9, 11));
        assertTrue(schedule.conflicts(slot(8, 12)));
    }

    void touchesBeforeNoConflict() {
        schedule.add(1, slot(9, 11));
        assertFalse(schedule.conflicts(slot(7, 9)));
    }

    void touchesAfterNoConflict() {
        schedule.add(1, slot(9, 11));
        assertFalse(schedule.conflicts(slot(11, 13)));
    }

    void entirelyBefore() {
        schedule.add(1, slot(9, 11));
        assertFalse(schedule.conflicts(slot(5, 8)));
    }

    void entirelyAfter() {
        schedule.add(1, slot(9, 11));
        assertFalse(schedule.conflicts(slot(12, 14)));
    }

    void incrementsOnAdd() {
        for (int i = 1; i <= 5; i++) {
            schedule.add(i, slot(i * 2, i * 2 + 1));
            assertEquals(i, schedule.size());
        }
    }

    void emptyFalseAfterAdd() {
        schedule.add(1, slot(1, 2));
        assertFalse(schedule.empty());
    }

    void decrementsOnRemove() {
        for (int i = 1; i <= 5; i++) schedule.add(i, slot(i * 2, i * 2 + 1));
        for (int i = 5; i >= 1; i--) {
            schedule.remove(i);
            assertEquals(i - 1, schedule.size());
        }
    }

    void emptyTrueWhenAllRemoved() {
        schedule.add(1, slot(1, 2));
        schedule.remove(1);
        assertTrue(schedule.empty());
    }

    void failedAddNoSizeChange() {
        schedule.add(1, slot(9, 10));
        schedule.add(1, slot(9, 10));
        assertEquals(1, schedule.size());
    }

    void failedRemoveNoSizeChange() {
        schedule.add(1, slot(9, 10));
        schedule.remove(99);
        assertEquals(1, schedule.size());
    }

    void sizeZeroAfterClear() {
        schedule.add(1, slot(8, 9));
        schedule.add(2, slot(10, 11));
        schedule.add(3, slot(12, 13));
        schedule.clear();
        assertEquals(0, schedule.size());
    }

    void emptyAfterClear() {
        schedule.add(1, slot(8, 9));
        schedule.add(2, slot(10, 11));
        schedule.add(3, slot(12, 13));
        schedule.clear();
        assertTrue(schedule.empty());
    }

    void containsFalseAfterClear() {
        schedule.add(1, slot(8, 9));
        schedule.add(2, slot(10, 11));
        schedule.add(3, slot(12, 13));
        schedule.clear();
        assertFalse(schedule.contains(1));
    }

    void conflictsFalseAfterClear() {
        schedule.add(1, slot(8, 9));
        schedule.add(2, slot(10, 11));
        schedule.add(3, slot(12, 13));
        schedule.clear();
        assertFalse(schedule.conflicts(slot(8, 9)));
    }

    void getEventIdsEmptyAfterClear() {
        schedule.add(1, slot(8, 9));
        schedule.add(2, slot(10, 11));
        schedule.add(3, slot(12, 13));
        schedule.clear();
        assertTrue(schedule.getEventIds().empty());
    }

    void getEventsEmptyAfterClear() {
        schedule.add(1, slot(8, 9));
        schedule.add(2, slot(10, 11));
        schedule.add(3, slot(12, 13));
        schedule.clear();
        assertTrue(schedule.getEvents().empty());
    }

    void canAddAfterClear() {
        schedule.add(1, slot(8, 9));
        schedule.add(2, slot(10, 11));
        schedule.add(3, slot(12, 13));
        schedule.clear();
        assertTrue(schedule.add(1, slot(8, 9)));
    }

    void sizeOneAfterReAdd() {
        schedule.add(1, slot(8, 9));
        schedule.add(2, slot(10, 11));
        schedule.add(3, slot(12, 13));
        schedule.clear();
        schedule.add(1, slot(8, 9));
        assertEquals(1, schedule.size());
    }

    void containsAllInsertedIds() {
        schedule.add(30, slot(1, 2));
        schedule.add(10, slot(3, 4));
        schedule.add(20, slot(5, 6));
        Set<Integer> ids = schedule.getEventIds();
        assertTrue(ids.contains(10));
        assertTrue(ids.contains(20));
        assertTrue(ids.contains(30));
    }

    void doesNotContainUnknownIds() {
        schedule.add(1, slot(1, 2));
        assertFalse(schedule.getEventIds().contains(99));
    }

    void getEventIdsSizeMatches() {
        schedule.add(30, slot(1, 2));
        schedule.add(10, slot(3, 4));
        schedule.add(20, slot(5, 6));
        assertEquals(3, schedule.getEventIds().size());
    }

    void keysInAscendingOrder() {
        schedule.add(30, slot(1, 2));
        schedule.add(10, slot(3, 4));
        schedule.add(20, slot(5, 6));
        List<Integer> keys = schedule.getEventIds().getKeys();
        keys.findFirst();
        int a = keys.retrieve();
        keys.findNext();
        int b = keys.retrieve();
        keys.findNext();
        int c = keys.retrieve();
        assertAll(
                () -> assertEquals(10, a, "first key should be 10"),
                () -> assertEquals(20, b, "second key should be 20"),
                () -> assertEquals(30, c, "third key should be 30")
        );
    }

    void removedIdAbsent() {
        schedule.add(1, slot(1, 2));
        schedule.add(2, slot(3, 4));
        schedule.remove(1);
        assertFalse(schedule.getEventIds().contains(1));
        assertTrue(schedule.getEventIds().contains(2));
    }

    void getEventsSizeMatches() {
        schedule.add(1, slot(8, 9));
        schedule.add(2, slot(10, 11));
        assertEquals(2, schedule.getEvents().size());
    }

    void mapsSlotToCorrectId() {
        ITimeSlot t1 = slot(8, 9);
        ITimeSlot t2 = slot(10, 11);
        schedule.add(100, t1);
        schedule.add(200, t2);
        assertAll(
                () -> assertEquals(100, schedule.getEvents().get(t1)),
                () -> assertEquals(200, schedule.getEvents().get(t2))
        );
    }

    void nullForUnknownSlot() {
        schedule.add(1, slot(8, 9));
        assertNull(schedule.getEvents().get(slot(20, 21)));
    }

    void slotAbsentAfterRemoval() {
        ITimeSlot t = slot(8, 9);
        schedule.add(1, t);
        schedule.remove(1);
        assertNull(schedule.getEvents().get(t));
    }

    void bulkInsert() {
         int N = 100;
        for (int i = 0; i < N; i++) {
            assertTrue(schedule.add(i, slotM(i, 0, i, 30)),
                    "add(" + i + ") should succeed");
        }
        assertEquals(N, schedule.size());
    }

    void conflictsAfterBulkInsert() {
         int N = 100;
        for (int i = 0; i < N; i++) schedule.add(i, slotM(i, 0, i, 30));
        assertAll(
                () -> assertTrue(schedule.conflicts(slotM(0, 0, 0, 30))),
                () -> assertTrue(schedule.conflicts(slotM(50, 0, 50, 30)))
        );
    }

    void gapsNoConflict() {
         int N = 100;
        for (int i = 0; i < N; i++) schedule.add(i, slotM(i, 0, i, 30));
        assertFalse(schedule.conflicts(slotM(0, 31, 0, 59)));
    }

    void bulkRemoveEvens() {
         int N = 100;
        for (int i = 0; i < N; i++) schedule.add(i, slotM(i, 0, i, 30));
        for (int i = 0; i < N; i += 2) assertTrue(schedule.remove(i));
        assertEquals(N / 2, schedule.size());
    }

    void oddsSurvive() {
         int N = 100;
        for (int i = 0; i < N; i++) schedule.add(i, slotM(i, 0, i, 30));
        for (int i = 0; i < N; i += 2) schedule.remove(i);
        assertAll(
                () -> assertFalse(schedule.contains(0)),
                () -> assertTrue(schedule.contains(1)),
                () -> assertTrue(schedule.contains(99))
        );
    }

    void freedSlotAcceptsNewEvent() {
        schedule.add(1, slot(8, 10));
        schedule.add(2, slot(10, 12));
        schedule.add(3, slot(12, 14));
        schedule.remove(2);
        assertTrue(schedule.add(4, slot(10, 12)));
    }

    void surroundingEventsStillConflict() {
        schedule.add(1, slot(8, 10));
        schedule.add(2, slot(10, 12));
        schedule.add(3, slot(12, 14));
        schedule.remove(2);
        assertAll(
                () -> assertTrue(schedule.conflicts(slot(9, 10))),
                () -> assertTrue(schedule.conflicts(slot(12, 13)))
        );
    }

    void removedNotContained() {
        schedule.add(1, slot(8, 10));
        schedule.add(2, slot(10, 12));
        schedule.remove(2);
        assertFalse(schedule.contains(2));
    }

    void newEventContained() {
        schedule.add(1, slot(8, 10));
        schedule.add(2, slot(10, 12));
        schedule.remove(2);
        schedule.add(4, slot(10, 12));
        assertTrue(schedule.contains(4));
    }

    void sizeConsistentThroughCycle() {
        schedule.add(1, slot(8, 10));
        schedule.add(2, slot(10, 12));
        schedule.add(3, slot(12, 14));
        assertEquals(3, schedule.size());
        schedule.remove(2);
        assertEquals(2, schedule.size());
        schedule.add(4, slot(10, 12));
        assertEquals(3, schedule.size());
    }

    void sameIdSameSlotReAdded() {
        ITimeSlot t = slot(9, 10);
        schedule.add(42, t);
        schedule.remove(42);
        assertTrue(schedule.add(42, t));
    }

    void differentIdSameSlotAfterRemoval() {
        ITimeSlot t = slot(9, 10);
        schedule.add(42, t);
        schedule.remove(42);
        assertTrue(schedule.add(99, t));
    }

    void originalIdNewSlot() {
        schedule.add(42, slot(9, 10));
        schedule.remove(42);
        assertTrue(schedule.add(42, slot(11, 12)));
    }

    void sizeAfterReInsert() {
        ITimeSlot t = slot(9, 10);
        schedule.add(42, t);
        schedule.remove(42);
        schedule.add(99, t);
        schedule.add(42, slot(11, 12));
        assertEquals(2, schedule.size());
    }

    void overnightInserted() {
        assertTrue(schedule.add(1,
                ts(dt(2026, 1, 1, 23, 0), dt(2026, 1, 2, 1, 0))));
    }

    void overnightConflictsSpanningMidnight() {
        schedule.add(1, ts(dt(2026, 1, 1, 23, 0), dt(2026, 1, 2, 1, 0)));
        assertTrue(schedule.conflicts(
                ts(dt(2026, 1, 1, 23, 30), dt(2026, 1, 2, 0, 30))));
    }

    void adjacentAfterOvernightNoConflict() {
        schedule.add(1, ts(dt(2026, 1, 1, 23, 0), dt(2026, 1, 2, 1, 0)));
        assertFalse(schedule.conflicts(
                ts(dt(2026, 1, 2, 1, 0), dt(2026, 1, 2, 2, 0))));
    }

    void differentMonthNoConflict() {
        schedule.add(1, ts(dt(2026, 1, 1, 23, 0), dt(2026, 1, 2, 1, 0)));
        assertFalse(schedule.conflicts(
                ts(dt(2026, 3, 15, 9, 0), dt(2026, 3, 15, 10, 0))));
    }

    void eventsAcrossTwoMonthsBothInserted() {
        assertTrue(schedule.add(1,
                ts(dt(2026, 1, 1, 23, 0), dt(2026, 1, 2, 1, 0))));
        assertTrue(schedule.add(2,
                ts(dt(2026, 3, 15, 9, 0), dt(2026, 3, 15, 10, 0))));
        assertEquals(2, schedule.size());
    }

    void oneMinuteSlotInserted() {
        assertTrue(schedule.add(1, slotM(10, 0, 10, 1)));
    }

    void sameOneMinuteSlotConflicts() {
        schedule.add(1, slotM(10, 0, 10, 1));
        assertTrue(schedule.conflicts(slotM(10, 0, 10, 1)));
    }

    void adjacentAfterNoConflict() {
        schedule.add(1, slotM(10, 0, 10, 1));
        assertFalse(schedule.conflicts(slotM(10, 1, 10, 2)));
    }

    void adjacentBeforeNoConflict() {
        schedule.add(1, slotM(10, 0, 10, 1));
        assertFalse(schedule.conflicts(slotM(9, 59, 10, 0)));
    }

    void twoConsecutiveOneMinuteSlots() {
        assertTrue(schedule.add(1, slotM(10, 0, 10, 1)));
        assertTrue(schedule.add(2, slotM(10, 1, 10, 2)));
        assertEquals(2, schedule.size());
    }

    void spanningSlotConflicts() {
        schedule.add(1, slotM(10, 0, 10, 1));
        schedule.add(2, slotM(10, 1, 10, 2));
        assertTrue(schedule.conflicts(slotM(10, 0, 10, 2)));
    }

    void nonOverlappingSlotAccepted(int startHour) {
        assertTrue(schedule.add(startHour, slot(startHour, startHour + 1)));
        assertEquals(1, schedule.size());
        schedule.clear();
    }
}

class StudentTest extends PlainAssertions {

    private Student student;

    void setUp() {
        student = new Student(1, "Bob", "bob@example.com", new Schedule() {
        }, "Computer Science");
    }

    void getMajor() {
        assertEquals("Computer Science", student.getMajor());
    }
}

class TimeSlotTest extends PlainAssertions {

    void getStart() {
        IDateTime start = new DateTime(2026, 4, 20, 10, 0);
        IDateTime end = new DateTime(2026, 4, 20, 11, 0);
        TimeSlot slot = new TimeSlot(start, end);

        assertSame(start, slot.getStart());
    }

    void getEnd() {
        IDateTime start = new DateTime(2026, 4, 20, 10, 0);
        IDateTime end = new DateTime(2026, 4, 20, 11, 0);
        TimeSlot slot = new TimeSlot(start, end);

        assertSame(end, slot.getEnd());
    }

    void compareTo_sameInterval_returnsZero() {
        ITimeSlot a = new TimeSlot(
                new DateTime(2026, 4, 20, 10, 0),
                new DateTime(2026, 4, 20, 11, 0)
        );
        ITimeSlot b = new TimeSlot(
                new DateTime(2026, 4, 20, 10, 0),
                new DateTime(2026, 4, 20, 11, 0)
        );

        assertEquals(0, a.compareTo(b));
        assertEquals(0, b.compareTo(a));
    }

    void compareTo_nonOverlappingBefore_returnsMinusOne() {
        ITimeSlot a = new TimeSlot(
                new DateTime(2026, 4, 20, 8, 0),
                new DateTime(2026, 4, 20, 9, 0)
        );
        ITimeSlot b = new TimeSlot(
                new DateTime(2026, 4, 20, 10, 0),
                new DateTime(2026, 4, 20, 11, 0)
        );

        assertEquals(-1, a.compareTo(b));
        assertEquals(1, b.compareTo(a));
    }

    void compareTo_touchingBoundary_returnsMinusOneAndPlusOne() {
        ITimeSlot a = new TimeSlot(
                new DateTime(2026, 4, 20, 9, 0),
                new DateTime(2026, 4, 20, 10, 0)
        );
        ITimeSlot b = new TimeSlot(
                new DateTime(2026, 4, 20, 10, 0),
                new DateTime(2026, 4, 20, 11, 0)
        );

        assertEquals(-1, a.compareTo(b));
        assertEquals(1, b.compareTo(a));
    }

    void compareTo_partialOverlapAtEnd_returnsZero() {
        ITimeSlot a = new TimeSlot(
                new DateTime(2026, 4, 20, 9, 0),
                new DateTime(2026, 4, 20, 10, 30)
        );
        ITimeSlot b = new TimeSlot(
                new DateTime(2026, 4, 20, 10, 0),
                new DateTime(2026, 4, 20, 11, 0)
        );

        assertEquals(0, a.compareTo(b));
        assertEquals(0, b.compareTo(a));
    }

    void compareTo_partialOverlapAtStart_returnsZero() {
        ITimeSlot a = new TimeSlot(
                new DateTime(2026, 4, 20, 10, 0),
                new DateTime(2026, 4, 20, 11, 0)
        );
        ITimeSlot b = new TimeSlot(
                new DateTime(2026, 4, 20, 9, 30),
                new DateTime(2026, 4, 20, 10, 15)
        );

        assertEquals(0, a.compareTo(b));
        assertEquals(0, b.compareTo(a));
    }

    void compareTo_oneContainsOther_returnsZero() {
        ITimeSlot outer = new TimeSlot(
                new DateTime(2026, 4, 20, 9, 0),
                new DateTime(2026, 4, 20, 12, 0)
        );
        ITimeSlot inner = new TimeSlot(
                new DateTime(2026, 4, 20, 10, 0),
                new DateTime(2026, 4, 20, 11, 0)
        );

        assertEquals(0, outer.compareTo(inner));
        assertEquals(0, inner.compareTo(outer));
    }

    void compareTo_sameStartDifferentEnd_returnsZero() {
        ITimeSlot a = new TimeSlot(
                new DateTime(2026, 4, 20, 10, 0),
                new DateTime(2026, 4, 20, 11, 0)
        );
        ITimeSlot b = new TimeSlot(
                new DateTime(2026, 4, 20, 10, 0),
                new DateTime(2026, 4, 20, 12, 0)
        );

        assertEquals(0, a.compareTo(b));
        assertEquals(0, b.compareTo(a));
    }

    void compareTo_sameEndDifferentStart_returnsZero() {
        ITimeSlot a = new TimeSlot(
                new DateTime(2026, 4, 20, 9, 0),
                new DateTime(2026, 4, 20, 11, 0)
        );
        ITimeSlot b = new TimeSlot(
                new DateTime(2026, 4, 20, 10, 0),
                new DateTime(2026, 4, 20, 11, 0)
        );

        assertEquals(0, a.compareTo(b));
        assertEquals(0, b.compareTo(a));
    }

    void compareTo_differentDays_nonOverlapping() {
        ITimeSlot a = new TimeSlot(
                new DateTime(2026, 4, 20, 10, 0),
                new DateTime(2026, 4, 20, 11, 0)
        );
        ITimeSlot b = new TimeSlot(
                new DateTime(2026, 4, 21, 10, 0),
                new DateTime(2026, 4, 21, 11, 0)
        );

        assertEquals(-1, a.compareTo(b));
        assertEquals(1, b.compareTo(a));
    }

    void compareTo_differentMonths_nonOverlapping() {
        ITimeSlot a = new TimeSlot(
                new DateTime(2026, 4, 30, 10, 0),
                new DateTime(2026, 4, 30, 11, 0)
        );
        ITimeSlot b = new TimeSlot(
                new DateTime(2026, 5, 1, 10, 0),
                new DateTime(2026, 5, 1, 11, 0)
        );

        assertEquals(-1, a.compareTo(b));
        assertEquals(1, b.compareTo(a));
    }

    void compareTo_differentYears_nonOverlapping() {
        ITimeSlot a = new TimeSlot(
                new DateTime(2025, 12, 31, 23, 0),
                new DateTime(2025, 12, 31, 23, 30)
        );
        ITimeSlot b = new TimeSlot(
                new DateTime(2026, 1, 1, 0, 0),
                new DateTime(2026, 1, 1, 1, 0)
        );

        assertEquals(-1, a.compareTo(b));
        assertEquals(1, b.compareTo(a));
    }

    void compareTo_zeroLengthAtBoundary_returnsMinusOneAndPlusOne() {
        ITimeSlot a = new TimeSlot(
                new DateTime(2026, 4, 20, 9, 0),
                new DateTime(2026, 4, 20, 10, 0)
        );
        ITimeSlot b = new TimeSlot(
                new DateTime(2026, 4, 20, 10, 0),
                new DateTime(2026, 4, 20, 10, 0)
        );

        assertEquals(-1, a.compareTo(b));
        assertEquals(1, b.compareTo(a));
    }

    void compareTo_zeroLengthInsideInterval_returnsZero() {
        ITimeSlot a = new TimeSlot(
                new DateTime(2026, 4, 20, 9, 0),
                new DateTime(2026, 4, 20, 11, 0)
        );
        ITimeSlot b = new TimeSlot(
                new DateTime(2026, 4, 20, 10, 0),
                new DateTime(2026, 4, 20, 10, 0)
        );

        assertEquals(0, a.compareTo(b));
        assertEquals(0, b.compareTo(a));
    }
}

class WorkshopTest extends PlainAssertions {

    private ITimeSlot createTimeSlot() {
        IDateTime start = new DateTime(2026, 5, 10, 9, 0);
        IDateTime end = new DateTime(2026, 5, 10, 11, 0);
        return new TimeSlot(start, end);
    }

    private ILocation createLocation() {
        return new Location(30, "Lab A", true, false, 20, new Schedule());
    }

    private Set<Integer> createSet(int... values) {
        Set<Integer> s = new BSTSet<>();
        for (int v : values)
            s.insert(v);
        return s;
    }

    void constructorShouldInitializeAllFields() {
        ITimeSlot timeSlot = createTimeSlot();
        ILocation location = createLocation();
        Set<Integer> advisorIds = createSet(1, 2);
        Set<Integer> studentIds = createSet(10, 11, 12);

        Workshop workshop = new Workshop(100, "AI Workshop", timeSlot, location, advisorIds, studentIds);

        assertEquals(100, workshop.getId());
        assertEquals("AI Workshop", workshop.getTitle());
        assertSame(timeSlot, workshop.getTimeSlot());
        assertSame(location, workshop.getLocation());
    }

    void constructorShouldCopyAdvisorIds() {
        Set<Integer> advisorIds = createSet(1, 2);
        Set<Integer> studentIds = createSet(10);

        Workshop workshop = new Workshop(101, "ML", createTimeSlot(), createLocation(), advisorIds, studentIds);

        Set<Integer> result = workshop.getAdvisorIds();

        assertEquals(2, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
    }

    void constructorShouldCopyStudentIds() {
        Set<Integer> advisorIds = createSet(1);
        Set<Integer> studentIds = createSet(10, 11, 12);

        Workshop workshop = new Workshop(102, "Data", createTimeSlot(), createLocation(), advisorIds, studentIds);

        Set<Integer> result = workshop.getStudentIds();

        assertEquals(3, result.size());
        assertTrue(result.contains(10));
        assertTrue(result.contains(11));
        assertTrue(result.contains(12));
    }

    void participantIdsShouldContainAllAdvisorsAndStudents() {
        Set<Integer> advisorIds = createSet(1, 2);
        Set<Integer> studentIds = createSet(10, 11, 12);

        Workshop workshop = new Workshop(103, "Networks", createTimeSlot(), createLocation(), advisorIds, studentIds);

        Set<Integer> participants = workshop.getParticipantIds();

        assertEquals(5, participants.size());
        assertTrue(participants.contains(1));
        assertTrue(participants.contains(2));
        assertTrue(participants.contains(10));
        assertTrue(participants.contains(11));
        assertTrue(participants.contains(12));
    }

    void participantIdsShouldRemoveDuplicatesAcrossAdvisorAndStudentSets() {
        Set<Integer> advisorIds = createSet(1, 2);
        Set<Integer> studentIds = createSet(2, 10);

        Workshop workshop = new Workshop(104, "Security", createTimeSlot(), createLocation(), advisorIds, studentIds);

        Set<Integer> participants = workshop.getParticipantIds();

        assertEquals(3, participants.size());
        assertTrue(participants.contains(1));
        assertTrue(participants.contains(2));
        assertTrue(participants.contains(10));
    }

    void workshopShouldDeepCopyAdvisorSet() {
        Set<Integer> advisorIds = createSet(1, 2);
        Set<Integer> studentIds = createSet(10);

        Workshop workshop = new Workshop(105, "SE", createTimeSlot(), createLocation(), advisorIds, studentIds);

        advisorIds.insert(99);

        assertFalse(workshop.getAdvisorIds().contains(99));
        assertFalse(workshop.getParticipantIds().contains(99));
    }

    void workshopShouldDeepCopyStudentSet() {
        Set<Integer> advisorIds = createSet(1);
        Set<Integer> studentIds = createSet(10, 11);

        Workshop workshop = new Workshop(106, "DB", createTimeSlot(), createLocation(), advisorIds, studentIds);

        studentIds.insert(99);

        assertFalse(workshop.getStudentIds().contains(99));
        assertFalse(workshop.getParticipantIds().contains(99));
    }

    void workshopShouldHandleEmptyAdvisorAndStudentSets() {
        Set<Integer> advisorIds = new BSTSet<>();
        Set<Integer> studentIds = new BSTSet<>();

        Workshop workshop = new Workshop(107, "Empty", createTimeSlot(), createLocation(), advisorIds, studentIds);

        assertEquals(0, workshop.getAdvisorIds().size());
        assertEquals(0, workshop.getStudentIds().size());
        assertEquals(0, workshop.getParticipantIds().size());
    }

    void compareToShouldUseEventId() {
        Workshop w1 = new Workshop(10, "A", createTimeSlot(), createLocation(), createSet(1), createSet(10));
        Workshop w2 = new Workshop(20, "B", createTimeSlot(), createLocation(), createSet(2), createSet(11));
        Workshop w3 = new Workshop(10, "C", createTimeSlot(), createLocation(), createSet(3), createSet(12));

        assertTrue(w1.compareTo(w2) < 0);
        assertTrue(w2.compareTo(w1) > 0);
        assertEquals(0, w1.compareTo(w3));
    }

    void returnedAdvisorSetShouldBeTheWorkshopSetContent() {
        Workshop workshop = new Workshop(108, "OS", createTimeSlot(), createLocation(), createSet(1, 2), createSet(10));

        Set<Integer> advisorIds = workshop.getAdvisorIds();

        assertTrue(advisorIds.contains(1));
        assertTrue(advisorIds.contains(2));
        assertFalse(advisorIds.contains(10));
    }

    void returnedStudentSetShouldBeTheWorkshopSetContent() {
        Workshop workshop = new Workshop(109, "Algo", createTimeSlot(), createLocation(), createSet(1), createSet(10, 11));

        Set<Integer> studentIds = workshop.getStudentIds();

        assertTrue(studentIds.contains(10));
        assertTrue(studentIds.contains(11));
        assertFalse(studentIds.contains(1));
    }
}

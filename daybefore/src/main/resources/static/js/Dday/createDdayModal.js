function backToOptionModal() {
    var modal = document.getElementById("createDdayModal")
    modal.style.display = "none"

    var optionModal = document.getElementById("createDdayOptionModal")
    optionModal.style.display = "block"
}

document.addEventListener('DOMContentLoaded', function () {
    var calendarEl = document.getElementById('calendar');
    var calendar = new FullCalendar.Calendar(calendarEl, {
        initialView: 'dayGridMonth'
    });
    calendar.render();
});
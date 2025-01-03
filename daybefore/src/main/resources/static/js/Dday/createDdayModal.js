function closeCreateDdayModal() {
    var modal = document.getElementById("createDdayModal")
    modal.style.display = "none"
}

document.addEventListener('DOMContentLoaded', function () {
    var calendarEl = document.getElementById('calendar');
    var calendar = new FullCalendar.Calendar(calendarEl, {
        initialView: 'dayGridMonth'
    });
    calendar.render();
});
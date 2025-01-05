function closeCreateDdayOptionModal() {
    var modal = document.getElementById("createDdayOptionModal")
    modal.style.display = "none"
}

function selectCompleteButton() {
    var optionModal = document.getElementById("createDdayOptionModal")
    optionModal.style.display = "none"

    var modal = document.getElementById("createDdayModal")
    modal.style.display = "block"
}

function showDdayDetailModal() {
    var modal = document.getElementById("DdayDetailModal")
    modal.style.display = "block"
}

function onOffNotification() {
    alert("디데이 알림 설정이 변경되었습니다.")
}



function deleteDday() {
    confirm("정말로 삭제하시겠습니까?")
}

document.addEventListener("DOMContentLoaded", () => {
    const DdayDetailModal = document.getElementById("DdayDetailModal")
    const DdayCard = document.getElementById("DdayCard")

    const updateToolbar = document.getElementById("updateToolbar")
    const onOffToolbar = document.getElementById("onOffToolbar")

    let isUpdateToolbarOpen = false
    let isDdayDetailModalOpen = false

    function openDdayDetailModal() {
        isDdayDetailModalOpen = true
        DdayDetailModal.style.display = "block"
    }
    function closeDdayDetailModal() {
        isUpdateToolbarOpen = false
        DdayDetailModal.style.display = "none"
    }
    function toggleDdayDetailModal(event) {
        event.stopPropagation()
        isDdayDetailModalOpen ? closeDdayDetailModal() : openDdayDetailModal()
    }
    DdayCard.addEventListener('click', toggleDdayDetailModal)


    function openUpdateToolbar() {
        isUpdateToolbarOpen = true
        updateToolbar.style.display = "block"
        onOffToolbar.classList.add("onOffToolbar-active")
    }
    function closeUpdateToolbar() {
        isUpdateToolbarOpen = false
        updateToolbar.style.display = "none"
        onOffToolbar.classList.remove("onOffToolbar-active")
    }
    function toggleUpdateToolbar(event) {
        event.stopPropagation()
        isUpdateToolbarOpen ? closeUpdateToolbar() : openUpdateToolbar()
    }
    onOffToolbar.addEventListener("click", toggleUpdateToolbar)

    function clickOutside(event) {
        if (isUpdateToolbarOpen && !updateToolbar.contains(event.target)) {
            closeUpdateToolbar()
        }
        if (isDdayDetailModalOpen && DdayDetailModal.contains(event.target)) {
            closeDdayDetailModal()
        }
        
    }
    document.addEventListener('click', clickOutside)
});

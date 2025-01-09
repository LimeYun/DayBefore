const csrfToken = "[[${_csrf.token}]]"

// 아이디 중복확인
function checkId() {
    const id = document.getElementById("id").value;

    if (!id) {
        alert("아이디를 입력해주세요.");
        return;
    }

    try {
        const response = fetch(`/check/${id}`, {
            method: 'GET',
            headers: {
                'X-CSRF-TOKEN': csrfToken
            }
        })
        if (response.ok) {
            const result = response.text()
            if (result == 'true') {
                alert('사용 가능한 아이디 입니다.')
                return true;
            }
            else {
                alert('중복된 아이디 입니다.')
                return false;
            }
        }
    } catch (error) {
        alert('아이디 중복 확인 중 오류가 발생했습니다.')
        return false;
    }
}

// 폼 제출 확인
function checkSubmit(event) {
    event.preventDefault()

    // 주소 병합
    const addressNo = document.getElementById("addressNo").value;
    const addressBasic = document.getElementById("addressBasic").value;
    const addressDetail = document.getElementById("addressDetail").value;
    const address = `(${addressNo}) ${addressBasic} ${addressDetail}`;

    // 휴대폰번호 병합
    const phone1 = document.getElementById('phone1').value;
    const phone2 = document.getElementById('phone2').value;
    const phone3 = document.getElementById('phone3').value;
    const phone = `${phone1}${phone2}${phone3}`;

    // 이메일 병합
    const email1 = document.getElementById('email1').value;
    const email2 = document.getElementById('email2').value;
    const email = `${email1}@${email2}`;

    // 생년월일 병합
    const year = document.getElementById('year').value;
    const month = document.getElementById('month').value;
    const day = document.getElementById('day').value;
    const birth = `${year}${month}${day}`;

    document.getElementById('address').value = address;
    document.getElementById('phone').value = phone;
    document.getElementById('email').value = email;
    document.getElementById('birth').value = birth;

    // 아이디 중복 확인
    const isIdAvailable = checkId();
    if (!isIdAvailable) {
        return;
    }

    // 아이디 유효성 검사
    const id = document.getElementById("id").value;
    const idConfirm = /^[a-zA-Z0-9]{6,16}$/;

    if (!idConfirm.test(id)) {
        alert("아이디는 영문과 숫자만, 6~16자로 입력해주세요.");
        return false;
    }
    else {
        alert("사용 가능한 아이디 입니다.");
        return true;
    }

    // 비밀번호 확인
    const password = document.getElementById('password').value;
    const passwordCheck = document.getElementById('passwordCheck').value;
    if (password !== passwordCheck) {
        alert('비밀번호가 일치하지 않습니다.');
        return;
    }


}
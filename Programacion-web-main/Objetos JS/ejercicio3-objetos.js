const userData = {
    user1: {
        email: "usuario1@usuario.com",
        password: "password1",
        userName: "User1 Name1",
    },
    user2: {
        email: "usuario2@usuario.com",
        password: "password2",
        userName: "User2 Name2",
    },
    user3: {
        email: "usuario3@usuario.com",
        password: "password3",
        userName: "User3 Name3",
    },
}


// Login email and password
function login(email, password) {
    for (let i in userData) {
        if (userData[i].email === email && userData[i].password === password) {
            return userData[i].userName;
        }
    }
    return "Usuario no encontrado o contraseña incorrecta";
}

//Comprobación de usuario
// let user1 = login("usuario1@usuario.com", "password1");
// console.log(user1);


let loginFor = document.querySelector("#loginform");
loginFor.addEventListener("submit", function (event) {
    event.preventDefault();

    let inputEmail = document.querySelector("#email").value;
    console.log(inputEmail);
    let inputPassword = document.querySelector("#password").value;
    console.log(inputPassword);
});
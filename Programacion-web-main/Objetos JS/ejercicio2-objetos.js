// Definir objeto que represente un:
// usuario con
//  - correo
//  - contraseña
//  - nombre usuario


// let userData = {
//     emial: "usuario@usuario.com",
//     password: "password",
//     userName: "User Name",
// }

// console.log({userData});

// Objeto con usuarios y parametros
let userData = {
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


// Listado de usuarios
function getInfo(userData) {
    for (let i in userData) {
        document.write(userData[i].userName+"<br>");
    }
}

getInfo(userData);


// Login
function login(user) {
    for (i = 0; i < user.length; i++) {
        if (user[i].emial === user.emial && user[i].password === user.password) {
            return user[i].userName;
        }
    }
}
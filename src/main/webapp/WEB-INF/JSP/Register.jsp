<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>
    <div class="text-center"> <h1>ajouter un employé</h1></div>

    <div class="text-center">
        <div class="container">
            <div class="card-header">
                <form action="/demo/add" method="post">
                    <input type="text" placeholder="nom" name="lastName" required>
                    <br><br>
                    <input type="text" placeholder="prénom" name="firstName" required>
                    <br><br>
                    <input type="text" placeholder="email" name="mail" required>
                    <br><br>
                    <input type="password" placeholder="mot de passe" name="password" required>
                    <br><br>
                    <input type="text" placeholder="privilège" name="privilege" required>
                    <br><br>
                    <input type="date" placeholder="date d'embauche" name="hireDate" required>
                    <br><br>
                    <p>Privilèges:</p>
                    <input type="radio" id="user" name="typeUser" value="USER">
                    <label for="user">employé</label>
                    <input type="radio" id="admin" name="typeUser" value="ADMIN">
                    <label for="admin">administrateur</label>
                    <div class="text-center"><button type="submit" class="btn btn-primary text-center" name="envoyer">valider</button></div>
                </form>
            </div>
        </div>
    </div>
    <div class="text-center"  >
        <h3> déjà un compte ? </h3>
        <a href="Login.html">connectez-vous</a>
    </div>




    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    

</body>
</html>
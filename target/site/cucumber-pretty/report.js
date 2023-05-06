$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Profil/feature-01-VisiMisi.feature");
formatter.feature({
  "line": 2,
  "name": "Profile",
  "description": "",
  "id": "profile",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Profile"
    }
  ]
});
formatter.before({
  "duration": 23396999728,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Profile visi-misi",
  "description": "",
  "id": "profile;profile-visi-misi",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User open the website perpusnas home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User hover on the navbar profile",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User hover on the navbar kelembagaan",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User click submenu visi-misi",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User already on page visi-misi",
  "keyword": "Then "
});
formatter.match({
  "location": "VisiMisiPage.userOpenTheWebsitePerpusnasHomePage()"
});
formatter.result({
  "duration": 3973596759,
  "status": "passed"
});
formatter.match({
  "location": "VisiMisiPage.userHoverOnTheNavbarProfile()"
});
formatter.result({
  "duration": 3347311391,
  "status": "passed"
});
formatter.match({
  "location": "VisiMisiPage.userHoverOnTheNavbarKelembagaan()"
});
formatter.result({
  "duration": 3139942420,
  "status": "passed"
});
formatter.match({
  "location": "VisiMisiPage.userClickSubmenuVisiMisi()"
});
formatter.result({
  "duration": 3225903995,
  "status": "passed"
});
formatter.match({
  "location": "VisiMisiPage.userAlreadyOnPageVisiMisi()"
});
formatter.result({
  "duration": 2079929600,
  "status": "passed"
});
formatter.after({
  "duration": 2223242798,
  "status": "passed"
});
});
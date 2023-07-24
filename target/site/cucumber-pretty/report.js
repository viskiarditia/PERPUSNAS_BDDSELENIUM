$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Beranda/BintangPusnasEdu.feature");
formatter.feature({
  "line": 2,
  "name": "Testing menu BintangPusnasEdu",
  "description": "",
  "id": "testing-menu-bintangpusnasedu",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Perpusnas"
    },
    {
      "line": 1,
      "name": "@Beranda"
    },
    {
      "line": 1,
      "name": "@BintangPusnasEdu"
    }
  ]
});
formatter.before({
  "duration": 24496363459,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User open website perpusnas",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click Menu Beranda",
  "keyword": "When "
});
formatter.match({
  "location": "BerandaSteps.userOpenWebsitePerpusnas()"
});
formatter.result({
  "duration": 4280552333,
  "status": "passed"
});
formatter.match({
  "location": "BerandaSteps.clickMenuBeranda()"
});
formatter.result({
  "duration": 5364159417,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "\"Users Click menu BintangPusnasEdu\"",
  "description": "",
  "id": "testing-menu-bintangpusnasedu;\"users-click-menu-bintangpusnasedu\"",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Click menu BintangPusnasEdu and user look with hover cursor to all fitur",
  "keyword": "Then "
});
formatter.match({
  "location": "BintangPusnasEduSteps.clickMenuBintangPusnasEduAndUserLookWithHoverCursorToAllFitur()"
});
formatter.result({
  "duration": 9766526000,
  "status": "passed"
});
formatter.after({
  "duration": 2119469792,
  "status": "passed"
});
});
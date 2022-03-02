rootProject.name = "application"

val projectPathMain = "app"

val projectPathHome = ":features:home"
val projectPathForm = ":features:form"
val projectPathList = ":features:list"

val projectPathBaseUi = ":layer:baseUi"

include(
    projectPathMain,
    projectPathBaseUi,
    projectPathHome,
    projectPathForm,
    projectPathList
)

val featureDir  = File(rootDir, "modules/features")
val layerDir    = File(rootDir, "modules/layer")

project(projectPathBaseUi).projectDir = File(layerDir, "baseUi")

project(projectPathHome).projectDir = File(featureDir, "home")
project(projectPathForm).projectDir = File(featureDir, "form")
project(projectPathList).projectDir = File(featureDir, "list")



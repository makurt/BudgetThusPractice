
class Config

    # Build type
    BUILD_TYPE_DEBUG = "debug"
    BUILD_TYPE_RELEASE = "release"

    # Gradle build task type
    BUILD_TASK_ASSEMBLE = "assemble"
    BUILD_TASK_BUNDLE = "bundle"

    # Path to generated versioning file (version name)
    VERSIONING_FILE_PATH = "../release/version.properties"

    # Version bump tasks
    BUMP_BUILD = "incrementBuild"
    BUMP_PATCH = "incrementPatch"
    BUMP_MINOR = "incrementMinor"
    BUMP_MAJOR = "incrementMajor"

    # Project repository git url
    GIT_REPO = "git@github.com:makurt/BudgetThusPractice.git" "git@github.com:makurt/BudgetThusPractice.git"
    GIT_REPO_TOKEN_URL_SUFFIX = "@github.com/makurt/BudgetThusPractice.git"

end
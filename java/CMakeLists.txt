INCLUDE(${SWIG_USE_FILE})

find_package(JNI REQUIRED)

INCLUDE_DIRECTORIES(${JNI_INCLUDE_DIRS})

SET(JAVA_MODULE_NAME PapillonCoreJava)

SET_SOURCE_FILES_PROPERTIES(../Papillon.i PROPERTIES CPLUSPLUS ON)

# Very important on Linux otherwise pint64 gets defined incorrectly
if(UNIX)
    SET(CMAKE_SWIG_FLAGS -DSWIGWORDSIZE64)
endif()

# Configure the java package
SET(JAVA_PACKAGE_PATH "")

if(JAVA_PACKAGE)
    MESSAGE( STATUS "Custom JAVA_PACKAGE:" ${JAVA_PACKAGE} )
else()
    # use the default package
    SET(JAVA_PACKAGE "net.videoai.papillon.core")
    MESSAGE( STATUS "Use default JAVA_PACKAGE:" ${JAVA_PACKAGE} )
endif()

SET(CMAKE_SWIG_FLAGS ${CMAKE_SWIG_FLAGS} -package ${JAVA_PACKAGE})
string(REPLACE "\." "/" JAVA_PACKAGE_PATH "${JAVA_PACKAGE}")

SET(CMAKE_SWIG_OUTDIR ${CMAKE_CURRENT_SOURCE_DIR}/PapillonCoreJava/${JAVA_PACKAGE_PATH})

if(POLICY CMP0026)
  cmake_policy(SET CMP0026 OLD)
endif()


SET(SWIG_MODULE_${JAVA_MODULE_NAME}_EXTRA_DEPS ${PapillonCoreLibPath})

SWIG_ADD_MODULE(${JAVA_MODULE_NAME} java ../Papillon.i)

SWIG_LINK_LIBRARIES(${JAVA_MODULE_NAME} ${PAPILLON_LIBRARIES})

if(WIN32)
    INSTALL(TARGETS ${JAVA_MODULE_NAME} DESTINATION bin)
    INSTALL(DIRECTORY PapillonCoreJava DESTINATION lib/java FILES_MATCHING PATTERN "*.java" )
else()
    INSTALL(TARGETS ${JAVA_MODULE_NAME} DESTINATION lib)
    INSTALL(DIRECTORY PapillonCoreJava DESTINATION lib/java FILES_MATCHING PATTERN "*.java" )
endif()

INSTALL(FILES ExampleCoreImage.java ExampleFaceDetector.java ExampleFaceRecognition.java DESTINATION examples/java)


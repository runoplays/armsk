LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := legacy

sources := 3dtracker.cpp \
    auxutils.cpp \
    calcimagehomography.cpp \
    calibfilter.cpp \
    camshift.cpp \
    clique.cpp \
    condens.cpp \
    contourtree.cpp \
    correspond.cpp \
    corrimages.cpp \
    createhandmask.cpp \
    decomppoly.cpp \
    dominants.cpp \
    dpstereo.cpp \
    eigenobjects.cpp \
    enmin.cpp \
    epilines.cpp \
    extendededges.cpp \
    face.cpp \
    facedetection.cpp \
    facetemplate.cpp \
    findface.cpp \
    findhandregion.cpp \
    hmm1d.cpp \
    hmm.cpp \
    hmmobs.cpp \
    image.cpp \
    lcm.cpp \
    lee.cpp \
    levmar.cpp \
    levmarprojbandle.cpp \
    levmartrif.cpp \
    lines.cpp \
    lmeds.cpp \
    mat.cpp \
    morphcontours.cpp \
    morphing.cpp \
    pgh.cpp \
    precomp.cpp \
    prewarp.cpp \
    scanlines.cpp \
    segment.cpp \
    snakes.cpp \
    subdiv2.cpp \
    texture.cpp \
    trifocal.cpp \
    vecfacetracking.cpp \
    video.cpp
  
LOCAL_SRC_FILES := $(sources:%=src/%) 

LOCAL_C_INCLUDES :=  \
        $(OpenCVInclude) \
        $(LOCAL_PATH)/src/ 
        


include $(BUILD_STATIC_LIBRARY)

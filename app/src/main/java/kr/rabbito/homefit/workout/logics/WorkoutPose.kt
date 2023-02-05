package kr.rabbito.homefit.workout.logics

import com.google.mlkit.vision.pose.Pose

abstract class WorkoutPose {
    open fun calculate(pose: Pose) {}
}
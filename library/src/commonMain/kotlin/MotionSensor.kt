package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MotionSensor: ImageVector
    get() {
        if (_MotionSensor != null) {
            return _MotionSensor!!
        }
        _MotionSensor = ImageVector.Builder(
            name = "MotionSensor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 0.2f)
                curveTo(9f, 0.2f, 8.2f, 1f, 8.2f, 2f)
                curveTo(8.2f, 3f, 9f, 3.8f, 10f, 3.8f)
                curveTo(11f, 3.8f, 11.8f, 3f, 11.8f, 2f)
                curveTo(11.8f, 1f, 11f, 0.2f, 10f, 0.2f)
                moveTo(15.67f, 1f)
                arcTo(7.33f, 7.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 8.33f)
                verticalLineTo(7f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 1f)
                horizontalLineTo(15.67f)
                moveTo(18.33f, 1f)
                curveTo(18.33f, 3.58f, 20.42f, 5.67f, 23f, 5.67f)
                verticalLineTo(4.33f)
                curveTo(21.16f, 4.33f, 19.67f, 2.84f, 19.67f, 1f)
                horizontalLineTo(18.33f)
                moveTo(21f, 1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(21f)
                moveTo(7.92f, 4.03f)
                curveTo(7.75f, 4.03f, 7.58f, 4.06f, 7.42f, 4.11f)
                lineTo(2f, 5.8f)
                verticalLineTo(11f)
                horizontalLineTo(3.8f)
                verticalLineTo(7.33f)
                lineTo(5.91f, 6.67f)
                lineTo(2f, 22f)
                horizontalLineTo(3.8f)
                lineTo(6.67f, 13.89f)
                lineTo(9f, 17f)
                verticalLineTo(22f)
                horizontalLineTo(10.8f)
                verticalLineTo(15.59f)
                lineTo(8.31f, 11.05f)
                lineTo(9.04f, 8.18f)
                lineTo(10.12f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(8.2f)
                horizontalLineTo(11.38f)
                lineTo(9.38f, 4.87f)
                curveTo(9.08f, 4.37f, 8.54f, 4.03f, 7.92f, 4.03f)
                close()
            }
        }.build()

        return _MotionSensor!!
    }

@Suppress("ObjectPropertyName")
private var _MotionSensor: ImageVector? = null

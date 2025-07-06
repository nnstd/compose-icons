package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MotionSensorOff: ImageVector
    get() {
        if (_MotionSensorOff != null) {
            return _MotionSensorOff!!
        }
        _MotionSensorOff = ImageVector.Builder(
            name = "MotionSensorOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.4f, 8.2f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(13.2f)
                lineTo(11.4f, 8.2f)
                moveTo(19.67f, 1f)
                horizontalLineTo(18.33f)
                curveTo(18.33f, 3.58f, 20.42f, 5.67f, 23f, 5.67f)
                verticalLineTo(4.33f)
                curveTo(21.16f, 4.33f, 19.67f, 2.84f, 19.67f, 1f)
                moveTo(21f, 1f)
                curveTo(21f, 2.11f, 21.9f, 3f, 23f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(21f)
                moveTo(17f, 1f)
                horizontalLineTo(15.67f)
                curveTo(15.67f, 5.05f, 18.95f, 8.33f, 23f, 8.33f)
                verticalLineTo(7f)
                curveTo(19.69f, 7f, 17f, 4.31f, 17f, 1f)
                moveTo(10f, 3.8f)
                curveTo(11f, 3.8f, 11.8f, 3f, 11.8f, 2f)
                reflectiveCurveTo(11f, 0.2f, 10f, 0.2f)
                reflectiveCurveTo(8.2f, 1f, 8.2f, 2f)
                reflectiveCurveTo(9f, 3.8f, 10f, 3.8f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3.46f, 5.35f)
                lineTo(2f, 5.8f)
                verticalLineTo(11f)
                horizontalLineTo(3.8f)
                verticalLineTo(7.33f)
                lineTo(5.05f, 6.94f)
                lineTo(5.68f, 7.57f)
                lineTo(2f, 22f)
                horizontalLineTo(3.8f)
                lineTo(6.67f, 13.89f)
                lineTo(9f, 17f)
                verticalLineTo(22f)
                horizontalLineTo(10.8f)
                verticalLineTo(15.59f)
                lineTo(8.31f, 11.05f)
                lineTo(8.5f, 10.37f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(9.38f, 4.87f)
                curveTo(9.08f, 4.37f, 8.54f, 4.03f, 7.92f, 4.03f)
                curveTo(7.75f, 4.03f, 7.58f, 4.06f, 7.42f, 4.11f)
                lineTo(7.34f, 4.14f)
                lineTo(11.35f, 8.15f)
                lineTo(9.38f, 4.87f)
                close()
            }
        }.build()

        return _MotionSensorOff!!
    }

@Suppress("ObjectPropertyName")
private var _MotionSensorOff: ImageVector? = null

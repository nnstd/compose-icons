package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotOff: ImageVector
    get() {
        if (_RobotOff != null) {
            return _RobotOff!!
        }
        _RobotOff = ImageVector.Builder(
            name = "RobotOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 15f)
                verticalLineTo(18f)
                curveTo(23f, 18.5f, 22.64f, 18.88f, 22.17f, 18.97f)
                lineTo(18.97f, 15.77f)
                curveTo(19f, 15.68f, 19f, 15.59f, 19f, 15.5f)
                curveTo(19f, 14.12f, 17.88f, 13f, 16.5f, 13f)
                curveTo(16.41f, 13f, 16.32f, 13f, 16.23f, 13.03f)
                lineTo(10.2f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(5.73f)
                curveTo(10.4f, 5.39f, 10f, 4.74f, 10f, 4f)
                curveTo(10f, 2.9f, 10.9f, 2f, 12f, 2f)
                reflectiveCurveTo(14f, 2.9f, 14f, 4f)
                curveTo(14f, 4.74f, 13.6f, 5.39f, 13f, 5.73f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                curveTo(17.87f, 7f, 21f, 10.13f, 21f, 14f)
                horizontalLineTo(22f)
                curveTo(22.55f, 14f, 23f, 14.45f, 23f, 15f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.89f, 21.78f)
                curveTo(19.62f, 21.92f, 19.32f, 22f, 19f, 22f)
                horizontalLineTo(5f)
                curveTo(3.9f, 22f, 3f, 21.11f, 3f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                curveTo(1.45f, 19f, 1f, 18.55f, 1f, 18f)
                verticalLineTo(15f)
                curveTo(1f, 14.45f, 1.45f, 14f, 2f, 14f)
                horizontalLineTo(3f)
                curveTo(3f, 11.53f, 4.29f, 9.36f, 6.22f, 8.11f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(10f, 15.5f)
                curveTo(10f, 14.12f, 8.88f, 13f, 7.5f, 13f)
                reflectiveCurveTo(5f, 14.12f, 5f, 15.5f)
                reflectiveCurveTo(6.12f, 18f, 7.5f, 18f)
                reflectiveCurveTo(10f, 16.88f, 10f, 15.5f)
                moveTo(16.07f, 17.96f)
                lineTo(14.04f, 15.93f)
                curveTo(14.23f, 16.97f, 15.04f, 17.77f, 16.07f, 17.96f)
                close()
            }
        }.build()

        return _RobotOff!!
    }

@Suppress("ObjectPropertyName")
private var _RobotOff: ImageVector? = null

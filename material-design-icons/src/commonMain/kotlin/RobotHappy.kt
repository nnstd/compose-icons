package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotHappy: ImageVector
    get() {
        if (_RobotHappy != null) {
            return _RobotHappy!!
        }
        _RobotHappy = ImageVector.Builder(
            name = "RobotHappy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 14f)
                horizontalLineTo(21f)
                curveTo(21f, 10.13f, 17.87f, 7f, 14f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(5.73f)
                curveTo(13.6f, 5.39f, 14f, 4.74f, 14f, 4f)
                curveTo(14f, 2.9f, 13.11f, 2f, 12f, 2f)
                reflectiveCurveTo(10f, 2.9f, 10f, 4f)
                curveTo(10f, 4.74f, 10.4f, 5.39f, 11f, 5.73f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                curveTo(6.13f, 7f, 3f, 10.13f, 3f, 14f)
                horizontalLineTo(2f)
                curveTo(1.45f, 14f, 1f, 14.45f, 1f, 15f)
                verticalLineTo(18f)
                curveTo(1f, 18.55f, 1.45f, 19f, 2f, 19f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                curveTo(3f, 21.11f, 3.9f, 22f, 5f, 22f)
                horizontalLineTo(19f)
                curveTo(20.11f, 22f, 21f, 21.11f, 21f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                curveTo(22.55f, 19f, 23f, 18.55f, 23f, 18f)
                verticalLineTo(15f)
                curveTo(23f, 14.45f, 22.55f, 14f, 22f, 14f)
                moveTo(9.79f, 16.5f)
                curveTo(9.4f, 15.62f, 8.53f, 15f, 7.5f, 15f)
                reflectiveCurveTo(5.6f, 15.62f, 5.21f, 16.5f)
                curveTo(5.08f, 16.19f, 5f, 15.86f, 5f, 15.5f)
                curveTo(5f, 14.12f, 6.12f, 13f, 7.5f, 13f)
                reflectiveCurveTo(10f, 14.12f, 10f, 15.5f)
                curveTo(10f, 15.86f, 9.92f, 16.19f, 9.79f, 16.5f)
                moveTo(18.79f, 16.5f)
                curveTo(18.4f, 15.62f, 17.5f, 15f, 16.5f, 15f)
                reflectiveCurveTo(14.6f, 15.62f, 14.21f, 16.5f)
                curveTo(14.08f, 16.19f, 14f, 15.86f, 14f, 15.5f)
                curveTo(14f, 14.12f, 15.12f, 13f, 16.5f, 13f)
                reflectiveCurveTo(19f, 14.12f, 19f, 15.5f)
                curveTo(19f, 15.86f, 18.92f, 16.19f, 18.79f, 16.5f)
                close()
            }
        }.build()

        return _RobotHappy!!
    }

@Suppress("ObjectPropertyName")
private var _RobotHappy: ImageVector? = null

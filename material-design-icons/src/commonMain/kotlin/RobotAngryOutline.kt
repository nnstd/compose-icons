package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotAngryOutline: ImageVector
    get() {
        if (_RobotAngryOutline != null) {
            return _RobotAngryOutline!!
        }
        _RobotAngryOutline = ImageVector.Builder(
            name = "RobotAngryOutline",
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
                moveTo(21f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                curveTo(5f, 11.24f, 7.24f, 9f, 10f, 9f)
                horizontalLineTo(14f)
                curveTo(16.76f, 9f, 19f, 11.24f, 19f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                moveTo(17.5f, 15.5f)
                curveTo(17.5f, 16.61f, 16.61f, 17.5f, 15.5f, 17.5f)
                curveTo(14.53f, 17.5f, 13.73f, 16.81f, 13.54f, 15.9f)
                lineTo(16.5f, 13.78f)
                curveTo(17.1f, 14.13f, 17.5f, 14.76f, 17.5f, 15.5f)
                moveTo(7.5f, 13.78f)
                lineTo(10.46f, 15.9f)
                curveTo(10.28f, 16.81f, 9.47f, 17.5f, 8.5f, 17.5f)
                curveTo(7.4f, 17.5f, 6.5f, 16.61f, 6.5f, 15.5f)
                curveTo(6.5f, 14.76f, 6.9f, 14.13f, 7.5f, 13.78f)
                close()
            }
        }.build()

        return _RobotAngryOutline!!
    }

@Suppress("ObjectPropertyName")
private var _RobotAngryOutline: ImageVector? = null

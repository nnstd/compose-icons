package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotHappyOutline: ImageVector
    get() {
        if (_RobotHappyOutline != null) {
            return _RobotHappyOutline!!
        }
        _RobotHappyOutline = ImageVector.Builder(
            name = "RobotHappyOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 15.5f)
                curveTo(10.5f, 15.87f, 10.4f, 16.2f, 10.22f, 16.5f)
                curveTo(9.88f, 15.91f, 9.24f, 15.5f, 8.5f, 15.5f)
                reflectiveCurveTo(7.12f, 15.91f, 6.78f, 16.5f)
                curveTo(6.61f, 16.2f, 6.5f, 15.87f, 6.5f, 15.5f)
                curveTo(6.5f, 14.4f, 7.4f, 13.5f, 8.5f, 13.5f)
                reflectiveCurveTo(10.5f, 14.4f, 10.5f, 15.5f)
                moveTo(23f, 15f)
                verticalLineTo(18f)
                curveTo(23f, 18.55f, 22.55f, 19f, 22f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                curveTo(21f, 21.11f, 20.11f, 22f, 19f, 22f)
                horizontalLineTo(5f)
                curveTo(3.9f, 22f, 3f, 21.11f, 3f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                curveTo(1.45f, 19f, 1f, 18.55f, 1f, 18f)
                verticalLineTo(15f)
                curveTo(1f, 14.45f, 1.45f, 14f, 2f, 14f)
                horizontalLineTo(3f)
                curveTo(3f, 10.13f, 6.13f, 7f, 10f, 7f)
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
                moveTo(21f, 16f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                curveTo(19f, 11.24f, 16.76f, 9f, 14f, 9f)
                horizontalLineTo(10f)
                curveTo(7.24f, 9f, 5f, 11.24f, 5f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                moveTo(15.5f, 13.5f)
                curveTo(14.4f, 13.5f, 13.5f, 14.4f, 13.5f, 15.5f)
                curveTo(13.5f, 15.87f, 13.61f, 16.2f, 13.78f, 16.5f)
                curveTo(14.12f, 15.91f, 14.76f, 15.5f, 15.5f, 15.5f)
                reflectiveCurveTo(16.88f, 15.91f, 17.22f, 16.5f)
                curveTo(17.4f, 16.2f, 17.5f, 15.87f, 17.5f, 15.5f)
                curveTo(17.5f, 14.4f, 16.61f, 13.5f, 15.5f, 13.5f)
                close()
            }
        }.build()

        return _RobotHappyOutline!!
    }

@Suppress("ObjectPropertyName")
private var _RobotHappyOutline: ImageVector? = null

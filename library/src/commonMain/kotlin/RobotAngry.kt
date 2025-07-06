package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotAngry: ImageVector
    get() {
        if (_RobotAngry != null) {
            return _RobotAngry!!
        }
        _RobotAngry = ImageVector.Builder(
            name = "RobotAngry",
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
                moveTo(7.5f, 18f)
                curveTo(6.12f, 18f, 5f, 16.88f, 5f, 15.5f)
                curveTo(5f, 14.68f, 5.4f, 13.96f, 6f, 13.5f)
                lineTo(9.83f, 16.38f)
                curveTo(9.5f, 17.32f, 8.57f, 18f, 7.5f, 18f)
                moveTo(16.5f, 18f)
                curveTo(15.43f, 18f, 14.5f, 17.32f, 14.17f, 16.38f)
                lineTo(18f, 13.5f)
                curveTo(18.6f, 13.96f, 19f, 14.68f, 19f, 15.5f)
                curveTo(19f, 16.88f, 17.88f, 18f, 16.5f, 18f)
                close()
            }
        }.build()

        return _RobotAngry!!
    }

@Suppress("ObjectPropertyName")
private var _RobotAngry: ImageVector? = null

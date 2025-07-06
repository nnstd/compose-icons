package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotVacuumAlert: ImageVector
    get() {
        if (_RobotVacuumAlert != null) {
            return _RobotVacuumAlert!!
        }
        _RobotVacuumAlert = ImageVector.Builder(
            name = "RobotVacuumAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                curveTo(12.6f, 2f, 15.2f, 3.1f, 17.1f, 4.9f)
                lineTo(15.7f, 6.3f)
                curveTo(14.1f, 4.8f, 12.1f, 4f, 10f, 4f)
                reflectiveCurveTo(5.8f, 4.8f, 4.3f, 6.3f)
                lineTo(2.9f, 4.9f)
                curveTo(4.8f, 3.1f, 7.4f, 2f, 10f, 2f)
                moveTo(1.7f, 6.5f)
                lineTo(3.2f, 7.9f)
                curveTo(2.4f, 9.2f, 2f, 10.6f, 2f, 12f)
                curveTo(2f, 16.4f, 5.6f, 20f, 10f, 20f)
                reflectiveCurveTo(18f, 16.4f, 18f, 12f)
                curveTo(18f, 10.6f, 17.6f, 9.2f, 16.9f, 7.9f)
                lineTo(18.4f, 6.5f)
                curveTo(19.4f, 8.1f, 20f, 10f, 20f, 12f)
                curveTo(20f, 17.5f, 15.5f, 22f, 10f, 22f)
                reflectiveCurveTo(0f, 17.5f, 0f, 12f)
                curveTo(0f, 10f, 0.6f, 8.1f, 1.7f, 6.5f)
                moveTo(10f, 6f)
                curveTo(13.3f, 6f, 16f, 8.7f, 16f, 12f)
                curveTo(16f, 13.6f, 15.4f, 15.1f, 14.2f, 16.2f)
                lineTo(12.8f, 14.8f)
                curveTo(12.1f, 15.6f, 11.1f, 16f, 10f, 16f)
                reflectiveCurveTo(7.9f, 15.6f, 7.2f, 14.8f)
                lineTo(5.8f, 16.2f)
                curveTo(4.6f, 15.1f, 4f, 13.6f, 4f, 12f)
                curveTo(4f, 8.7f, 6.7f, 6f, 10f, 6f)
                moveTo(10f, 8f)
                curveTo(9.4f, 8f, 9f, 8.4f, 9f, 9f)
                reflectiveCurveTo(9.4f, 10f, 10f, 10f)
                reflectiveCurveTo(11f, 9.6f, 11f, 9f)
                reflectiveCurveTo(10.6f, 8f, 10f, 8f)
                moveTo(22f, 12f)
                verticalLineTo(7f)
                horizontalLineTo(24f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                moveTo(22f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(24f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _RobotVacuumAlert!!
    }

@Suppress("ObjectPropertyName")
private var _RobotVacuumAlert: ImageVector? = null

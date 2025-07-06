package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotVacuumVariantAlert: ImageVector
    get() {
        if (_RobotVacuumVariantAlert != null) {
            return _RobotVacuumVariantAlert!!
        }
        _RobotVacuumVariantAlert = ImageVector.Builder(
            name = "RobotVacuumVariantAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                curveTo(1.9f, 3f, 1f, 3.9f, 1f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                curveTo(19f, 3.9f, 18.1f, 3f, 17f, 3f)
                horizontalLineTo(3f)
                moveTo(6f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                moveTo(1f, 9f)
                verticalLineTo(12f)
                curveTo(1f, 17f, 5f, 21f, 10f, 21f)
                reflectiveCurveTo(19f, 17f, 19f, 12f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                curveTo(17f, 15.9f, 13.9f, 19f, 10f, 19f)
                reflectiveCurveTo(3f, 15.9f, 3f, 12f)
                verticalLineTo(9f)
                horizontalLineTo(1f)
                moveTo(10f, 12f)
                curveTo(8.6f, 12f, 7.5f, 13.1f, 7.5f, 14.5f)
                reflectiveCurveTo(8.6f, 17f, 10f, 17f)
                reflectiveCurveTo(12.5f, 15.9f, 12.5f, 14.5f)
                reflectiveCurveTo(11.4f, 12f, 10f, 12f)
                moveTo(21f, 12f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                moveTo(21f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _RobotVacuumVariantAlert!!
    }

@Suppress("ObjectPropertyName")
private var _RobotVacuumVariantAlert: ImageVector? = null

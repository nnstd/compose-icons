package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeLockOutline: ImageVector
    get() {
        if (_EyeLockOutline != null) {
            return _EyeLockOutline!!
        }
        _EyeLockOutline = ImageVector.Builder(
            name = "EyeLockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 17f)
                verticalLineTo(15.5f)
                curveTo(20.8f, 14.1f, 19.4f, 13f, 18f, 13f)
                reflectiveCurveTo(15.2f, 14.1f, 15.2f, 15.5f)
                verticalLineTo(17f)
                curveTo(14.6f, 17f, 14f, 17.6f, 14f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(14f, 22.4f, 14.6f, 23f, 15.2f, 23f)
                horizontalLineTo(20.7f)
                curveTo(21.4f, 23f, 22f, 22.4f, 22f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(22f, 17.6f, 21.4f, 17f, 20.8f, 17f)
                moveTo(19.5f, 17f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.5f)
                curveTo(16.5f, 14.7f, 17.2f, 14.2f, 18f, 14.2f)
                reflectiveCurveTo(19.5f, 14.7f, 19.5f, 15.5f)
                verticalLineTo(17f)
                moveTo(15f, 12f)
                curveTo(14.1f, 12.7f, 13.5f, 13.6f, 13.3f, 14.7f)
                curveTo(12.9f, 14.9f, 12.5f, 15f, 12f, 15f)
                curveTo(10.3f, 15f, 9f, 13.7f, 9f, 12f)
                reflectiveCurveTo(10.3f, 9f, 12f, 9f)
                reflectiveCurveTo(15f, 10.3f, 15f, 12f)
                moveTo(12f, 19.5f)
                curveTo(7f, 19.5f, 2.7f, 16.4f, 1f, 12f)
                curveTo(2.7f, 7.6f, 7f, 4.5f, 12f, 4.5f)
                reflectiveCurveTo(21.3f, 7.6f, 23f, 12f)
                curveTo(22.8f, 12.5f, 22.5f, 13f, 22.3f, 13.5f)
                curveTo(21.9f, 12.8f, 21.4f, 12.2f, 20.7f, 11.8f)
                curveTo(19f, 8.5f, 15.7f, 6.5f, 12f, 6.5f)
                curveTo(8.2f, 6.5f, 4.8f, 8.6f, 3.2f, 12f)
                curveTo(4.9f, 15.4f, 8.3f, 17.5f, 12f, 17.5f)
                horizontalLineTo(12.1f)
                curveTo(12f, 17.7f, 12f, 18f, 12f, 18.2f)
                verticalLineTo(19.5f)
                close()
            }
        }.build()

        return _EyeLockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EyeLockOutline: ImageVector? = null

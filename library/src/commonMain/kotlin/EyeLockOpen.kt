package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeLockOpen: ImageVector
    get() {
        if (_EyeLockOpen != null) {
            return _EyeLockOpen!!
        }
        _EyeLockOpen = ImageVector.Builder(
            name = "EyeLockOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.9f, 11.1f)
                curveTo(13.9f, 11.9f, 13.2f, 13.1f, 13.2f, 14.5f)
                verticalLineTo(14.7f)
                curveTo(12.8f, 14.9f, 12.4f, 15f, 12f, 15f)
                curveTo(10.3f, 15f, 9f, 13.7f, 9f, 12f)
                reflectiveCurveTo(10.3f, 9f, 12f, 9f)
                curveTo(13.4f, 9f, 14.5f, 9.9f, 14.9f, 11.1f)
                moveTo(12f, 18.2f)
                curveTo(12f, 17.8f, 12.1f, 17.4f, 12.3f, 17f)
                horizontalLineTo(12f)
                curveTo(9.2f, 17f, 7f, 14.8f, 7f, 12f)
                reflectiveCurveTo(9.2f, 7f, 12f, 7f)
                curveTo(14.1f, 7f, 15.9f, 8.3f, 16.7f, 10.2f)
                curveTo(17.1f, 10.1f, 17.6f, 10f, 18f, 10f)
                curveTo(20.1f, 10f, 21.9f, 11.3f, 22.5f, 13.1f)
                curveTo(22.7f, 12.8f, 22.8f, 12.4f, 23f, 12f)
                curveTo(21.3f, 7.6f, 17f, 4.5f, 12f, 4.5f)
                reflectiveCurveTo(2.7f, 7.6f, 1f, 12f)
                curveTo(2.7f, 16.4f, 7f, 19.5f, 12f, 19.5f)
                verticalLineTo(18.2f)
                moveTo(20.8f, 17f)
                horizontalLineTo(16.5f)
                verticalLineTo(14.5f)
                curveTo(16.5f, 13.7f, 17.2f, 13.2f, 18f, 13.2f)
                reflectiveCurveTo(19.5f, 13.7f, 19.5f, 14.5f)
                verticalLineTo(15f)
                horizontalLineTo(20.8f)
                verticalLineTo(14.5f)
                curveTo(20.8f, 13.1f, 19.4f, 12f, 18f, 12f)
                reflectiveCurveTo(15.2f, 13.1f, 15.2f, 14.5f)
                verticalLineTo(17f)
                curveTo(14.6f, 17f, 14f, 17.6f, 14f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(14f, 22.4f, 14.6f, 23f, 15.2f, 23f)
                horizontalLineTo(20.7f)
                curveTo(21.4f, 23f, 22f, 22.4f, 22f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(22f, 17.6f, 21.4f, 17f, 20.8f, 17f)
                close()
            }
        }.build()

        return _EyeLockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _EyeLockOpen: ImageVector? = null

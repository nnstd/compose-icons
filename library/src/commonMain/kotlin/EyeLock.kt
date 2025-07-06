package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeLock: ImageVector
    get() {
        if (_EyeLock != null) {
            return _EyeLock!!
        }
        _EyeLock = ImageVector.Builder(
            name = "EyeLock",
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
                curveTo(21.5f, 12f, 19.8f, 11f, 18f, 11f)
                curveTo(17.6f, 11f, 17.3f, 11.1f, 16.9f, 11.1f)
                curveTo(16.5f, 8.8f, 14.5f, 7f, 12f, 7f)
                curveTo(9.2f, 7f, 7f, 9.2f, 7f, 12f)
                reflectiveCurveTo(9.2f, 17f, 12f, 17f)
                horizontalLineTo(12.3f)
                curveTo(12.1f, 17.4f, 12f, 17.8f, 12f, 18.2f)
                verticalLineTo(19.5f)
                close()
            }
        }.build()

        return _EyeLock!!
    }

@Suppress("ObjectPropertyName")
private var _EyeLock: ImageVector? = null

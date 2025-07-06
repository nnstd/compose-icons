package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeLockOpenOutline: ImageVector
    get() {
        if (_EyeLockOpenOutline != null) {
            return _EyeLockOpenOutline!!
        }
        _EyeLockOpenOutline = ImageVector.Builder(
            name = "EyeLockOpenOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19.5f)
                curveTo(7f, 19.5f, 2.7f, 16.4f, 1f, 12f)
                curveTo(2.7f, 7.6f, 7f, 4.5f, 12f, 4.5f)
                reflectiveCurveTo(21.3f, 7.6f, 23f, 12f)
                curveTo(22.9f, 12.4f, 22.7f, 12.7f, 22.5f, 13.1f)
                curveTo(22f, 11.9f, 21f, 10.9f, 19.7f, 10.4f)
                curveTo(17.9f, 8f, 15.1f, 6.5f, 12f, 6.5f)
                curveTo(8.2f, 6.5f, 4.8f, 8.6f, 3.2f, 12f)
                curveTo(4.9f, 15.4f, 8.3f, 17.5f, 12f, 17.5f)
                horizontalLineTo(12.1f)
                curveTo(12f, 17.7f, 12f, 18f, 12f, 18.2f)
                verticalLineTo(19.5f)
                moveTo(12f, 9f)
                curveTo(10.3f, 9f, 9f, 10.3f, 9f, 12f)
                reflectiveCurveTo(10.3f, 15f, 12f, 15f)
                curveTo(12.4f, 15f, 12.8f, 14.9f, 13.2f, 14.7f)
                verticalLineTo(14.5f)
                curveTo(13.2f, 13.2f, 13.9f, 12f, 14.9f, 11.1f)
                curveTo(14.5f, 9.9f, 13.4f, 9f, 12f, 9f)
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

        return _EyeLockOpenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EyeLockOpenOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseEye: ImageVector
    get() {
        if (_DatabaseEye != null) {
            return _DatabaseEye!!
        }
        _DatabaseEye = ImageVector.Builder(
            name = "DatabaseEye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 12f)
                verticalLineTo(9f)
                curveTo(4f, 11.2f, 7.6f, 13f, 12f, 13f)
                reflectiveCurveTo(20f, 11.2f, 20f, 9f)
                verticalLineTo(12f)
                curveTo(20f, 12.5f, 19.8f, 12.9f, 19.5f, 13.4f)
                curveTo(18.7f, 13.1f, 17.9f, 13f, 17f, 13f)
                curveTo(14.5f, 13f, 12.1f, 14.1f, 10.6f, 15.9f)
                curveTo(6.8f, 15.6f, 4f, 14f, 4f, 12f)
                moveTo(12f, 11f)
                curveTo(16.4f, 11f, 20f, 9.2f, 20f, 7f)
                reflectiveCurveTo(16.4f, 3f, 12f, 3f)
                reflectiveCurveTo(4f, 4.8f, 4f, 7f)
                reflectiveCurveTo(7.6f, 11f, 12f, 11f)
                moveTo(9.1f, 19.7f)
                lineTo(8.8f, 19f)
                lineTo(9.1f, 18.3f)
                curveTo(9.2f, 18.1f, 9.3f, 18f, 9.3f, 17.8f)
                curveTo(6.2f, 17.2f, 4f, 15.8f, 4f, 14f)
                verticalLineTo(17f)
                curveTo(4f, 18.8f, 6.4f, 20.3f, 9.7f, 20.8f)
                curveTo(9.5f, 20.5f, 9.3f, 20.1f, 9.1f, 19.7f)
                moveTo(17f, 18f)
                curveTo(16.4f, 18f, 16f, 18.4f, 16f, 19f)
                reflectiveCurveTo(16.4f, 20f, 17f, 20f)
                reflectiveCurveTo(18f, 19.6f, 18f, 19f)
                reflectiveCurveTo(17.6f, 18f, 17f, 18f)
                moveTo(23f, 19f)
                curveTo(22.1f, 21.3f, 19.7f, 23f, 17f, 23f)
                reflectiveCurveTo(11.9f, 21.3f, 11f, 19f)
                curveTo(11.9f, 16.7f, 14.3f, 15f, 17f, 15f)
                reflectiveCurveTo(22.1f, 16.7f, 23f, 19f)
                moveTo(19.5f, 19f)
                curveTo(19.5f, 17.6f, 18.4f, 16.5f, 17f, 16.5f)
                reflectiveCurveTo(14.5f, 17.6f, 14.5f, 19f)
                reflectiveCurveTo(15.6f, 21.5f, 17f, 21.5f)
                reflectiveCurveTo(19.5f, 20.4f, 19.5f, 19f)
                close()
            }
        }.build()

        return _DatabaseEye!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseEye: ImageVector? = null

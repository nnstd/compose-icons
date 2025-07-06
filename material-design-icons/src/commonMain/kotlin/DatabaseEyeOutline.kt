package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseEyeOutline: ImageVector
    get() {
        if (_DatabaseEyeOutline != null) {
            return _DatabaseEyeOutline!!
        }
        _DatabaseEyeOutline = ImageVector.Builder(
            name = "DatabaseEyeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.1f, 19.7f)
                lineTo(8.8f, 19f)
                lineTo(9f, 18.6f)
                curveTo(7.1f, 18.1f, 6f, 17.3f, 6f, 17f)
                verticalLineTo(14.8f)
                curveTo(7.3f, 15.4f, 8.8f, 15.8f, 10.6f, 16f)
                curveTo(11.3f, 15.2f, 12.2f, 14.5f, 13.1f, 14f)
                horizontalLineTo(12f)
                curveTo(9.6f, 14f, 7.3f, 13.4f, 6f, 12.5f)
                verticalLineTo(9.6f)
                curveTo(7.5f, 10.4f, 9.6f, 11f, 12f, 11f)
                reflectiveCurveTo(16.5f, 10.5f, 18f, 9.6f)
                verticalLineTo(12.4f)
                curveTo(17.7f, 12.6f, 17.4f, 12.8f, 17f, 13f)
                curveTo(18f, 13f, 19f, 13.2f, 20f, 13.6f)
                verticalLineTo(7f)
                curveTo(20f, 4.8f, 16.4f, 3f, 12f, 3f)
                reflectiveCurveTo(4f, 4.8f, 4f, 7f)
                verticalLineTo(17f)
                curveTo(4f, 18.8f, 6.4f, 20.3f, 9.7f, 20.8f)
                curveTo(9.5f, 20.5f, 9.3f, 20.1f, 9.1f, 19.7f)
                moveTo(12f, 5f)
                curveTo(15.9f, 5f, 18f, 6.5f, 18f, 7f)
                reflectiveCurveTo(15.9f, 9f, 12f, 9f)
                reflectiveCurveTo(6f, 7.5f, 6f, 7f)
                reflectiveCurveTo(8.1f, 5f, 12f, 5f)
                moveTo(17f, 18f)
                curveTo(17.6f, 18f, 18f, 18.4f, 18f, 19f)
                reflectiveCurveTo(17.6f, 20f, 17f, 20f)
                reflectiveCurveTo(16f, 19.6f, 16f, 19f)
                reflectiveCurveTo(16.4f, 18f, 17f, 18f)
                moveTo(17f, 15f)
                curveTo(14.3f, 15f, 11.9f, 16.7f, 11f, 19f)
                curveTo(11.9f, 21.3f, 14.3f, 23f, 17f, 23f)
                reflectiveCurveTo(22.1f, 21.3f, 23f, 19f)
                curveTo(22.1f, 16.7f, 19.7f, 15f, 17f, 15f)
                moveTo(17f, 21.5f)
                curveTo(15.6f, 21.5f, 14.5f, 20.4f, 14.5f, 19f)
                reflectiveCurveTo(15.6f, 16.5f, 17f, 16.5f)
                reflectiveCurveTo(19.5f, 17.6f, 19.5f, 19f)
                reflectiveCurveTo(18.4f, 21.5f, 17f, 21.5f)
                close()
            }
        }.build()

        return _DatabaseEyeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseEyeOutline: ImageVector? = null

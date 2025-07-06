package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatColorMarkerCancel: ImageVector
    get() {
        if (_FormatColorMarkerCancel != null) {
            return _FormatColorMarkerCancel!!
        }
        _FormatColorMarkerCancel = ImageVector.Builder(
            name = "FormatColorMarkerCancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 8f)
                curveTo(14f, 8f, 12f, 10f, 12f, 12.5f)
                reflectiveCurveTo(14f, 17f, 16.5f, 17f)
                reflectiveCurveTo(21f, 15f, 21f, 12.5f)
                reflectiveCurveTo(19f, 8f, 16.5f, 8f)
                moveTo(16.5f, 15.5f)
                curveTo(14.8f, 15.5f, 13.5f, 14.2f, 13.5f, 12.5f)
                curveTo(13.5f, 11.9f, 13.7f, 11.4f, 13.9f, 11f)
                lineTo(18f, 15.1f)
                curveTo(17.6f, 15.3f, 17.1f, 15.5f, 16.5f, 15.5f)
                moveTo(19.1f, 14f)
                lineTo(15f, 9.9f)
                curveTo(15.4f, 9.6f, 15.9f, 9.5f, 16.5f, 9.5f)
                curveTo(18.2f, 9.5f, 19.5f, 10.8f, 19.5f, 12.5f)
                curveTo(19.5f, 13.1f, 19.3f, 13.6f, 19.1f, 14f)
                moveTo(12.1f, 7.7f)
                lineTo(10.6f, 6.2f)
                lineTo(13.9f, 2.9f)
                curveTo(14.5f, 2.3f, 15.4f, 2.3f, 16f, 2.9f)
                lineTo(18.2f, 5f)
                curveTo(18.6f, 5.4f, 18.7f, 5.8f, 18.6f, 6.3f)
                curveTo(18f, 6.1f, 17.3f, 6f, 16.6f, 6f)
                curveTo(14.8f, 6f, 13.3f, 6.7f, 12.1f, 7.7f)
                moveTo(10.5f, 14.9f)
                lineTo(9f, 16.3f)
                curveTo(8.4f, 16.9f, 7.5f, 16.9f, 6.9f, 16.3f)
                lineTo(6.2f, 17f)
                horizontalLineTo(2f)
                lineTo(4.8f, 14.2f)
                curveTo(4.2f, 13.6f, 4.2f, 12.7f, 4.8f, 12.1f)
                lineTo(9.5f, 7.4f)
                lineTo(11.1f, 9f)
                curveTo(10.4f, 10f, 10f, 11.2f, 10f, 12.5f)
                curveTo(10f, 13.3f, 10.2f, 14.1f, 10.5f, 14.9f)
                close()
            }
        }.build()

        return _FormatColorMarkerCancel!!
    }

@Suppress("ObjectPropertyName")
private var _FormatColorMarkerCancel: ImageVector? = null

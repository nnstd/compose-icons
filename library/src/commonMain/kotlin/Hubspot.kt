package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hubspot: ImageVector
    get() {
        if (_Hubspot != null) {
            return _Hubspot!!
        }
        _Hubspot = ImageVector.Builder(
            name = "Hubspot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.1f, 8.6f)
                verticalLineTo(6.2f)
                curveTo(17.7f, 5.9f, 18.2f, 5.3f, 18.2f, 4.6f)
                verticalLineTo(4.5f)
                curveTo(18.2f, 3.5f, 17.4f, 2.7f, 16.4f, 2.7f)
                horizontalLineTo(16.3f)
                curveTo(15.3f, 2.7f, 14.5f, 3.5f, 14.5f, 4.5f)
                verticalLineTo(4.6f)
                curveTo(14.5f, 5.3f, 14.9f, 5.9f, 15.6f, 6.2f)
                verticalLineTo(8.6f)
                curveTo(14.7f, 8.7f, 13.8f, 9.1f, 13.1f, 9.7f)
                lineTo(6.5f, 4.6f)
                curveTo(6.8f, 3.5f, 6.1f, 2.3f, 5f, 2.1f)
                curveTo(3.9f, 1.9f, 2.8f, 2.4f, 2.5f, 3.5f)
                curveTo(2.2f, 4.6f, 2.9f, 5.8f, 4f, 6.1f)
                curveTo(4.5f, 6.2f, 5.1f, 6.2f, 5.6f, 5.9f)
                lineTo(12f, 10.9f)
                curveTo(10.8f, 12.7f, 10.8f, 15f, 12.1f, 16.8f)
                lineTo(10.1f, 18.8f)
                curveTo(9.9f, 18.8f, 9.8f, 18.7f, 9.6f, 18.7f)
                curveTo(8.7f, 18.7f, 7.9f, 19.5f, 7.9f, 20.4f)
                curveTo(7.9f, 21.3f, 8.7f, 22f, 9.6f, 22f)
                curveTo(10.5f, 22f, 11.3f, 21.2f, 11.3f, 20.3f)
                verticalLineTo(20.3f)
                curveTo(11.3f, 20.1f, 11.3f, 20f, 11.2f, 19.8f)
                lineTo(13.1f, 17.9f)
                curveTo(15.4f, 19.6f, 18.7f, 19.2f, 20.4f, 16.9f)
                curveTo(22.1f, 14.6f, 21.7f, 11.3f, 19.4f, 9.6f)
                curveTo(18.8f, 9.1f, 18f, 8.7f, 17.1f, 8.6f)
                moveTo(16.3f, 16.4f)
                curveTo(14.8f, 16.4f, 13.6f, 15.2f, 13.6f, 13.7f)
                curveTo(13.6f, 12.2f, 14.8f, 11f, 16.3f, 11f)
                curveTo(17.8f, 11f, 19f, 12.2f, 19f, 13.7f)
                curveTo(19f, 15.2f, 17.8f, 16.4f, 16.3f, 16.4f)
            }
        }.build()

        return _Hubspot!!
    }

@Suppress("ObjectPropertyName")
private var _Hubspot: ImageVector? = null

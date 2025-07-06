package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShareOffOutline: ImageVector
    get() {
        if (_ShareOffOutline != null) {
            return _ShareOffOutline!!
        }
        _ShareOffOutline = ImageVector.Builder(
            name = "ShareOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(8.9f, 10.8f)
                curveTo(5.4f, 12.9f, 3.7f, 16.4f, 3f, 20f)
                curveTo(5.3f, 16.7f, 8.6f, 15.1f, 13f, 14.9f)
                lineTo(14f, 15.9f)
                verticalLineTo(19f)
                lineTo(15.6f, 17.4f)
                lineTo(20.8f, 22.7f)
                moveTo(8.3f, 13.8f)
                curveTo(8.94f, 13.22f, 9.65f, 12.71f, 10.4f, 12.3f)
                lineTo(11.3f, 13.1f)
                moveTo(14.2f, 11f)
                lineTo(12.5f, 9.3f)
                lineTo(14f, 9f)
                verticalLineTo(5f)
                lineTo(21f, 12f)
                lineTo(18.1f, 14.9f)
                lineTo(16.7f, 13.5f)
                lineTo(18.2f, 12f)
                lineTo(16f, 9.8f)
                verticalLineTo(10.7f)
            }
        }.build()

        return _ShareOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShareOffOutline: ImageVector? = null

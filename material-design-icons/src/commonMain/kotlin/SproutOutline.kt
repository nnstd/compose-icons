package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SproutOutline: ImageVector
    get() {
        if (_SproutOutline != null) {
            return _SproutOutline!!
        }
        _SproutOutline = ImageVector.Builder(
            name = "SproutOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 4.1f)
                verticalLineTo(2.3f)
                lineTo(21.2f, 2.1f)
                curveTo(21.1f, 2.1f, 20.5f, 2f, 19.5f, 2f)
                curveTo(15.4f, 2f, 12.4f, 3.2f, 10.7f, 5.3f)
                curveTo(9.4f, 4.5f, 7.6f, 4f, 5.5f, 4f)
                curveTo(4.5f, 4f, 3.8f, 4.1f, 3.8f, 4.1f)
                lineTo(1.9f, 4.4f)
                lineTo(2f, 6.1f)
                curveTo(2.1f, 9.1f, 3.6f, 14.8f, 8.8f, 14.8f)
                curveTo(8.9f, 14.8f, 8.9f, 14.8f, 9f, 14.8f)
                verticalLineTo(18.2f)
                curveTo(5.2f, 18.7f, 2f, 20f, 2f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                curveTo(22f, 20f, 18.8f, 18.7f, 15f, 18.2f)
                verticalLineTo(15f)
                curveTo(21.3f, 14.9f, 23f, 7.8f, 23f, 4.1f)
                moveTo(12f, 18f)
                curveTo(11.7f, 18f, 11.3f, 18f, 11f, 18f)
                verticalLineTo(12.4f)
                curveTo(11f, 12.4f, 10.8f, 9f, 8f, 9f)
                curveTo(8f, 9f, 9.5f, 9.8f, 9.9f, 12.7f)
                curveTo(9.5f, 12.8f, 9.1f, 12.8f, 8.8f, 12.8f)
                curveTo(4.2f, 12.8f, 4f, 6.1f, 4f, 6.1f)
                curveTo(4f, 6.1f, 4.6f, 6f, 5.5f, 6f)
                curveTo(7.4f, 6f, 10.5f, 6.4f, 11.4f, 9.1f)
                curveTo(11.9f, 4.6f, 17f, 4f, 19.5f, 4f)
                curveTo(20.4f, 4f, 21f, 4.1f, 21f, 4.1f)
                curveTo(21f, 4.1f, 21f, 13.1f, 14.7f, 13.1f)
                curveTo(14.5f, 13.1f, 14.2f, 13.1f, 14f, 13.1f)
                curveTo(14f, 11.1f, 16f, 8.1f, 16f, 8.1f)
                curveTo(13f, 9.1f, 13f, 13f, 13f, 13f)
                verticalLineTo(18f)
                curveTo(12.7f, 18f, 12.3f, 18f, 12f, 18f)
                close()
            }
        }.build()

        return _SproutOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SproutOutline: ImageVector? = null

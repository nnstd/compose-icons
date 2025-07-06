package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StickerCheckOutline: ImageVector
    get() {
        if (_StickerCheckOutline != null) {
            return _StickerCheckOutline!!
        }
        _StickerCheckOutline = ImageVector.Builder(
            name = "StickerCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 2f)
                horizontalLineTo(5.5f)
                curveTo(3.6f, 2f, 2f, 3.6f, 2f, 5.5f)
                verticalLineTo(18.5f)
                curveTo(2f, 20.4f, 3.6f, 22f, 5.5f, 22f)
                horizontalLineTo(16f)
                lineTo(22f, 16f)
                verticalLineTo(5.5f)
                curveTo(22f, 3.6f, 20.4f, 2f, 18.5f, 2f)
                moveTo(20f, 15f)
                horizontalLineTo(18.5f)
                curveTo(16.6f, 15f, 15f, 16.6f, 15f, 18.5f)
                verticalLineTo(20f)
                horizontalLineTo(5.8f)
                curveTo(4.8f, 20f, 4f, 19.2f, 4f, 18.2f)
                verticalLineTo(5.8f)
                curveTo(4f, 4.8f, 4.8f, 4f, 5.8f, 4f)
                horizontalLineTo(18.3f)
                curveTo(19.3f, 4f, 20.1f, 4.8f, 20.1f, 5.8f)
                verticalLineTo(15f)
                moveTo(15.2f, 8.2f)
                lineTo(16.7f, 9.7f)
                lineTo(10.7f, 15.7f)
                lineTo(7.2f, 12.2f)
                lineTo(8.7f, 10.7f)
                lineTo(10.7f, 12.7f)
                lineTo(15.2f, 8.2f)
                close()
            }
        }.build()

        return _StickerCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StickerCheckOutline: ImageVector? = null

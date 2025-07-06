package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StickerRemoveOutline: ImageVector
    get() {
        if (_StickerRemoveOutline != null) {
            return _StickerRemoveOutline!!
        }
        _StickerRemoveOutline = ImageVector.Builder(
            name = "StickerRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9.4f)
                lineTo(13.4f, 12f)
                lineTo(16f, 14.6f)
                lineTo(14.6f, 16f)
                lineTo(12f, 13.4f)
                lineTo(9.4f, 16f)
                lineTo(8f, 14.6f)
                lineTo(10.6f, 12f)
                lineTo(8f, 9.4f)
                lineTo(9.4f, 8f)
                lineTo(12f, 10.6f)
                lineTo(14.6f, 8f)
                lineTo(16f, 9.4f)
                moveTo(22f, 5.5f)
                verticalLineTo(16f)
                lineTo(16f, 22f)
                horizontalLineTo(5.5f)
                curveTo(3.6f, 22f, 2f, 20.4f, 2f, 18.5f)
                verticalLineTo(5.5f)
                curveTo(2f, 3.6f, 3.6f, 2f, 5.5f, 2f)
                horizontalLineTo(18.5f)
                curveTo(20.4f, 2f, 22f, 3.6f, 22f, 5.5f)
                moveTo(20f, 5.8f)
                curveTo(20f, 4.8f, 19.2f, 4f, 18.2f, 4f)
                horizontalLineTo(5.8f)
                curveTo(4.8f, 4f, 4f, 4.8f, 4f, 5.8f)
                verticalLineTo(18.3f)
                curveTo(4f, 19.3f, 4.8f, 20.1f, 5.8f, 20.1f)
                horizontalLineTo(15f)
                verticalLineTo(18.6f)
                curveTo(15f, 16.7f, 16.6f, 15.1f, 18.5f, 15.1f)
                horizontalLineTo(20f)
                verticalLineTo(5.8f)
                close()
            }
        }.build()

        return _StickerRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StickerRemoveOutline: ImageVector? = null

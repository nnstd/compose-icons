package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StickerPlus: ImageVector
    get() {
        if (_StickerPlus != null) {
            return _StickerPlus!!
        }
        _StickerPlus = ImageVector.Builder(
            name = "StickerPlus",
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
                moveTo(13f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                moveTo(15f, 20f)
                verticalLineTo(18.5f)
                curveTo(15f, 16.6f, 16.6f, 15f, 18.5f, 15f)
                horizontalLineTo(20f)
                lineTo(15f, 20f)
                close()
            }
        }.build()

        return _StickerPlus!!
    }

@Suppress("ObjectPropertyName")
private var _StickerPlus: ImageVector? = null

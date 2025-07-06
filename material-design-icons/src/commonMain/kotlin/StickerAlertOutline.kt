package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StickerAlertOutline: ImageVector
    get() {
        if (_StickerAlertOutline != null) {
            return _StickerAlertOutline!!
        }
        _StickerAlertOutline = ImageVector.Builder(
            name = "StickerAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                moveTo(11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
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

        return _StickerAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StickerAlertOutline: ImageVector? = null

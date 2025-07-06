package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextureBox: ImageVector
    get() {
        if (_TextureBox != null) {
            return _TextureBox!!
        }
        _TextureBox = ImageVector.Builder(
            name = "TextureBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.11f, 2f, 20f, 2f)
                moveTo(4f, 6f)
                lineTo(6f, 4f)
                horizontalLineTo(10.9f)
                lineTo(4f, 10.9f)
                verticalLineTo(6f)
                moveTo(4f, 13.7f)
                lineTo(13.7f, 4f)
                horizontalLineTo(18.6f)
                lineTo(4f, 18.6f)
                verticalLineTo(13.7f)
                moveTo(20f, 18f)
                lineTo(18f, 20f)
                horizontalLineTo(13.1f)
                lineTo(20f, 13.1f)
                verticalLineTo(18f)
                moveTo(20f, 10.3f)
                lineTo(10.3f, 20f)
                horizontalLineTo(5.4f)
                lineTo(20f, 5.4f)
                verticalLineTo(10.3f)
                close()
            }
        }.build()

        return _TextureBox!!
    }

@Suppress("ObjectPropertyName")
private var _TextureBox: ImageVector? = null

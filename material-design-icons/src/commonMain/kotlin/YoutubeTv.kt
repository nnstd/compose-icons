package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.YoutubeTv: ImageVector
    get() {
        if (_YoutubeTv != null) {
            return _YoutubeTv!!
        }
        _YoutubeTv = ImageVector.Builder(
            name = "YoutubeTv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 4.5f)
                horizontalLineTo(21.5f)
                curveTo(22.34f, 4.5f, 23f, 5.15f, 23f, 6f)
                verticalLineTo(17.5f)
                curveTo(23f, 18.35f, 22.34f, 19f, 21.5f, 19f)
                horizontalLineTo(2.5f)
                curveTo(1.65f, 19f, 1f, 18.35f, 1f, 17.5f)
                verticalLineTo(6f)
                curveTo(1f, 5.15f, 1.65f, 4.5f, 2.5f, 4.5f)
                moveTo(9.71f, 8.5f)
                verticalLineTo(15f)
                lineTo(15.42f, 11.7f)
                lineTo(9.71f, 8.5f)
                moveTo(17.25f, 21f)
                horizontalLineTo(6.65f)
                curveTo(6.35f, 21f, 6.15f, 20.8f, 6.15f, 20.5f)
                curveTo(6.15f, 20.2f, 6.35f, 20f, 6.65f, 20f)
                horizontalLineTo(17.35f)
                curveTo(17.65f, 20f, 17.85f, 20.2f, 17.85f, 20.5f)
                curveTo(17.85f, 20.8f, 17.55f, 21f, 17.25f, 21f)
                close()
            }
        }.build()

        return _YoutubeTv!!
    }

@Suppress("ObjectPropertyName")
private var _YoutubeTv: ImageVector? = null

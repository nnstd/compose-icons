package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicRestWhole: ImageVector
    get() {
        if (_MusicRestWhole != null) {
            return _MusicRestWhole!!
        }
        _MusicRestWhole = ImageVector.Builder(
            name = "MusicRestWhole",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _MusicRestWhole!!
    }

@Suppress("ObjectPropertyName")
private var _MusicRestWhole: ImageVector? = null

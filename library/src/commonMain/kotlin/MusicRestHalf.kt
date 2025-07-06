package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicRestHalf: ImageVector
    get() {
        if (_MusicRestHalf != null) {
            return _MusicRestHalf!!
        }
        _MusicRestHalf = ImageVector.Builder(
            name = "MusicRestHalf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _MusicRestHalf!!
    }

@Suppress("ObjectPropertyName")
private var _MusicRestHalf: ImageVector? = null

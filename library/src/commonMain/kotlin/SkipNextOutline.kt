package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkipNextOutline: ImageVector
    get() {
        if (_SkipNextOutline != null) {
            return _SkipNextOutline!!
        }
        _SkipNextOutline = ImageVector.Builder(
            name = "SkipNextOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 18f)
                lineTo(14.5f, 12f)
                lineTo(6f, 6f)
                moveTo(8f, 9.86f)
                lineTo(11.03f, 12f)
                lineTo(8f, 14.14f)
                moveTo(16f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
            }
        }.build()

        return _SkipNextOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SkipNextOutline: ImageVector? = null

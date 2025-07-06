package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloseOutline: ImageVector
    get() {
        if (_CloseOutline != null) {
            return _CloseOutline!!
        }
        _CloseOutline = ImageVector.Builder(
            name = "CloseOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 16.74f)
                lineTo(7.76f, 12f)
                lineTo(3f, 7.26f)
                lineTo(7.26f, 3f)
                lineTo(12f, 7.76f)
                lineTo(16.74f, 3f)
                lineTo(21f, 7.26f)
                lineTo(16.24f, 12f)
                lineTo(21f, 16.74f)
                lineTo(16.74f, 21f)
                lineTo(12f, 16.24f)
                lineTo(7.26f, 21f)
                lineTo(3f, 16.74f)
                moveTo(12f, 13.41f)
                lineTo(16.74f, 18.16f)
                lineTo(18.16f, 16.74f)
                lineTo(13.41f, 12f)
                lineTo(18.16f, 7.26f)
                lineTo(16.74f, 5.84f)
                lineTo(12f, 10.59f)
                lineTo(7.26f, 5.84f)
                lineTo(5.84f, 7.26f)
                lineTo(10.59f, 12f)
                lineTo(5.84f, 16.74f)
                lineTo(7.26f, 18.16f)
                lineTo(12f, 13.41f)
                close()
            }
        }.build()

        return _CloseOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloseOutline: ImageVector? = null

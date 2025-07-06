package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarHalf: ImageVector
    get() {
        if (_StarHalf != null) {
            return _StarHalf!!
        }
        _StarHalf = ImageVector.Builder(
            name = "StarHalf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(9.19f, 8.62f)
                lineTo(2f, 9.24f)
                lineTo(7.45f, 13.97f)
                lineTo(5.82f, 21f)
                lineTo(12f, 17.27f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _StarHalf!!
    }

@Suppress("ObjectPropertyName")
private var _StarHalf: ImageVector? = null

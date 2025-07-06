package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarOutline: ImageVector
    get() {
        if (_StarOutline != null) {
            return _StarOutline!!
        }
        _StarOutline = ImageVector.Builder(
            name = "StarOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.39f)
                lineTo(8.24f, 17.66f)
                lineTo(9.23f, 13.38f)
                lineTo(5.91f, 10.5f)
                lineTo(10.29f, 10.13f)
                lineTo(12f, 6.09f)
                lineTo(13.71f, 10.13f)
                lineTo(18.09f, 10.5f)
                lineTo(14.77f, 13.38f)
                lineTo(15.76f, 17.66f)
                moveTo(22f, 9.24f)
                lineTo(14.81f, 8.63f)
                lineTo(12f, 2f)
                lineTo(9.19f, 8.63f)
                lineTo(2f, 9.24f)
                lineTo(7.45f, 13.97f)
                lineTo(5.82f, 21f)
                lineTo(12f, 17.27f)
                lineTo(18.18f, 21f)
                lineTo(16.54f, 13.97f)
                lineTo(22f, 9.24f)
                close()
            }
        }.build()

        return _StarOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StarOutline: ImageVector? = null

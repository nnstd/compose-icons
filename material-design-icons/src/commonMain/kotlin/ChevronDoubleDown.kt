package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronDoubleDown: ImageVector
    get() {
        if (_ChevronDoubleDown != null) {
            return _ChevronDoubleDown!!
        }
        _ChevronDoubleDown = ImageVector.Builder(
            name = "ChevronDoubleDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.59f, 5.59f)
                lineTo(18f, 7f)
                lineTo(12f, 13f)
                lineTo(6f, 7f)
                lineTo(7.41f, 5.59f)
                lineTo(12f, 10.17f)
                lineTo(16.59f, 5.59f)
                moveTo(16.59f, 11.59f)
                lineTo(18f, 13f)
                lineTo(12f, 19f)
                lineTo(6f, 13f)
                lineTo(7.41f, 11.59f)
                lineTo(12f, 16.17f)
                lineTo(16.59f, 11.59f)
                close()
            }
        }.build()

        return _ChevronDoubleDown!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDoubleDown: ImageVector? = null

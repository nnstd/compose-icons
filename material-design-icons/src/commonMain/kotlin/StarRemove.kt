package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarRemove: ImageVector
    get() {
        if (_StarRemove != null) {
            return _StarRemove!!
        }
        _StarRemove = ImageVector.Builder(
            name = "StarRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.8f, 21f)
                lineTo(7.4f, 14f)
                lineTo(2f, 9.2f)
                lineTo(9.2f, 8.6f)
                lineTo(12f, 2f)
                lineTo(14.8f, 8.6f)
                lineTo(22f, 9.2f)
                lineTo(18.8f, 12f)
                horizontalLineTo(18f)
                curveTo(14.9f, 12f, 12.4f, 14.3f, 12f, 17.3f)
                lineTo(5.8f, 21f)
                moveTo(20.1f, 14.5f)
                lineTo(18f, 16.6f)
                lineTo(15.9f, 14.5f)
                lineTo(14.5f, 15.9f)
                lineTo(16.6f, 18f)
                lineTo(14.5f, 20.1f)
                lineTo(15.9f, 21.5f)
                lineTo(18f, 19.4f)
                lineTo(20.1f, 21.5f)
                lineTo(21.5f, 20.1f)
                lineTo(19.4f, 18f)
                lineTo(21.5f, 15.9f)
                lineTo(20.1f, 14.5f)
                close()
            }
        }.build()

        return _StarRemove!!
    }

@Suppress("ObjectPropertyName")
private var _StarRemove: ImageVector? = null

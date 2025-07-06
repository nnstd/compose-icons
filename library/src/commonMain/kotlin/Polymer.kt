package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Polymer: ImageVector
    get() {
        if (_Polymer != null) {
            return _Polymer!!
        }
        _Polymer = ImageVector.Builder(
            name = "Polymer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 4f)
                horizontalLineTo(15f)
                lineTo(7.1f, 16.63f)
                lineTo(4.5f, 12f)
                lineTo(9f, 4f)
                horizontalLineTo(5f)
                lineTo(0.5f, 12f)
                lineTo(5f, 20f)
                horizontalLineTo(9f)
                lineTo(16.89f, 7.37f)
                lineTo(19.5f, 12f)
                lineTo(15f, 20f)
                horizontalLineTo(19f)
                lineTo(23.5f, 12f)
                lineTo(19f, 4f)
                close()
            }
        }.build()

        return _Polymer!!
    }

@Suppress("ObjectPropertyName")
private var _Polymer: ImageVector? = null

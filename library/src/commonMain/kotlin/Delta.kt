package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Delta: ImageVector
    get() {
        if (_Delta != null) {
            return _Delta!!
        }
        _Delta = ImageVector.Builder(
            name = "Delta",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.77f)
                lineTo(18.39f, 18f)
                horizontalLineTo(5.61f)
                lineTo(12f, 7.77f)
                moveTo(12f, 4f)
                lineTo(2f, 20f)
                horizontalLineTo(22f)
            }
        }.build()

        return _Delta!!
    }

@Suppress("ObjectPropertyName")
private var _Delta: ImageVector? = null

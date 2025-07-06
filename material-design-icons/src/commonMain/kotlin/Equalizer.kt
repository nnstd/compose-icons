package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Equalizer: ImageVector
    get() {
        if (_Equalizer != null) {
            return _Equalizer!!
        }
        _Equalizer = ImageVector.Builder(
            name = "Equalizer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 20f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                moveTo(4f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                moveTo(16f, 9f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _Equalizer!!
    }

@Suppress("ObjectPropertyName")
private var _Equalizer: ImageVector? = null

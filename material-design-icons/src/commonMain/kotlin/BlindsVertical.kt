package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BlindsVertical: ImageVector
    get() {
        if (_BlindsVertical != null) {
            return _BlindsVertical!!
        }
        _BlindsVertical = ImageVector.Builder(
            name = "BlindsVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                moveTo(10f, 19f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _BlindsVertical!!
    }

@Suppress("ObjectPropertyName")
private var _BlindsVertical: ImageVector? = null

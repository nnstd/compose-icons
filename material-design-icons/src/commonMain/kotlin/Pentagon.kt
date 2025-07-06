package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pentagon: ImageVector
    get() {
        if (_Pentagon != null) {
            return _Pentagon!!
        }
        _Pentagon = ImageVector.Builder(
            name = "Pentagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.5f)
                lineTo(2f, 9.8f)
                lineTo(5.8f, 21.5f)
                horizontalLineTo(18.2f)
                lineTo(22f, 9.8f)
                lineTo(12f, 2.5f)
                close()
            }
        }.build()

        return _Pentagon!!
    }

@Suppress("ObjectPropertyName")
private var _Pentagon: ImageVector? = null

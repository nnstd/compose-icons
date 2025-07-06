package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Details: ImageVector
    get() {
        if (_Details != null) {
            return _Details!!
        }
        _Details = ImageVector.Builder(
            name = "Details",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.38f, 6f)
                horizontalLineTo(17.63f)
                lineTo(12f, 16f)
                lineTo(6.38f, 6f)
                moveTo(3f, 4f)
                lineTo(12f, 20f)
                lineTo(21f, 4f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _Details!!
    }

@Suppress("ObjectPropertyName")
private var _Details: ImageVector? = null

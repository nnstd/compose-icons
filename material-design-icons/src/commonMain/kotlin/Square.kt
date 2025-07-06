package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Square: ImageVector
    get() {
        if (_Square != null) {
            return _Square!!
        }
        _Square = ImageVector.Builder(
            name = "Square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
            }
        }.build()

        return _Square!!
    }

@Suppress("ObjectPropertyName")
private var _Square: ImageVector? = null

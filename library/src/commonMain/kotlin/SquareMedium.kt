package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareMedium: ImageVector
    get() {
        if (_SquareMedium != null) {
            return _SquareMedium!!
        }
        _SquareMedium = ImageVector.Builder(
            name = "SquareMedium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _SquareMedium!!
    }

@Suppress("ObjectPropertyName")
private var _SquareMedium: ImageVector? = null

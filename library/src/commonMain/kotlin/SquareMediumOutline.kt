package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareMediumOutline: ImageVector
    get() {
        if (_SquareMediumOutline != null) {
            return _SquareMediumOutline!!
        }
        _SquareMediumOutline = ImageVector.Builder(
            name = "SquareMediumOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                moveTo(16f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _SquareMediumOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SquareMediumOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaI: ImageVector
    get() {
        if (_AlphaI != null) {
            return _AlphaI!!
        }
        _AlphaI = ImageVector.Builder(
            name = "AlphaI",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _AlphaI!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaI: ImageVector? = null

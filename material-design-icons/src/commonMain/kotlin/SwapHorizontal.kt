package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SwapHorizontal: ImageVector
    get() {
        if (_SwapHorizontal != null) {
            return _SwapHorizontal!!
        }
        _SwapHorizontal = ImageVector.Builder(
            name = "SwapHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                lineTo(17f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                moveTo(7f, 11f)
                lineTo(3f, 15f)
                lineTo(7f, 19f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _SwapHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _SwapHorizontal: ImageVector? = null

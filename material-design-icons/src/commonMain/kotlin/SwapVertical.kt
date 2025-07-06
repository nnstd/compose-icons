package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SwapVertical: ImageVector
    get() {
        if (_SwapVertical != null) {
            return _SwapVertical!!
        }
        _SwapVertical = ImageVector.Builder(
            name = "SwapVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 3f)
                lineTo(5f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                moveTo(16f, 17f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                lineTo(15f, 21f)
                lineTo(19f, 17f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _SwapVertical!!
    }

@Suppress("ObjectPropertyName")
private var _SwapVertical: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SwapHorizontalBold: ImageVector
    get() {
        if (_SwapHorizontalBold != null) {
            return _SwapHorizontalBold!!
        }
        _SwapHorizontalBold = ImageVector.Builder(
            name = "SwapHorizontalBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                lineTo(2f, 15.5f)
                lineTo(8f, 10f)
                moveTo(22f, 8.5f)
                lineTo(16f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                lineTo(22f, 8.5f)
                close()
            }
        }.build()

        return _SwapHorizontalBold!!
    }

@Suppress("ObjectPropertyName")
private var _SwapHorizontalBold: ImageVector? = null

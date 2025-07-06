package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SwapVerticalBold: ImageVector
    get() {
        if (_SwapVerticalBold != null) {
            return _SwapVerticalBold!!
        }
        _SwapVerticalBold = ImageVector.Builder(
            name = "SwapVerticalBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                lineTo(8.5f, 2f)
                lineTo(14f, 8f)
                moveTo(15.5f, 22f)
                lineTo(21f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                lineTo(15.5f, 22f)
                close()
            }
        }.build()

        return _SwapVerticalBold!!
    }

@Suppress("ObjectPropertyName")
private var _SwapVerticalBold: ImageVector? = null

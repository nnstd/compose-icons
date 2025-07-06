package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SwapHorizontalHidden: ImageVector
    get() {
        if (_SwapHorizontalHidden != null) {
            return _SwapHorizontalHidden!!
        }
        _SwapHorizontalHidden = ImageVector.Builder(
            name = "SwapHorizontalHidden",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 5f)
                lineTo(21f, 9f)
                lineTo(17f, 13f)
                verticalLineTo(5f)
                moveTo(16f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                moveTo(12f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(12f)
                moveTo(3f, 15f)
                lineTo(7f, 11f)
                verticalLineTo(19f)
                lineTo(3f, 15f)
                moveTo(8f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                moveTo(12f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _SwapHorizontalHidden!!
    }

@Suppress("ObjectPropertyName")
private var _SwapHorizontalHidden: ImageVector? = null

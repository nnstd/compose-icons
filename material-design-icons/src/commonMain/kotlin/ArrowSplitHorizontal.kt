package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowSplitHorizontal: ImageVector
    get() {
        if (_ArrowSplitHorizontal != null) {
            return _ArrowSplitHorizontal!!
        }
        _ArrowSplitHorizontal = ImageVector.Builder(
            name = "ArrowSplitHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                lineTo(12f, 22f)
                lineTo(8f, 18f)
                moveTo(12f, 2f)
                lineTo(8f, 6f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                lineTo(12f, 2f)
                close()
            }
        }.build()

        return _ArrowSplitHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSplitHorizontal: ImageVector? = null

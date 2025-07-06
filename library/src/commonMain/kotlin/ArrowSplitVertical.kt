package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowSplitVertical: ImageVector
    get() {
        if (_ArrowSplitVertical != null) {
            return _ArrowSplitVertical!!
        }
        _ArrowSplitVertical = ImageVector.Builder(
            name = "ArrowSplitVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                lineTo(22f, 12f)
                lineTo(18f, 16f)
                moveTo(2f, 12f)
                lineTo(6f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                lineTo(2f, 12f)
                close()
            }
        }.build()

        return _ArrowSplitVertical!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSplitVertical: ImageVector? = null

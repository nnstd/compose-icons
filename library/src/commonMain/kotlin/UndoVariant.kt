package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UndoVariant: ImageVector
    get() {
        if (_UndoVariant != null) {
            return _UndoVariant!!
        }
        _UndoVariant = ImageVector.Builder(
            name = "UndoVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 7f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 13.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 20f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(13.5f)
                curveTo(16f, 18f, 18f, 16f, 18f, 13.5f)
                curveTo(18f, 11f, 16f, 9f, 13.5f, 9f)
                horizontalLineTo(7.83f)
                lineTo(10.91f, 12.09f)
                lineTo(9.5f, 13.5f)
                lineTo(4f, 8f)
                lineTo(9.5f, 2.5f)
                lineTo(10.92f, 3.91f)
                lineTo(7.83f, 7f)
                horizontalLineTo(13.5f)
                moveTo(6f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _UndoVariant!!
    }

@Suppress("ObjectPropertyName")
private var _UndoVariant: ImageVector? = null

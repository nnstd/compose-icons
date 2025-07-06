package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MoveResizeVariant: ImageVector
    get() {
        if (_MoveResizeVariant != null) {
            return _MoveResizeVariant!!
        }
        _MoveResizeVariant = ImageVector.Builder(
            name = "MoveResizeVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.88f, 0.46f)
                lineTo(0.46f, 1.88f)
                lineTo(5.59f, 7f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                verticalLineTo(5.59f)
                moveTo(11f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 7f)
                moveTo(7f, 11f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 23f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                moveTo(15.88f, 14.46f)
                lineTo(14.46f, 15.88f)
                lineTo(19.6f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(23f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(19.59f)
            }
        }.build()

        return _MoveResizeVariant!!
    }

@Suppress("ObjectPropertyName")
private var _MoveResizeVariant: ImageVector? = null

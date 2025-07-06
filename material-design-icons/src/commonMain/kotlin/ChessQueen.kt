package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChessQueen: ImageVector
    get() {
        if (_ChessQueen != null) {
            return _ChessQueen!!
        }
        _ChessQueen = ImageVector.Builder(
            name = "ChessQueen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 5f)
                curveTo(20f, 5.81f, 19.5f, 6.5f, 18.83f, 6.82f)
                lineTo(17f, 13.15f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(13.15f)
                lineTo(5.17f, 6.82f)
                curveTo(4.5f, 6.5f, 4f, 5.81f, 4f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5f)
                curveTo(8f, 5.5f, 7.82f, 5.95f, 7.5f, 6.3f)
                lineTo(10.3f, 9.35f)
                lineTo(10.83f, 5.62f)
                curveTo(10.33f, 5.26f, 10f, 4.67f, 10f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 4f)
                curveTo(14f, 4.67f, 13.67f, 5.26f, 13.17f, 5.62f)
                lineTo(13.7f, 9.35f)
                lineTo(16.47f, 6.29f)
                curveTo(16.18f, 5.94f, 16f, 5.5f, 16f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 3f)
                moveTo(5f, 20f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _ChessQueen!!
    }

@Suppress("ObjectPropertyName")
private var _ChessQueen: ImageVector? = null

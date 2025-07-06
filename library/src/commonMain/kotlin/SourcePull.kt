package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SourcePull: ImageVector
    get() {
        if (_SourcePull != null) {
            return _SourcePull!!
        }
        _SourcePull = ImageVector.Builder(
            name = "SourcePull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6f)
                curveTo(9f, 7.31f, 8.17f, 8.42f, 7f, 8.83f)
                verticalLineTo(15.17f)
                curveTo(8.17f, 15.58f, 9f, 16.69f, 9f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18f)
                curveTo(3f, 16.69f, 3.83f, 15.58f, 5f, 15.17f)
                verticalLineTo(8.83f)
                curveTo(3.83f, 8.42f, 3f, 7.31f, 3f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 3f)
                moveTo(6f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5f)
                moveTo(6f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 17f)
                moveTo(21f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 18f)
                curveTo(15f, 16.69f, 15.83f, 15.58f, 17f, 15.17f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(10.25f)
                lineTo(10.75f, 6f)
                lineTo(15f, 1.75f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 7f)
                verticalLineTo(15.17f)
                curveTo(20.17f, 15.58f, 21f, 16.69f, 21f, 18f)
                moveTo(18f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 17f)
                close()
            }
        }.build()

        return _SourcePull!!
    }

@Suppress("ObjectPropertyName")
private var _SourcePull: ImageVector? = null

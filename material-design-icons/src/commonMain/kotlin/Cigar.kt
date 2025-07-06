package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cigar: ImageVector
    get() {
        if (_Cigar != null) {
            return _Cigar!!
        }
        _Cigar = ImageVector.Builder(
            name = "Cigar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 10.2f)
                horizontalLineTo(14.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.65f, 8.2f)
                arcTo(1.78f, 1.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 6.45f)
                verticalLineTo(5f)
                arcTo(3.35f, 3.35f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.5f, 11.7f)
                horizontalLineTo(16f)
                arcTo(1.93f, 1.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 13.7f)
                verticalLineTo(15f)
                horizontalLineTo(19.5f)
                verticalLineTo(13.36f)
                arcTo(3.31f, 3.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 10.2f)
                moveTo(18.82f, 7.73f)
                arcTo(3.34f, 3.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 2f)
                verticalLineTo(3.5f)
                arcTo(1.85f, 1.85f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.5f, 7.2f)
                verticalLineTo(8.7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 12.77f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(12.76f)
                arcTo(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.85f, 7.73f)
                moveTo(18f, 16f)
                verticalLineTo(22f)
                horizontalLineTo(19.5f)
                verticalLineTo(16f)
                moveTo(20.5f, 16f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                moveTo(12f, 16f)
                verticalLineTo(17.27f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20.73f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                moveTo(2.88f, 16.88f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 22f)
                horizontalLineTo(10f)
                verticalLineTo(20.73f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 17.27f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.88f, 16.88f)
                moveTo(12f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                close()
            }
        }.build()

        return _Cigar!!
    }

@Suppress("ObjectPropertyName")
private var _Cigar: ImageVector? = null

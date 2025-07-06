package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorSelection: ImageVector
    get() {
        if (_VectorSelection != null) {
            return _VectorSelection!!
        }
        _VectorSelection = ImageVector.Builder(
            name = "VectorSelection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 1f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 1f)
                moveTo(14f, 1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                horizontalLineTo(12f)
                verticalLineTo(1f)
                horizontalLineTo(14f)
                moveTo(20f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                moveTo(22f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                moveTo(20f, 13f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                moveTo(13f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                moveTo(13f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                moveTo(9f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                moveTo(7f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                moveTo(7f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                moveTo(3f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                moveTo(1f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineTo(1f)
                verticalLineTo(7f)
                moveTo(9f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 7f)
                moveTo(16f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 16f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _VectorSelection!!
    }

@Suppress("ObjectPropertyName")
private var _VectorSelection: ImageVector? = null

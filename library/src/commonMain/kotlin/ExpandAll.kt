package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ExpandAll: ImageVector
    get() {
        if (_ExpandAll != null) {
            return _ExpandAll!!
        }
        _ExpandAll = ImageVector.Builder(
            name = "ExpandAll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                moveTo(14f, 2f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                moveTo(22f, 12f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 20f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                moveTo(20f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _ExpandAll!!
    }

@Suppress("ObjectPropertyName")
private var _ExpandAll: ImageVector? = null

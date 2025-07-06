package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TabletCellphone: ImageVector
    get() {
        if (_TabletCellphone != null) {
            return _TabletCellphone!!
        }
        _TabletCellphone = ImageVector.Builder(
            name = "TabletCellphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 4f)
                moveTo(17f, 10f)
                horizontalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 11f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 22f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 21f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 10f)
                moveTo(18f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _TabletCellphone!!
    }

@Suppress("ObjectPropertyName")
private var _TabletCellphone: ImageVector? = null

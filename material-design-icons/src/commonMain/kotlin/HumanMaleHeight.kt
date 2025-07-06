package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanMaleHeight: ImageVector
    get() {
        if (_HumanMaleHeight != null) {
            return _HumanMaleHeight!!
        }
        _HumanMaleHeight = ImageVector.Builder(
            name = "HumanMaleHeight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                curveTo(8.78f, 2f, 9.67f, 4.16f, 8.42f, 5.42f)
                curveTo(7.16f, 6.67f, 5f, 5.78f, 5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                moveTo(5.5f, 7f)
                horizontalLineTo(8.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 9f)
                verticalLineTo(14.5f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(14.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 7f)
                moveTo(21f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                moveTo(21f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                moveTo(21f, 2f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(21f)
                moveTo(21f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                moveTo(21f, 14f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                moveTo(21f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(21f)
                moveTo(21f, 17f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
            }
        }.build()

        return _HumanMaleHeight!!
    }

@Suppress("ObjectPropertyName")
private var _HumanMaleHeight: ImageVector? = null

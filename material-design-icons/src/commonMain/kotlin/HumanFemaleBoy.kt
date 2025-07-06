package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanFemaleBoy: ImageVector
    get() {
        if (_HumanFemaleBoy != null) {
            return _HumanFemaleBoy!!
        }
        _HumanFemaleBoy = ImageVector.Builder(
            name = "HumanFemaleBoy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 2f)
                moveTo(6f, 22f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                lineTo(5.6f, 8.4f)
                curveTo(5.9f, 7.6f, 6.6f, 7f, 7.5f, 7f)
                curveTo(8.4f, 7f, 9.2f, 7.6f, 9.4f, 8.4f)
                lineTo(12f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                moveTo(14.5f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 12f)
                moveTo(13.5f, 15f)
                horizontalLineTo(19.5f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(13.5f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _HumanFemaleBoy!!
    }

@Suppress("ObjectPropertyName")
private var _HumanFemaleBoy: ImageVector? = null

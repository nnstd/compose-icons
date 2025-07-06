package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanFemaleFemale: ImageVector
    get() {
        if (_HumanFemaleFemale != null) {
            return _HumanFemaleFemale!!
        }
        _HumanFemaleFemale = ImageVector.Builder(
            name = "HumanFemaleFemale",
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
                lineTo(14.6f, 8.4f)
                curveTo(14.9f, 7.6f, 15.6f, 7f, 16.5f, 7f)
                curveTo(17.4f, 7f, 18.2f, 7.6f, 18.4f, 8.4f)
                lineTo(21f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                lineTo(9f, 16f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                moveTo(16.5f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 2f)
                close()
            }
        }.build()

        return _HumanFemaleFemale!!
    }

@Suppress("ObjectPropertyName")
private var _HumanFemaleFemale: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanBabyChangingTable: ImageVector
    get() {
        if (_HumanBabyChangingTable != null) {
            return _HumanBabyChangingTable!!
        }
        _HumanBabyChangingTable = ImageVector.Builder(
            name = "HumanBabyChangingTable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 6.08f)
                curveTo(5.72f, 6.12f, 5f, 6.62f, 4.72f, 7.4f)
                lineTo(3f, 12.13f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(12.84f)
                lineTo(8.42f, 8.94f)
                lineTo(10.7f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(11.15f)
                lineTo(7.29f, 6.2f)
                curveTo(7.03f, 6.11f, 6.76f, 6.07f, 6.5f, 6.08f)
                moveTo(9f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                moveTo(10f, 3.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 3.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 1.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 3.5f)
                moveTo(21f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 14.5f)
                moveTo(9f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                curveTo(11f, 15.11f, 11.89f, 16f, 13f, 16f)
                horizontalLineTo(15f)
                curveTo(16.11f, 16f, 17f, 15.11f, 17f, 14f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11f)
                close()
            }
        }.build()

        return _HumanBabyChangingTable!!
    }

@Suppress("ObjectPropertyName")
private var _HumanBabyChangingTable: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SubwayVariant: ImageVector
    get() {
        if (_SubwayVariant != null) {
            return _SubwayVariant!!
        }
        _SubwayVariant = ImageVector.Builder(
            name = "SubwayVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                moveTo(16.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 17f)
                moveTo(11f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                moveTo(7.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 17f)
                moveTo(12f, 2f)
                curveTo(7.58f, 2f, 4f, 2.5f, 4f, 6f)
                verticalLineTo(15.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 19f)
                lineTo(6f, 20.5f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(20.5f)
                lineTo(16.5f, 19f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 15.5f)
                verticalLineTo(6f)
                curveTo(20f, 2.5f, 16.42f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _SubwayVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SubwayVariant: ImageVector? = null

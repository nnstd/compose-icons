package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirPurifier: ImageVector
    get() {
        if (_AirPurifier != null) {
            return _AirPurifier!!
        }
        _AirPurifier = ImageVector.Builder(
            name = "AirPurifier",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 9f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9f)
                moveTo(11f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 11f)
                moveTo(7f, 4f)
                horizontalLineTo(14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 8f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 6f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 8f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 4f)
                moveTo(16f, 11f)
                curveTo(18.5f, 11f, 18.5f, 9f, 21f, 9f)
                verticalLineTo(11f)
                curveTo(18.5f, 11f, 18.5f, 13f, 16f, 13f)
                verticalLineTo(11f)
                moveTo(16f, 15f)
                curveTo(18.5f, 15f, 18.5f, 13f, 21f, 13f)
                verticalLineTo(15f)
                curveTo(18.5f, 15f, 18.5f, 17f, 16f, 17f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _AirPurifier!!
    }

@Suppress("ObjectPropertyName")
private var _AirPurifier: ImageVector? = null

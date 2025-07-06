package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToyBrickMarker: ImageVector
    get() {
        if (_ToyBrickMarker != null) {
            return _ToyBrickMarker!!
        }
        _ToyBrickMarker = ImageVector.Builder(
            name = "ToyBrickMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 6f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 3f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(14.54f)
                arcTo(9.55f, 9.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 15.5f)
                arcTo(5.58f, 5.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 10f)
                arcTo(5.3f, 5.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10.63f)
                verticalLineTo(6f)
                moveTo(18.5f, 12f)
                arcTo(3.54f, 3.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 15.5f)
                curveTo(15f, 18.1f, 18.5f, 22f, 18.5f, 22f)
                reflectiveCurveTo(22f, 18.1f, 22f, 15.5f)
                arcTo(3.54f, 3.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 12f)
                moveTo(18.5f, 16.8f)
                arcTo(1.2f, 1.2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18.5f, 14.4f)
                arcTo(1.29f, 1.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.7f, 15.6f)
                arcTo(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 16.8f)
                close()
            }
        }.build()

        return _ToyBrickMarker!!
    }

@Suppress("ObjectPropertyName")
private var _ToyBrickMarker: ImageVector? = null

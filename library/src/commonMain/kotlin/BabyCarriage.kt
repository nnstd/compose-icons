package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BabyCarriage: ImageVector
    get() {
        if (_BabyCarriage != null) {
            return _BabyCarriage!!
        }
        _BabyCarriage = ImageVector.Builder(
            name = "BabyCarriage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 2f)
                moveTo(19.32f, 15.89f)
                curveTo(20.37f, 14.54f, 21f, 12.84f, 21f, 11f)
                horizontalLineTo(6.44f)
                lineTo(5.5f, 9f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(4.22f)
                curveTo(4.22f, 11f, 6.11f, 15.07f, 6.34f, 15.42f)
                curveTo(5.24f, 16f, 4.5f, 17.17f, 4.5f, 18.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 22f)
                curveTo(9.76f, 22f, 11.22f, 20.7f, 11.46f, 19f)
                horizontalLineTo(13.54f)
                curveTo(13.78f, 20.7f, 15.24f, 22f, 17f, 22f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 18.5f)
                curveTo(20.5f, 17.46f, 20.04f, 16.53f, 19.32f, 15.89f)
                moveTo(8f, 20f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 20f)
                moveTo(17f, 20f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 20f)
                close()
            }
        }.build()

        return _BabyCarriage!!
    }

@Suppress("ObjectPropertyName")
private var _BabyCarriage: ImageVector? = null

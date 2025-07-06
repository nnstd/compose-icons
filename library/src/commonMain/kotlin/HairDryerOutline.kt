package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HairDryerOutline: ImageVector
    get() {
        if (_HairDryerOutline != null) {
            return _HairDryerOutline!!
        }
        _HairDryerOutline = ImageVector.Builder(
            name = "HairDryerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 12.73f)
                arcTo(70.39f, 70.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 11f)
                verticalLineTo(4f)
                reflectiveCurveTo(10.5f, 2f, 7.5f, 2f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.12f, 12.82f)
                lineTo(7f, 19f)
                horizontalLineTo(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.46f, 21.33f)
                arcTo(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 24f)
                horizontalLineTo(12f)
                arcTo(4.12f, 4.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.09f, 20.55f)
                curveTo(9.39f, 20f, 9f, 19.63f, 9f, 19f)
                horizontalLineTo(10f)
                moveTo(4f, 7.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 4f)
                arcTo(37.08f, 37.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5.5f)
                verticalLineTo(9.5f)
                arcTo(37.08f, 37.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 11f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 7.5f)
                moveTo(22f, 9f)
                arcTo(4.32f, 4.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.78f, 8.45f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 8f)
                verticalLineTo(7f)
                arcTo(4.32f, 4.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.22f, 7.55f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 8f)
                moveTo(22f, 6f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.22f, 5.55f)
                arcTo(4.32f, 4.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 5f)
                verticalLineTo(6f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.78f, 6.45f)
                arcTo(4.32f, 4.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 7f)
                moveTo(22f, 10f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.22f, 9.55f)
                arcTo(4.32f, 4.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 9f)
                verticalLineTo(10f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.78f, 10.45f)
                arcTo(4.32f, 4.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 11f)
                moveTo(9f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.5f, 6f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 7.5f)
                close()
            }
        }.build()

        return _HairDryerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HairDryerOutline: ImageVector? = null

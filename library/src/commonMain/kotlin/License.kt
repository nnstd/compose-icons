package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.License: ImageVector
    get() {
        if (_License != null) {
            return _License!!
        }
        _License = ImageVector.Builder(
            name = "License",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 10f)
                arcTo(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                arcTo(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 10f)
                arcTo(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13f)
                arcTo(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 10f)
                moveTo(12f, 19f)
                lineTo(16f, 20f)
                verticalLineTo(16.92f)
                arcTo(7.54f, 7.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                arcTo(7.54f, 7.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 16.92f)
                verticalLineTo(20f)
                moveTo(12f, 4f)
                arcTo(5.78f, 5.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.76f, 5.74f)
                arcTo(5.78f, 5.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 10f)
                arcTo(5.78f, 5.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.76f, 14.23f)
                arcTo(5.78f, 5.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                arcTo(5.78f, 5.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.24f, 14.23f)
                arcTo(5.78f, 5.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 10f)
                arcTo(5.78f, 5.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.24f, 5.74f)
                arcTo(5.78f, 5.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                moveTo(20f, 10f)
                arcTo(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.43f, 12.8f)
                arcTo(7.84f, 7.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15.28f)
                verticalLineTo(23f)
                lineTo(12f, 21f)
                lineTo(6f, 23f)
                verticalLineTo(15.28f)
                arcTo(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 10f)
                arcTo(7.68f, 7.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.33f, 4.36f)
                arcTo(7.73f, 7.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(7.73f, 7.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.67f, 4.36f)
                arcTo(7.68f, 7.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 10f)
                close()
            }
        }.build()

        return _License!!
    }

@Suppress("ObjectPropertyName")
private var _License: ImageVector? = null

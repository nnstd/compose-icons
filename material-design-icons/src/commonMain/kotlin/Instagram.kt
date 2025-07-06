package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Instagram: ImageVector
    get() {
        if (_Instagram != null) {
            return _Instagram!!
        }
        _Instagram = ImageVector.Builder(
            name = "Instagram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.8f, 2f)
                horizontalLineTo(16.2f)
                curveTo(19.4f, 2f, 22f, 4.6f, 22f, 7.8f)
                verticalLineTo(16.2f)
                arcTo(5.8f, 5.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.2f, 22f)
                horizontalLineTo(7.8f)
                curveTo(4.6f, 22f, 2f, 19.4f, 2f, 16.2f)
                verticalLineTo(7.8f)
                arcTo(5.8f, 5.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.8f, 2f)
                moveTo(7.6f, 4f)
                arcTo(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 7.6f)
                verticalLineTo(16.4f)
                curveTo(4f, 18.39f, 5.61f, 20f, 7.6f, 20f)
                horizontalLineTo(16.4f)
                arcTo(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 16.4f)
                verticalLineTo(7.6f)
                curveTo(20f, 5.61f, 18.39f, 4f, 16.4f, 4f)
                horizontalLineTo(7.6f)
                moveTo(17.25f, 5.5f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 6.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.25f, 8f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 6.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.25f, 5.5f)
                moveTo(12f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                close()
            }
        }.build()

        return _Instagram!!
    }

@Suppress("ObjectPropertyName")
private var _Instagram: ImageVector? = null

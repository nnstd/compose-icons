package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkullOutline: ImageVector
    get() {
        if (_SkullOutline != null) {
            return _SkullOutline!!
        }
        _SkullOutline = ImageVector.Builder(
            name = "SkullOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 15f)
                moveTo(10.5f, 17f)
                lineTo(12f, 14f)
                lineTo(13.5f, 17f)
                horizontalLineTo(10.5f)
                moveTo(16f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 15f)
                moveTo(22f, 11f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 11f)
                curveTo(2f, 13.8f, 3.2f, 16.3f, 5f, 18.1f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(18.1f)
                curveTo(20.8f, 16.3f, 22f, 13.8f, 22f, 11f)
                moveTo(17f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(17.2f)
                curveTo(5.2f, 15.7f, 4f, 13.5f, 4f, 11f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 11f)
                curveTo(20f, 13.5f, 18.8f, 15.8f, 17f, 17.2f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _SkullOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SkullOutline: ImageVector? = null

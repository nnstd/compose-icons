package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bus: ImageVector
    get() {
        if (_Bus != null) {
            return _Bus!!
        }
        _Bus = ImageVector.Builder(
            name = "Bus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                moveTo(16.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 17f)
                moveTo(7.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 17f)
                moveTo(4f, 16f)
                curveTo(4f, 16.88f, 4.39f, 17.67f, 5f, 18.22f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 21f)
                horizontalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 21f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 20f)
                verticalLineTo(18.22f)
                curveTo(19.61f, 17.67f, 20f, 16.88f, 20f, 16f)
                verticalLineTo(6f)
                curveTo(20f, 2.5f, 16.42f, 2f, 12f, 2f)
                curveTo(7.58f, 2f, 4f, 2.5f, 4f, 6f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _Bus!!
    }

@Suppress("ObjectPropertyName")
private var _Bus: ImageVector? = null

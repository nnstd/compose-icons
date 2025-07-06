package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountOutline: ImageVector
    get() {
        if (_AccountOutline != null) {
            return _AccountOutline!!
        }
        _AccountOutline = ImageVector.Builder(
            name = "AccountOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                moveTo(12f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                moveTo(12f, 13f)
                curveTo(14.67f, 13f, 20f, 14.33f, 20f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                curveTo(4f, 14.33f, 9.33f, 13f, 12f, 13f)
                moveTo(12f, 14.9f)
                curveTo(9.03f, 14.9f, 5.9f, 16.36f, 5.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(18.1f)
                verticalLineTo(17f)
                curveTo(18.1f, 16.36f, 14.97f, 14.9f, 12f, 14.9f)
                close()
            }
        }.build()

        return _AccountOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountOutline: ImageVector? = null

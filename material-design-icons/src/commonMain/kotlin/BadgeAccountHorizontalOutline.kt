package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BadgeAccountHorizontalOutline: ImageVector
    get() {
        if (_BadgeAccountHorizontalOutline != null) {
            return _BadgeAccountHorizontalOutline!!
        }
        _BadgeAccountHorizontalOutline = ImageVector.Builder(
            name = "BadgeAccountHorizontalOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 9f)
                moveTo(12f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                curveTo(4f, 14.67f, 6.67f, 14f, 8f, 14f)
                curveTo(9.33f, 14f, 12f, 14.67f, 12f, 16f)
                verticalLineTo(17f)
                moveTo(20f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                moveTo(20f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                moveTo(20f, 16f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                moveTo(22f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 22f)
                horizontalLineTo(22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 20f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 4f)
                moveTo(13f, 6f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _BadgeAccountHorizontalOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BadgeAccountHorizontalOutline: ImageVector? = null

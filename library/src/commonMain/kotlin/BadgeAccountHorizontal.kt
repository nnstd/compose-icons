package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BadgeAccountHorizontal: ImageVector
    get() {
        if (_BadgeAccountHorizontal != null) {
            return _BadgeAccountHorizontal!!
        }
        _BadgeAccountHorizontal = ImageVector.Builder(
            name = "BadgeAccountHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
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
                moveTo(20f, 18f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                moveTo(20f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                moveTo(20f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                moveTo(13f, 6f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _BadgeAccountHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _BadgeAccountHorizontal: ImageVector? = null

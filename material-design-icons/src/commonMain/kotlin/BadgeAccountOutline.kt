package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BadgeAccountOutline: ImageVector
    get() {
        if (_BadgeAccountOutline != null) {
            return _BadgeAccountOutline!!
        }
        _BadgeAccountOutline = ImageVector.Builder(
            name = "BadgeAccountOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 23f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 21f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 3f)
                moveTo(12f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                moveTo(16f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                curveTo(8f, 12.67f, 10.67f, 12f, 12f, 12f)
                curveTo(13.33f, 12f, 16f, 12.67f, 16f, 14f)
                verticalLineTo(15f)
                moveTo(16f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                moveTo(12f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(20f)
                moveTo(13f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(1f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _BadgeAccountOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BadgeAccountOutline: ImageVector? = null

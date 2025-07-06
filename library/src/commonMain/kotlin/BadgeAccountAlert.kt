package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BadgeAccountAlert: ImageVector
    get() {
        if (_BadgeAccountAlert != null) {
            return _BadgeAccountAlert!!
        }
        _BadgeAccountAlert = ImageVector.Builder(
            name = "BadgeAccountAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 3f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 23f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 21f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 3f)
                moveTo(10f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 8f)
                moveTo(14f, 16f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                curveTo(6f, 13.67f, 8.67f, 13f, 10f, 13f)
                curveTo(11.33f, 13f, 14f, 13.67f, 14f, 15f)
                verticalLineTo(16f)
                moveTo(11f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(1f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                moveTo(14f, 19f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                moveTo(10f, 21f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                moveTo(19f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                moveTo(19f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _BadgeAccountAlert!!
    }

@Suppress("ObjectPropertyName")
private var _BadgeAccountAlert: ImageVector? = null

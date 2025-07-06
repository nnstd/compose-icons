package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BadgeAccount: ImageVector
    get() {
        if (_BadgeAccount != null) {
            return _BadgeAccount!!
        }
        _BadgeAccount = ImageVector.Builder(
            name = "BadgeAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
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
                moveTo(12f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                moveTo(16f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                curveTo(8f, 13.67f, 10.67f, 13f, 12f, 13f)
                curveTo(13.33f, 13f, 16f, 13.67f, 16f, 15f)
                verticalLineTo(16f)
                moveTo(13f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(1f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                moveTo(16f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                moveTo(12f, 21f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _BadgeAccount!!
    }

@Suppress("ObjectPropertyName")
private var _BadgeAccount: ImageVector? = null

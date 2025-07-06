package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BadgeAccountAlertOutline: ImageVector
    get() {
        if (_BadgeAccountAlertOutline != null) {
            return _BadgeAccountAlertOutline!!
        }
        _BadgeAccountAlertOutline = ImageVector.Builder(
            name = "BadgeAccountAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 3f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
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
                moveTo(10f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 7f)
                moveTo(14f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                curveTo(6f, 12.67f, 8.67f, 12f, 10f, 12f)
                curveTo(11.33f, 12f, 14f, 12.67f, 14f, 14f)
                verticalLineTo(15f)
                moveTo(14f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                moveTo(10f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                moveTo(11f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(1f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
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

        return _BadgeAccountAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BadgeAccountAlertOutline: ImageVector? = null

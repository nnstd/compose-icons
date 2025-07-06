package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountAlertOutline: ImageVector
    get() {
        if (_AccountAlertOutline != null) {
            return _AccountAlertOutline!!
        }
        _AccountAlertOutline = ImageVector.Builder(
            name = "AccountAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                verticalLineTo(7f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                moveTo(20f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                moveTo(10f, 13f)
                curveTo(12.67f, 13f, 18f, 14.34f, 18f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                curveTo(2f, 14.34f, 7.33f, 13f, 10f, 13f)
                moveTo(10f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4f)
                moveTo(10f, 14.9f)
                curveTo(7.03f, 14.9f, 3.9f, 16.36f, 3.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(16.1f)
                verticalLineTo(17f)
                curveTo(16.1f, 16.36f, 12.97f, 14.9f, 10f, 14.9f)
                moveTo(10f, 5.9f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.9f, 8f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 10.1f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.1f, 8f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 5.9f)
                close()
            }
        }.build()

        return _AccountAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountAlertOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountRemove: ImageVector
    get() {
        if (_AccountRemove != null) {
            return _AccountRemove!!
        }
        _AccountRemove = ImageVector.Builder(
            name = "AccountRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 14f)
                curveTo(17.67f, 14f, 23f, 15.33f, 23f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                curveTo(7f, 15.33f, 12.33f, 14f, 15f, 14f)
                moveTo(15f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                moveTo(5f, 9.59f)
                lineTo(7.12f, 7.46f)
                lineTo(8.54f, 8.88f)
                lineTo(6.41f, 11f)
                lineTo(8.54f, 13.12f)
                lineTo(7.12f, 14.54f)
                lineTo(5f, 12.41f)
                lineTo(2.88f, 14.54f)
                lineTo(1.46f, 13.12f)
                lineTo(3.59f, 11f)
                lineTo(1.46f, 8.88f)
                lineTo(2.88f, 7.46f)
                lineTo(5f, 9.59f)
                close()
            }
        }.build()

        return _AccountRemove!!
    }

@Suppress("ObjectPropertyName")
private var _AccountRemove: ImageVector? = null
